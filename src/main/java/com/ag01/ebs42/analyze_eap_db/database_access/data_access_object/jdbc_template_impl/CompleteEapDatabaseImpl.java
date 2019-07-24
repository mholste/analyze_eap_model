package com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.jdbc_template_impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.ag01.ebs42.analyze.database_access.domain_object.*;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.CompleteEapDatabase;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TattributeDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TattributeconstraintsDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TattributetagDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TauthorsDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TcardinalityDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TcategoryDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TclientsDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TcomplexitytypesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TconnectorDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TconnectorconstraintDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TconnectortagDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TconnectortypesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TconstantsDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TconstrainttypesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TdatatypesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TdiagramDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TdiagramlinksDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TdiagramobjectsDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TdiagramtypesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TdocumentDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TecfDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TefforttypesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TfilesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TgenoptDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TglossaryDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.ThtmlDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TimageDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TimplementDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TissuesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TlistsDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TmainttypesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TmethodDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TmetrictypesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TobjectDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TobjectconstraintDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TobjecteffortDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TobjectfilesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TobjectmetricsDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TobjectproblemsDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TobjectpropertiesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TobjectrequiresDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TobjectresourceDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TobjectrisksDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TobjectscenariosDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TobjecttestsDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TobjecttrxDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TobjecttypesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TocfDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.ToperationDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.ToperationparamsDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.ToperationpostsDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.ToperationpresDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.ToperationtagDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TpackageDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TpaletteDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TpaletteitemDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TphaseDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TprimitivesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TproblemtypesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TprojectrolesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TpropertytypesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TrequiretypesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TresourcesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TrisktypesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TroleconstraintDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TrtfDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TrtfreportDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TrulesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TscenariotypesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TscriptDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TsecgroupDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TsecgrouppermissionDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TseclocksDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TsecpermissionDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TsecpoliciesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TsecuserDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TsecusergroupDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TsecuserpermissionDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TsnapshotDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TstatustypesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TstereotypesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TtaggedvalueDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TtasksDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TtcfDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TtemplateDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TtestclassDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TtestplansDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TtesttypesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TtrxtypesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TumlpatternDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TversionDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TxrefDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TxrefsystemDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TxrefuserDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.UsysoldtablesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.UsysqueriesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.UsyssystemDao;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.UsystablesDao;

public class CompleteEapDatabaseImpl implements CompleteEapDatabase {
	
	private static Logger LOGGER = LogManager.getLogger(CompleteEapDatabaseImpl.class);
	
	private PlatformTransactionManager platformTransactionManager;
	
	private TattributeDao tattributeDao;
	private TattributeconstraintsDao tattributeconstraintsDao;
	private TattributetagDao tattributetagDao;
	private TauthorsDao tauthorsDao;
	private TcardinalityDao tcardinalityDao;
	private TcategoryDao tcategoryDao;
	private TclientsDao tclientsDao;
	private TcomplexitytypesDao tcomplexitytypesDao;
	private TconnectorDao tconnectorDao;
	private TconnectorconstraintDao tconnectorconstraintDao;
	private TconnectortagDao tconnectortagDao;
	private TconnectortypesDao tconnectortypesDao;
	private TconstantsDao tconstantsDao;
	private TconstrainttypesDao tconstrainttypesDao;
	private TdatatypesDao tdatatypesDao;
	private TdiagramDao tdiagramDao;
	private TdiagramlinksDao tdiagramlinksDao;
	private TdiagramobjectsDao tdiagramobjectsDao;
	private TdiagramtypesDao tdiagramtypesDao;
	private TdocumentDao tdocumentDao;
	private TecfDao tecfDao;
	private TefforttypesDao tefforttypesDao;
	private TfilesDao tfilesDao;
	private TgenoptDao tgenoptDao;
	private TglossaryDao tglossaryDao;
	private ThtmlDao thtmlDao;
	private TimageDao timageDao;
	private TimplementDao timplementDao;
	private TissuesDao tissuesDao;
	private TlistsDao tlistsDao;
	private TmainttypesDao tmainttypesDao;
	private TmethodDao tmethodDao;
	private TmetrictypesDao tmetrictypesDao;
	private TobjectDao tobjectDao;
	private TobjectconstraintDao tobjectconstraintDao;
	private TobjecteffortDao tobjecteffortDao;
	private TobjectfilesDao tobjectfilesDao;
	private TobjectmetricsDao tobjectmetricsDao;
	private TobjectproblemsDao tobjectproblemsDao;
	private TobjectpropertiesDao tobjectpropertiesDao;
	private TobjectrequiresDao tobjectrequiresDao;
	private TobjectresourceDao tobjectresourceDao;
	private TobjectrisksDao tobjectrisksDao;
	private TobjectscenariosDao tobjectscenariosDao;
	private TobjecttestsDao tobjecttestsDao;
	private TobjecttrxDao tobjecttrxDao;
	private TobjecttypesDao tobjecttypesDao;
	private TocfDao tocfDao;
	private ToperationDao toperationDao;
	private ToperationparamsDao toperationparamsDao;
	private ToperationpostsDao toperationpostsDao;
	private ToperationpresDao toperationpresDao;
	private ToperationtagDao toperationtagDao;
	private TpackageDao tpackageDao;
	private TpaletteDao tpaletteDao;
	private TpaletteitemDao tpaletteitemDao;
	private TphaseDao tphaseDao;
	private TprimitivesDao tprimitivesDao;
	private TproblemtypesDao tproblemtypesDao;
	private TprojectrolesDao tprojectrolesDao;
	private TpropertytypesDao tpropertytypesDao;
	private TrequiretypesDao trequiretypesDao;
	private TresourcesDao tresourcesDao;
	private TrisktypesDao trisktypesDao;
	private TroleconstraintDao troleconstraintDao;
	private TrtfDao trtfDao;
	private TrtfreportDao trtfreportDao;
	private TrulesDao trulesDao;
	private TscenariotypesDao tscenariotypesDao;
	private TscriptDao tscriptDao;
	private TsecgroupDao tsecgroupDao;
	private TsecgrouppermissionDao tsecgrouppermissionDao;
	private TseclocksDao tseclocksDao;
	private TsecpermissionDao tsecpermissionDao;
	private TsecpoliciesDao tsecpoliciesDao;
	private TsecuserDao tsecuserDao;
	private TsecusergroupDao tsecusergroupDao;
	private TsecuserpermissionDao tsecuserpermissionDao;
	private TsnapshotDao tsnapshotDao;
	private TstatustypesDao tstatustypesDao;
	private TstereotypesDao tstereotypesDao;
	private TtaggedvalueDao ttaggedvalueDao;
	private TtasksDao ttasksDao;
	private TtcfDao ttcfDao;
	private TtemplateDao ttemplateDao;
	private TtestclassDao ttestclassDao;
	private TtestplansDao ttestplansDao;
	private TtesttypesDao ttesttypesDao;
	private TtrxtypesDao ttrxtypesDao;
	private TumlpatternDao tumlpatternDao;
	private TversionDao tversionDao;
	private TxrefDao txrefDao;
	private TxrefsystemDao txrefsystemDao;
	private TxrefuserDao txrefuserDao;
	private UsysoldtablesDao usysoldtablesDao;
	private UsysqueriesDao usysqueriesDao;
	private UsyssystemDao usyssystemDao;
	private UsystablesDao usystablesDao;
	
	public void setPlatformTransactionManager(PlatformTransactionManager platformTransactionManager) {
		this.platformTransactionManager = platformTransactionManager;
	}

	public void setTattributeDao(TattributeDao tattributeDao) {
		this.tattributeDao = tattributeDao;
	}

	public void setTattributeconstraintsDao(TattributeconstraintsDao tattributeconstraintsDao) {
		this.tattributeconstraintsDao = tattributeconstraintsDao;
	}

	public void setTattributetagDao(TattributetagDao tattributetagDao) {
		this.tattributetagDao = tattributetagDao;
	}

	public void setTauthorsDao(TauthorsDao tauthorsDao) {
		this.tauthorsDao = tauthorsDao;
	}

	public void setTcardinalityDao(TcardinalityDao tcardinalityDao) {
		this.tcardinalityDao = tcardinalityDao;
	}

	public void setTcategoryDao(TcategoryDao tcategoryDao) {
		this.tcategoryDao = tcategoryDao;
	}

	public void setTclientsDao(TclientsDao tclientsDao) {
		this.tclientsDao = tclientsDao;
	}

	public void setTcomplexitytypesDao(TcomplexitytypesDao tcomplexitytypesDao) {
		this.tcomplexitytypesDao = tcomplexitytypesDao;
	}

	public void setTconnectorDao(TconnectorDao tconnectorDao) {
		this.tconnectorDao = tconnectorDao;
	}

	public void setTconnectorconstraintDao(TconnectorconstraintDao tconnectorconstraintDao) {
		this.tconnectorconstraintDao = tconnectorconstraintDao;
	}

	public void setTconnectortagDao(TconnectortagDao tconnectortagDao) {
		this.tconnectortagDao = tconnectortagDao;
	}

	public void setTconnectortypesDao(TconnectortypesDao tconnectortypesDao) {
		this.tconnectortypesDao = tconnectortypesDao;
	}

	public void setTconstantsDao(TconstantsDao tconstantsDao) {
		this.tconstantsDao = tconstantsDao;
	}

	public void setTconstrainttypesDao(TconstrainttypesDao tconstrainttypesDao) {
		this.tconstrainttypesDao = tconstrainttypesDao;
	}

	public void setTdatatypesDao(TdatatypesDao tdatatypesDao) {
		this.tdatatypesDao = tdatatypesDao;
	}

	public void setTdiagramDao(TdiagramDao tdiagramDao) {
		this.tdiagramDao = tdiagramDao;
	}

	public void setTdiagramlinksDao(TdiagramlinksDao tdiagramlinksDao) {
		this.tdiagramlinksDao = tdiagramlinksDao;
	}

	public void setTdiagramobjectsDao(TdiagramobjectsDao tdiagramobjectsDao) {
		this.tdiagramobjectsDao = tdiagramobjectsDao;
	}

	public void setTdiagramtypesDao(TdiagramtypesDao tdiagramtypesDao) {
		this.tdiagramtypesDao = tdiagramtypesDao;
	}

	public void setTdocumentDao(TdocumentDao tdocumentDao) {
		this.tdocumentDao = tdocumentDao;
	}

	public void setTecfDao(TecfDao tecfDao) {
		this.tecfDao = tecfDao;
	}

	public void setTefforttypesDao(TefforttypesDao tefforttypesDao) {
		this.tefforttypesDao = tefforttypesDao;
	}

	public void setTfilesDao(TfilesDao tfilesDao) {
		this.tfilesDao = tfilesDao;
	}

	public void setTgenoptDao(TgenoptDao tgenoptDao) {
		this.tgenoptDao = tgenoptDao;
	}

	public void setTglossaryDao(TglossaryDao tglossaryDao) {
		this.tglossaryDao = tglossaryDao;
	}

	public void setThtmlDao(ThtmlDao thtmlDao) {
		this.thtmlDao = thtmlDao;
	}

	public void setTimageDao(TimageDao timageDao) {
		this.timageDao = timageDao;
	}

