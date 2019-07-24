package com.ag01.ebs42.alternative;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.NestedRuntimeException;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TpackageDao;
import com.ag01.ebs42.analyze.database_access.domain_object.TpackageDo;

public class FillEbsModel 
{
	private static Logger LOGGER = LogManager.getLogger(FillEbsModel.class);
	
	private TpackageDao tpackageDao;
	private List <TpackageDo> resultTpackageDoList;
	private AbstractApplicationContext applicationContext;
	/*
	public void setPlatformTransactionManager(PlatformTransactionManager platformTransactionManager) {
		this.platformTransactionManager = platformTransactionManager;
	}
	*/
	
	public void setTpackageDao() 
	{		
		TpackageDao tpackageDao = (TpackageDao) this.applicationContext.getBean("tpackageDao");
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
	}

	public void readDatabase(AbstractApplicationContext context, PlatformTransactionManager platformTransactionManager) throws Exception
	{
		TransactionStatus transactionStatus0001 = null;
		this.resultTpackageDoList = null;
		this.applicationContext = context;
		this.setTpackageDao();
		
		try
		{
			
			DefaultTransactionDefinition defaultTransactionDefinition = new DefaultTransactionDefinition();
			
			defaultTransactionDefinition.setName("READ_EAP_DATABASE_0001");
			defaultTransactionDefinition.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
			
			transactionStatus0001 = platformTransactionManager.getTransaction(defaultTransactionDefinition);
			
			this.resultTpackageDoList = tpackageDao.readListTpackage();
		}
		catch (TransactionException te)
		{
			LOGGER.error("TransactionException\n" + te.getMessage());
			platformTransactionManager.rollback(transactionStatus0001);
			throw te;
		}
		catch (NestedRuntimeException nre)
		{
			LOGGER.error("NestedRuntimeException\n" + nre.getMessage());
			platformTransactionManager.rollback(transactionStatus0001);
			throw nre;
		}
		catch (RuntimeException re)
		{
			LOGGER.error("RuntimeException\n" + re.getMessage());
			platformTransactionManager.rollback(transactionStatus0001);
			throw re;
		}
	}
	
	public void showSystems()
	{
		this.resultTpackageDoList.stream().forEach((obj) -> LOGGER.info(obj));		
	}
}
