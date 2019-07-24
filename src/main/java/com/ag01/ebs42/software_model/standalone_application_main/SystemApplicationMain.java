package com.ag01.ebs42.software_model.standalone_application_main;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ag01.ebs42.alternative.FillEbsModel;
import com.ag01.ebs42.model.arc42.domobj.Arc42SystemComponent;
import com.ag01.ebs42.model.arc42.domobj.Arc42SystemDo;
import com.ag01.ebs42.model.arc42.domobj.Arc42SystemInterface;
import com.ag01.ebs42.model.arc42.domobj.Ebs42ModelRootDo;
import com.ag01.ebs42.model.config.ApplicationMainConfiguration;
import com.ag01.ebs42.model.eap_to_ebs42.api.ConvertEapToEbs42;

public class SystemApplicationMain {

	private static Logger LOGGER = LogManager.getLogger(SystemApplicationMain.class);

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = null;
		try {
			LOGGER.debug("begin ApplicationMain -> static void main(String args[]");

			applicationContext = new AnnotationConfigApplicationContext(ApplicationMainConfiguration.class);
			
			ConvertEapToEbs42 convertEapToEbs42 = (ConvertEapToEbs42) applicationContext.getBean("convertEapToEbs42");

			Ebs42ModelRootDo ebs42ModelRootDo = null;
			
			try {
				ebs42ModelRootDo = convertEapToEbs42.convertEapToEbs42();
			
				StringBuffer tmpArcLog = new StringBuffer();
				tmpArcLog.append("system_name, system_package, system_component01, system_component02, system_component03, system_component04, system_component05, system_component06, system_component07, system_component08, system_component09, system_component10, systeminterface01, systeminterface02, systeminterface03, systeminterface04, systeminterface05, systeminterface06, systeminterface07, systeminterface08, systeminterface09, systeminterface10, systeminterface11, systeminterface12, systeminterface13, systeminterface14, systeminterface15, systeminterface16, systeminterface17, systeminterface18, systeminterface19, systeminterface20, providedinterface01, providedinterface02, providedinterface03, providedinterface04, providedinterface05, providedinterface06, providedinterface07, providedinterface08, providedinterface09, providedinterface10, providedinterface11, providedinterface12, providedinterface13, providedinterface14, providedinterface15, providedinterface16, providedinterface17, providedinterface18, providedinterface19, providedinterface20, usedinterface01, usedinterface02, usedinterface03, usedinterface04, usedinterface05, usedinterface06, usedinterface07, usedinterface08, usedinterface09, usedinterface10, usedinterface11, usedinterface12, usedinterface13, usedinterface14, usedinterface15, usedinterface16, usedinterface17, usedinterface18, usedinterface19, usedinterface20\n");
				
				List <Arc42SystemDo> arc42Systems = ebs42ModelRootDo.getArc42ModelRootDo().getArc42SystemsList();
				for(int i = 0; i < arc42Systems.size(); i++) {
					Arc42SystemDo arc42System = arc42Systems.get(i);
					tmpArcLog.append(arc42System.getSystemName() + "," + arc42System.getSystemPackageName());
					for(int j = 0; j < 10; j++ ) {
						int sizeComponentList = arc42System.getSystemComponentList().size();
						if(j < sizeComponentList) {
							tmpArcLog.append("," + arc42System.getSystemComponentList().get(j).getSystemComponentName());
						} else {
							tmpArcLog.append(",");
						}
					}
					for(int j = 0; j < 20; j++ ) {
						int sizeInterfaceList = arc42System.getSystemInterfaceList().size();
						if(j < sizeInterfaceList) {
							tmpArcLog.append("," + arc42System.getSystemInterfaceList().get(j).getSystemInterfaceName());
						} else {
							tmpArcLog.append(",");
						}
					}
					/*
					for(int j = 0; j < 10; j++ ) {
						int sizeComponentList = arc42System.getSystemComponentList().size();
						if(j < sizeComponentList) {
							for(int k = 0; k < 20; k++) {
								int sizeArc42SystemComponentProvidedInterfacesList = arc42System.getSystemComponentList().get(j).getServerInterfaces().size();
								if(k < sizeArc42SystemComponentProvidedInterfacesList) {
									tmpArcLog.append("," + arc42System.getSystemComponentList().get(j).getServerInterfaces().get(k));
								} else {
									tmpArcLog.append(",");
								}
							} 
						}
					}
					for(int j = 0; j < 10; j++ ) {
						int sizeComponentList = arc42System.getSystemComponentList().size();
						if(j < sizeComponentList) {
							for(int k = 0; k < 20; k++) {
								int sizeArc42SystemComponentUsedInterfacesList = arc42System.getSystemComponentList().get(j).getClientInterfaces().size();
								if(k < sizeArc42SystemComponentUsedInterfacesList) {
									tmpArcLog.append("," + arc42System.getSystemComponentList().get(j).getClientInterfaces().get(k));
								} else {
									tmpArcLog.append(",");
								}
							} 
						}
					}
					*/
					tmpArcLog.append("\n");
				}
				System.out.println(tmpArcLog.toString());
				
			} catch(Exception ex) {
				LOGGER.error("exception ApplicationMain-> static void main(String args[]:", ex);
			    throw ex;
			}
			
			LOGGER.debug("finish ApplicationMain -> static void main(String args[]");
		} catch (Exception e) {
			LOGGER.error("exception in ApplicationMain -> static void main(String args[])", e);
		} finally {
			if (applicationContext != null) {
				try {
					applicationContext.close();
				} catch (Exception e) {
					// ignore
				}
				applicationContext = null;
			}
		}
	}
	
}
