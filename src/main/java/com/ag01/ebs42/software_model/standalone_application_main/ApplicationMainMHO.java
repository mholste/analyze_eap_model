package com.ag01.ebs42.software_model.standalone_application_main;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TconnectorDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TobjectDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TobjectpropertiesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TpackageDao;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TconnectorDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TobjectDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TobjectpropertiesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TpackageDo;
import com.ag01.ebs42.software_model.standalone_application_config.ApplicationConfigMHO;
import com.ag01.ebs42.software_model.standalone_application_config.ApplicationMainConfiguration;

public class ApplicationMainMHO 
{
	private static Logger LOGGER = LogManager.getLogger(ApplicationMainMHO.class);
	
	public static void main(String[] args) 
	{
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfigMHO.class);
		
		TpackageDao tpackageDao = (TpackageDao) ctx.getBean("tpackageDao");
		TobjectDao tobjectDao = (TobjectDao) ctx.getBean("tobjectDao");
		TobjectpropertiesDao tobjectpropertiesDao = (TobjectpropertiesDao)ctx.getBean("tobjectpropertiesDao");
		TconnectorDao tconnectorDao = (TconnectorDao)ctx.getBean("tconnectorDao");        
        
		List<TpackageDo> resultTpackageDoList = null;
        List<TobjectDo> resultTobjectList = null;
        List<TobjectpropertiesDo> resultTobjectpropertiesDoList = null;
        List <TconnectorDo> resultTconnectorDoList1 = null;
        
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
        	resultTconnectorDoList1 = tconnectorDao.readListTconnector();
		}
		catch (Exception e) 
		{
			LOGGER.error("Exception while reading t_object\n" + e.getMessage(), e);
		}
	}
	
}
