package com.ag01.ebs42.transform;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.NestedRuntimeException;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TconnectorDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TobjectDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TobjectpropertiesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TpackageDao;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TconnectorDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TobjectDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TobjectpropertiesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TpackageDo;

public class TransferManager 
{
	@Autowired
	private ApplicationContext appContext;
	
	private PlatformTransactionManager platformTransactionManager;
	private static Logger LOGGER = LogManager.getLogger(TransferManager.class);
	
	private TpackageDao tpackageDao;
	private TobjectDao tobjectDao;
	private TobjectpropertiesDao tobjectpropertiesDao;
	private TconnectorDao tconnectorDao;
	private List <TpackageDo> resultTpackageDoList;
	private List <TobjectDo> resultTobjectDoList;
	private List <TobjectpropertiesDo> resultTobjectpropertiesDoList;
	private List <TconnectorDo> resultTconnectorDoList1;
	
	public TransferManager() { }
	
	public TransferManager(PlatformTransactionManager platformTransactionManager)
	{
		this.platformTransactionManager = platformTransactionManager;
	}
	
	public void importTables() throws Exception
	{
		TransactionStatus transactionStatus = null;
		this.resultTpackageDoList = null;
		this.setTpackageDao();
		
		try
		{			
			DefaultTransactionDefinition defaultTransactionDefinition = new DefaultTransactionDefinition();
			
			defaultTransactionDefinition.setName("IMPORT_TABLES");
			defaultTransactionDefinition.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
			
			transactionStatus = platformTransactionManager.getTransaction(defaultTransactionDefinition);
			
			this.resultTpackageDoList = tpackageDao.readListTpackage();
		}
		catch (TransactionException te)
		{
			LOGGER.error("TransactionException\n" + te.getMessage());
			platformTransactionManager.rollback(transactionStatus);
			throw te;
		}
		catch (NestedRuntimeException nre)
		{
			LOGGER.error("NestedRuntimeException\n" + nre.getMessage());
			platformTransactionManager.rollback(transactionStatus);
			throw nre;
		}
		catch (RuntimeException re)
		{
			LOGGER.error("RuntimeException\n" + re.getMessage());
			platformTransactionManager.rollback(transactionStatus);
			throw re;
		}
		catch (Exception e)
		{
			LOGGER.error("Exception\n" + e.getMessage());
			platformTransactionManager.rollback(transactionStatus);
			throw e;
		}
	}
	
	public List<TpackageDo> setTpackageDao() 
	{		
		TpackageDao tpackageDao = (TpackageDao) this.appContext.getBean("tpackageDao");
        List<TpackageDo> resultTpackageDoList = null;
		try 
		{
			resultTpackageDoList = tpackageDao.readListTpackage();
		}
		catch (Exception e) 
		{
			LOGGER.error("Exception while reading t_package\n" + e.getMessage());
		}
		
        if(resultTpackageDoList != null) 
        {
            for(int i = 0; i < resultTpackageDoList.size(); i++) 
            {
                TpackageDo tpackageDo = resultTpackageDoList.get(i);
                if(tpackageDo != null) 
                {
                    LOGGER.info("object[" + i + "] = " + tpackageDo.toString());
                } 
                else 
                {
                    LOGGER.info("object[" + i + "] = null");
                }
            }
        }
        this.tpackageDao = tpackageDao;
        return resultTpackageDoList;
	}
	
	public List<TobjectDo> setTobjectDao()
	{
        TobjectDao tobjectDao = (TobjectDao) this.appContext.getBean("tobjectDao");
        List<TobjectDo> resultTobjectList = null;
        
        try 
		{
			resultTobjectList = tobjectDao.readListTobject();
		}
		catch (Exception e) 
		{
			LOGGER.error("Exception while reading t_object\n" + e.getMessage());
		}
		
        if(resultTobjectList != null) 
        {
            for(int i = 0; i < resultTobjectList.size(); i++) 
            {
                TobjectDo tobjectDo = resultTobjectList.get(i);
                if(tobjectDo != null) 
                {
                    LOGGER.info("object[" + i + "] = " + tobjectDo.toString());
                } 
                else 
                {
                    LOGGER.info("object[" + i + "] = null");
                }
            }
        }
        this.tobjectDao = tobjectDao;
        
        return resultTobjectList;
	}
	
	
	public List<TobjectpropertiesDo> setTobjectpropertiesDao()
	{
		TobjectpropertiesDao tobjectpropertiesDao = (TobjectpropertiesDao)this.appContext.getBean("tobjectpropertiesDao");
		List<TobjectpropertiesDo> resultTobjectpropertiesDoList = null;
		
		try 
		{
			resultTobjectpropertiesDoList = tobjectpropertiesDao.readListTobjectproperties();
		}
		catch (Exception e) 
		{
			LOGGER.error("Exception while reading t_object\n" + e.getMessage());
		}
		
        if(resultTobjectpropertiesDoList != null) 
        {
            for(int i = 0; i < resultTobjectpropertiesDoList.size(); i++) 
            {
            	TobjectpropertiesDo tobjectpropertiesDo = resultTobjectpropertiesDoList.get(i);
                if(tobjectpropertiesDo != null) 
                {
                    LOGGER.info("object[" + i + "] = " + tobjectpropertiesDo.toString());
                } 
                else 
                {
                    LOGGER.info("object[" + i + "] = null");
                }
            }
        }
        this.tobjectpropertiesDao = tobjectpropertiesDao;
		
		return resultTobjectpropertiesDoList;
	} 
	
	public List <TconnectorDo> setTconnectorDao()
	{
        TconnectorDao tconnectorDao = (TconnectorDao)this.appContext.getBean("tconnectorDao");
        List <TconnectorDo> resultTconnectorDoList1 = null;
        
        try 
		{
        	resultTconnectorDoList1 = tconnectorDao.readListTconnector();
		}
		catch (Exception e) 
		{
			LOGGER.error("Exception while reading t_object\n" + e.getMessage());
		}
		
        if(resultTconnectorDoList1 != null) 
        {
            for(int i = 0; i < resultTconnectorDoList1.size(); i++) 
            {
            	TconnectorDo tconnectorDo = resultTconnectorDoList1.get(i);
                if(tconnectorDo != null) 
                {
                    LOGGER.info("object[" + i + "] = " + tconnectorDo.toString());
                } 
                else 
                {
                    LOGGER.info("object[" + i + "] = null");
                }
            }
        }
        this.tconnectorDao = tconnectorDao;
        
        return resultTconnectorDoList1;
	}
}
