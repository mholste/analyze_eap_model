package com.ag01.ebs42.transform;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ag01.ebs42.analyze.dbaccess.domobj.TconnectorDo;
import com.ag01.ebs42.analyze.dbaccess.domobj.TobjectDo;
import com.ag01.ebs42.analyze.dbaccess.domobj.TobjectpropertiesDo;
import com.ag01.ebs42.analyze.dbaccess.domobj.TpackageDo;
import com.ag01.ebs42.model.arc42.api.Arc42SystemDo;
import com.ag01.ebs42.model.arc42.domobj.Arc42InterfaceConnectionImpl;
import com.ag01.ebs42.model.arc42.domobj.Arc42SystemComponentImpl;
import com.ag01.ebs42.model.arc42.domobj.Arc42SystemDoImpl;
import com.ag01.ebs42.model.arc42.domobj.Arc42SystemInterfaceImpl;
import com.ag01.ebs42.model.utils.ConnectionType;
import com.ag01.ebs42.model.utils.DirectionType;
import com.ag01.ebs42.model.utils.InterfaceType;

public class TransferManager 
{
	// Final values from EA model
	private static final int MODEL_ID = 2; 
	private static final String ARC_NAME = "20_ARC42";
	private static final String SYSTEM_Name = "50_systems";
	private static final String ELEMENT_NAME = "80_elements";
	private static final String COMPONENT = "Component";
	private static final String ICTO = "ICTO";
	private static final String APP = "APP";
	private static final String SPL = "SPL";
	private static final String REQUIRED = "RequiredInterface";
	private static final String PROVIDED = "ProvidedInterface";
	
	// Names for keys in HashMap
	private static final String NAME = "Name";
	private static final String PACKAGE_ID = "Package_ID";
	
	// List of all folders containing systems in EA
	private List<HashMap<String, String>> systemFolderList = null;
	// List for all systems in transfer format
	private List<TransferArc42SystemComponent> componentList = null;
	//List for all provided interfaces in transfer format
	private List<TransferArc42SystemInterface> providedInterfaceList = null;
	//List for all required interfaces in transfer format
	private List<TransferArc42SystemInterface> requiredInterfaceList = null;	
	// Map of all interfaces and corresponding interfaces
	private HashMap<TransferArc42SystemInterface, List<TransferArc42InterfaceConnection>> interfaceMap = null;
	private List<TransferArc42InterfaceConnection> tempConnection = null;
	
	private List<TransferArc42SystemInterface> allRequiredInterfaceList = null;
	
	// DAOs for relevant tables
	private List<TpackageDo> resultTpackageDoList = null;
    private List<TobjectDo> resultTobjectList = null;
    private List<TobjectpropertiesDo> resultTobjectpropertiesDoList = null;
    private List<TconnectorDo> resultTconnectorDoList = null;

	private static Logger LOGGER = LogManager.getLogger(TransferManager.class);
	
	public TransferManager() 
	{ 		
		componentList = new ArrayList<TransferArc42SystemComponent>();
		providedInterfaceList = new ArrayList<TransferArc42SystemInterface>();
		requiredInterfaceList = new ArrayList<TransferArc42SystemInterface>();
		allRequiredInterfaceList = new ArrayList<TransferArc42SystemInterface>();
		interfaceMap = new HashMap<>();
	}
	
	/**
	 * Collects all system that are defined in the model and adds the corresponding 
	 * corporate Id if applicable
	 * 
	 * @return list of interfaces in temporary transfer format
	 */
	public List<TransferArc42SystemComponent> collectSystems()
	{
		this.getSystemfolders(
				this.extractPackageID(extractPackageID(MODEL_ID, ARC_NAME), SYSTEM_Name));
		for (HashMap<String, String> system : systemFolderList)
		{
			int elementId = this.extractPackageID(Integer.parseInt(system.get(PACKAGE_ID)), ELEMENT_NAME);
			int baseFolder = this.extractPackageID(elementId, system.get(NAME));
			
			for (TobjectDo objDo : resultTobjectList)
			{
				if (objDo.getObjecttype().equalsIgnoreCase(COMPONENT) && objDo.getPackageid() == baseFolder)
				{
					TransferArc42SystemComponent transObj = new TransferArc42SystemComponent(new Arc42SystemComponentImpl());
					transObj.setPackageName(system.get(NAME));
					transObj.setSystemComponentName(objDo.getName());
					transObj.setEaId(String.valueOf(objDo.getObjectid()));
					transObj.setEaPackageId(String.valueOf(objDo.getPackageid()));
					
					transObj.setCorporateId(this.mapCorporateId(transObj.getEaId()));

					componentList.add(transObj);
				}
			}		
		}		
		
		LOGGER.info("##### Logging all collected systems: ");
		
		for (TransferArc42SystemComponent tObj : componentList)
		{
			LOGGER.info("##### PackageName: " + tObj.getPackageName());
			LOGGER.info("##### SystemName: " + tObj.getSystemComponentName());
			LOGGER.info("##### Corporate ID: " + tObj.getCorporateId());
			LOGGER.info("##### EA ID: " + tObj.getEaId());
			LOGGER.info("##### EA Package ID: " + tObj.getEaPackageId());
			
		}
		return componentList;		
	}	
	
