package com.ag01.ebs42.model.old;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.ag01.ebs42.analyze.dbaccess.dao.api.*;
import com.ag01.ebs42.analyze.dbaccess.domobj.*;

public class ApplicationMain {

	private static Logger LOGGER = LogManager.getLogger(ApplicationMain.class);

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = null;
        
		try {
			LOGGER.debug("begin ApplicationMain -> static void main(String args[]");

			applicationContext = new AnnotationConfigApplicationContext(ApplicationMainConfiguration.class);

			PlatformTransactionManager platformTransactionManager = (PlatformTransactionManager) applicationContext.getBean("platformTransactionManager");
			DefaultTransactionDefinition defaultTransactionDefinition = new DefaultTransactionDefinition();
						
			defaultTransactionDefinition.setName("TX_00001");
			defaultTransactionDefinition.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
			
			TransactionStatus transactionStatus0001 = platformTransactionManager.getTransaction(defaultTransactionDefinition);

			try {
	             TefforttypesDao tefforttypesDao = (TefforttypesDao) applicationContext.getBean("tefforttypesDao");
	             List <TefforttypesDo> resultTefforttypesDoList = tefforttypesDao.readListTefforttypes();
	             if(resultTefforttypesDoList != null) {
	                 for(int i = 0; i < resultTefforttypesDoList.size(); i++) {
	                     TefforttypesDo tefforttypesDo = resultTefforttypesDoList.get(i);
	                     if(tefforttypesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tefforttypesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TtemplateDao ttemplateDao = (TtemplateDao) applicationContext.getBean("ttemplateDao");
	             List <TtemplateDo> resultTtemplateDoList = ttemplateDao.readListTtemplate();
	             if(resultTtemplateDoList != null) {
	                 for(int i = 0; i < resultTtemplateDoList.size(); i++) {
	                     TtemplateDo ttemplateDo = resultTtemplateDoList.get(i);
	                     if(ttemplateDo != null) {
	                         LOGGER.info("object[" + i + "] = " + ttemplateDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TtcfDao ttcfDao = (TtcfDao) applicationContext.getBean("ttcfDao");
	             List <TtcfDo> resultTtcfDoList = ttcfDao.readListTtcf();
	             if(resultTtcfDoList != null) {
	                 for(int i = 0; i < resultTtcfDoList.size(); i++) {
	                     TtcfDo ttcfDo = resultTtcfDoList.get(i);
	                     if(ttcfDo != null) {
	                         LOGGER.info("object[" + i + "] = " + ttcfDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TprojectrolesDao tprojectrolesDao = (TprojectrolesDao) applicationContext.getBean("tprojectrolesDao");
	             List <TprojectrolesDo> resultTprojectrolesDoList = tprojectrolesDao.readListTprojectroles();
	             if(resultTprojectrolesDoList != null) {
	                 for(int i = 0; i < resultTprojectrolesDoList.size(); i++) {
	                     TprojectrolesDo tprojectrolesDo = resultTprojectrolesDoList.get(i);
	                     if(tprojectrolesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tprojectrolesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TobjecttrxDao tobjecttrxDao = (TobjecttrxDao) applicationContext.getBean("tobjecttrxDao");
	             List <TobjecttrxDo> resultTobjecttrxDoList = tobjecttrxDao.readListTobjecttrx();
	             if(resultTobjecttrxDoList != null) {
	                 for(int i = 0; i < resultTobjecttrxDoList.size(); i++) {
	                     TobjecttrxDo tobjecttrxDo = resultTobjecttrxDoList.get(i);
	                     if(tobjecttrxDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tobjecttrxDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TobjectproblemsDao tobjectproblemsDao = (TobjectproblemsDao) applicationContext.getBean("tobjectproblemsDao");
	             List <TobjectproblemsDo> resultTobjectproblemsDoList = tobjectproblemsDao.readListTobjectproblems();
	             if(resultTobjectproblemsDoList != null) {
	                 for(int i = 0; i < resultTobjectproblemsDoList.size(); i++) {
	                     TobjectproblemsDo tobjectproblemsDo = resultTobjectproblemsDoList.get(i);
	                     if(tobjectproblemsDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tobjectproblemsDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TpackageDao tpackageDao = (TpackageDao) applicationContext.getBean("tpackageDao");
	             List <TpackageDo> resultTpackageDoList = tpackageDao.readListTpackage();
	             if(resultTpackageDoList != null) {
	                 for(int i = 0; i < resultTpackageDoList.size(); i++) {
	                     TpackageDo tpackageDo = resultTpackageDoList.get(i);
	                     if(tpackageDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tpackageDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TprimitivesDao tprimitivesDao = (TprimitivesDao) applicationContext.getBean("tprimitivesDao");
	             List <TprimitivesDo> resultTprimitivesDoList = tprimitivesDao.readListTprimitives();
	             if(resultTprimitivesDoList != null) {
	                 for(int i = 0; i < resultTprimitivesDoList.size(); i++) {
	                     TprimitivesDo tprimitivesDo = resultTprimitivesDoList.get(i);
	                     if(tprimitivesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tprimitivesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TproblemtypesDao tproblemtypesDao = (TproblemtypesDao) applicationContext.getBean("tproblemtypesDao");
	             List <TproblemtypesDo> resultTproblemtypesDoList = tproblemtypesDao.readListTproblemtypes();
	             if(resultTproblemtypesDoList != null) {
	                 for(int i = 0; i < resultTproblemtypesDoList.size(); i++) {
	                     TproblemtypesDo tproblemtypesDo = resultTproblemtypesDoList.get(i);
	                     if(tproblemtypesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tproblemtypesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TconnectortagDao tconnectortagDao = (TconnectortagDao) applicationContext.getBean("tconnectortagDao");
	             List <TconnectortagDo> resultTconnectortagDoList = tconnectortagDao.readListTconnectortag();
	             if(resultTconnectortagDoList != null) {
	                 for(int i = 0; i < resultTconnectortagDoList.size(); i++) {
	                     TconnectortagDo tconnectortagDo = resultTconnectortagDoList.get(i);
	                     if(tconnectortagDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tconnectortagDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TsecgrouppermissionDao tsecgrouppermissionDao = (TsecgrouppermissionDao) applicationContext.getBean("tsecgrouppermissionDao");
	             List <TsecgrouppermissionDo> resultTsecgrouppermissionDoList = tsecgrouppermissionDao.readListTsecgrouppermission();
	             if(resultTsecgrouppermissionDoList != null) {
	                 for(int i = 0; i < resultTsecgrouppermissionDoList.size(); i++) {
	                     TsecgrouppermissionDo tsecgrouppermissionDo = resultTsecgrouppermissionDoList.get(i);
	                     if(tsecgrouppermissionDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tsecgrouppermissionDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TumlpatternDao tumlpatternDao = (TumlpatternDao) applicationContext.getBean("tumlpatternDao");
	             List <TumlpatternDo> resultTumlpatternDoList = tumlpatternDao.readListTumlpattern();
	             if(resultTumlpatternDoList != null) {
	                 for(int i = 0; i < resultTumlpatternDoList.size(); i++) {
	                     TumlpatternDo tumlpatternDo = resultTumlpatternDoList.get(i);
	                     if(tumlpatternDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tumlpatternDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TobjectDao tobjectDao = (TobjectDao) applicationContext.getBean("tobjectDao");
	             List <TobjectDo> resultTobjectDoList = tobjectDao.readListTobject();
	             if(resultTobjectDoList != null) {
	                 for(int i = 0; i < resultTobjectDoList.size(); i++) {
	                     TobjectDo tobjectDo = resultTobjectDoList.get(i);
	                     if(tobjectDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tobjectDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TroleconstraintDao troleconstraintDao = (TroleconstraintDao) applicationContext.getBean("troleconstraintDao");
	             List <TroleconstraintDo> resultTroleconstraintDoList = troleconstraintDao.readListTroleconstraint();
	             if(resultTroleconstraintDoList != null) {
	                 for(int i = 0; i < resultTroleconstraintDoList.size(); i++) {
	                     TroleconstraintDo troleconstraintDo = resultTroleconstraintDoList.get(i);
	                     if(troleconstraintDo != null) {
	                         LOGGER.info("object[" + i + "] = " + troleconstraintDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TsecpermissionDao tsecpermissionDao = (TsecpermissionDao) applicationContext.getBean("tsecpermissionDao");
	             List <TsecpermissionDo> resultTsecpermissionDoList = tsecpermissionDao.readListTsecpermission();
	             if(resultTsecpermissionDoList != null) {
	                 for(int i = 0; i < resultTsecpermissionDoList.size(); i++) {
	                     TsecpermissionDo tsecpermissionDo = resultTsecpermissionDoList.get(i);
	                     if(tsecpermissionDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tsecpermissionDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TobjectpropertiesDao tobjectpropertiesDao = (TobjectpropertiesDao) applicationContext.getBean("tobjectpropertiesDao");
	             List <TobjectpropertiesDo> resultTobjectpropertiesDoList = tobjectpropertiesDao.readListTobjectproperties();
	             if(resultTobjectpropertiesDoList != null) {
	                 for(int i = 0; i < resultTobjectpropertiesDoList.size(); i++) {
	                     TobjectpropertiesDo tobjectpropertiesDo = resultTobjectpropertiesDoList.get(i);
	                     if(tobjectpropertiesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tobjectpropertiesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TpropertytypesDao tpropertytypesDao = (TpropertytypesDao) applicationContext.getBean("tpropertytypesDao");
	             List <TpropertytypesDo> resultTpropertytypesDoList = tpropertytypesDao.readListTpropertytypes();
	             if(resultTpropertytypesDoList != null) {
	                 for(int i = 0; i < resultTpropertytypesDoList.size(); i++) {
	                     TpropertytypesDo tpropertytypesDo = resultTpropertytypesDoList.get(i);
	                     if(tpropertytypesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tpropertytypesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TconnectorDao tconnectorDao = (TconnectorDao) applicationContext.getBean("tconnectorDao");
	             List <TconnectorDo> resultTconnectorDoList = tconnectorDao.readListTconnector();
	             if(resultTconnectorDoList != null) {
	                 for(int i = 0; i < resultTconnectorDoList.size(); i++) {
	                     TconnectorDo tconnectorDo = resultTconnectorDoList.get(i);
	                     if(tconnectorDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tconnectorDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TobjecttypesDao tobjecttypesDao = (TobjecttypesDao) applicationContext.getBean("tobjecttypesDao");
	             List <TobjecttypesDo> resultTobjecttypesDoList = tobjecttypesDao.readListTobjecttypes();
	             if(resultTobjecttypesDoList != null) {
	                 for(int i = 0; i < resultTobjecttypesDoList.size(); i++) {
	                     TobjecttypesDo tobjecttypesDo = resultTobjecttypesDoList.get(i);
	                     if(tobjecttypesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tobjecttypesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             UsysqueriesDao usysqueriesDao = (UsysqueriesDao) applicationContext.getBean("usysqueriesDao");
	             List <UsysqueriesDo> resultUsysqueriesDoList = usysqueriesDao.readListUsysqueries();
	             if(resultUsysqueriesDoList != null) {
	                 for(int i = 0; i < resultUsysqueriesDoList.size(); i++) {
	                     UsysqueriesDo usysqueriesDo = resultUsysqueriesDoList.get(i);
	                     if(usysqueriesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + usysqueriesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TobjectconstraintDao tobjectconstraintDao = (TobjectconstraintDao) applicationContext.getBean("tobjectconstraintDao");
	             List <TobjectconstraintDo> resultTobjectconstraintDoList = tobjectconstraintDao.readListTobjectconstraint();
	             if(resultTobjectconstraintDoList != null) {
	                 for(int i = 0; i < resultTobjectconstraintDoList.size(); i++) {
	                     TobjectconstraintDo tobjectconstraintDo = resultTobjectconstraintDoList.get(i);
	                     if(tobjectconstraintDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tobjectconstraintDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TpaletteitemDao tpaletteitemDao = (TpaletteitemDao) applicationContext.getBean("tpaletteitemDao");
	             List <TpaletteitemDo> resultTpaletteitemDoList = tpaletteitemDao.readListTpaletteitem();
	             if(resultTpaletteitemDoList != null) {
	                 for(int i = 0; i < resultTpaletteitemDoList.size(); i++) {
	                     TpaletteitemDo tpaletteitemDo = resultTpaletteitemDoList.get(i);
	                     if(tpaletteitemDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tpaletteitemDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TstatustypesDao tstatustypesDao = (TstatustypesDao) applicationContext.getBean("tstatustypesDao");
	             List <TstatustypesDo> resultTstatustypesDoList = tstatustypesDao.readListTstatustypes();
	             if(resultTstatustypesDoList != null) {
	                 for(int i = 0; i < resultTstatustypesDoList.size(); i++) {
	                     TstatustypesDo tstatustypesDo = resultTstatustypesDoList.get(i);
	                     if(tstatustypesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tstatustypesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TmethodDao tmethodDao = (TmethodDao) applicationContext.getBean("tmethodDao");
	             List <TmethodDo> resultTmethodDoList = tmethodDao.readListTmethod();
	             if(resultTmethodDoList != null) {
	                 for(int i = 0; i < resultTmethodDoList.size(); i++) {
	                     TmethodDo tmethodDo = resultTmethodDoList.get(i);
	                     if(tmethodDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tmethodDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TtaggedvalueDao ttaggedvalueDao = (TtaggedvalueDao) applicationContext.getBean("ttaggedvalueDao");
	             List <TtaggedvalueDo> resultTtaggedvalueDoList = ttaggedvalueDao.readListTtaggedvalue();
	             if(resultTtaggedvalueDoList != null) {
	                 for(int i = 0; i < resultTtaggedvalueDoList.size(); i++) {
	                     TtaggedvalueDo ttaggedvalueDo = resultTtaggedvalueDoList.get(i);
	                     if(ttaggedvalueDo != null) {
	                         LOGGER.info("object[" + i + "] = " + ttaggedvalueDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TattributeDao tattributeDao = (TattributeDao) applicationContext.getBean("tattributeDao");
	             List <TattributeDo> resultTattributeDoList = tattributeDao.readListTattribute();
	             if(resultTattributeDoList != null) {
	                 for(int i = 0; i < resultTattributeDoList.size(); i++) {
	                     TattributeDo tattributeDo = resultTattributeDoList.get(i);
	                     if(tattributeDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tattributeDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TsecuserpermissionDao tsecuserpermissionDao = (TsecuserpermissionDao) applicationContext.getBean("tsecuserpermissionDao");
	             List <TsecuserpermissionDo> resultTsecuserpermissionDoList = tsecuserpermissionDao.readListTsecuserpermission();
	             if(resultTsecuserpermissionDoList != null) {
	                 for(int i = 0; i < resultTsecuserpermissionDoList.size(); i++) {
	                     TsecuserpermissionDo tsecuserpermissionDo = resultTsecuserpermissionDoList.get(i);
	                     if(tsecuserpermissionDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tsecuserpermissionDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TphaseDao tphaseDao = (TphaseDao) applicationContext.getBean("tphaseDao");
	             List <TphaseDo> resultTphaseDoList = tphaseDao.readListTphase();
	             if(resultTphaseDoList != null) {
	                 for(int i = 0; i < resultTphaseDoList.size(); i++) {
	                     TphaseDo tphaseDo = resultTphaseDoList.get(i);
	                     if(tphaseDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tphaseDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TxrefuserDao txrefuserDao = (TxrefuserDao) applicationContext.getBean("txrefuserDao");
	             List <TxrefuserDo> resultTxrefuserDoList = txrefuserDao.readListTxrefuser();
	             if(resultTxrefuserDoList != null) {
	                 for(int i = 0; i < resultTxrefuserDoList.size(); i++) {
	                     TxrefuserDo txrefuserDo = resultTxrefuserDoList.get(i);
	                     if(txrefuserDo != null) {
	                         LOGGER.info("object[" + i + "] = " + txrefuserDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TdiagramDao tdiagramDao = (TdiagramDao) applicationContext.getBean("tdiagramDao");
	             List <TdiagramDo> resultTdiagramDoList = tdiagramDao.readListTdiagram();
	             if(resultTdiagramDoList != null) {
	                 for(int i = 0; i < resultTdiagramDoList.size(); i++) {
	                     TdiagramDo tdiagramDo = resultTdiagramDoList.get(i);
	                     if(tdiagramDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tdiagramDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             UsystablesDao usystablesDao = (UsystablesDao) applicationContext.getBean("usystablesDao");
	             List <UsystablesDo> resultUsystablesDoList = usystablesDao.readListUsystables();
	             if(resultUsystablesDoList != null) {
	                 for(int i = 0; i < resultUsystablesDoList.size(); i++) {
	                     UsystablesDo usystablesDo = resultUsystablesDoList.get(i);
	                     if(usystablesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + usystablesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TsecgroupDao tsecgroupDao = (TsecgroupDao) applicationContext.getBean("tsecgroupDao");
	             List <TsecgroupDo> resultTsecgroupDoList = tsecgroupDao.readListTsecgroup();
	             if(resultTsecgroupDoList != null) {
	                 for(int i = 0; i < resultTsecgroupDoList.size(); i++) {
	                     TsecgroupDo tsecgroupDo = resultTsecgroupDoList.get(i);
	                     if(tsecgroupDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tsecgroupDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TpaletteDao tpaletteDao = (TpaletteDao) applicationContext.getBean("tpaletteDao");
	             List <TpaletteDo> resultTpaletteDoList = tpaletteDao.readListTpalette();
	             if(resultTpaletteDoList != null) {
	                 for(int i = 0; i < resultTpaletteDoList.size(); i++) {
	                     TpaletteDo tpaletteDo = resultTpaletteDoList.get(i);
	                     if(tpaletteDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tpaletteDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TsecpoliciesDao tsecpoliciesDao = (TsecpoliciesDao) applicationContext.getBean("tsecpoliciesDao");
	             List <TsecpoliciesDo> resultTsecpoliciesDoList = tsecpoliciesDao.readListTsecpolicies();
	             if(resultTsecpoliciesDoList != null) {
	                 for(int i = 0; i < resultTsecpoliciesDoList.size(); i++) {
	                     TsecpoliciesDo tsecpoliciesDo = resultTsecpoliciesDoList.get(i);
	                     if(tsecpoliciesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tsecpoliciesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TxrefsystemDao txrefsystemDao = (TxrefsystemDao) applicationContext.getBean("txrefsystemDao");
	             List <TxrefsystemDo> resultTxrefsystemDoList = txrefsystemDao.readListTxrefsystem();
	             if(resultTxrefsystemDoList != null) {
	                 for(int i = 0; i < resultTxrefsystemDoList.size(); i++) {
	                     TxrefsystemDo txrefsystemDo = resultTxrefsystemDoList.get(i);
	                     if(txrefsystemDo != null) {
	                         LOGGER.info("object[" + i + "] = " + txrefsystemDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TocfDao tocfDao = (TocfDao) applicationContext.getBean("tocfDao");
	             List <TocfDo> resultTocfDoList = tocfDao.readListTocf();
	             if(resultTocfDoList != null) {
	                 for(int i = 0; i < resultTocfDoList.size(); i++) {
	                     TocfDo tocfDo = resultTocfDoList.get(i);
	                     if(tocfDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tocfDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TmainttypesDao tmainttypesDao = (TmainttypesDao) applicationContext.getBean("tmainttypesDao");
	             List <TmainttypesDo> resultTmainttypesDoList = tmainttypesDao.readListTmainttypes();
	             if(resultTmainttypesDoList != null) {
	                 for(int i = 0; i < resultTmainttypesDoList.size(); i++) {
	                     TmainttypesDo tmainttypesDo = resultTmainttypesDoList.get(i);
	                     if(tmainttypesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tmainttypesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TconnectortypesDao tconnectortypesDao = (TconnectortypesDao) applicationContext.getBean("tconnectortypesDao");
	             List <TconnectortypesDo> resultTconnectortypesDoList = tconnectortypesDao.readListTconnectortypes();
	             if(resultTconnectortypesDoList != null) {
	                 for(int i = 0; i < resultTconnectortypesDoList.size(); i++) {
	                     TconnectortypesDo tconnectortypesDo = resultTconnectortypesDoList.get(i);
	                     if(tconnectortypesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tconnectortypesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TstereotypesDao tstereotypesDao = (TstereotypesDao) applicationContext.getBean("tstereotypesDao");
	             List <TstereotypesDo> resultTstereotypesDoList = tstereotypesDao.readListTstereotypes();
	             if(resultTstereotypesDoList != null) {
	                 for(int i = 0; i < resultTstereotypesDoList.size(); i++) {
	                     TstereotypesDo tstereotypesDo = resultTstereotypesDoList.get(i);
	                     if(tstereotypesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tstereotypesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TxrefDao txrefDao = (TxrefDao) applicationContext.getBean("txrefDao");
	             List <TxrefDo> resultTxrefDoList = txrefDao.readListTxref();
	             if(resultTxrefDoList != null) {
	                 for(int i = 0; i < resultTxrefDoList.size(); i++) {
	                     TxrefDo txrefDo = resultTxrefDoList.get(i);
	                     if(txrefDo != null) {
	                         LOGGER.info("object[" + i + "] = " + txrefDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TdatatypesDao tdatatypesDao = (TdatatypesDao) applicationContext.getBean("tdatatypesDao");
	             List <TdatatypesDo> resultTdatatypesDoList = tdatatypesDao.readListTdatatypes();
	             if(resultTdatatypesDoList != null) {
	                 for(int i = 0; i < resultTdatatypesDoList.size(); i++) {
	                     TdatatypesDo tdatatypesDo = resultTdatatypesDoList.get(i);
	                     if(tdatatypesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tdatatypesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TobjectrisksDao tobjectrisksDao = (TobjectrisksDao) applicationContext.getBean("tobjectrisksDao");
	             List <TobjectrisksDo> resultTobjectrisksDoList = tobjectrisksDao.readListTobjectrisks();
	             if(resultTobjectrisksDoList != null) {
	                 for(int i = 0; i < resultTobjectrisksDoList.size(); i++) {
	                     TobjectrisksDo tobjectrisksDo = resultTobjectrisksDoList.get(i);
	                     if(tobjectrisksDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tobjectrisksDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TgenoptDao tgenoptDao = (TgenoptDao) applicationContext.getBean("tgenoptDao");
	             List <TgenoptDo> resultTgenoptDoList = tgenoptDao.readListTgenopt();
	             if(resultTgenoptDoList != null) {
	                 for(int i = 0; i < resultTgenoptDoList.size(); i++) {
	                     TgenoptDo tgenoptDo = resultTgenoptDoList.get(i);
	                     if(tgenoptDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tgenoptDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TauthorsDao tauthorsDao = (TauthorsDao) applicationContext.getBean("tauthorsDao");
	             List <TauthorsDo> resultTauthorsDoList = tauthorsDao.readListTauthors();
	             if(resultTauthorsDoList != null) {
	                 for(int i = 0; i < resultTauthorsDoList.size(); i++) {
	                     TauthorsDo tauthorsDo = resultTauthorsDoList.get(i);
	                     if(tauthorsDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tauthorsDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TsecusergroupDao tsecusergroupDao = (TsecusergroupDao) applicationContext.getBean("tsecusergroupDao");
	             List <TsecusergroupDo> resultTsecusergroupDoList = tsecusergroupDao.readListTsecusergroup();
	             if(resultTsecusergroupDoList != null) {
	                 for(int i = 0; i < resultTsecusergroupDoList.size(); i++) {
	                     TsecusergroupDo tsecusergroupDo = resultTsecusergroupDoList.get(i);
	                     if(tsecusergroupDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tsecusergroupDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             ToperationtagDao toperationtagDao = (ToperationtagDao) applicationContext.getBean("toperationtagDao");
	             List <ToperationtagDo> resultToperationtagDoList = toperationtagDao.readListToperationtag();
	             if(resultToperationtagDoList != null) {
	                 for(int i = 0; i < resultToperationtagDoList.size(); i++) {
	                     ToperationtagDo toperationtagDo = resultToperationtagDoList.get(i);
	                     if(toperationtagDo != null) {
	                         LOGGER.info("object[" + i + "] = " + toperationtagDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TtestplansDao ttestplansDao = (TtestplansDao) applicationContext.getBean("ttestplansDao");
	             List <TtestplansDo> resultTtestplansDoList = ttestplansDao.readListTtestplans();
	             if(resultTtestplansDoList != null) {
	                 for(int i = 0; i < resultTtestplansDoList.size(); i++) {
	                     TtestplansDo ttestplansDo = resultTtestplansDoList.get(i);
	                     if(ttestplansDo != null) {
	                         LOGGER.info("object[" + i + "] = " + ttestplansDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TobjecteffortDao tobjecteffortDao = (TobjecteffortDao) applicationContext.getBean("tobjecteffortDao");
	             List <TobjecteffortDo> resultTobjecteffortDoList = tobjecteffortDao.readListTobjecteffort();
	             if(resultTobjecteffortDoList != null) {
	                 for(int i = 0; i < resultTobjecteffortDoList.size(); i++) {
	                     TobjecteffortDo tobjecteffortDo = resultTobjecteffortDoList.get(i);
	                     if(tobjecteffortDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tobjecteffortDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TrulesDao trulesDao = (TrulesDao) applicationContext.getBean("trulesDao");
	             List <TrulesDo> resultTrulesDoList = trulesDao.readListTrules();
	             if(resultTrulesDoList != null) {
	                 for(int i = 0; i < resultTrulesDoList.size(); i++) {
	                     TrulesDo trulesDo = resultTrulesDoList.get(i);
	                     if(trulesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + trulesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TimplementDao timplementDao = (TimplementDao) applicationContext.getBean("timplementDao");
	             List <TimplementDo> resultTimplementDoList = timplementDao.readListTimplement();
	             if(resultTimplementDoList != null) {
	                 for(int i = 0; i < resultTimplementDoList.size(); i++) {
	                     TimplementDo timplementDo = resultTimplementDoList.get(i);
	                     if(timplementDo != null) {
	                         LOGGER.info("object[" + i + "] = " + timplementDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TobjectrequiresDao tobjectrequiresDao = (TobjectrequiresDao) applicationContext.getBean("tobjectrequiresDao");
	             List <TobjectrequiresDo> resultTobjectrequiresDoList = tobjectrequiresDao.readListTobjectrequires();
	             if(resultTobjectrequiresDoList != null) {
	                 for(int i = 0; i < resultTobjectrequiresDoList.size(); i++) {
	                     TobjectrequiresDo tobjectrequiresDo = resultTobjectrequiresDoList.get(i);
	                     if(tobjectrequiresDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tobjectrequiresDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TattributeconstraintsDao tattributeconstraintsDao = (TattributeconstraintsDao) applicationContext.getBean("tattributeconstraintsDao");
	             List <TattributeconstraintsDo> resultTattributeconstraintsDoList = tattributeconstraintsDao.readListTattributeconstraints();
	             if(resultTattributeconstraintsDoList != null) {
	                 for(int i = 0; i < resultTattributeconstraintsDoList.size(); i++) {
	                     TattributeconstraintsDo tattributeconstraintsDo = resultTattributeconstraintsDoList.get(i);
	                     if(tattributeconstraintsDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tattributeconstraintsDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TsnapshotDao tsnapshotDao = (TsnapshotDao) applicationContext.getBean("tsnapshotDao");
	             List <TsnapshotDo> resultTsnapshotDoList = tsnapshotDao.readListTsnapshot();
	             if(resultTsnapshotDoList != null) {
	                 for(int i = 0; i < resultTsnapshotDoList.size(); i++) {
	                     TsnapshotDo tsnapshotDo = resultTsnapshotDoList.get(i);
	                     if(tsnapshotDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tsnapshotDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TversionDao tversionDao = (TversionDao) applicationContext.getBean("tversionDao");
	             List <TversionDo> resultTversionDoList = tversionDao.readListTversion();
	             if(resultTversionDoList != null) {
	                 for(int i = 0; i < resultTversionDoList.size(); i++) {
	                     TversionDo tversionDo = resultTversionDoList.get(i);
	                     if(tversionDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tversionDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TdocumentDao tdocumentDao = (TdocumentDao) applicationContext.getBean("tdocumentDao");
	             List <TdocumentDo> resultTdocumentDoList = tdocumentDao.readListTdocument();
	             if(resultTdocumentDoList != null) {
	                 for(int i = 0; i < resultTdocumentDoList.size(); i++) {
	                     TdocumentDo tdocumentDo = resultTdocumentDoList.get(i);
	                     if(tdocumentDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tdocumentDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TrtfDao trtfDao = (TrtfDao) applicationContext.getBean("trtfDao");
	             List <TrtfDo> resultTrtfDoList = trtfDao.readListTrtf();
	             if(resultTrtfDoList != null) {
	                 for(int i = 0; i < resultTrtfDoList.size(); i++) {
	                     TrtfDo trtfDo = resultTrtfDoList.get(i);
	                     if(trtfDo != null) {
	                         LOGGER.info("object[" + i + "] = " + trtfDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TlistsDao tlistsDao = (TlistsDao) applicationContext.getBean("tlistsDao");
	             List <TlistsDo> resultTlistsDoList = tlistsDao.readListTlists();
	             if(resultTlistsDoList != null) {
	                 for(int i = 0; i < resultTlistsDoList.size(); i++) {
	                     TlistsDo tlistsDo = resultTlistsDoList.get(i);
	                     if(tlistsDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tlistsDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TmetrictypesDao tmetrictypesDao = (TmetrictypesDao) applicationContext.getBean("tmetrictypesDao");
	             List <TmetrictypesDo> resultTmetrictypesDoList = tmetrictypesDao.readListTmetrictypes();
	             if(resultTmetrictypesDoList != null) {
	                 for(int i = 0; i < resultTmetrictypesDoList.size(); i++) {
	                     TmetrictypesDo tmetrictypesDo = resultTmetrictypesDoList.get(i);
	                     if(tmetrictypesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tmetrictypesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             UsyssystemDao usyssystemDao = (UsyssystemDao) applicationContext.getBean("usyssystemDao");
	             List <UsyssystemDo> resultUsyssystemDoList = usyssystemDao.readListUsyssystem();
	             if(resultUsyssystemDoList != null) {
	                 for(int i = 0; i < resultUsyssystemDoList.size(); i++) {
	                     UsyssystemDo usyssystemDo = resultUsyssystemDoList.get(i);
	                     if(usyssystemDo != null) {
	                         LOGGER.info("object[" + i + "] = " + usyssystemDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TcomplexitytypesDao tcomplexitytypesDao = (TcomplexitytypesDao) applicationContext.getBean("tcomplexitytypesDao");
	             List <TcomplexitytypesDo> resultTcomplexitytypesDoList = tcomplexitytypesDao.readListTcomplexitytypes();
	             if(resultTcomplexitytypesDoList != null) {
	                 for(int i = 0; i < resultTcomplexitytypesDoList.size(); i++) {
	                     TcomplexitytypesDo tcomplexitytypesDo = resultTcomplexitytypesDoList.get(i);
	                     if(tcomplexitytypesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tcomplexitytypesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             ToperationDao toperationDao = (ToperationDao) applicationContext.getBean("toperationDao");
	             List <ToperationDo> resultToperationDoList = toperationDao.readListToperation();
	             if(resultToperationDoList != null) {
	                 for(int i = 0; i < resultToperationDoList.size(); i++) {
	                     ToperationDo toperationDo = resultToperationDoList.get(i);
	                     if(toperationDo != null) {
	                         LOGGER.info("object[" + i + "] = " + toperationDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TconstrainttypesDao tconstrainttypesDao = (TconstrainttypesDao) applicationContext.getBean("tconstrainttypesDao");
	             List <TconstrainttypesDo> resultTconstrainttypesDoList = tconstrainttypesDao.readListTconstrainttypes();
	             if(resultTconstrainttypesDoList != null) {
	                 for(int i = 0; i < resultTconstrainttypesDoList.size(); i++) {
	                     TconstrainttypesDo tconstrainttypesDo = resultTconstrainttypesDoList.get(i);
	                     if(tconstrainttypesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tconstrainttypesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TtestclassDao ttestclassDao = (TtestclassDao) applicationContext.getBean("ttestclassDao");
	             List <TtestclassDo> resultTtestclassDoList = ttestclassDao.readListTtestclass();
	             if(resultTtestclassDoList != null) {
	                 for(int i = 0; i < resultTtestclassDoList.size(); i++) {
	                     TtestclassDo ttestclassDo = resultTtestclassDoList.get(i);
	                     if(ttestclassDo != null) {
	                         LOGGER.info("object[" + i + "] = " + ttestclassDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TobjectscenariosDao tobjectscenariosDao = (TobjectscenariosDao) applicationContext.getBean("tobjectscenariosDao");
	             List <TobjectscenariosDo> resultTobjectscenariosDoList = tobjectscenariosDao.readListTobjectscenarios();
	             if(resultTobjectscenariosDoList != null) {
	                 for(int i = 0; i < resultTobjectscenariosDoList.size(); i++) {
	                     TobjectscenariosDo tobjectscenariosDo = resultTobjectscenariosDoList.get(i);
	                     if(tobjectscenariosDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tobjectscenariosDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TscriptDao tscriptDao = (TscriptDao) applicationContext.getBean("tscriptDao");
	             List <TscriptDo> resultTscriptDoList = tscriptDao.readListTscript();
	             if(resultTscriptDoList != null) {
	                 for(int i = 0; i < resultTscriptDoList.size(); i++) {
	                     TscriptDo tscriptDo = resultTscriptDoList.get(i);
	                     if(tscriptDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tscriptDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TtesttypesDao ttesttypesDao = (TtesttypesDao) applicationContext.getBean("ttesttypesDao");
	             List <TtesttypesDo> resultTtesttypesDoList = ttesttypesDao.readListTtesttypes();
	             if(resultTtesttypesDoList != null) {
	                 for(int i = 0; i < resultTtesttypesDoList.size(); i++) {
	                     TtesttypesDo ttesttypesDo = resultTtesttypesDoList.get(i);
	                     if(ttesttypesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + ttesttypesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TrisktypesDao trisktypesDao = (TrisktypesDao) applicationContext.getBean("trisktypesDao");
	             List <TrisktypesDo> resultTrisktypesDoList = trisktypesDao.readListTrisktypes();
	             if(resultTrisktypesDoList != null) {
	                 for(int i = 0; i < resultTrisktypesDoList.size(); i++) {
	                     TrisktypesDo trisktypesDo = resultTrisktypesDoList.get(i);
	                     if(trisktypesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + trisktypesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             ToperationparamsDao toperationparamsDao = (ToperationparamsDao) applicationContext.getBean("toperationparamsDao");
	             List <ToperationparamsDo> resultToperationparamsDoList = toperationparamsDao.readListToperationparams();
	             if(resultToperationparamsDoList != null) {
	                 for(int i = 0; i < resultToperationparamsDoList.size(); i++) {
	                     ToperationparamsDo toperationparamsDo = resultToperationparamsDoList.get(i);
	                     if(toperationparamsDo != null) {
	                         LOGGER.info("object[" + i + "] = " + toperationparamsDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TecfDao tecfDao = (TecfDao) applicationContext.getBean("tecfDao");
	             List <TecfDo> resultTecfDoList = tecfDao.readListTecf();
	             if(resultTecfDoList != null) {
	                 for(int i = 0; i < resultTecfDoList.size(); i++) {
	                     TecfDo tecfDo = resultTecfDoList.get(i);
	                     if(tecfDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tecfDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TresourcesDao tresourcesDao = (TresourcesDao) applicationContext.getBean("tresourcesDao");
	             List <TresourcesDo> resultTresourcesDoList = tresourcesDao.readListTresources();
	             if(resultTresourcesDoList != null) {
	                 for(int i = 0; i < resultTresourcesDoList.size(); i++) {
	                     TresourcesDo tresourcesDo = resultTresourcesDoList.get(i);
	                     if(tresourcesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tresourcesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TobjectmetricsDao tobjectmetricsDao = (TobjectmetricsDao) applicationContext.getBean("tobjectmetricsDao");
	             List <TobjectmetricsDo> resultTobjectmetricsDoList = tobjectmetricsDao.readListTobjectmetrics();
	             if(resultTobjectmetricsDoList != null) {
	                 for(int i = 0; i < resultTobjectmetricsDoList.size(); i++) {
	                     TobjectmetricsDo tobjectmetricsDo = resultTobjectmetricsDoList.get(i);
	                     if(tobjectmetricsDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tobjectmetricsDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TimageDao timageDao = (TimageDao) applicationContext.getBean("timageDao");
	             List <TimageDo> resultTimageDoList = timageDao.readListTimage();
	             if(resultTimageDoList != null) {
	                 for(int i = 0; i < resultTimageDoList.size(); i++) {
	                     TimageDo timageDo = resultTimageDoList.get(i);
	                     if(timageDo != null) {
	                         LOGGER.info("object[" + i + "] = " + timageDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TdiagramtypesDao tdiagramtypesDao = (TdiagramtypesDao) applicationContext.getBean("tdiagramtypesDao");
	             List <TdiagramtypesDo> resultTdiagramtypesDoList = tdiagramtypesDao.readListTdiagramtypes();
	             if(resultTdiagramtypesDoList != null) {
	                 for(int i = 0; i < resultTdiagramtypesDoList.size(); i++) {
	                     TdiagramtypesDo tdiagramtypesDo = resultTdiagramtypesDoList.get(i);
	                     if(tdiagramtypesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tdiagramtypesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TobjecttestsDao tobjecttestsDao = (TobjecttestsDao) applicationContext.getBean("tobjecttestsDao");
	             List <TobjecttestsDo> resultTobjecttestsDoList = tobjecttestsDao.readListTobjecttests();
	             if(resultTobjecttestsDoList != null) {
	                 for(int i = 0; i < resultTobjecttestsDoList.size(); i++) {
	                     TobjecttestsDo tobjecttestsDo = resultTobjecttestsDoList.get(i);
	                     if(tobjecttestsDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tobjecttestsDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TdiagramobjectsDao tdiagramobjectsDao = (TdiagramobjectsDao) applicationContext.getBean("tdiagramobjectsDao");
	             List <TdiagramobjectsDo> resultTdiagramobjectsDoList = tdiagramobjectsDao.readListTdiagramobjects();
	             if(resultTdiagramobjectsDoList != null) {
	                 for(int i = 0; i < resultTdiagramobjectsDoList.size(); i++) {
	                     TdiagramobjectsDo tdiagramobjectsDo = resultTdiagramobjectsDoList.get(i);
	                     if(tdiagramobjectsDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tdiagramobjectsDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             UsysoldtablesDao usysoldtablesDao = (UsysoldtablesDao) applicationContext.getBean("usysoldtablesDao");
	             List <UsysoldtablesDo> resultUsysoldtablesDoList = usysoldtablesDao.readListUsysoldtables();
	             if(resultUsysoldtablesDoList != null) {
	                 for(int i = 0; i < resultUsysoldtablesDoList.size(); i++) {
	                     UsysoldtablesDo usysoldtablesDo = resultUsysoldtablesDoList.get(i);
	                     if(usysoldtablesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + usysoldtablesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TobjectfilesDao tobjectfilesDao = (TobjectfilesDao) applicationContext.getBean("tobjectfilesDao");
	             List <TobjectfilesDo> resultTobjectfilesDoList = tobjectfilesDao.readListTobjectfiles();
	             if(resultTobjectfilesDoList != null) {
	                 for(int i = 0; i < resultTobjectfilesDoList.size(); i++) {
	                     TobjectfilesDo tobjectfilesDo = resultTobjectfilesDoList.get(i);
	                     if(tobjectfilesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tobjectfilesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TcategoryDao tcategoryDao = (TcategoryDao) applicationContext.getBean("tcategoryDao");
	             List <TcategoryDo> resultTcategoryDoList = tcategoryDao.readListTcategory();
	             if(resultTcategoryDoList != null) {
	                 for(int i = 0; i < resultTcategoryDoList.size(); i++) {
	                     TcategoryDo tcategoryDo = resultTcategoryDoList.get(i);
	                     if(tcategoryDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tcategoryDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TissuesDao tissuesDao = (TissuesDao) applicationContext.getBean("tissuesDao");
	             List <TissuesDo> resultTissuesDoList = tissuesDao.readListTissues();
	             if(resultTissuesDoList != null) {
	                 for(int i = 0; i < resultTissuesDoList.size(); i++) {
	                     TissuesDo tissuesDo = resultTissuesDoList.get(i);
	                     if(tissuesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tissuesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             ThtmlDao thtmlDao = (ThtmlDao) applicationContext.getBean("thtmlDao");
	             List <ThtmlDo> resultThtmlDoList = thtmlDao.readListThtml();
	             if(resultThtmlDoList != null) {
	                 for(int i = 0; i < resultThtmlDoList.size(); i++) {
	                     ThtmlDo thtmlDo = resultThtmlDoList.get(i);
	                     if(thtmlDo != null) {
	                         LOGGER.info("object[" + i + "] = " + thtmlDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TobjectresourceDao tobjectresourceDao = (TobjectresourceDao) applicationContext.getBean("tobjectresourceDao");
	             List <TobjectresourceDo> resultTobjectresourceDoList = tobjectresourceDao.readListTobjectresource();
	             if(resultTobjectresourceDoList != null) {
	                 for(int i = 0; i < resultTobjectresourceDoList.size(); i++) {
	                     TobjectresourceDo tobjectresourceDo = resultTobjectresourceDoList.get(i);
	                     if(tobjectresourceDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tobjectresourceDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             ToperationpresDao toperationpresDao = (ToperationpresDao) applicationContext.getBean("toperationpresDao");
	             List <ToperationpresDo> resultToperationpresDoList = toperationpresDao.readListToperationpres();
	             if(resultToperationpresDoList != null) {
	                 for(int i = 0; i < resultToperationpresDoList.size(); i++) {
	                     ToperationpresDo toperationpresDo = resultToperationpresDoList.get(i);
	                     if(toperationpresDo != null) {
	                         LOGGER.info("object[" + i + "] = " + toperationpresDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TfilesDao tfilesDao = (TfilesDao) applicationContext.getBean("tfilesDao");
	             List <TfilesDo> resultTfilesDoList = tfilesDao.readListTfiles();
	             if(resultTfilesDoList != null) {
	                 for(int i = 0; i < resultTfilesDoList.size(); i++) {
	                     TfilesDo tfilesDo = resultTfilesDoList.get(i);
	                     if(tfilesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tfilesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TglossaryDao tglossaryDao = (TglossaryDao) applicationContext.getBean("tglossaryDao");
	             List <TglossaryDo> resultTglossaryDoList = tglossaryDao.readListTglossary();
	             if(resultTglossaryDoList != null) {
	                 for(int i = 0; i < resultTglossaryDoList.size(); i++) {
	                     TglossaryDo tglossaryDo = resultTglossaryDoList.get(i);
	                     if(tglossaryDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tglossaryDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TsecuserDao tsecuserDao = (TsecuserDao) applicationContext.getBean("tsecuserDao");
	             List <TsecuserDo> resultTsecuserDoList = tsecuserDao.readListTsecuser();
	             if(resultTsecuserDoList != null) {
	                 for(int i = 0; i < resultTsecuserDoList.size(); i++) {
	                     TsecuserDo tsecuserDo = resultTsecuserDoList.get(i);
	                     if(tsecuserDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tsecuserDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TseclocksDao tseclocksDao = (TseclocksDao) applicationContext.getBean("tseclocksDao");
	             List <TseclocksDo> resultTseclocksDoList = tseclocksDao.readListTseclocks();
	             if(resultTseclocksDoList != null) {
	                 for(int i = 0; i < resultTseclocksDoList.size(); i++) {
	                     TseclocksDo tseclocksDo = resultTseclocksDoList.get(i);
	                     if(tseclocksDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tseclocksDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TclientsDao tclientsDao = (TclientsDao) applicationContext.getBean("tclientsDao");
	             List <TclientsDo> resultTclientsDoList = tclientsDao.readListTclients();
	             if(resultTclientsDoList != null) {
	                 for(int i = 0; i < resultTclientsDoList.size(); i++) {
	                     TclientsDo tclientsDo = resultTclientsDoList.get(i);
	                     if(tclientsDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tclientsDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TdiagramlinksDao tdiagramlinksDao = (TdiagramlinksDao) applicationContext.getBean("tdiagramlinksDao");
	             List <TdiagramlinksDo> resultTdiagramlinksDoList = tdiagramlinksDao.readListTdiagramlinks();
	             if(resultTdiagramlinksDoList != null) {
	                 for(int i = 0; i < resultTdiagramlinksDoList.size(); i++) {
	                     TdiagramlinksDo tdiagramlinksDo = resultTdiagramlinksDoList.get(i);
	                     if(tdiagramlinksDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tdiagramlinksDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TrequiretypesDao trequiretypesDao = (TrequiretypesDao) applicationContext.getBean("trequiretypesDao");
	             List <TrequiretypesDo> resultTrequiretypesDoList = trequiretypesDao.readListTrequiretypes();
	             if(resultTrequiretypesDoList != null) {
	                 for(int i = 0; i < resultTrequiretypesDoList.size(); i++) {
	                     TrequiretypesDo trequiretypesDo = resultTrequiretypesDoList.get(i);
	                     if(trequiretypesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + trequiretypesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TrtfreportDao trtfreportDao = (TrtfreportDao) applicationContext.getBean("trtfreportDao");
	             List <TrtfreportDo> resultTrtfreportDoList = trtfreportDao.readListTrtfreport();
	             if(resultTrtfreportDoList != null) {
	                 for(int i = 0; i < resultTrtfreportDoList.size(); i++) {
	                     TrtfreportDo trtfreportDo = resultTrtfreportDoList.get(i);
	                     if(trtfreportDo != null) {
	                         LOGGER.info("object[" + i + "] = " + trtfreportDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TscenariotypesDao tscenariotypesDao = (TscenariotypesDao) applicationContext.getBean("tscenariotypesDao");
	             List <TscenariotypesDo> resultTscenariotypesDoList = tscenariotypesDao.readListTscenariotypes();
	             if(resultTscenariotypesDoList != null) {
	                 for(int i = 0; i < resultTscenariotypesDoList.size(); i++) {
	                     TscenariotypesDo tscenariotypesDo = resultTscenariotypesDoList.get(i);
	                     if(tscenariotypesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tscenariotypesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TattributetagDao tattributetagDao = (TattributetagDao) applicationContext.getBean("tattributetagDao");
	             List <TattributetagDo> resultTattributetagDoList = tattributetagDao.readListTattributetag();
	             if(resultTattributetagDoList != null) {
	                 for(int i = 0; i < resultTattributetagDoList.size(); i++) {
	                     TattributetagDo tattributetagDo = resultTattributetagDoList.get(i);
	                     if(tattributetagDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tattributetagDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TcardinalityDao tcardinalityDao = (TcardinalityDao) applicationContext.getBean("tcardinalityDao");
	             List <TcardinalityDo> resultTcardinalityDoList = tcardinalityDao.readListTcardinality();
	             if(resultTcardinalityDoList != null) {
	                 for(int i = 0; i < resultTcardinalityDoList.size(); i++) {
	                     TcardinalityDo tcardinalityDo = resultTcardinalityDoList.get(i);
	                     if(tcardinalityDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tcardinalityDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TconstantsDao tconstantsDao = (TconstantsDao) applicationContext.getBean("tconstantsDao");
	             List <TconstantsDo> resultTconstantsDoList = tconstantsDao.readListTconstants();
	             if(resultTconstantsDoList != null) {
	                 for(int i = 0; i < resultTconstantsDoList.size(); i++) {
	                     TconstantsDo tconstantsDo = resultTconstantsDoList.get(i);
	                     if(tconstantsDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tconstantsDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TtrxtypesDao ttrxtypesDao = (TtrxtypesDao) applicationContext.getBean("ttrxtypesDao");
	             List <TtrxtypesDo> resultTtrxtypesDoList = ttrxtypesDao.readListTtrxtypes();
	             if(resultTtrxtypesDoList != null) {
	                 for(int i = 0; i < resultTtrxtypesDoList.size(); i++) {
	                     TtrxtypesDo ttrxtypesDo = resultTtrxtypesDoList.get(i);
	                     if(ttrxtypesDo != null) {
	                         LOGGER.info("object[" + i + "] = " + ttrxtypesDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TconnectorconstraintDao tconnectorconstraintDao = (TconnectorconstraintDao) applicationContext.getBean("tconnectorconstraintDao");
	             List <TconnectorconstraintDo> resultTconnectorconstraintDoList = tconnectorconstraintDao.readListTconnectorconstraint();
	             if(resultTconnectorconstraintDoList != null) {
	                 for(int i = 0; i < resultTconnectorconstraintDoList.size(); i++) {
	                     TconnectorconstraintDo tconnectorconstraintDo = resultTconnectorconstraintDoList.get(i);
	                     if(tconnectorconstraintDo != null) {
	                         LOGGER.info("object[" + i + "] = " + tconnectorconstraintDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             TtasksDao ttasksDao = (TtasksDao) applicationContext.getBean("ttasksDao");
	             List <TtasksDo> resultTtasksDoList = ttasksDao.readListTtasks();
	             if(resultTtasksDoList != null) {
	                 for(int i = 0; i < resultTtasksDoList.size(); i++) {
	                     TtasksDo ttasksDo = resultTtasksDoList.get(i);
	                     if(ttasksDo != null) {
	                         LOGGER.info("object[" + i + "] = " + ttasksDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



	             ToperationpostsDao toperationpostsDao = (ToperationpostsDao) applicationContext.getBean("toperationpostsDao");
	             List <ToperationpostsDo> resultToperationpostsDoList = toperationpostsDao.readListToperationposts();
	             if(resultToperationpostsDoList != null) {
	                 for(int i = 0; i < resultToperationpostsDoList.size(); i++) {
	                     ToperationpostsDo toperationpostsDo = resultToperationpostsDoList.get(i);
	                     if(toperationpostsDo != null) {
	                         LOGGER.info("object[" + i + "] = " + toperationpostsDo.toString());
	                     } else {
	                         LOGGER.info("object[" + i + "] = null");
	                     }
	                 }
	             }



			} catch(Exception ex) {
				platformTransactionManager.rollback(transactionStatus0001);
			    throw ex;
			}
			platformTransactionManager.commit(transactionStatus0001);

			
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
