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
import com.ag01.ebs42.model.arc42.api.Arc42SystemComponent;
import com.ag01.ebs42.meta_model.api.Arc42SystemInterface;
import com.ag01.ebs42.meta_model.api.InterfaceType;
import com.ag01.ebs42.model.arc42.domobj.Arc42SystemComponentImpl;
import com.ag01.ebs42.meta_model.impl.Arc42SystemInterfaceImpl;

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
	//List for all interfaces in transfer format
	private List<TransferArc42SystemInterface> interfaceList = null;
	
	// DAOs for relevant tables
	private List<TpackageDo> resultTpackageDoList = null;
    private List<TobjectDo> resultTobjectList = null;
    private List<TobjectpropertiesDo> resultTobjectpropertiesDoList = null;
    private List <TconnectorDo> resultTconnectorDoList = null;

	private static Logger LOGGER = LogManager.getLogger(TransferManager.class);
	
	public TransferManager() 
	{ 		
		componentList = new ArrayList<TransferArc42SystemComponent>();
		interfaceList = new ArrayList<TransferArc42SystemInterface>();
	}
	
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
					
					for (TobjectpropertiesDo prop : resultTobjectpropertiesDoList)
					{
						if (transObj.getEaId().equalsIgnoreCase(String.valueOf(prop.getObjectid())) &&
								(prop.getProperty().equalsIgnoreCase(APP) || 
								prop.getProperty().equalsIgnoreCase(ICTO) || 
								prop.getProperty().equalsIgnoreCase(SPL)))
						{
							transObj.setCorporateId(prop.getProperty() + " " + prop.getValue());
						}						
					}
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
	 * Gets the id of a package in EA with a given name and ID
	 * 
	 * @param parent the id of the parent folder 
	 * @param name   the name of the folder
	 * @return the id of the package as int
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
	
	public List<TransferArc42SystemInterface> collectInterfaces()
	{
		for (TobjectDo objDo : resultTobjectList)
		{
			if (objDo.getObjecttype().equalsIgnoreCase(PROVIDED) || 
					objDo.getObjecttype().equalsIgnoreCase(REQUIRED))
			{
				TransferArc42SystemInterface transInt = 
						new TransferArc42SystemInterface(new Arc42SystemInterfaceImpl());
				transInt.setEaId(String.valueOf(objDo.getObjectid()));
				transInt.setEaPackageId(String.valueOf(objDo.getPackageid()));
				transInt.setEaParentID(String.valueOf(objDo.getParentid()));
				transInt.setInterfaceName(objDo.getName());
				transInt.setInterfaceType(objDo.getObjecttype().equalsIgnoreCase(REQUIRED) 
						? InterfaceType.REQUIRED : InterfaceType.PROVIDED);
				interfaceList.add(transInt);
			}
		}
		return interfaceList;
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
