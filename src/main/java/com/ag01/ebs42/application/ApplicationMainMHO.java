package com.ag01.ebs42.application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ag01.ebs42.analyze.dbaccess.dao.api.TconnectorDao;
import com.ag01.ebs42.analyze.dbaccess.dao.api.TobjectDao;
import com.ag01.ebs42.analyze.dbaccess.dao.api.TobjectpropertiesDao;
import com.ag01.ebs42.analyze.dbaccess.dao.api.TpackageDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TconnectorDo;
import com.ag01.ebs42.analyze.dbaccess.domobj.TobjectDo;
import com.ag01.ebs42.analyze.dbaccess.domobj.TobjectpropertiesDo;
import com.ag01.ebs42.analyze.dbaccess.domobj.TpackageDo;
import com.ag01.ebs42.export.ExcelExporter;
import com.ag01.ebs42.transform.TransferArc42InterfaceConnection;
import com.ag01.ebs42.transform.TransferArc42SystemComponent;
import com.ag01.ebs42.transform.TransferArc42SystemInterface;
import com.ag01.ebs42.transform.TransferManager;

public class ApplicationMainMHO 
{
	private static Logger LOGGER = LogManager.getLogger(ApplicationMainMHO.class);
	
	private static ApplicationContext ctx;
	
	private static List<TpackageDo> resultTpackageDoList = null;
    private static List<TobjectDo> resultTobjectList = null;
    private static List<TobjectpropertiesDo> resultTobjectpropertiesDoList = null;
    private static List <TconnectorDo> resultconnectorDoList = null;
    
    private static List<TransferArc42SystemComponent> componentList = null;
	private static List<TransferArc42SystemInterface> providedInterfaceList = null;
	private static List<TransferArc42SystemInterface> requiredInterfaceList = null;
	private static ArrayList<HashMap> allConnections = null;
	
	//temp
	private static List<TransferArc42SystemInterface> allRequiredInterfaceList = null;
	private static HashMap<TransferArc42SystemInterface, List<TransferArc42InterfaceConnection>> interfaceMap = null;
	
	public static void main(String[] args) 
	{
		ctx = new AnnotationConfigApplicationContext(ApplicationConfigMHO.class);
		readTables();
		TransferManager transferManager = (TransferManager) ctx.getBean("transferManager");
		transferManager.setResultTpackageDoList(resultTpackageDoList);
		transferManager.setResultTobjectList(resultTobjectList);
		transferManager.setResultTobjectpropertiesDoList(resultTobjectpropertiesDoList);
		transferManager.setResultTconnectorDoList(resultconnectorDoList);
		componentList = transferManager.collectSystems();
		providedInterfaceList = transferManager.collectProvidedInterfaces();
		requiredInterfaceList = transferManager.collectRequiredInterfaces();
		allRequiredInterfaceList = transferManager.collectAllRequiredInterfaces();
		interfaceMap = transferManager.collectConnections();
		allConnections = transferManager.collectAllConnections();
		
		ExcelExporter exporter = ExcelExporter.getInstance();
		exporter.exportSystems(componentList);
		exporter.exportInterfaces(providedInterfaceList, "Provided Interfaces");
		//exporter.exportInterfaces(requiredInterfaceList, "Required Interfaces");
		//exporter.exportInterfaces(allRequiredInterfaceList, "All Interfaces");
		//exporter.exportConnections(interfaceMap, requiredInterfaceList);
		//exporter.exportConnections2(interfaceMap, requiredInterfaceList);
		//exporter.exportGeneral(interfaceMap, providedInterfaceList, requiredInterfaceList);
		exporter.exportAllConnections(allConnections);

		try
		{
			exporter.generateReport();
		}
		catch (IOException ioe)
		{
			LOGGER.error("error while generating report\n" + ioe.getMessage(), ioe);
		}
	}
	
	private static void readTables()
	{
		TpackageDao tpackageDao = (TpackageDao) ctx.getBean("tpackageDao");
		TobjectDao tobjectDao = (TobjectDao) ctx.getBean("tobjectDao");
		TobjectpropertiesDao tobjectpropertiesDao = (TobjectpropertiesDao)ctx.getBean("tobjectpropertiesDao");
		TconnectorDao tconnectorDao = (TconnectorDao)ctx.getBean("tconnectorDao");                		
        
        try 
        {
			resultTpackageDoList = tpackageDao.readListTpackage();
		} 
        catch (Exception e) 
        {
        	LOGGER.error("Exception while reading t_package\n" + e.getMessage(), e);
        }        
        
        try 
		{
			resultTobjectList = tobjectDao.readListTobject();
		}
		catch (Exception e) 
		{
			LOGGER.error("Exception while reading t_object\n" + e.getMessage(), e);
		}
        
        try 
		{
			resultTobjectpropertiesDoList = tobjectpropertiesDao.readListTobjectproperties();			
		}
		catch (Exception e) 
		{
			LOGGER.error("Exception while reading t_object\n" + e.getMessage(), e);
		}
        
        try 
		{
        	resultconnectorDoList = tconnectorDao.readListTconnector();
		}
		catch (Exception e) 
		{
			LOGGER.error("Exception while reading t_object\n" + e.getMessage(), e);
		}
	}
	
}
