package com.ag01.ebs42.software_model.standalone_application_main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMainMHO 
{
	private static Logger LOGGER = LogManager.getLogger(ApplicationMainMHO.class);
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	}
	
}