	/**
	 * Maps a given id of an t_object to a corporate ID
	 * 
	 * @param id	the id of t_object to map
	 * @return		the corporate Id or "internal" if a corporate Id is not found 
	 */
	private String mapCorporateId(String id)
	{
		for (TobjectpropertiesDo prop : resultTobjectpropertiesDoList)
		{
			if (id.equalsIgnoreCase(String.valueOf(prop.getObjectid())) &&
					(prop.getProperty().equalsIgnoreCase(APP) || 
					prop.getProperty().equalsIgnoreCase(ICTO) || 
					prop.getProperty().equalsIgnoreCase(SPL)))
			{
				return (prop.getProperty() + " " + prop.getValue());
			}						
		}
		return "Internal";
	}
	
	/**
	 * Gets the id of a package in EA with a given name and ID
	 * 
	 * @param parent the id of the parent folder 
	 * @param name   the name of the folder
	 * @return       the id of the package as int
	 */
	public int extractPackageID(int parent, String name)
	{
		int retId = 0;
		for (TpackageDo tmpDo : resultTpackageDoList)
		{
			if (tmpDo.getParentid() == parent && tmpDo.getName().equalsIgnoreCase(name))
			{
				retId = tmpDo.getPackageid();
				break;
			}
		}
		return retId;
	}
	
	/**
	 * Gets all folders beyond a given Package ID in the original EA model
	 * 
	 * @param parent id of the parent folder
	 */
	public void getSystemfolders(int parent)
	{
		this.systemFolderList = new ArrayList<HashMap<String, String>>();
		for (TpackageDo tmpDo : resultTpackageDoList)
		{
			if (tmpDo.getParentid() == parent)
			{
				HashMap<String, String> system = new HashMap<String, String>(); 
				system.put(NAME, tmpDo.getName());
				system.put(PACKAGE_ID, String.valueOf(tmpDo.getPackageid()));
				systemFolderList.add(system);
			}
		}
	}
	
	/**
	 * Collects all required interfaces that are defined in the model and adds a 
	 * corporate Id if applicable
	 * @return list of interfaces in temporary transfer format
	 */
	public List<TransferArc42SystemInterface> collectRequiredInterfaces()
	{
		Arc42SystemDo baseSystem = null;
		// Iterate all system components
		for (TransferArc42SystemComponent component : componentList)
		{
			// For each system component, check all objects and iterate over them
			for (TobjectDo objDo : resultTobjectList)
			{
				// Continue, if the object does not belong to the package of the component 
				if (objDo.getPackageid() != Integer.valueOf(component.getEaPackageId())) continue;
				// Get only the provided interfaces of this package
				if (objDo.getObjecttype().equalsIgnoreCase(REQUIRED))
				{
					baseSystem = new Arc42SystemDoImpl();
					baseSystem.setSystemName(component.getSystemComponentName());
					baseSystem.addSystemComponent(component.getComponent());
					TransferArc42SystemInterface transInt = new TransferArc42SystemInterface(new Arc42SystemInterfaceImpl());
					transInt.setEaId(String.valueOf(objDo.getObjectid()));
					transInt.setEaPackageId(String.valueOf(objDo.getPackageid()));
					transInt.setEaParentId(String.valueOf(objDo.getParentid()));
					transInt.setSystemInterfaceName(objDo.getName());
					transInt.setInterfaceType(InterfaceType.REQUIRED);
					transInt.setDefinedInSystem(baseSystem);
					transInt.setCorporateId(component.getCorporateId());
	
					requiredInterfaceList.add(transInt);
				}
			}
		}

			return requiredInterfaceList;
	}
	
	public List<TransferArc42SystemInterface> collectAllRequiredInterfaces()
	{
		Arc42SystemDo baseSystem = new Arc42SystemDoImpl();
		baseSystem.setSystemName("Dummy");
		for (TobjectDo objDo : resultTobjectList)
		{
			if (!objDo.getObjecttype().equalsIgnoreCase(REQUIRED)) continue;
			TransferArc42SystemInterface transInt = new TransferArc42SystemInterface(new Arc42SystemInterfaceImpl());
			transInt.setEaId(String.valueOf(objDo.getObjectid()));
			transInt.setEaPackageId(String.valueOf(objDo.getPackageid()));
			transInt.setEaParentId(String.valueOf(objDo.getParentid()));
			transInt.setSystemInterfaceName(objDo.getName());
			transInt.setInterfaceType(InterfaceType.REQUIRED);
			transInt.setDefinedInSystem(baseSystem);
			transInt.setCorporateId("123");
			allRequiredInterfaceList.add(transInt);
		}
		return allRequiredInterfaceList;
	}
	