	public void setTimplementDao(TimplementDao timplementDao) {
		this.timplementDao = timplementDao;
	}

	public void setTissuesDao(TissuesDao tissuesDao) {
		this.tissuesDao = tissuesDao;
	}

	public void setTlistsDao(TlistsDao tlistsDao) {
		this.tlistsDao = tlistsDao;
	}

	public void setTmainttypesDao(TmainttypesDao tmainttypesDao) {
		this.tmainttypesDao = tmainttypesDao;
	}

	public void setTmethodDao(TmethodDao tmethodDao) {
		this.tmethodDao = tmethodDao;
	}

	public void setTmetrictypesDao(TmetrictypesDao tmetrictypesDao) {
		this.tmetrictypesDao = tmetrictypesDao;
	}

	public void setTobjectDao(TobjectDao tobjectDao) {
		this.tobjectDao = tobjectDao;
	}

	public void setTobjectconstraintDao(TobjectconstraintDao tobjectconstraintDao) {
		this.tobjectconstraintDao = tobjectconstraintDao;
	}

	public void setTobjecteffortDao(TobjecteffortDao tobjecteffortDao) {
		this.tobjecteffortDao = tobjecteffortDao;
	}

	public void setTobjectfilesDao(TobjectfilesDao tobjectfilesDao) {
		this.tobjectfilesDao = tobjectfilesDao;
	}

	public void setTobjectmetricsDao(TobjectmetricsDao tobjectmetricsDao) {
		this.tobjectmetricsDao = tobjectmetricsDao;
	}

	public void setTobjectproblemsDao(TobjectproblemsDao tobjectproblemsDao) {
		this.tobjectproblemsDao = tobjectproblemsDao;
	}

	public void setTobjectpropertiesDao(TobjectpropertiesDao tobjectpropertiesDao) {
		this.tobjectpropertiesDao = tobjectpropertiesDao;
	}

	public void setTobjectrequiresDao(TobjectrequiresDao tobjectrequiresDao) {
		this.tobjectrequiresDao = tobjectrequiresDao;
	}

	public void setTobjectresourceDao(TobjectresourceDao tobjectresourceDao) {
		this.tobjectresourceDao = tobjectresourceDao;
	}

	public void setTobjectrisksDao(TobjectrisksDao tobjectrisksDao) {
		this.tobjectrisksDao = tobjectrisksDao;
	}

	public void setTobjectscenariosDao(TobjectscenariosDao tobjectscenariosDao) {
		this.tobjectscenariosDao = tobjectscenariosDao;
	}

	public void setTobjecttestsDao(TobjecttestsDao tobjecttestsDao) {
		this.tobjecttestsDao = tobjecttestsDao;
	}

	public void setTobjecttrxDao(TobjecttrxDao tobjecttrxDao) {
		this.tobjecttrxDao = tobjecttrxDao;
	}

	public void setTobjecttypesDao(TobjecttypesDao tobjecttypesDao) {
		this.tobjecttypesDao = tobjecttypesDao;
	}

	public void setTocfDao(TocfDao tocfDao) {
		this.tocfDao = tocfDao;
	}

	public void setToperationDao(ToperationDao toperationDao) {
		this.toperationDao = toperationDao;
	}

	public void setToperationparamsDao(ToperationparamsDao toperationparamsDao) {
		this.toperationparamsDao = toperationparamsDao;
	}

	public void setToperationpostsDao(ToperationpostsDao toperationpostsDao) {
		this.toperationpostsDao = toperationpostsDao;
	}

	public void setToperationpresDao(ToperationpresDao toperationpresDao) {
		this.toperationpresDao = toperationpresDao;
	}

	public void setToperationtagDao(ToperationtagDao toperationtagDao) {
		this.toperationtagDao = toperationtagDao;
	}

	public void setTpackageDao(TpackageDao tpackageDao) {
		this.tpackageDao = tpackageDao;
	}

	public void setTpaletteDao(TpaletteDao tpaletteDao) {
		this.tpaletteDao = tpaletteDao;
	}

	public void setTpaletteitemDao(TpaletteitemDao tpaletteitemDao) {
		this.tpaletteitemDao = tpaletteitemDao;
	}

	public void setTphaseDao(TphaseDao tphaseDao) {
		this.tphaseDao = tphaseDao;
	}

	public void setTprimitivesDao(TprimitivesDao tprimitivesDao) {
		this.tprimitivesDao = tprimitivesDao;
	}

	public void setTproblemtypesDao(TproblemtypesDao tproblemtypesDao) {
		this.tproblemtypesDao = tproblemtypesDao;
	}

	public void setTprojectrolesDao(TprojectrolesDao tprojectrolesDao) {
		this.tprojectrolesDao = tprojectrolesDao;
	}

	public void setTpropertytypesDao(TpropertytypesDao tpropertytypesDao) {
		this.tpropertytypesDao = tpropertytypesDao;
	}

	public void setTrequiretypesDao(TrequiretypesDao trequiretypesDao) {
		this.trequiretypesDao = trequiretypesDao;
	}

	public void setTresourcesDao(TresourcesDao tresourcesDao) {
		this.tresourcesDao = tresourcesDao;
	}

	public void setTrisktypesDao(TrisktypesDao trisktypesDao) {
		this.trisktypesDao = trisktypesDao;
	}

	public void setTroleconstraintDao(TroleconstraintDao troleconstraintDao) {
		this.troleconstraintDao = troleconstraintDao;
	}

	public void setTrtfDao(TrtfDao trtfDao) {
		this.trtfDao = trtfDao;
	}

	public void setTrtfreportDao(TrtfreportDao trtfreportDao) {
		this.trtfreportDao = trtfreportDao;
	}

	public void setTrulesDao(TrulesDao trulesDao) {
		this.trulesDao = trulesDao;
	}

	public void setTscenariotypesDao(TscenariotypesDao tscenariotypesDao) {
		this.tscenariotypesDao = tscenariotypesDao;
	}

	public void setTscriptDao(TscriptDao tscriptDao) {
		this.tscriptDao = tscriptDao;
	}

	public void setTsecgroupDao(TsecgroupDao tsecgroupDao) {
		this.tsecgroupDao = tsecgroupDao;
	}

	public void setTsecgrouppermissionDao(TsecgrouppermissionDao tsecgrouppermissionDao) {
		this.tsecgrouppermissionDao = tsecgrouppermissionDao;
	}

	public void setTseclocksDao(TseclocksDao tseclocksDao) {
		this.tseclocksDao = tseclocksDao;
	}

	public void setTsecpermissionDao(TsecpermissionDao tsecpermissionDao) {
		this.tsecpermissionDao = tsecpermissionDao;
	}

	public void setTsecpoliciesDao(TsecpoliciesDao tsecpoliciesDao) {
		this.tsecpoliciesDao = tsecpoliciesDao;
	}

	public void setTsecuserDao(TsecuserDao tsecuserDao) {
		this.tsecuserDao = tsecuserDao;
	}

	public void setTsecusergroupDao(TsecusergroupDao tsecusergroupDao) {
		this.tsecusergroupDao = tsecusergroupDao;
	}

	public void setTsecuserpermissionDao(TsecuserpermissionDao tsecuserpermissionDao) {
		this.tsecuserpermissionDao = tsecuserpermissionDao;
	}

	public void setTsnapshotDao(TsnapshotDao tsnapshotDao) {
		this.tsnapshotDao = tsnapshotDao;
	}

	public void setTstatustypesDao(TstatustypesDao tstatustypesDao) {
		this.tstatustypesDao = tstatustypesDao;
	}

	public void setTstereotypesDao(TstereotypesDao tstereotypesDao) {
		this.tstereotypesDao = tstereotypesDao;
	}

	public void setTtaggedvalueDao(TtaggedvalueDao ttaggedvalueDao) {
		this.ttaggedvalueDao = ttaggedvalueDao;
	}

	public void setTtasksDao(TtasksDao ttasksDao) {
		this.ttasksDao = ttasksDao;
	}

	public void setTtcfDao(TtcfDao ttcfDao) {
		this.ttcfDao = ttcfDao;
	}

	public void setTtemplateDao(TtemplateDao ttemplateDao) {
		this.ttemplateDao = ttemplateDao;
	}

	public void setTtestclassDao(TtestclassDao ttestclassDao) {
		this.ttestclassDao = ttestclassDao;
	}

	public void setTtestplansDao(TtestplansDao ttestplansDao) {
		this.ttestplansDao = ttestplansDao;
	}

	public void setTtesttypesDao(TtesttypesDao ttesttypesDao) {
		this.ttesttypesDao = ttesttypesDao;
	}

	public void setTtrxtypesDao(TtrxtypesDao ttrxtypesDao) {
		this.ttrxtypesDao = ttrxtypesDao;
	}

	public void setTumlpatternDao(TumlpatternDao tumlpatternDao) {
		this.tumlpatternDao = tumlpatternDao;
	}

	public void setTversionDao(TversionDao tversionDao) {
		this.tversionDao = tversionDao;
	}

	public void setTxrefDao(TxrefDao txrefDao) {
		this.txrefDao = txrefDao;
	}

	public void setTxrefsystemDao(TxrefsystemDao txrefsystemDao) {
		this.txrefsystemDao = txrefsystemDao;
	}

	public void setTxrefuserDao(TxrefuserDao txrefuserDao) {
		this.txrefuserDao = txrefuserDao;
	}

	public void setUsysoldtablesDao(UsysoldtablesDao usysoldtablesDao) {
		this.usysoldtablesDao = usysoldtablesDao;
	}

	public void setUsysqueriesDao(UsysqueriesDao usysqueriesDao) {
		this.usysqueriesDao = usysqueriesDao;
	}

	public void setUsyssystemDao(UsyssystemDao usyssystemDao) {
		this.usyssystemDao = usyssystemDao;
	}

	public void setUsystablesDao(UsystablesDao usystablesDao) {
		this.usystablesDao = usystablesDao;
	}

