package com.ag01.ebs42.alternative;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.core.NestedRuntimeException;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TpackageDao;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TpackageDo;

public class FillEbsModel 
{
	private static Logger LOGGER = LogManager.getLogger(FillEbsModel.class);
	
	private PlatformTransactionManager platformTransactionManager;
	private TpackageDao tpackageDao;
	private List <TpackageDo> resultTpackageDoList;
	
	public void setPlatformTransactionManager(PlatformTransactionManager platformTransactionManager) {
		this.platformTransactionManager = platformTransactionManager;
	}
	
	public void setTpackageDao(TpackageDao tpackageDao) {
		this.tpackageDao = tpackageDao;
	}

	public void readDatabase() throws Exception
	{
		TransactionStatus transactionStatus0001 = null;
		this.resultTpackageDoList = null;
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