	public List<TransferArc42SystemInterface> collectProvidedInterfaces()
	{
		Arc42SystemDo baseSystem = null;
		// Iterate all system components
		for (TransferArc42SystemComponent component : componentList)
		{
			// For each system component, check all objects and iterate over them
			for (TobjectDo objDo : resultTobjectList)
			{
				// Continue, if the object does not belong to the package of the component
				if (objDo.getPackageid() != Integer.valueOf(component.getEaPackageId())) continue; 
				// Get only the provided interfaces of this package
				if (objDo.getObjecttype().equalsIgnoreCase(PROVIDED))
				{
					baseSystem = new Arc42SystemDoImpl();
					baseSystem.setSystemName(component.getSystemComponentName());
					baseSystem.addSystemComponent(component.getComponent());
					TransferArc42SystemInterface transInt = new TransferArc42SystemInterface(new Arc42SystemInterfaceImpl());				
					transInt.setEaId(String.valueOf(objDo.getObjectid()));
					transInt.setEaPackageId(String.valueOf(objDo.getPackageid()));
					transInt.setEaParentId(String.valueOf(objDo.getParentid()));
					transInt.setSystemInterfaceName(objDo.getName());
					transInt.setInterfaceType(InterfaceType.PROVIDED);
					transInt.setDefinedInSystem(baseSystem);
					transInt.setCorporateId(component.getCorporateId());
					
					providedInterfaceList.add(transInt);
					baseSystem = null;
				}
			}
		}		
		return providedInterfaceList;
	}
	
	public HashMap<TransferArc42SystemInterface, List<TransferArc42InterfaceConnection>> collectConnections()
	{
		for (TransferArc42SystemInterface provided : providedInterfaceList)
		{
			
			for (TconnectorDo conDo : resultTconnectorDoList)
			{
				if (! conDo.getConnectortype().equalsIgnoreCase(ConnectionType.DEPENDENCY.name())) continue;
				if (conDo.getEndobjectid() == Integer.valueOf(provided.getEaId()))
				{
					if (tempConnection == null)
					{
						tempConnection = new ArrayList<TransferArc42InterfaceConnection>();
					}
					TransferArc42InterfaceConnection transCon = 
							new TransferArc42InterfaceConnection(new Arc42InterfaceConnectionImpl());
					transCon.setEaEndId(String.valueOf(conDo.getEndobjectid()));
					transCon.setEaStartId(String.valueOf(conDo.getStartobjectid()));
					transCon.setEaId(String.valueOf(conDo.getConnectorid()));
					transCon.setServer(provided.getDefinedInSystem().getSystemComponentList().get(0));
					transCon.setConnectorType(ConnectionType.DEPENDENCY);
					//transCon.setDirection(DirectionType.valueOf(conDo.getDirection()));
					transCon.setInterfaceConnectionName(conDo.getName());
					transCon.setInterfaceDefinition(provided.getInterface());
					tempConnection.add(transCon);
				}
			}
			if (tempConnection == null)
			{
				continue;
			}
			else
			{
				interfaceMap.put(provided, tempConnection);
				tempConnection = null;
			}
		}
		return interfaceMap;
	}
	
	public List<TpackageDo> getResultTpackageDoList() 
	{
		return resultTpackageDoList;
	}

	public void setResultTpackageDoList(List<TpackageDo> resultTpackageDoList) 
	{
		this.resultTpackageDoList = resultTpackageDoList;
	}

	public List<TobjectDo> getResultTobjectList() 
	{
		return resultTobjectList;
	}

	public void setResultTobjectList(List<TobjectDo> resultTobjectList) 
	{
		this.resultTobjectList = resultTobjectList;
	}

	public List<TobjectpropertiesDo> getResultTobjectpropertiesDoList() 
	{
		return resultTobjectpropertiesDoList;
	}

	public void setResultTobjectpropertiesDoList(List<TobjectpropertiesDo> resultTobjectpropertiesDoList) 
	{
		this.resultTobjectpropertiesDoList = resultTobjectpropertiesDoList;
	}

	public List<TconnectorDo> getResultTconnectorDoList() 
	{
		return resultTconnectorDoList;
	}

	public void setResultTconnectorDoList(List<TconnectorDo> resultTconnectorDoList) 
	{
		this.resultTconnectorDoList = resultTconnectorDoList;
	}
}