	@Override
	public CompleteEabDatabaseDo readCompleteEabDatabase() throws Exception {
		CompleteEabDatabaseDo completeEabDatabaseDo = null;
		
		TransactionStatus transactionStatus0001 = null;
				
		completeEabDatabaseDo = new CompleteEabDatabaseDo();
		
		try {
			DefaultTransactionDefinition defaultTransactionDefinition = new DefaultTransactionDefinition();
			
			defaultTransactionDefinition.setName("READ_COMPLETE_EAP_DATABASE_0001");
			defaultTransactionDefinition.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
			
			transactionStatus0001 = platformTransactionManager.getTransaction(defaultTransactionDefinition);
						
            List <TefforttypesDo> resultTefforttypesDoList = tefforttypesDao.readListTefforttypes();
            completeEabDatabaseDo.setTefforttypesDoList(resultTefforttypesDoList);

            List <TtemplateDo> resultTtemplateDoList = ttemplateDao.readListTtemplate();
            completeEabDatabaseDo.setTtemplateDoList(resultTtemplateDoList);

            List <TtcfDo> resultTtcfDoList = ttcfDao.readListTtcf();
            completeEabDatabaseDo.setTtcfDoList(resultTtcfDoList);

            List <TprojectrolesDo> resultTprojectrolesDoList = tprojectrolesDao.readListTprojectroles();
            completeEabDatabaseDo.setTprojectrolesDoList(resultTprojectrolesDoList);

            List <TobjecttrxDo> resultTobjecttrxDoList = tobjecttrxDao.readListTobjecttrx();
            completeEabDatabaseDo.setTobjecttrxDoList(resultTobjecttrxDoList);

            List <TobjectproblemsDo> resultTobjectproblemsDoList = tobjectproblemsDao.readListTobjectproblems();
            completeEabDatabaseDo.setTobjectproblemsDoList(resultTobjectproblemsDoList);

            List <TpackageDo> resultTpackageDoList = tpackageDao.readListTpackage();
            completeEabDatabaseDo.setTpackageDoList(resultTpackageDoList);

            List <TprimitivesDo> resultTprimitivesDoList = tprimitivesDao.readListTprimitives();
            completeEabDatabaseDo.setTprimitivesDoList(resultTprimitivesDoList);

            List <TproblemtypesDo> resultTproblemtypesDoList = tproblemtypesDao.readListTproblemtypes();
            completeEabDatabaseDo.setTproblemtypesDoList(resultTproblemtypesDoList);

            List <TconnectortagDo> resultTconnectortagDoList = tconnectortagDao.readListTconnectortag();
            completeEabDatabaseDo.setTconnectortagDoList(resultTconnectortagDoList);

            List <TsecgrouppermissionDo> resultTsecgrouppermissionDoList = tsecgrouppermissionDao.readListTsecgrouppermission();
            completeEabDatabaseDo.setTsecgrouppermissionDoList(resultTsecgrouppermissionDoList);

            List <TumlpatternDo> resultTumlpatternDoList = tumlpatternDao.readListTumlpattern();
            completeEabDatabaseDo.setTumlpatternDoList(resultTumlpatternDoList);

            List <TobjectDo> resultTobjectDoList = tobjectDao.readListTobject();
            completeEabDatabaseDo.setTobjectDoList(resultTobjectDoList);

            List <TroleconstraintDo> resultTroleconstraintDoList = troleconstraintDao.readListTroleconstraint();
            completeEabDatabaseDo.setTroleconstraintDoList(resultTroleconstraintDoList);

            List <TsecpermissionDo> resultTsecpermissionDoList = tsecpermissionDao.readListTsecpermission();
            completeEabDatabaseDo.setTsecpermissionDoList(resultTsecpermissionDoList);

            List <TobjectpropertiesDo> resultTobjectpropertiesDoList = tobjectpropertiesDao.readListTobjectproperties();
            completeEabDatabaseDo.setTobjectpropertiesDoList(resultTobjectpropertiesDoList);

            List <TpropertytypesDo> resultTpropertytypesDoList = tpropertytypesDao.readListTpropertytypes();
            completeEabDatabaseDo.setTpropertytypesDoList(resultTpropertytypesDoList);

            List <TconnectorDo> resultTconnectorDoList = tconnectorDao.readListTconnector();
            completeEabDatabaseDo.setTconnectorDoList(resultTconnectorDoList);

            List <TobjecttypesDo> resultTobjecttypesDoList = tobjecttypesDao.readListTobjecttypes();
            completeEabDatabaseDo.setTobjecttypesDoList(resultTobjecttypesDoList);

            List <UsysqueriesDo> resultUsysqueriesDoList = usysqueriesDao.readListUsysqueries();
            completeEabDatabaseDo.setUsysqueriesDoList(resultUsysqueriesDoList);

            List <TobjectconstraintDo> resultTobjectconstraintDoList = tobjectconstraintDao.readListTobjectconstraint();
            completeEabDatabaseDo.setTobjectconstraintDoList(resultTobjectconstraintDoList);

            List <TpaletteitemDo> resultTpaletteitemDoList = tpaletteitemDao.readListTpaletteitem();
            completeEabDatabaseDo.setTpaletteitemDoList(resultTpaletteitemDoList);

            List <TstatustypesDo> resultTstatustypesDoList = tstatustypesDao.readListTstatustypes();
            completeEabDatabaseDo.setTstatustypesDoList(resultTstatustypesDoList);

            List <TmethodDo> resultTmethodDoList = tmethodDao.readListTmethod();
            completeEabDatabaseDo.setTmethodDoList(resultTmethodDoList);

            List <TtaggedvalueDo> resultTtaggedvalueDoList = ttaggedvalueDao.readListTtaggedvalue();
            completeEabDatabaseDo.setTtaggedvalueDoList(resultTtaggedvalueDoList);

            List <TattributeDo> resultTattributeDoList = tattributeDao.readListTattribute();
            completeEabDatabaseDo.setTattributeDoList(resultTattributeDoList);

            List <TsecuserpermissionDo> resultTsecuserpermissionDoList = tsecuserpermissionDao.readListTsecuserpermission();
            completeEabDatabaseDo.setTsecuserpermissionDoList(resultTsecuserpermissionDoList);

            List <TphaseDo> resultTphaseDoList = tphaseDao.readListTphase();
            completeEabDatabaseDo.setTphaseDoList(resultTphaseDoList);

            List <TxrefuserDo> resultTxrefuserDoList = txrefuserDao.readListTxrefuser();
            completeEabDatabaseDo.setTxrefuserDoList(resultTxrefuserDoList);

            List <TdiagramDo> resultTdiagramDoList = tdiagramDao.readListTdiagram();
            completeEabDatabaseDo.setTdiagramDoList(resultTdiagramDoList);

            List <UsystablesDo> resultUsystablesDoList = usystablesDao.readListUsystables();
            completeEabDatabaseDo.setUsystablesDoList(resultUsystablesDoList);

            List <TsecgroupDo> resultTsecgroupDoList = tsecgroupDao.readListTsecgroup();
            completeEabDatabaseDo.setTsecgroupDoList(resultTsecgroupDoList);

            List <TpaletteDo> resultTpaletteDoList = tpaletteDao.readListTpalette();
            completeEabDatabaseDo.setTpaletteDoList(resultTpaletteDoList);

            List <TsecpoliciesDo> resultTsecpoliciesDoList = tsecpoliciesDao.readListTsecpolicies();
            completeEabDatabaseDo.setTsecpoliciesDoList(resultTsecpoliciesDoList);

            List <TxrefsystemDo> resultTxrefsystemDoList = txrefsystemDao.readListTxrefsystem();
            completeEabDatabaseDo.setTxrefsystemDoList(resultTxrefsystemDoList);

            List <TocfDo> resultTocfDoList = tocfDao.readListTocf();
            completeEabDatabaseDo.setTocfDoList(resultTocfDoList);

            List <TmainttypesDo> resultTmainttypesDoList = tmainttypesDao.readListTmainttypes();
            completeEabDatabaseDo.setTmainttypesDoList(resultTmainttypesDoList);

            List <TconnectortypesDo> resultTconnectortypesDoList = tconnectortypesDao.readListTconnectortypes();
            completeEabDatabaseDo.setTconnectortypesDoList(resultTconnectortypesDoList);

            List <TstereotypesDo> resultTstereotypesDoList = tstereotypesDao.readListTstereotypes();
            completeEabDatabaseDo.setTstereotypesDoList(resultTstereotypesDoList);

            List <TxrefDo> resultTxrefDoList = txrefDao.readListTxref();
            completeEabDatabaseDo.setTxrefDoList(resultTxrefDoList);

            List <TdatatypesDo> resultTdatatypesDoList = tdatatypesDao.readListTdatatypes();
            completeEabDatabaseDo.setTdatatypesDoList(resultTdatatypesDoList);

            List <TobjectrisksDo> resultTobjectrisksDoList = tobjectrisksDao.readListTobjectrisks();
            completeEabDatabaseDo.setTobjectrisksDoList(resultTobjectrisksDoList);

            List <TgenoptDo> resultTgenoptDoList = tgenoptDao.readListTgenopt();
            completeEabDatabaseDo.setTgenoptDoList(resultTgenoptDoList);

            List <TauthorsDo> resultTauthorsDoList = tauthorsDao.readListTauthors();
            completeEabDatabaseDo.setTauthorsDoList(resultTauthorsDoList);

            List <TsecusergroupDo> resultTsecusergroupDoList = tsecusergroupDao.readListTsecusergroup();
            completeEabDatabaseDo.setTsecusergroupDoList(resultTsecusergroupDoList);

            List <ToperationtagDo> resultToperationtagDoList = toperationtagDao.readListToperationtag();
            completeEabDatabaseDo.setToperationtagDoList(resultToperationtagDoList);

            List <TtestplansDo> resultTtestplansDoList = ttestplansDao.readListTtestplans();
            completeEabDatabaseDo.setTtestplansDoList(resultTtestplansDoList);

            List <TobjecteffortDo> resultTobjecteffortDoList = tobjecteffortDao.readListTobjecteffort();
            completeEabDatabaseDo.setTobjecteffortDoList(resultTobjecteffortDoList);

            List <TrulesDo> resultTrulesDoList = trulesDao.readListTrules();
            completeEabDatabaseDo.setTrulesDoList(resultTrulesDoList);

            List <TimplementDo> resultTimplementDoList = timplementDao.readListTimplement();
            completeEabDatabaseDo.setTimplementDoList(resultTimplementDoList);

            List <TobjectrequiresDo> resultTobjectrequiresDoList = tobjectrequiresDao.readListTobjectrequires();
            completeEabDatabaseDo.setTobjectrequiresDoList(resultTobjectrequiresDoList);

            List <TattributeconstraintsDo> resultTattributeconstraintsDoList = tattributeconstraintsDao.readListTattributeconstraints();
            completeEabDatabaseDo.setTattributeconstraintsDoList(resultTattributeconstraintsDoList);

            List <TsnapshotDo> resultTsnapshotDoList = tsnapshotDao.readListTsnapshot();
            completeEabDatabaseDo.setTsnapshotDoList(resultTsnapshotDoList);

            List <TversionDo> resultTversionDoList = tversionDao.readListTversion();
            completeEabDatabaseDo.setTversionDoList(resultTversionDoList);

            List <TdocumentDo> resultTdocumentDoList = tdocumentDao.readListTdocument();
            completeEabDatabaseDo.setTdocumentDoList(resultTdocumentDoList);

            List <TrtfDo> resultTrtfDoList = trtfDao.readListTrtf();
            completeEabDatabaseDo.setTrtfDoList(resultTrtfDoList);

            List <TlistsDo> resultTlistsDoList = tlistsDao.readListTlists();
            completeEabDatabaseDo.setTlistsDoList(resultTlistsDoList);

            List <TmetrictypesDo> resultTmetrictypesDoList = tmetrictypesDao.readListTmetrictypes();
            completeEabDatabaseDo.setTmetrictypesDoList(resultTmetrictypesDoList);

            List <UsyssystemDo> resultUsyssystemDoList = usyssystemDao.readListUsyssystem();
            completeEabDatabaseDo.setUsyssystemDoList(resultUsyssystemDoList);

            List <TcomplexitytypesDo> resultTcomplexitytypesDoList = tcomplexitytypesDao.readListTcomplexitytypes();
            completeEabDatabaseDo.setTcomplexitytypesDoList(resultTcomplexitytypesDoList);

            List <ToperationDo> resultToperationDoList = toperationDao.readListToperation();
            completeEabDatabaseDo.setToperationDoList(resultToperationDoList);

            List <TconstrainttypesDo> resultTconstrainttypesDoList = tconstrainttypesDao.readListTconstrainttypes();
            completeEabDatabaseDo.setTconstrainttypesDoList(resultTconstrainttypesDoList);

            List <TtestclassDo> resultTtestclassDoList = ttestclassDao.readListTtestclass();
            completeEabDatabaseDo.setTtestclassDoList(resultTtestclassDoList);

            List <TobjectscenariosDo> resultTobjectscenariosDoList = tobjectscenariosDao.readListTobjectscenarios();
            completeEabDatabaseDo.setTobjectscenariosDoList(resultTobjectscenariosDoList);

            List <TscriptDo> resultTscriptDoList = tscriptDao.readListTscript();
            completeEabDatabaseDo.setTscriptDoList(resultTscriptDoList);

            List <TtesttypesDo> resultTtesttypesDoList = ttesttypesDao.readListTtesttypes();
            completeEabDatabaseDo.setTtesttypesDoList(resultTtesttypesDoList);

            List <TrisktypesDo> resultTrisktypesDoList = trisktypesDao.readListTrisktypes();
            completeEabDatabaseDo.setTrisktypesDoList(resultTrisktypesDoList);

            List <ToperationparamsDo> resultToperationparamsDoList = toperationparamsDao.readListToperationparams();
            completeEabDatabaseDo.setToperationparamsDoList(resultToperationparamsDoList);

            List <TecfDo> resultTecfDoList = tecfDao.readListTecf();
            completeEabDatabaseDo.setTecfDoList(resultTecfDoList);

            List <TresourcesDo> resultTresourcesDoList = tresourcesDao.readListTresources();
            completeEabDatabaseDo.setTresourcesDoList(resultTresourcesDoList);

            List <TobjectmetricsDo> resultTobjectmetricsDoList = tobjectmetricsDao.readListTobjectmetrics();
            completeEabDatabaseDo.setTobjectmetricsDoList(resultTobjectmetricsDoList);

            List <TimageDo> resultTimageDoList = timageDao.readListTimage();
            completeEabDatabaseDo.setTimageDoList(resultTimageDoList);

            List <TdiagramtypesDo> resultTdiagramtypesDoList = tdiagramtypesDao.readListTdiagramtypes();
            completeEabDatabaseDo.setTdiagramtypesDoList(resultTdiagramtypesDoList);

            List <TobjecttestsDo> resultTobjecttestsDoList = tobjecttestsDao.readListTobjecttests();
            completeEabDatabaseDo.setTobjecttestsDoList(resultTobjecttestsDoList);

            List <TdiagramobjectsDo> resultTdiagramobjectsDoList = tdiagramobjectsDao.readListTdiagramobjects();
            completeEabDatabaseDo.setTdiagramobjectsDoList(resultTdiagramobjectsDoList);

            List <UsysoldtablesDo> resultUsysoldtablesDoList = usysoldtablesDao.readListUsysoldtables();
            completeEabDatabaseDo.setUsysoldtablesDoList(resultUsysoldtablesDoList);

            List <TobjectfilesDo> resultTobjectfilesDoList = tobjectfilesDao.readListTobjectfiles();
            completeEabDatabaseDo.setTobjectfilesDoList(resultTobjectfilesDoList);

            List <TcategoryDo> resultTcategoryDoList = tcategoryDao.readListTcategory();
            completeEabDatabaseDo.setTcategoryDoList(resultTcategoryDoList);

            List <TissuesDo> resultTissuesDoList = tissuesDao.readListTissues();
            completeEabDatabaseDo.setTissuesDoList(resultTissuesDoList);

            List <ThtmlDo> resultThtmlDoList = thtmlDao.readListThtml();
            completeEabDatabaseDo.setThtmlDoList(resultThtmlDoList);

            List <TobjectresourceDo> resultTobjectresourceDoList = tobjectresourceDao.readListTobjectresource();
            completeEabDatabaseDo.setTobjectresourceDoList(resultTobjectresourceDoList);

            List <ToperationpresDo> resultToperationpresDoList = toperationpresDao.readListToperationpres();
            completeEabDatabaseDo.setToperationpresDoList(resultToperationpresDoList);

            List <TfilesDo> resultTfilesDoList = tfilesDao.readListTfiles();
            completeEabDatabaseDo.setTfilesDoList(resultTfilesDoList);

            List <TglossaryDo> resultTglossaryDoList = tglossaryDao.readListTglossary();
            completeEabDatabaseDo.setTglossaryDoList(resultTglossaryDoList);

            List <TsecuserDo> resultTsecuserDoList = tsecuserDao.readListTsecuser();
            completeEabDatabaseDo.setTsecuserDoList(resultTsecuserDoList);

            List <TseclocksDo> resultTseclocksDoList = tseclocksDao.readListTseclocks();
            completeEabDatabaseDo.setTseclocksDoList(resultTseclocksDoList);

            List <TclientsDo> resultTclientsDoList = tclientsDao.readListTclients();
            completeEabDatabaseDo.setTclientsDoList(resultTclientsDoList);

            List <TdiagramlinksDo> resultTdiagramlinksDoList = tdiagramlinksDao.readListTdiagramlinks();
            completeEabDatabaseDo.setTdiagramlinksDoList(resultTdiagramlinksDoList);

            List <TrequiretypesDo> resultTrequiretypesDoList = trequiretypesDao.readListTrequiretypes();
            completeEabDatabaseDo.setTrequiretypesDoList(resultTrequiretypesDoList);

            List <TrtfreportDo> resultTrtfreportDoList = trtfreportDao.readListTrtfreport();
            completeEabDatabaseDo.setTrtfreportDoList(resultTrtfreportDoList);

            List <TscenariotypesDo> resultTscenariotypesDoList = tscenariotypesDao.readListTscenariotypes();
            completeEabDatabaseDo.setTscenariotypesDoList(resultTscenariotypesDoList);

            List <TattributetagDo> resultTattributetagDoList = tattributetagDao.readListTattributetag();
            completeEabDatabaseDo.setTattributetagDoList(resultTattributetagDoList);

            List <TcardinalityDo> resultTcardinalityDoList = tcardinalityDao.readListTcardinality();
            completeEabDatabaseDo.setTcardinalityDoList(resultTcardinalityDoList);

            List <TconstantsDo> resultTconstantsDoList = tconstantsDao.readListTconstants();
            completeEabDatabaseDo.setTconstantsDoList(resultTconstantsDoList);

            List <TtrxtypesDo> resultTtrxtypesDoList = ttrxtypesDao.readListTtrxtypes();
            completeEabDatabaseDo.setTtrxtypesDoList(resultTtrxtypesDoList);

            List <TconnectorconstraintDo> resultTconnectorconstraintDoList = tconnectorconstraintDao.readListTconnectorconstraint();
            completeEabDatabaseDo.setTconnectorconstraintDoList(resultTconnectorconstraintDoList);

            List <TtasksDo> resultTtasksDoList = ttasksDao.readListTtasks();
            completeEabDatabaseDo.setTtasksDoList(resultTtasksDoList);

            List <ToperationpostsDo> resultToperationpostsDoList = toperationpostsDao.readListToperationposts();
            completeEabDatabaseDo.setToperationpostsDoList(resultToperationpostsDoList);

		} catch(Exception ex) {
			platformTransactionManager.rollback(transactionStatus0001);
		    throw ex;
		}

		return completeEabDatabaseDo;
	}

