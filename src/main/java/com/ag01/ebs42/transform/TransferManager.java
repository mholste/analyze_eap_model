package com.ag01.ebs42.transform;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TconnectorDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TobjectDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TobjectpropertiesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TpackageDo;
import com.ag01.ebs42.meta_model.api.Arc42SystemComponent;
import com.ag01.ebs42.meta_model.impl.Arc42SystemComponentImpl;

public class TransferManager 
{
	// Final values from EA model
	private static final int MODEL_ID = 2; 
	private static final String ARC_NAME = "20_ARC42";
	private static final String SYSTEM_Name = "50_systems";
	private static final String ELEMENT_NAME = "80_elements";
	private static final String COMPONENT = "Component";
	
	// Names for keys in HashMap
	private static final String NAME = "Name";
	private static final String PACKAGE_ID = "Package_ID";
	
	private List<HashMap<String, String>> systemFolderList = null;
	private List<TransferArc42SystemComponent> componentList = null;
	
	private List<TpackageDo> resultTpackageDoList = null;
    private List<TobjectDo> resultTobjectList = null;
    private List<TobjectpropertiesDo> resultTobjectpropertiesDoList = null;
    private List <TconnectorDo> resultTconnectorDoList = null;

	private static Logger LOGGER = LogManager.getLogger(TransferManager.class);
	
	public TransferManager() 
	{ 		
		componentList = new ArrayList<TransferArc42SystemComponent>();
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
					transObj.setSystemName(objDo.getName());
					transObj.setEaId(String.valueOf(objDo.getObjectid()));
					transObj.setEaPackageId(String.valueOf(objDo.getPackageid()));
					LOGGER.info("##### PackageName: " + transObj.getPackageName());
					LOGGER.info("##### SystemName: " + transObj.getSystemName());
					LOGGER.info("##### EA ID: " + transObj.getEaId());
					LOGGER.info("##### EA Package ID: " + transObj.getEaPackageId());
				}
			}
		}
	}		
	
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
	
	public void getSystemDetails(HashMap<String, String> system)
	{
		
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
