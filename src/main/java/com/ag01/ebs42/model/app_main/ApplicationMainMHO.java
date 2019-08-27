package com.ag01.ebs42.model.app_main;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ag01.ebs42.analyze.dbaccess.dao.api.TconnectorDao;
import com.ag01.ebs42.analyze.dbaccess.dao.api.TobjectDao;
import com.ag01.ebs42.analyze.dbaccess.dao.api.TobjectpropertiesDao;
import com.ag01.ebs42.analyze.dbaccess.dao.api.TpackageDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TconnectorDo;
import com.ag01.ebs42.analyze.dbaccess.domobj.TobjectDo;
import com.ag01.ebs42.analyze.dbaccess.domobj.TobjectpropertiesDo;
import com.ag01.ebs42.analyze.dbaccess.domobj.TpackageDo;
import com.ag01.ebs42.export.ExcelExporter;
import com.ag01.ebs42.model.app_config.ApplicationConfigMHO;
import com.ag01.ebs42.model.app_config.ApplicationMainConfiguration;
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
	private static List<TransferArc42SystemInterface> interfaceList = null;
	
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
		interfaceList = transferManager.collectInterfaces();
		
		ExcelExporter exporter = ExcelExporter.getInstance();
		exporter.exportSystems(componentList);
		exporter.exportInterfaces(interfaceList);
		
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