	public CompleteEabDatabaseDo readCompleteEabDatabaseDebug() throws Exception {
		CompleteEabDatabaseDo completeEabDatabaseDo = null;
		
		TransactionStatus transactionStatus0001 = null;
				
		completeEabDatabaseDo = new CompleteEabDatabaseDo();
		
		try {
			DefaultTransactionDefinition defaultTransactionDefinition = new DefaultTransactionDefinition();
			
			defaultTransactionDefinition.setName("READ_COMPLETE_EAP_DATABASE_0001");
			defaultTransactionDefinition.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
			
			transactionStatus0001 = platformTransactionManager.getTransaction(defaultTransactionDefinition);
						
            List <TefforttypesDo> resultTefforttypesDoList = tefforttypesDao.readListTefforttypes();
            if(resultTefforttypesDoList != null) {
                for(int i = 0 ; i < resultTefforttypesDoList.size(); i++) {
                    TefforttypesDo tefforttypesDo = resultTefforttypesDoList.get(i);
                    if(tefforttypesDo != null) {
                        LOGGER.info("object[" + i + "] = " + tefforttypesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTefforttypesDoList(resultTefforttypesDoList);

            List <TtemplateDo> resultTtemplateDoList = ttemplateDao.readListTtemplate();
            if(resultTtemplateDoList != null) {
                for(int i = 0 ; i < resultTtemplateDoList.size(); i++) {
                    TtemplateDo ttemplateDo = resultTtemplateDoList.get(i);
                    if(ttemplateDo != null) {
                        LOGGER.info("object[" + i + "] = " + ttemplateDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTtemplateDoList(resultTtemplateDoList);

            List <TtcfDo> resultTtcfDoList = ttcfDao.readListTtcf();
            if(resultTtcfDoList != null) {
                for(int i = 0 ; i < resultTtcfDoList.size(); i++) {
                    TtcfDo ttcfDo = resultTtcfDoList.get(i);
                    if(ttcfDo != null) {
                        LOGGER.info("object[" + i + "] = " + ttcfDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTtcfDoList(resultTtcfDoList);

            List <TprojectrolesDo> resultTprojectrolesDoList = tprojectrolesDao.readListTprojectroles();
            if(resultTprojectrolesDoList != null) {
                for(int i = 0 ; i < resultTprojectrolesDoList.size(); i++) {
                    TprojectrolesDo tprojectrolesDo = resultTprojectrolesDoList.get(i);
                    if(tprojectrolesDo != null) {
                        LOGGER.info("object[" + i + "] = " + tprojectrolesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTprojectrolesDoList(resultTprojectrolesDoList);

            List <TobjecttrxDo> resultTobjecttrxDoList = tobjecttrxDao.readListTobjecttrx();
            if(resultTobjecttrxDoList != null) {
                for(int i = 0 ; i < resultTobjecttrxDoList.size(); i++) {
                    TobjecttrxDo tobjecttrxDo = resultTobjecttrxDoList.get(i);
                    if(tobjecttrxDo != null) {
                        LOGGER.info("object[" + i + "] = " + tobjecttrxDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTobjecttrxDoList(resultTobjecttrxDoList);

            List <TobjectproblemsDo> resultTobjectproblemsDoList = tobjectproblemsDao.readListTobjectproblems();
            if(resultTobjectproblemsDoList != null) {
                for(int i = 0 ; i < resultTobjectproblemsDoList.size(); i++) {
                    TobjectproblemsDo tobjectproblemsDo = resultTobjectproblemsDoList.get(i);
                    if(tobjectproblemsDo != null) {
                        LOGGER.info("object[" + i + "] = " + tobjectproblemsDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTobjectproblemsDoList(resultTobjectproblemsDoList);

            List <TpackageDo> resultTpackageDoList = tpackageDao.readListTpackage();
            if(resultTpackageDoList != null) {
                for(int i = 0 ; i < resultTpackageDoList.size(); i++) {
                    TpackageDo tpackageDo = resultTpackageDoList.get(i);
                    if(tpackageDo != null) {
                        LOGGER.info("object[" + i + "] = " + tpackageDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTpackageDoList(resultTpackageDoList);

            List <TprimitivesDo> resultTprimitivesDoList = tprimitivesDao.readListTprimitives();
            if(resultTprimitivesDoList != null) {
                for(int i = 0 ; i < resultTprimitivesDoList.size(); i++) {
                    TprimitivesDo tprimitivesDo = resultTprimitivesDoList.get(i);
                    if(tprimitivesDo != null) {
                        LOGGER.info("object[" + i + "] = " + tprimitivesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTprimitivesDoList(resultTprimitivesDoList);

            List <TproblemtypesDo> resultTproblemtypesDoList = tproblemtypesDao.readListTproblemtypes();
            if(resultTproblemtypesDoList != null) {
                for(int i = 0 ; i < resultTproblemtypesDoList.size(); i++) {
                    TproblemtypesDo tproblemtypesDo = resultTproblemtypesDoList.get(i);
                    if(tproblemtypesDo != null) {
                        LOGGER.info("object[" + i + "] = " + tproblemtypesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTproblemtypesDoList(resultTproblemtypesDoList);

            List <TconnectortagDo> resultTconnectortagDoList = tconnectortagDao.readListTconnectortag();
            if(resultTconnectortagDoList != null) {
                for(int i = 0 ; i < resultTconnectortagDoList.size(); i++) {
                    TconnectortagDo tconnectortagDo = resultTconnectortagDoList.get(i);
                    if(tconnectortagDo != null) {
                        LOGGER.info("object[" + i + "] = " + tconnectortagDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTconnectortagDoList(resultTconnectortagDoList);

            List <TsecgrouppermissionDo> resultTsecgrouppermissionDoList = tsecgrouppermissionDao.readListTsecgrouppermission();
            if(resultTsecgrouppermissionDoList != null) {
                for(int i = 0 ; i < resultTsecgrouppermissionDoList.size(); i++) {
                    TsecgrouppermissionDo tsecgrouppermissionDo = resultTsecgrouppermissionDoList.get(i);
                    if(tsecgrouppermissionDo != null) {
                        LOGGER.info("object[" + i + "] = " + tsecgrouppermissionDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTsecgrouppermissionDoList(resultTsecgrouppermissionDoList);

            List <TumlpatternDo> resultTumlpatternDoList = tumlpatternDao.readListTumlpattern();
            if(resultTumlpatternDoList != null) {
                for(int i = 0 ; i < resultTumlpatternDoList.size(); i++) {
                    TumlpatternDo tumlpatternDo = resultTumlpatternDoList.get(i);
                    if(tumlpatternDo != null) {
                        LOGGER.info("object[" + i + "] = " + tumlpatternDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTumlpatternDoList(resultTumlpatternDoList);

            List <TobjectDo> resultTobjectDoList = tobjectDao.readListTobject();
            if(resultTobjectDoList != null) {
                for(int i = 0 ; i < resultTobjectDoList.size(); i++) {
                    TobjectDo tobjectDo = resultTobjectDoList.get(i);
                    if(tobjectDo != null) {
                        LOGGER.info("object[" + i + "] = " + tobjectDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTobjectDoList(resultTobjectDoList);

            List <TroleconstraintDo> resultTroleconstraintDoList = troleconstraintDao.readListTroleconstraint();
            if(resultTroleconstraintDoList != null) {
                for(int i = 0 ; i < resultTroleconstraintDoList.size(); i++) {
                    TroleconstraintDo troleconstraintDo = resultTroleconstraintDoList.get(i);
                    if(troleconstraintDo != null) {
                        LOGGER.info("object[" + i + "] = " + troleconstraintDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTroleconstraintDoList(resultTroleconstraintDoList);

            List <TsecpermissionDo> resultTsecpermissionDoList = tsecpermissionDao.readListTsecpermission();
            if(resultTsecpermissionDoList != null) {
                for(int i = 0 ; i < resultTsecpermissionDoList.size(); i++) {
                    TsecpermissionDo tsecpermissionDo = resultTsecpermissionDoList.get(i);
                    if(tsecpermissionDo != null) {
                        LOGGER.info("object[" + i + "] = " + tsecpermissionDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTsecpermissionDoList(resultTsecpermissionDoList);

            List <TobjectpropertiesDo> resultTobjectpropertiesDoList = tobjectpropertiesDao.readListTobjectproperties();
            if(resultTobjectpropertiesDoList != null) {
                for(int i = 0 ; i < resultTobjectpropertiesDoList.size(); i++) {
                    TobjectpropertiesDo tobjectpropertiesDo = resultTobjectpropertiesDoList.get(i);
                    if(tobjectpropertiesDo != null) {
                        LOGGER.info("object[" + i + "] = " + tobjectpropertiesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTobjectpropertiesDoList(resultTobjectpropertiesDoList);

            List <TpropertytypesDo> resultTpropertytypesDoList = tpropertytypesDao.readListTpropertytypes();
            if(resultTpropertytypesDoList != null) {
                for(int i = 0 ; i < resultTpropertytypesDoList.size(); i++) {
                    TpropertytypesDo tpropertytypesDo = resultTpropertytypesDoList.get(i);
                    if(tpropertytypesDo != null) {
                        LOGGER.info("object[" + i + "] = " + tpropertytypesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTpropertytypesDoList(resultTpropertytypesDoList);

            List <TconnectorDo> resultTconnectorDoList = tconnectorDao.readListTconnector();
            if(resultTconnectorDoList != null) {
                for(int i = 0 ; i < resultTconnectorDoList.size(); i++) {
                    TconnectorDo tconnectorDo = resultTconnectorDoList.get(i);
                    if(tconnectorDo != null) {
                        LOGGER.info("object[" + i + "] = " + tconnectorDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTconnectorDoList(resultTconnectorDoList);

            List <TobjecttypesDo> resultTobjecttypesDoList = tobjecttypesDao.readListTobjecttypes();
            if(resultTobjecttypesDoList != null) {
                for(int i = 0 ; i < resultTobjecttypesDoList.size(); i++) {
                    TobjecttypesDo tobjecttypesDo = resultTobjecttypesDoList.get(i);
                    if(tobjecttypesDo != null) {
                        LOGGER.info("object[" + i + "] = " + tobjecttypesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTobjecttypesDoList(resultTobjecttypesDoList);

            List <UsysqueriesDo> resultUsysqueriesDoList = usysqueriesDao.readListUsysqueries();
            if(resultUsysqueriesDoList != null) {
                for(int i = 0 ; i < resultUsysqueriesDoList.size(); i++) {
                    UsysqueriesDo usysqueriesDo = resultUsysqueriesDoList.get(i);
                    if(usysqueriesDo != null) {
                        LOGGER.info("object[" + i + "] = " + usysqueriesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setUsysqueriesDoList(resultUsysqueriesDoList);

            List <TobjectconstraintDo> resultTobjectconstraintDoList = tobjectconstraintDao.readListTobjectconstraint();
            if(resultTobjectconstraintDoList != null) {
                for(int i = 0 ; i < resultTobjectconstraintDoList.size(); i++) {
                    TobjectconstraintDo tobjectconstraintDo = resultTobjectconstraintDoList.get(i);
                    if(tobjectconstraintDo != null) {
                        LOGGER.info("object[" + i + "] = " + tobjectconstraintDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTobjectconstraintDoList(resultTobjectconstraintDoList);

            List <TpaletteitemDo> resultTpaletteitemDoList = tpaletteitemDao.readListTpaletteitem();
            if(resultTpaletteitemDoList != null) {
                for(int i = 0 ; i < resultTpaletteitemDoList.size(); i++) {
                    TpaletteitemDo tpaletteitemDo = resultTpaletteitemDoList.get(i);
                    if(tpaletteitemDo != null) {
                        LOGGER.info("object[" + i + "] = " + tpaletteitemDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTpaletteitemDoList(resultTpaletteitemDoList);

            List <TstatustypesDo> resultTstatustypesDoList = tstatustypesDao.readListTstatustypes();
            if(resultTstatustypesDoList != null) {
                for(int i = 0 ; i < resultTstatustypesDoList.size(); i++) {
                    TstatustypesDo tstatustypesDo = resultTstatustypesDoList.get(i);
                    if(tstatustypesDo != null) {
                        LOGGER.info("object[" + i + "] = " + tstatustypesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTstatustypesDoList(resultTstatustypesDoList);

            List <TmethodDo> resultTmethodDoList = tmethodDao.readListTmethod();
            if(resultTmethodDoList != null) {
                for(int i = 0 ; i < resultTmethodDoList.size(); i++) {
                    TmethodDo tmethodDo = resultTmethodDoList.get(i);
                    if(tmethodDo != null) {
                        LOGGER.info("object[" + i + "] = " + tmethodDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTmethodDoList(resultTmethodDoList);

            List <TtaggedvalueDo> resultTtaggedvalueDoList = ttaggedvalueDao.readListTtaggedvalue();
            if(resultTtaggedvalueDoList != null) {
                for(int i = 0 ; i < resultTtaggedvalueDoList.size(); i++) {
                    TtaggedvalueDo ttaggedvalueDo = resultTtaggedvalueDoList.get(i);
                    if(ttaggedvalueDo != null) {
                        LOGGER.info("object[" + i + "] = " + ttaggedvalueDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTtaggedvalueDoList(resultTtaggedvalueDoList);

            List <TattributeDo> resultTattributeDoList = tattributeDao.readListTattribute();
            if(resultTattributeDoList != null) {
                for(int i = 0 ; i < resultTattributeDoList.size(); i++) {
                    TattributeDo tattributeDo = resultTattributeDoList.get(i);
                    if(tattributeDo != null) {
                        LOGGER.info("object[" + i + "] = " + tattributeDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTattributeDoList(resultTattributeDoList);

            List <TsecuserpermissionDo> resultTsecuserpermissionDoList = tsecuserpermissionDao.readListTsecuserpermission();
            if(resultTsecuserpermissionDoList != null) {
                for(int i = 0 ; i < resultTsecuserpermissionDoList.size(); i++) {
                    TsecuserpermissionDo tsecuserpermissionDo = resultTsecuserpermissionDoList.get(i);
                    if(tsecuserpermissionDo != null) {
                        LOGGER.info("object[" + i + "] = " + tsecuserpermissionDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTsecuserpermissionDoList(resultTsecuserpermissionDoList);

            List <TphaseDo> resultTphaseDoList = tphaseDao.readListTphase();
            if(resultTphaseDoList != null) {
                for(int i = 0 ; i < resultTphaseDoList.size(); i++) {
                    TphaseDo tphaseDo = resultTphaseDoList.get(i);
                    if(tphaseDo != null) {
                        LOGGER.info("object[" + i + "] = " + tphaseDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTphaseDoList(resultTphaseDoList);

            List <TxrefuserDo> resultTxrefuserDoList = txrefuserDao.readListTxrefuser();
            if(resultTxrefuserDoList != null) {
                for(int i = 0 ; i < resultTxrefuserDoList.size(); i++) {
                    TxrefuserDo txrefuserDo = resultTxrefuserDoList.get(i);
                    if(txrefuserDo != null) {
                        LOGGER.info("object[" + i + "] = " + txrefuserDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTxrefuserDoList(resultTxrefuserDoList);

            List <TdiagramDo> resultTdiagramDoList = tdiagramDao.readListTdiagram();
            if(resultTdiagramDoList != null) {
                for(int i = 0 ; i < resultTdiagramDoList.size(); i++) {
                    TdiagramDo tdiagramDo = resultTdiagramDoList.get(i);
                    if(tdiagramDo != null) {
                        LOGGER.info("object[" + i + "] = " + tdiagramDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTdiagramDoList(resultTdiagramDoList);

            List <UsystablesDo> resultUsystablesDoList = usystablesDao.readListUsystables();
            if(resultUsystablesDoList != null) {
                for(int i = 0 ; i < resultUsystablesDoList.size(); i++) {
                    UsystablesDo usystablesDo = resultUsystablesDoList.get(i);
                    if(usystablesDo != null) {
                        LOGGER.info("object[" + i + "] = " + usystablesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setUsystablesDoList(resultUsystablesDoList);

            List <TsecgroupDo> resultTsecgroupDoList = tsecgroupDao.readListTsecgroup();
            if(resultTsecgroupDoList != null) {
                for(int i = 0 ; i < resultTsecgroupDoList.size(); i++) {
                    TsecgroupDo tsecgroupDo = resultTsecgroupDoList.get(i);
                    if(tsecgroupDo != null) {
                        LOGGER.info("object[" + i + "] = " + tsecgroupDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTsecgroupDoList(resultTsecgroupDoList);

            List <TpaletteDo> resultTpaletteDoList = tpaletteDao.readListTpalette();
            if(resultTpaletteDoList != null) {
                for(int i = 0 ; i < resultTpaletteDoList.size(); i++) {
                    TpaletteDo tpaletteDo = resultTpaletteDoList.get(i);
                    if(tpaletteDo != null) {
                        LOGGER.info("object[" + i + "] = " + tpaletteDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTpaletteDoList(resultTpaletteDoList);

            List <TsecpoliciesDo> resultTsecpoliciesDoList = tsecpoliciesDao.readListTsecpolicies();
            if(resultTsecpoliciesDoList != null) {
                for(int i = 0 ; i < resultTsecpoliciesDoList.size(); i++) {
                    TsecpoliciesDo tsecpoliciesDo = resultTsecpoliciesDoList.get(i);
                    if(tsecpoliciesDo != null) {
                        LOGGER.info("object[" + i + "] = " + tsecpoliciesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTsecpoliciesDoList(resultTsecpoliciesDoList);

            List <TxrefsystemDo> resultTxrefsystemDoList = txrefsystemDao.readListTxrefsystem();
            if(resultTxrefsystemDoList != null) {
                for(int i = 0 ; i < resultTxrefsystemDoList.size(); i++) {
                    TxrefsystemDo txrefsystemDo = resultTxrefsystemDoList.get(i);
                    if(txrefsystemDo != null) {
                        LOGGER.info("object[" + i + "] = " + txrefsystemDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTxrefsystemDoList(resultTxrefsystemDoList);

            List <TocfDo> resultTocfDoList = tocfDao.readListTocf();
            if(resultTocfDoList != null) {
                for(int i = 0 ; i < resultTocfDoList.size(); i++) {
                    TocfDo tocfDo = resultTocfDoList.get(i);
                    if(tocfDo != null) {
                        LOGGER.info("object[" + i + "] = " + tocfDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTocfDoList(resultTocfDoList);

            List <TmainttypesDo> resultTmainttypesDoList = tmainttypesDao.readListTmainttypes();
            if(resultTmainttypesDoList != null) {
                for(int i = 0 ; i < resultTmainttypesDoList.size(); i++) {
                    TmainttypesDo tmainttypesDo = resultTmainttypesDoList.get(i);
                    if(tmainttypesDo != null) {
                        LOGGER.info("object[" + i + "] = " + tmainttypesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTmainttypesDoList(resultTmainttypesDoList);

            List <TconnectortypesDo> resultTconnectortypesDoList = tconnectortypesDao.readListTconnectortypes();
            if(resultTconnectortypesDoList != null) {
                for(int i = 0 ; i < resultTconnectortypesDoList.size(); i++) {
                    TconnectortypesDo tconnectortypesDo = resultTconnectortypesDoList.get(i);
                    if(tconnectortypesDo != null) {
                        LOGGER.info("object[" + i + "] = " + tconnectortypesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTconnectortypesDoList(resultTconnectortypesDoList);

            List <TstereotypesDo> resultTstereotypesDoList = tstereotypesDao.readListTstereotypes();
            if(resultTstereotypesDoList != null) {
                for(int i = 0 ; i < resultTstereotypesDoList.size(); i++) {
                    TstereotypesDo tstereotypesDo = resultTstereotypesDoList.get(i);
                    if(tstereotypesDo != null) {
                        LOGGER.info("object[" + i + "] = " + tstereotypesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTstereotypesDoList(resultTstereotypesDoList);

            List <TxrefDo> resultTxrefDoList = txrefDao.readListTxref();
            if(resultTxrefDoList != null) {
                for(int i = 0 ; i < resultTxrefDoList.size(); i++) {
                    TxrefDo txrefDo = resultTxrefDoList.get(i);
                    if(txrefDo != null) {
                        LOGGER.info("object[" + i + "] = " + txrefDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTxrefDoList(resultTxrefDoList);

            List <TdatatypesDo> resultTdatatypesDoList = tdatatypesDao.readListTdatatypes();
            if(resultTdatatypesDoList != null) {
                for(int i = 0 ; i < resultTdatatypesDoList.size(); i++) {
                    TdatatypesDo tdatatypesDo = resultTdatatypesDoList.get(i);
                    if(tdatatypesDo != null) {
                        LOGGER.info("object[" + i + "] = " + tdatatypesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTdatatypesDoList(resultTdatatypesDoList);

            List <TobjectrisksDo> resultTobjectrisksDoList = tobjectrisksDao.readListTobjectrisks();
            if(resultTobjectrisksDoList != null) {
                for(int i = 0 ; i < resultTobjectrisksDoList.size(); i++) {
                    TobjectrisksDo tobjectrisksDo = resultTobjectrisksDoList.get(i);
                    if(tobjectrisksDo != null) {
                        LOGGER.info("object[" + i + "] = " + tobjectrisksDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTobjectrisksDoList(resultTobjectrisksDoList);

            List <TgenoptDo> resultTgenoptDoList = tgenoptDao.readListTgenopt();
            if(resultTgenoptDoList != null) {
                for(int i = 0 ; i < resultTgenoptDoList.size(); i++) {
                    TgenoptDo tgenoptDo = resultTgenoptDoList.get(i);
                    if(tgenoptDo != null) {
                        LOGGER.info("object[" + i + "] = " + tgenoptDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTgenoptDoList(resultTgenoptDoList);

            List <TauthorsDo> resultTauthorsDoList = tauthorsDao.readListTauthors();
            if(resultTauthorsDoList != null) {
                for(int i = 0 ; i < resultTauthorsDoList.size(); i++) {
                    TauthorsDo tauthorsDo = resultTauthorsDoList.get(i);
                    if(tauthorsDo != null) {
                        LOGGER.info("object[" + i + "] = " + tauthorsDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTauthorsDoList(resultTauthorsDoList);

            List <TsecusergroupDo> resultTsecusergroupDoList = tsecusergroupDao.readListTsecusergroup();
            if(resultTsecusergroupDoList != null) {
                for(int i = 0 ; i < resultTsecusergroupDoList.size(); i++) {
                    TsecusergroupDo tsecusergroupDo = resultTsecusergroupDoList.get(i);
                    if(tsecusergroupDo != null) {
                        LOGGER.info("object[" + i + "] = " + tsecusergroupDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTsecusergroupDoList(resultTsecusergroupDoList);

            List <ToperationtagDo> resultToperationtagDoList = toperationtagDao.readListToperationtag();
            if(resultToperationtagDoList != null) {
                for(int i = 0 ; i < resultToperationtagDoList.size(); i++) {
                    ToperationtagDo toperationtagDo = resultToperationtagDoList.get(i);
                    if(toperationtagDo != null) {
                        LOGGER.info("object[" + i + "] = " + toperationtagDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setToperationtagDoList(resultToperationtagDoList);

            List <TtestplansDo> resultTtestplansDoList = ttestplansDao.readListTtestplans();
            if(resultTtestplansDoList != null) {
                for(int i = 0 ; i < resultTtestplansDoList.size(); i++) {
                    TtestplansDo ttestplansDo = resultTtestplansDoList.get(i);
                    if(ttestplansDo != null) {
                        LOGGER.info("object[" + i + "] = " + ttestplansDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTtestplansDoList(resultTtestplansDoList);

            List <TobjecteffortDo> resultTobjecteffortDoList = tobjecteffortDao.readListTobjecteffort();
            if(resultTobjecteffortDoList != null) {
                for(int i = 0 ; i < resultTobjecteffortDoList.size(); i++) {
                    TobjecteffortDo tobjecteffortDo = resultTobjecteffortDoList.get(i);
                    if(tobjecteffortDo != null) {
                        LOGGER.info("object[" + i + "] = " + tobjecteffortDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTobjecteffortDoList(resultTobjecteffortDoList);

            List <TrulesDo> resultTrulesDoList = trulesDao.readListTrules();
            if(resultTrulesDoList != null) {
                for(int i = 0 ; i < resultTrulesDoList.size(); i++) {
                    TrulesDo trulesDo = resultTrulesDoList.get(i);
                    if(trulesDo != null) {
                        LOGGER.info("object[" + i + "] = " + trulesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTrulesDoList(resultTrulesDoList);

            List <TimplementDo> resultTimplementDoList = timplementDao.readListTimplement();
            if(resultTimplementDoList != null) {
                for(int i = 0 ; i < resultTimplementDoList.size(); i++) {
                    TimplementDo timplementDo = resultTimplementDoList.get(i);
                    if(timplementDo != null) {
                        LOGGER.info("object[" + i + "] = " + timplementDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTimplementDoList(resultTimplementDoList);

            List <TobjectrequiresDo> resultTobjectrequiresDoList = tobjectrequiresDao.readListTobjectrequires();
            if(resultTobjectrequiresDoList != null) {
                for(int i = 0 ; i < resultTobjectrequiresDoList.size(); i++) {
                    TobjectrequiresDo tobjectrequiresDo = resultTobjectrequiresDoList.get(i);
                    if(tobjectrequiresDo != null) {
                        LOGGER.info("object[" + i + "] = " + tobjectrequiresDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTobjectrequiresDoList(resultTobjectrequiresDoList);

            List <TattributeconstraintsDo> resultTattributeconstraintsDoList = tattributeconstraintsDao.readListTattributeconstraints();
            if(resultTattributeconstraintsDoList != null) {
                for(int i = 0 ; i < resultTattributeconstraintsDoList.size(); i++) {
                    TattributeconstraintsDo tattributeconstraintsDo = resultTattributeconstraintsDoList.get(i);
                    if(tattributeconstraintsDo != null) {
                        LOGGER.info("object[" + i + "] = " + tattributeconstraintsDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTattributeconstraintsDoList(resultTattributeconstraintsDoList);

            List <TsnapshotDo> resultTsnapshotDoList = tsnapshotDao.readListTsnapshot();
            if(resultTsnapshotDoList != null) {
                for(int i = 0 ; i < resultTsnapshotDoList.size(); i++) {
                    TsnapshotDo tsnapshotDo = resultTsnapshotDoList.get(i);
                    if(tsnapshotDo != null) {
                        LOGGER.info("object[" + i + "] = " + tsnapshotDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTsnapshotDoList(resultTsnapshotDoList);

            List <TversionDo> resultTversionDoList = tversionDao.readListTversion();
            if(resultTversionDoList != null) {
                for(int i = 0 ; i < resultTversionDoList.size(); i++) {
                    TversionDo tversionDo = resultTversionDoList.get(i);
                    if(tversionDo != null) {
                        LOGGER.info("object[" + i + "] = " + tversionDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTversionDoList(resultTversionDoList);

            List <TdocumentDo> resultTdocumentDoList = tdocumentDao.readListTdocument();
            if(resultTdocumentDoList != null) {
                for(int i = 0 ; i < resultTdocumentDoList.size(); i++) {
                    TdocumentDo tdocumentDo = resultTdocumentDoList.get(i);
                    if(tdocumentDo != null) {
                        LOGGER.info("object[" + i + "] = " + tdocumentDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTdocumentDoList(resultTdocumentDoList);

            List <TrtfDo> resultTrtfDoList = trtfDao.readListTrtf();
            if(resultTrtfDoList != null) {
                for(int i = 0 ; i < resultTrtfDoList.size(); i++) {
                    TrtfDo trtfDo = resultTrtfDoList.get(i);
                    if(trtfDo != null) {
                        LOGGER.info("object[" + i + "] = " + trtfDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTrtfDoList(resultTrtfDoList);

            List <TlistsDo> resultTlistsDoList = tlistsDao.readListTlists();
            if(resultTlistsDoList != null) {
                for(int i = 0 ; i < resultTlistsDoList.size(); i++) {
                    TlistsDo tlistsDo = resultTlistsDoList.get(i);
                    if(tlistsDo != null) {
                        LOGGER.info("object[" + i + "] = " + tlistsDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTlistsDoList(resultTlistsDoList);

            List <TmetrictypesDo> resultTmetrictypesDoList = tmetrictypesDao.readListTmetrictypes();
            if(resultTmetrictypesDoList != null) {
                for(int i = 0 ; i < resultTmetrictypesDoList.size(); i++) {
                    TmetrictypesDo tmetrictypesDo = resultTmetrictypesDoList.get(i);
                    if(tmetrictypesDo != null) {
                        LOGGER.info("object[" + i + "] = " + tmetrictypesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTmetrictypesDoList(resultTmetrictypesDoList);

            List <UsyssystemDo> resultUsyssystemDoList = usyssystemDao.readListUsyssystem();
            if(resultUsyssystemDoList != null) {
                for(int i = 0 ; i < resultUsyssystemDoList.size(); i++) {
                    UsyssystemDo usyssystemDo = resultUsyssystemDoList.get(i);
                    if(usyssystemDo != null) {
                        LOGGER.info("object[" + i + "] = " + usyssystemDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setUsyssystemDoList(resultUsyssystemDoList);

            List <TcomplexitytypesDo> resultTcomplexitytypesDoList = tcomplexitytypesDao.readListTcomplexitytypes();
            if(resultTcomplexitytypesDoList != null) {
                for(int i = 0 ; i < resultTcomplexitytypesDoList.size(); i++) {
                    TcomplexitytypesDo tcomplexitytypesDo = resultTcomplexitytypesDoList.get(i);
                    if(tcomplexitytypesDo != null) {
                        LOGGER.info("object[" + i + "] = " + tcomplexitytypesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTcomplexitytypesDoList(resultTcomplexitytypesDoList);

            List <ToperationDo> resultToperationDoList = toperationDao.readListToperation();
            if(resultToperationDoList != null) {
                for(int i = 0 ; i < resultToperationDoList.size(); i++) {
                    ToperationDo toperationDo = resultToperationDoList.get(i);
                    if(toperationDo != null) {
                        LOGGER.info("object[" + i + "] = " + toperationDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setToperationDoList(resultToperationDoList);

            List <TconstrainttypesDo> resultTconstrainttypesDoList = tconstrainttypesDao.readListTconstrainttypes();
            if(resultTconstrainttypesDoList != null) {
                for(int i = 0 ; i < resultTconstrainttypesDoList.size(); i++) {
                    TconstrainttypesDo tconstrainttypesDo = resultTconstrainttypesDoList.get(i);
                    if(tconstrainttypesDo != null) {
                        LOGGER.info("object[" + i + "] = " + tconstrainttypesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTconstrainttypesDoList(resultTconstrainttypesDoList);

            List <TtestclassDo> resultTtestclassDoList = ttestclassDao.readListTtestclass();
            if(resultTtestclassDoList != null) {
                for(int i = 0 ; i < resultTtestclassDoList.size(); i++) {
                    TtestclassDo ttestclassDo = resultTtestclassDoList.get(i);
                    if(ttestclassDo != null) {
                        LOGGER.info("object[" + i + "] = " + ttestclassDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTtestclassDoList(resultTtestclassDoList);

            List <TobjectscenariosDo> resultTobjectscenariosDoList = tobjectscenariosDao.readListTobjectscenarios();
            if(resultTobjectscenariosDoList != null) {
                for(int i = 0 ; i < resultTobjectscenariosDoList.size(); i++) {
                    TobjectscenariosDo tobjectscenariosDo = resultTobjectscenariosDoList.get(i);
                    if(tobjectscenariosDo != null) {
                        LOGGER.info("object[" + i + "] = " + tobjectscenariosDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTobjectscenariosDoList(resultTobjectscenariosDoList);

            List <TscriptDo> resultTscriptDoList = tscriptDao.readListTscript();
            if(resultTscriptDoList != null) {
                for(int i = 0 ; i < resultTscriptDoList.size(); i++) {
                    TscriptDo tscriptDo = resultTscriptDoList.get(i);
                    if(tscriptDo != null) {
                        LOGGER.info("object[" + i + "] = " + tscriptDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTscriptDoList(resultTscriptDoList);

            List <TtesttypesDo> resultTtesttypesDoList = ttesttypesDao.readListTtesttypes();
            if(resultTtesttypesDoList != null) {
                for(int i = 0 ; i < resultTtesttypesDoList.size(); i++) {
                    TtesttypesDo ttesttypesDo = resultTtesttypesDoList.get(i);
                    if(ttesttypesDo != null) {
                        LOGGER.info("object[" + i + "] = " + ttesttypesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTtesttypesDoList(resultTtesttypesDoList);

            List <TrisktypesDo> resultTrisktypesDoList = trisktypesDao.readListTrisktypes();
            if(resultTrisktypesDoList != null) {
                for(int i = 0 ; i < resultTrisktypesDoList.size(); i++) {
                    TrisktypesDo trisktypesDo = resultTrisktypesDoList.get(i);
                    if(trisktypesDo != null) {
                        LOGGER.info("object[" + i + "] = " + trisktypesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTrisktypesDoList(resultTrisktypesDoList);

            List <ToperationparamsDo> resultToperationparamsDoList = toperationparamsDao.readListToperationparams();
            if(resultToperationparamsDoList != null) {
                for(int i = 0 ; i < resultToperationparamsDoList.size(); i++) {
                    ToperationparamsDo toperationparamsDo = resultToperationparamsDoList.get(i);
                    if(toperationparamsDo != null) {
                        LOGGER.info("object[" + i + "] = " + toperationparamsDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setToperationparamsDoList(resultToperationparamsDoList);

            List <TecfDo> resultTecfDoList = tecfDao.readListTecf();
            if(resultTecfDoList != null) {
                for(int i = 0 ; i < resultTecfDoList.size(); i++) {
                    TecfDo tecfDo = resultTecfDoList.get(i);
                    if(tecfDo != null) {
                        LOGGER.info("object[" + i + "] = " + tecfDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTecfDoList(resultTecfDoList);

            List <TresourcesDo> resultTresourcesDoList = tresourcesDao.readListTresources();
            if(resultTresourcesDoList != null) {
                for(int i = 0 ; i < resultTresourcesDoList.size(); i++) {
                    TresourcesDo tresourcesDo = resultTresourcesDoList.get(i);
                    if(tresourcesDo != null) {
                        LOGGER.info("object[" + i + "] = " + tresourcesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTresourcesDoList(resultTresourcesDoList);

            List <TobjectmetricsDo> resultTobjectmetricsDoList = tobjectmetricsDao.readListTobjectmetrics();
            if(resultTobjectmetricsDoList != null) {
                for(int i = 0 ; i < resultTobjectmetricsDoList.size(); i++) {
                    TobjectmetricsDo tobjectmetricsDo = resultTobjectmetricsDoList.get(i);
                    if(tobjectmetricsDo != null) {
                        LOGGER.info("object[" + i + "] = " + tobjectmetricsDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTobjectmetricsDoList(resultTobjectmetricsDoList);

            List <TimageDo> resultTimageDoList = timageDao.readListTimage();
            if(resultTimageDoList != null) {
                for(int i = 0 ; i < resultTimageDoList.size(); i++) {
                    TimageDo timageDo = resultTimageDoList.get(i);
                    if(timageDo != null) {
                        LOGGER.info("object[" + i + "] = " + timageDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTimageDoList(resultTimageDoList);

            List <TdiagramtypesDo> resultTdiagramtypesDoList = tdiagramtypesDao.readListTdiagramtypes();
            if(resultTdiagramtypesDoList != null) {
                for(int i = 0 ; i < resultTdiagramtypesDoList.size(); i++) {
                    TdiagramtypesDo tdiagramtypesDo = resultTdiagramtypesDoList.get(i);
                    if(tdiagramtypesDo != null) {
                        LOGGER.info("object[" + i + "] = " + tdiagramtypesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTdiagramtypesDoList(resultTdiagramtypesDoList);

            List <TobjecttestsDo> resultTobjecttestsDoList = tobjecttestsDao.readListTobjecttests();
            if(resultTobjecttestsDoList != null) {
                for(int i = 0 ; i < resultTobjecttestsDoList.size(); i++) {
                    TobjecttestsDo tobjecttestsDo = resultTobjecttestsDoList.get(i);
                    if(tobjecttestsDo != null) {
                        LOGGER.info("object[" + i + "] = " + tobjecttestsDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTobjecttestsDoList(resultTobjecttestsDoList);

            List <TdiagramobjectsDo> resultTdiagramobjectsDoList = tdiagramobjectsDao.readListTdiagramobjects();
            if(resultTdiagramobjectsDoList != null) {
                for(int i = 0 ; i < resultTdiagramobjectsDoList.size(); i++) {
                    TdiagramobjectsDo tdiagramobjectsDo = resultTdiagramobjectsDoList.get(i);
                    if(tdiagramobjectsDo != null) {
                        LOGGER.info("object[" + i + "] = " + tdiagramobjectsDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTdiagramobjectsDoList(resultTdiagramobjectsDoList);

            List <UsysoldtablesDo> resultUsysoldtablesDoList = usysoldtablesDao.readListUsysoldtables();
            if(resultUsysoldtablesDoList != null) {
                for(int i = 0 ; i < resultUsysoldtablesDoList.size(); i++) {
                    UsysoldtablesDo usysoldtablesDo = resultUsysoldtablesDoList.get(i);
                    if(usysoldtablesDo != null) {
                        LOGGER.info("object[" + i + "] = " + usysoldtablesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setUsysoldtablesDoList(resultUsysoldtablesDoList);

            List <TobjectfilesDo> resultTobjectfilesDoList = tobjectfilesDao.readListTobjectfiles();
            if(resultTobjectfilesDoList != null) {
                for(int i = 0 ; i < resultTobjectfilesDoList.size(); i++) {
                    TobjectfilesDo tobjectfilesDo = resultTobjectfilesDoList.get(i);
                    if(tobjectfilesDo != null) {
                        LOGGER.info("object[" + i + "] = " + tobjectfilesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTobjectfilesDoList(resultTobjectfilesDoList);

            List <TcategoryDo> resultTcategoryDoList = tcategoryDao.readListTcategory();
            if(resultTcategoryDoList != null) {
                for(int i = 0 ; i < resultTcategoryDoList.size(); i++) {
                    TcategoryDo tcategoryDo = resultTcategoryDoList.get(i);
                    if(tcategoryDo != null) {
                        LOGGER.info("object[" + i + "] = " + tcategoryDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTcategoryDoList(resultTcategoryDoList);

            List <TissuesDo> resultTissuesDoList = tissuesDao.readListTissues();
            if(resultTissuesDoList != null) {
                for(int i = 0 ; i < resultTissuesDoList.size(); i++) {
                    TissuesDo tissuesDo = resultTissuesDoList.get(i);
                    if(tissuesDo != null) {
                        LOGGER.info("object[" + i + "] = " + tissuesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTissuesDoList(resultTissuesDoList);

            List <ThtmlDo> resultThtmlDoList = thtmlDao.readListThtml();
            if(resultThtmlDoList != null) {
                for(int i = 0 ; i < resultThtmlDoList.size(); i++) {
                    ThtmlDo thtmlDo = resultThtmlDoList.get(i);
                    if(thtmlDo != null) {
                        LOGGER.info("object[" + i + "] = " + thtmlDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setThtmlDoList(resultThtmlDoList);

            List <TobjectresourceDo> resultTobjectresourceDoList = tobjectresourceDao.readListTobjectresource();
            if(resultTobjectresourceDoList != null) {
                for(int i = 0 ; i < resultTobjectresourceDoList.size(); i++) {
                    TobjectresourceDo tobjectresourceDo = resultTobjectresourceDoList.get(i);
                    if(tobjectresourceDo != null) {
                        LOGGER.info("object[" + i + "] = " + tobjectresourceDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTobjectresourceDoList(resultTobjectresourceDoList);

            List <ToperationpresDo> resultToperationpresDoList = toperationpresDao.readListToperationpres();
            if(resultToperationpresDoList != null) {
                for(int i = 0 ; i < resultToperationpresDoList.size(); i++) {
                    ToperationpresDo toperationpresDo = resultToperationpresDoList.get(i);
                    if(toperationpresDo != null) {
                        LOGGER.info("object[" + i + "] = " + toperationpresDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setToperationpresDoList(resultToperationpresDoList);

            List <TfilesDo> resultTfilesDoList = tfilesDao.readListTfiles();
            if(resultTfilesDoList != null) {
                for(int i = 0 ; i < resultTfilesDoList.size(); i++) {
                    TfilesDo tfilesDo = resultTfilesDoList.get(i);
                    if(tfilesDo != null) {
                        LOGGER.info("object[" + i + "] = " + tfilesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTfilesDoList(resultTfilesDoList);

            List <TglossaryDo> resultTglossaryDoList = tglossaryDao.readListTglossary();
            if(resultTglossaryDoList != null) {
                for(int i = 0 ; i < resultTglossaryDoList.size(); i++) {
                    TglossaryDo tglossaryDo = resultTglossaryDoList.get(i);
                    if(tglossaryDo != null) {
                        LOGGER.info("object[" + i + "] = " + tglossaryDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTglossaryDoList(resultTglossaryDoList);

            List <TsecuserDo> resultTsecuserDoList = tsecuserDao.readListTsecuser();
            if(resultTsecuserDoList != null) {
                for(int i = 0 ; i < resultTsecuserDoList.size(); i++) {
                    TsecuserDo tsecuserDo = resultTsecuserDoList.get(i);
                    if(tsecuserDo != null) {
                        LOGGER.info("object[" + i + "] = " + tsecuserDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTsecuserDoList(resultTsecuserDoList);

            List <TseclocksDo> resultTseclocksDoList = tseclocksDao.readListTseclocks();
            if(resultTseclocksDoList != null) {
                for(int i = 0 ; i < resultTseclocksDoList.size(); i++) {
                    TseclocksDo tseclocksDo = resultTseclocksDoList.get(i);
                    if(tseclocksDo != null) {
                        LOGGER.info("object[" + i + "] = " + tseclocksDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTseclocksDoList(resultTseclocksDoList);

            List <TclientsDo> resultTclientsDoList = tclientsDao.readListTclients();
            if(resultTclientsDoList != null) {
                for(int i = 0 ; i < resultTclientsDoList.size(); i++) {
                    TclientsDo tclientsDo = resultTclientsDoList.get(i);
                    if(tclientsDo != null) {
                        LOGGER.info("object[" + i + "] = " + tclientsDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTclientsDoList(resultTclientsDoList);

            List <TdiagramlinksDo> resultTdiagramlinksDoList = tdiagramlinksDao.readListTdiagramlinks();
            if(resultTdiagramlinksDoList != null) {
                for(int i = 0 ; i < resultTdiagramlinksDoList.size(); i++) {
                    TdiagramlinksDo tdiagramlinksDo = resultTdiagramlinksDoList.get(i);
                    if(tdiagramlinksDo != null) {
                        LOGGER.info("object[" + i + "] = " + tdiagramlinksDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTdiagramlinksDoList(resultTdiagramlinksDoList);

            List <TrequiretypesDo> resultTrequiretypesDoList = trequiretypesDao.readListTrequiretypes();
            if(resultTrequiretypesDoList != null) {
                for(int i = 0 ; i < resultTrequiretypesDoList.size(); i++) {
                    TrequiretypesDo trequiretypesDo = resultTrequiretypesDoList.get(i);
                    if(trequiretypesDo != null) {
                        LOGGER.info("object[" + i + "] = " + trequiretypesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTrequiretypesDoList(resultTrequiretypesDoList);

            List <TrtfreportDo> resultTrtfreportDoList = trtfreportDao.readListTrtfreport();
            if(resultTrtfreportDoList != null) {
                for(int i = 0 ; i < resultTrtfreportDoList.size(); i++) {
                    TrtfreportDo trtfreportDo = resultTrtfreportDoList.get(i);
                    if(trtfreportDo != null) {
                        LOGGER.info("object[" + i + "] = " + trtfreportDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTrtfreportDoList(resultTrtfreportDoList);

            List <TscenariotypesDo> resultTscenariotypesDoList = tscenariotypesDao.readListTscenariotypes();
            if(resultTscenariotypesDoList != null) {
                for(int i = 0 ; i < resultTscenariotypesDoList.size(); i++) {
                    TscenariotypesDo tscenariotypesDo = resultTscenariotypesDoList.get(i);
                    if(tscenariotypesDo != null) {
                        LOGGER.info("object[" + i + "] = " + tscenariotypesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTscenariotypesDoList(resultTscenariotypesDoList);

            List <TattributetagDo> resultTattributetagDoList = tattributetagDao.readListTattributetag();
            if(resultTattributetagDoList != null) {
                for(int i = 0 ; i < resultTattributetagDoList.size(); i++) {
                    TattributetagDo tattributetagDo = resultTattributetagDoList.get(i);
                    if(tattributetagDo != null) {
                        LOGGER.info("object[" + i + "] = " + tattributetagDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTattributetagDoList(resultTattributetagDoList);

            List <TcardinalityDo> resultTcardinalityDoList = tcardinalityDao.readListTcardinality();
            if(resultTcardinalityDoList != null) {
                for(int i = 0 ; i < resultTcardinalityDoList.size(); i++) {
                    TcardinalityDo tcardinalityDo = resultTcardinalityDoList.get(i);
                    if(tcardinalityDo != null) {
                        LOGGER.info("object[" + i + "] = " + tcardinalityDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTcardinalityDoList(resultTcardinalityDoList);

            List <TconstantsDo> resultTconstantsDoList = tconstantsDao.readListTconstants();
            if(resultTconstantsDoList != null) {
                for(int i = 0 ; i < resultTconstantsDoList.size(); i++) {
                    TconstantsDo tconstantsDo = resultTconstantsDoList.get(i);
                    if(tconstantsDo != null) {
                        LOGGER.info("object[" + i + "] = " + tconstantsDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTconstantsDoList(resultTconstantsDoList);

            List <TtrxtypesDo> resultTtrxtypesDoList = ttrxtypesDao.readListTtrxtypes();
            if(resultTtrxtypesDoList != null) {
                for(int i = 0 ; i < resultTtrxtypesDoList.size(); i++) {
                    TtrxtypesDo ttrxtypesDo = resultTtrxtypesDoList.get(i);
                    if(ttrxtypesDo != null) {
                        LOGGER.info("object[" + i + "] = " + ttrxtypesDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTtrxtypesDoList(resultTtrxtypesDoList);

            List <TconnectorconstraintDo> resultTconnectorconstraintDoList = tconnectorconstraintDao.readListTconnectorconstraint();
            if(resultTconnectorconstraintDoList != null) {
                for(int i = 0 ; i < resultTconnectorconstraintDoList.size(); i++) {
                    TconnectorconstraintDo tconnectorconstraintDo = resultTconnectorconstraintDoList.get(i);
                    if(tconnectorconstraintDo != null) {
                        LOGGER.info("object[" + i + "] = " + tconnectorconstraintDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTconnectorconstraintDoList(resultTconnectorconstraintDoList);

            List <TtasksDo> resultTtasksDoList = ttasksDao.readListTtasks();
            if(resultTtasksDoList != null) {
                for(int i = 0 ; i < resultTtasksDoList.size(); i++) {
                    TtasksDo ttasksDo = resultTtasksDoList.get(i);
                    if(ttasksDo != null) {
                        LOGGER.info("object[" + i + "] = " + ttasksDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setTtasksDoList(resultTtasksDoList);

            List <ToperationpostsDo> resultToperationpostsDoList = toperationpostsDao.readListToperationposts();
            if(resultToperationpostsDoList != null) {
                for(int i = 0 ; i < resultToperationpostsDoList.size(); i++) {
                    ToperationpostsDo toperationpostsDo = resultToperationpostsDoList.get(i);
                    if(toperationpostsDo != null) {
                        LOGGER.info("object[" + i + "] = " + toperationpostsDo.toString());
                    } else {
                        LOGGER.info("object[" + i + "] = null");
                    }
                }
            }
            completeEabDatabaseDo.setToperationpostsDoList(resultToperationpostsDoList);

		} catch(Exception ex) {
			platformTransactionManager.rollback(transactionStatus0001);
		    throw ex;
		}

		return completeEabDatabaseDo;
	}

}
