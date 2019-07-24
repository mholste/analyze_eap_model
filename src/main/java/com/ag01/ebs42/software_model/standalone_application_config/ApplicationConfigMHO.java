package com.ag01.ebs42.software_model.standalone_application_config;

import java.sql.Driver;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TconnectorDao;
import com.ag01.ebs42.analyze.database_access.data_access_object.api.TobjectDao;
import com.ag01.ebs42.analyze.database_access.data_access_object.api.TobjectpropertiesDao;
import com.ag01.ebs42.analyze.database_access.data_access_object.api.TpackageDao;
import com.ag01.ebs42.analyze.database_access.data_access_object.jdbc_template_impl.TconnectorDaoSpringJdbcTemplatesImpl;
import com.ag01.ebs42.analyze.database_access.data_access_object.jdbc_template_impl.TobjectDaoSpringJdbcTemplatesImpl;
import com.ag01.ebs42.analyze.database_access.data_access_object.jdbc_template_impl.TobjectpropertiesDaoSpringJdbcTemplatesImpl;
import com.ag01.ebs42.analyze.database_access.data_access_object.jdbc_template_impl.TpackageDaoSpringJdbcTemplatesImpl;
import com.ag01.ebs42.transform.TransferManager;

@Configuration
@PropertySource("classpath:ebs42.properties")
public class ApplicationConfigMHO 
{
	@Value("${db.location}")
	private String dbLocation;
	
	private  Driver getJdbcDriver() throws InstantiationException, IllegalAccessException, ClassNotFoundException 
	{
		return (Driver) Class.forName("net.ucanaccess.jdbc.UcanaccessDriver").newInstance();		
	}
	
	private String getJdbcUrl() 
	{
		return dbLocation;
	}
	
	@Bean
	public DataSource dataSource() throws InstantiationException, IllegalAccessException, ClassNotFoundException 
	{    	
		return new SimpleDriverDataSource(getJdbcDriver(), getJdbcUrl());
	}
	
	 @Bean
	 TpackageDao tpackageDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException 
	 {
		 TpackageDaoSpringJdbcTemplatesImpl tmpTpackageDaoSpringJdbcTemplatesImpl = new TpackageDaoSpringJdbcTemplatesImpl();
		 tmpTpackageDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
		 return tmpTpackageDaoSpringJdbcTemplatesImpl;
	 }
	 
	 @Bean
	 TobjectDao tobjectDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException 
	 {
		 TobjectDaoSpringJdbcTemplatesImpl tmpTobjectDaoSpringJdbcTemplatesImpl = new TobjectDaoSpringJdbcTemplatesImpl();
		 tmpTobjectDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
		 return tmpTobjectDaoSpringJdbcTemplatesImpl;
	 }	  

	 @Bean
	 TobjectpropertiesDao tobjectpropertiesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException 
	 {
		 TobjectpropertiesDaoSpringJdbcTemplatesImpl tmpTobjectpropertiesDaoSpringJdbcTemplatesImpl = new TobjectpropertiesDaoSpringJdbcTemplatesImpl();
		 tmpTobjectpropertiesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
		 return tmpTobjectpropertiesDaoSpringJdbcTemplatesImpl;
	 }	 
	 
	 @Bean
	 TconnectorDao tconnectorDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException 
	 {
		 TconnectorDaoSpringJdbcTemplatesImpl tmpTconnectorDaoSpringJdbcTemplatesImpl = new TconnectorDaoSpringJdbcTemplatesImpl();
		 tmpTconnectorDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
		 return tmpTconnectorDaoSpringJdbcTemplatesImpl;
	 }	 	
	 
	 @Bean
	 TransferManager transferManager()
	 {
		 return new TransferManager();
	 }
}
