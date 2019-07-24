package com.ag01.ebs42.model.config;

import java.sql.Driver;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.transaction.PlatformTransactionManager;

import com.ag01.ebs42.analyze.dbaccess.dao.api.*;
import com.ag01.ebs42.analyze.dbaccess.dao.jdbc_impl.*;
import com.ag01.ebs42.model.eap_to_ebs42.api.ConvertEapToEbs42;
import com.ag01.ebs42.model.eap_to_ebs42.impl.ConvertEapToEbs42WithCacheImpl;
import com.ag01.ebs42.model.utils.api.ConverterUtils;
import com.ag01.ebs42.model.utils.impl.ConverterUtilsImpl;

@Configuration
@PropertySource("classpath:ebs42.properties")
public class ApplicationMainConfiguration {
	
	@Autowired
	private Environment env;
	
	//private String dbLocation = env.getProperty("db.location");
	
	private static Driver getJdbcDriver() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		return (Driver) Class.forName("net.ucanaccess.jdbc.UcanaccessDriver").newInstance();		
	}
	
	private String getJdbcUrl() {		
		return new String("jdbc:ucanaccess:///opt/analyze_eap/model/ebs42_model.eap");
		//return dbLocation;
		//return new String("jdbc:ucanaccess://C:/home/axl/projects/ebs42/ebs42_model.eap");
	}

	@Bean
	public DataSource dataSource() throws InstantiationException, IllegalAccessException, ClassNotFoundException {    	
		return new SimpleDriverDataSource(getJdbcDriver(), getJdbcUrl());
	}	
    
	@Bean
	public PlatformTransactionManager platformTransactionManager() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
		dataSourceTransactionManager.setDataSource(dataSource());
		return dataSourceTransactionManager;
	}
	
    @Bean
    TefforttypesDao tefforttypesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TefforttypesDaoSpringJdbcTemplatesImpl tmpTefforttypesDaoSpringJdbcTemplatesImpl = new TefforttypesDaoSpringJdbcTemplatesImpl();
        tmpTefforttypesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTefforttypesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TtemplateDao ttemplateDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TtemplateDaoSpringJdbcTemplatesImpl tmpTtemplateDaoSpringJdbcTemplatesImpl = new TtemplateDaoSpringJdbcTemplatesImpl();
        tmpTtemplateDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTtemplateDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TtcfDao ttcfDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TtcfDaoSpringJdbcTemplatesImpl tmpTtcfDaoSpringJdbcTemplatesImpl = new TtcfDaoSpringJdbcTemplatesImpl();
        tmpTtcfDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTtcfDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TprojectrolesDao tprojectrolesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TprojectrolesDaoSpringJdbcTemplatesImpl tmpTprojectrolesDaoSpringJdbcTemplatesImpl = new TprojectrolesDaoSpringJdbcTemplatesImpl();
        tmpTprojectrolesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTprojectrolesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TobjecttrxDao tobjecttrxDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TobjecttrxDaoSpringJdbcTemplatesImpl tmpTobjecttrxDaoSpringJdbcTemplatesImpl = new TobjecttrxDaoSpringJdbcTemplatesImpl();
        tmpTobjecttrxDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTobjecttrxDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TobjectproblemsDao tobjectproblemsDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TobjectproblemsDaoSpringJdbcTemplatesImpl tmpTobjectproblemsDaoSpringJdbcTemplatesImpl = new TobjectproblemsDaoSpringJdbcTemplatesImpl();
        tmpTobjectproblemsDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTobjectproblemsDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TpackageDao tpackageDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TpackageDaoSpringJdbcTemplatesImpl tmpTpackageDaoSpringJdbcTemplatesImpl = new TpackageDaoSpringJdbcTemplatesImpl();
        tmpTpackageDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTpackageDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TprimitivesDao tprimitivesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TprimitivesDaoSpringJdbcTemplatesImpl tmpTprimitivesDaoSpringJdbcTemplatesImpl = new TprimitivesDaoSpringJdbcTemplatesImpl();
        tmpTprimitivesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTprimitivesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TproblemtypesDao tproblemtypesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TproblemtypesDaoSpringJdbcTemplatesImpl tmpTproblemtypesDaoSpringJdbcTemplatesImpl = new TproblemtypesDaoSpringJdbcTemplatesImpl();
        tmpTproblemtypesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTproblemtypesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TconnectortagDao tconnectortagDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TconnectortagDaoSpringJdbcTemplatesImpl tmpTconnectortagDaoSpringJdbcTemplatesImpl = new TconnectortagDaoSpringJdbcTemplatesImpl();
        tmpTconnectortagDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTconnectortagDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TsecgrouppermissionDao tsecgrouppermissionDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TsecgrouppermissionDaoSpringJdbcTemplatesImpl tmpTsecgrouppermissionDaoSpringJdbcTemplatesImpl = new TsecgrouppermissionDaoSpringJdbcTemplatesImpl();
        tmpTsecgrouppermissionDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTsecgrouppermissionDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TumlpatternDao tumlpatternDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TumlpatternDaoSpringJdbcTemplatesImpl tmpTumlpatternDaoSpringJdbcTemplatesImpl = new TumlpatternDaoSpringJdbcTemplatesImpl();
        tmpTumlpatternDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTumlpatternDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TobjectDao tobjectDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TobjectDaoSpringJdbcTemplatesImpl tmpTobjectDaoSpringJdbcTemplatesImpl = new TobjectDaoSpringJdbcTemplatesImpl();
        tmpTobjectDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTobjectDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TroleconstraintDao troleconstraintDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TroleconstraintDaoSpringJdbcTemplatesImpl tmpTroleconstraintDaoSpringJdbcTemplatesImpl = new TroleconstraintDaoSpringJdbcTemplatesImpl();
        tmpTroleconstraintDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTroleconstraintDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TsecpermissionDao tsecpermissionDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TsecpermissionDaoSpringJdbcTemplatesImpl tmpTsecpermissionDaoSpringJdbcTemplatesImpl = new TsecpermissionDaoSpringJdbcTemplatesImpl();
        tmpTsecpermissionDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTsecpermissionDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TobjectpropertiesDao tobjectpropertiesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TobjectpropertiesDaoSpringJdbcTemplatesImpl tmpTobjectpropertiesDaoSpringJdbcTemplatesImpl = new TobjectpropertiesDaoSpringJdbcTemplatesImpl();
        tmpTobjectpropertiesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTobjectpropertiesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TpropertytypesDao tpropertytypesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TpropertytypesDaoSpringJdbcTemplatesImpl tmpTpropertytypesDaoSpringJdbcTemplatesImpl = new TpropertytypesDaoSpringJdbcTemplatesImpl();
        tmpTpropertytypesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTpropertytypesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TconnectorDao tconnectorDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TconnectorDaoSpringJdbcTemplatesImpl tmpTconnectorDaoSpringJdbcTemplatesImpl = new TconnectorDaoSpringJdbcTemplatesImpl();
        tmpTconnectorDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTconnectorDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TobjecttypesDao tobjecttypesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TobjecttypesDaoSpringJdbcTemplatesImpl tmpTobjecttypesDaoSpringJdbcTemplatesImpl = new TobjecttypesDaoSpringJdbcTemplatesImpl();
        tmpTobjecttypesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTobjecttypesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    UsysqueriesDao usysqueriesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        UsysqueriesDaoSpringJdbcTemplatesImpl tmpUsysqueriesDaoSpringJdbcTemplatesImpl = new UsysqueriesDaoSpringJdbcTemplatesImpl();
        tmpUsysqueriesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpUsysqueriesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TobjectconstraintDao tobjectconstraintDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TobjectconstraintDaoSpringJdbcTemplatesImpl tmpTobjectconstraintDaoSpringJdbcTemplatesImpl = new TobjectconstraintDaoSpringJdbcTemplatesImpl();
        tmpTobjectconstraintDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTobjectconstraintDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TpaletteitemDao tpaletteitemDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TpaletteitemDaoSpringJdbcTemplatesImpl tmpTpaletteitemDaoSpringJdbcTemplatesImpl = new TpaletteitemDaoSpringJdbcTemplatesImpl();
        tmpTpaletteitemDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTpaletteitemDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TstatustypesDao tstatustypesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TstatustypesDaoSpringJdbcTemplatesImpl tmpTstatustypesDaoSpringJdbcTemplatesImpl = new TstatustypesDaoSpringJdbcTemplatesImpl();
        tmpTstatustypesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTstatustypesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TmethodDao tmethodDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TmethodDaoSpringJdbcTemplatesImpl tmpTmethodDaoSpringJdbcTemplatesImpl = new TmethodDaoSpringJdbcTemplatesImpl();
        tmpTmethodDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTmethodDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TtaggedvalueDao ttaggedvalueDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TtaggedvalueDaoSpringJdbcTemplatesImpl tmpTtaggedvalueDaoSpringJdbcTemplatesImpl = new TtaggedvalueDaoSpringJdbcTemplatesImpl();
        tmpTtaggedvalueDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTtaggedvalueDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TattributeDao tattributeDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TattributeDaoSpringJdbcTemplatesImpl tmpTattributeDaoSpringJdbcTemplatesImpl = new TattributeDaoSpringJdbcTemplatesImpl();
        tmpTattributeDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTattributeDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TsecuserpermissionDao tsecuserpermissionDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TsecuserpermissionDaoSpringJdbcTemplatesImpl tmpTsecuserpermissionDaoSpringJdbcTemplatesImpl = new TsecuserpermissionDaoSpringJdbcTemplatesImpl();
        tmpTsecuserpermissionDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTsecuserpermissionDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TphaseDao tphaseDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TphaseDaoSpringJdbcTemplatesImpl tmpTphaseDaoSpringJdbcTemplatesImpl = new TphaseDaoSpringJdbcTemplatesImpl();
        tmpTphaseDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTphaseDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TxrefuserDao txrefuserDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TxrefuserDaoSpringJdbcTemplatesImpl tmpTxrefuserDaoSpringJdbcTemplatesImpl = new TxrefuserDaoSpringJdbcTemplatesImpl();
        tmpTxrefuserDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTxrefuserDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TdiagramDao tdiagramDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TdiagramDaoSpringJdbcTemplatesImpl tmpTdiagramDaoSpringJdbcTemplatesImpl = new TdiagramDaoSpringJdbcTemplatesImpl();
        tmpTdiagramDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTdiagramDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    UsystablesDao usystablesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        UsystablesDaoSpringJdbcTemplatesImpl tmpUsystablesDaoSpringJdbcTemplatesImpl = new UsystablesDaoSpringJdbcTemplatesImpl();
        tmpUsystablesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpUsystablesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TsecgroupDao tsecgroupDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TsecgroupDaoSpringJdbcTemplatesImpl tmpTsecgroupDaoSpringJdbcTemplatesImpl = new TsecgroupDaoSpringJdbcTemplatesImpl();
        tmpTsecgroupDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTsecgroupDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TpaletteDao tpaletteDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TpaletteDaoSpringJdbcTemplatesImpl tmpTpaletteDaoSpringJdbcTemplatesImpl = new TpaletteDaoSpringJdbcTemplatesImpl();
        tmpTpaletteDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTpaletteDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TsecpoliciesDao tsecpoliciesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TsecpoliciesDaoSpringJdbcTemplatesImpl tmpTsecpoliciesDaoSpringJdbcTemplatesImpl = new TsecpoliciesDaoSpringJdbcTemplatesImpl();
        tmpTsecpoliciesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTsecpoliciesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TxrefsystemDao txrefsystemDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TxrefsystemDaoSpringJdbcTemplatesImpl tmpTxrefsystemDaoSpringJdbcTemplatesImpl = new TxrefsystemDaoSpringJdbcTemplatesImpl();
        tmpTxrefsystemDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTxrefsystemDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TocfDao tocfDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TocfDaoSpringJdbcTemplatesImpl tmpTocfDaoSpringJdbcTemplatesImpl = new TocfDaoSpringJdbcTemplatesImpl();
        tmpTocfDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTocfDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TmainttypesDao tmainttypesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TmainttypesDaoSpringJdbcTemplatesImpl tmpTmainttypesDaoSpringJdbcTemplatesImpl = new TmainttypesDaoSpringJdbcTemplatesImpl();
        tmpTmainttypesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTmainttypesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TconnectortypesDao tconnectortypesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TconnectortypesDaoSpringJdbcTemplatesImpl tmpTconnectortypesDaoSpringJdbcTemplatesImpl = new TconnectortypesDaoSpringJdbcTemplatesImpl();
        tmpTconnectortypesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTconnectortypesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TstereotypesDao tstereotypesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TstereotypesDaoSpringJdbcTemplatesImpl tmpTstereotypesDaoSpringJdbcTemplatesImpl = new TstereotypesDaoSpringJdbcTemplatesImpl();
        tmpTstereotypesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTstereotypesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TxrefDao txrefDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TxrefDaoSpringJdbcTemplatesImpl tmpTxrefDaoSpringJdbcTemplatesImpl = new TxrefDaoSpringJdbcTemplatesImpl();
        tmpTxrefDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTxrefDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TdatatypesDao tdatatypesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TdatatypesDaoSpringJdbcTemplatesImpl tmpTdatatypesDaoSpringJdbcTemplatesImpl = new TdatatypesDaoSpringJdbcTemplatesImpl();
        tmpTdatatypesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTdatatypesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TobjectrisksDao tobjectrisksDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TobjectrisksDaoSpringJdbcTemplatesImpl tmpTobjectrisksDaoSpringJdbcTemplatesImpl = new TobjectrisksDaoSpringJdbcTemplatesImpl();
        tmpTobjectrisksDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTobjectrisksDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TgenoptDao tgenoptDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TgenoptDaoSpringJdbcTemplatesImpl tmpTgenoptDaoSpringJdbcTemplatesImpl = new TgenoptDaoSpringJdbcTemplatesImpl();
        tmpTgenoptDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTgenoptDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TauthorsDao tauthorsDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TauthorsDaoSpringJdbcTemplatesImpl tmpTauthorsDaoSpringJdbcTemplatesImpl = new TauthorsDaoSpringJdbcTemplatesImpl();
        tmpTauthorsDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTauthorsDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TsecusergroupDao tsecusergroupDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TsecusergroupDaoSpringJdbcTemplatesImpl tmpTsecusergroupDaoSpringJdbcTemplatesImpl = new TsecusergroupDaoSpringJdbcTemplatesImpl();
        tmpTsecusergroupDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTsecusergroupDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    ToperationtagDao toperationtagDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        ToperationtagDaoSpringJdbcTemplatesImpl tmpToperationtagDaoSpringJdbcTemplatesImpl = new ToperationtagDaoSpringJdbcTemplatesImpl();
        tmpToperationtagDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpToperationtagDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TtestplansDao ttestplansDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TtestplansDaoSpringJdbcTemplatesImpl tmpTtestplansDaoSpringJdbcTemplatesImpl = new TtestplansDaoSpringJdbcTemplatesImpl();
        tmpTtestplansDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTtestplansDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TobjecteffortDao tobjecteffortDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TobjecteffortDaoSpringJdbcTemplatesImpl tmpTobjecteffortDaoSpringJdbcTemplatesImpl = new TobjecteffortDaoSpringJdbcTemplatesImpl();
        tmpTobjecteffortDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTobjecteffortDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TrulesDao trulesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TrulesDaoSpringJdbcTemplatesImpl tmpTrulesDaoSpringJdbcTemplatesImpl = new TrulesDaoSpringJdbcTemplatesImpl();
        tmpTrulesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTrulesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TimplementDao timplementDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TimplementDaoSpringJdbcTemplatesImpl tmpTimplementDaoSpringJdbcTemplatesImpl = new TimplementDaoSpringJdbcTemplatesImpl();
        tmpTimplementDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTimplementDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TobjectrequiresDao tobjectrequiresDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TobjectrequiresDaoSpringJdbcTemplatesImpl tmpTobjectrequiresDaoSpringJdbcTemplatesImpl = new TobjectrequiresDaoSpringJdbcTemplatesImpl();
        tmpTobjectrequiresDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTobjectrequiresDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TattributeconstraintsDao tattributeconstraintsDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TattributeconstraintsDaoSpringJdbcTemplatesImpl tmpTattributeconstraintsDaoSpringJdbcTemplatesImpl = new TattributeconstraintsDaoSpringJdbcTemplatesImpl();
        tmpTattributeconstraintsDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTattributeconstraintsDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TsnapshotDao tsnapshotDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TsnapshotDaoSpringJdbcTemplatesImpl tmpTsnapshotDaoSpringJdbcTemplatesImpl = new TsnapshotDaoSpringJdbcTemplatesImpl();
        tmpTsnapshotDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTsnapshotDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TversionDao tversionDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TversionDaoSpringJdbcTemplatesImpl tmpTversionDaoSpringJdbcTemplatesImpl = new TversionDaoSpringJdbcTemplatesImpl();
        tmpTversionDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTversionDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TdocumentDao tdocumentDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TdocumentDaoSpringJdbcTemplatesImpl tmpTdocumentDaoSpringJdbcTemplatesImpl = new TdocumentDaoSpringJdbcTemplatesImpl();
        tmpTdocumentDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTdocumentDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TrtfDao trtfDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TrtfDaoSpringJdbcTemplatesImpl tmpTrtfDaoSpringJdbcTemplatesImpl = new TrtfDaoSpringJdbcTemplatesImpl();
        tmpTrtfDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTrtfDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TlistsDao tlistsDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TlistsDaoSpringJdbcTemplatesImpl tmpTlistsDaoSpringJdbcTemplatesImpl = new TlistsDaoSpringJdbcTemplatesImpl();
        tmpTlistsDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTlistsDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TmetrictypesDao tmetrictypesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TmetrictypesDaoSpringJdbcTemplatesImpl tmpTmetrictypesDaoSpringJdbcTemplatesImpl = new TmetrictypesDaoSpringJdbcTemplatesImpl();
        tmpTmetrictypesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTmetrictypesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    UsyssystemDao usyssystemDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        UsyssystemDaoSpringJdbcTemplatesImpl tmpUsyssystemDaoSpringJdbcTemplatesImpl = new UsyssystemDaoSpringJdbcTemplatesImpl();
        tmpUsyssystemDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpUsyssystemDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TcomplexitytypesDao tcomplexitytypesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TcomplexitytypesDaoSpringJdbcTemplatesImpl tmpTcomplexitytypesDaoSpringJdbcTemplatesImpl = new TcomplexitytypesDaoSpringJdbcTemplatesImpl();
        tmpTcomplexitytypesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTcomplexitytypesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    ToperationDao toperationDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        ToperationDaoSpringJdbcTemplatesImpl tmpToperationDaoSpringJdbcTemplatesImpl = new ToperationDaoSpringJdbcTemplatesImpl();
        tmpToperationDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpToperationDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TconstrainttypesDao tconstrainttypesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TconstrainttypesDaoSpringJdbcTemplatesImpl tmpTconstrainttypesDaoSpringJdbcTemplatesImpl = new TconstrainttypesDaoSpringJdbcTemplatesImpl();
        tmpTconstrainttypesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTconstrainttypesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TtestclassDao ttestclassDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TtestclassDaoSpringJdbcTemplatesImpl tmpTtestclassDaoSpringJdbcTemplatesImpl = new TtestclassDaoSpringJdbcTemplatesImpl();
        tmpTtestclassDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTtestclassDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TobjectscenariosDao tobjectscenariosDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TobjectscenariosDaoSpringJdbcTemplatesImpl tmpTobjectscenariosDaoSpringJdbcTemplatesImpl = new TobjectscenariosDaoSpringJdbcTemplatesImpl();
        tmpTobjectscenariosDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTobjectscenariosDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TscriptDao tscriptDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TscriptDaoSpringJdbcTemplatesImpl tmpTscriptDaoSpringJdbcTemplatesImpl = new TscriptDaoSpringJdbcTemplatesImpl();
        tmpTscriptDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTscriptDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TtesttypesDao ttesttypesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TtesttypesDaoSpringJdbcTemplatesImpl tmpTtesttypesDaoSpringJdbcTemplatesImpl = new TtesttypesDaoSpringJdbcTemplatesImpl();
        tmpTtesttypesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTtesttypesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TrisktypesDao trisktypesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TrisktypesDaoSpringJdbcTemplatesImpl tmpTrisktypesDaoSpringJdbcTemplatesImpl = new TrisktypesDaoSpringJdbcTemplatesImpl();
        tmpTrisktypesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTrisktypesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    ToperationparamsDao toperationparamsDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        ToperationparamsDaoSpringJdbcTemplatesImpl tmpToperationparamsDaoSpringJdbcTemplatesImpl = new ToperationparamsDaoSpringJdbcTemplatesImpl();
        tmpToperationparamsDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpToperationparamsDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TecfDao tecfDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TecfDaoSpringJdbcTemplatesImpl tmpTecfDaoSpringJdbcTemplatesImpl = new TecfDaoSpringJdbcTemplatesImpl();
        tmpTecfDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTecfDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TresourcesDao tresourcesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TresourcesDaoSpringJdbcTemplatesImpl tmpTresourcesDaoSpringJdbcTemplatesImpl = new TresourcesDaoSpringJdbcTemplatesImpl();
        tmpTresourcesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTresourcesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TobjectmetricsDao tobjectmetricsDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TobjectmetricsDaoSpringJdbcTemplatesImpl tmpTobjectmetricsDaoSpringJdbcTemplatesImpl = new TobjectmetricsDaoSpringJdbcTemplatesImpl();
        tmpTobjectmetricsDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTobjectmetricsDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TimageDao timageDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TimageDaoSpringJdbcTemplatesImpl tmpTimageDaoSpringJdbcTemplatesImpl = new TimageDaoSpringJdbcTemplatesImpl();
        tmpTimageDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTimageDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TdiagramtypesDao tdiagramtypesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TdiagramtypesDaoSpringJdbcTemplatesImpl tmpTdiagramtypesDaoSpringJdbcTemplatesImpl = new TdiagramtypesDaoSpringJdbcTemplatesImpl();
        tmpTdiagramtypesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTdiagramtypesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TobjecttestsDao tobjecttestsDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TobjecttestsDaoSpringJdbcTemplatesImpl tmpTobjecttestsDaoSpringJdbcTemplatesImpl = new TobjecttestsDaoSpringJdbcTemplatesImpl();
        tmpTobjecttestsDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTobjecttestsDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TdiagramobjectsDao tdiagramobjectsDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TdiagramobjectsDaoSpringJdbcTemplatesImpl tmpTdiagramobjectsDaoSpringJdbcTemplatesImpl = new TdiagramobjectsDaoSpringJdbcTemplatesImpl();
        tmpTdiagramobjectsDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTdiagramobjectsDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    UsysoldtablesDao usysoldtablesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        UsysoldtablesDaoSpringJdbcTemplatesImpl tmpUsysoldtablesDaoSpringJdbcTemplatesImpl = new UsysoldtablesDaoSpringJdbcTemplatesImpl();
        tmpUsysoldtablesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpUsysoldtablesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TobjectfilesDao tobjectfilesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TobjectfilesDaoSpringJdbcTemplatesImpl tmpTobjectfilesDaoSpringJdbcTemplatesImpl = new TobjectfilesDaoSpringJdbcTemplatesImpl();
        tmpTobjectfilesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTobjectfilesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TcategoryDao tcategoryDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TcategoryDaoSpringJdbcTemplatesImpl tmpTcategoryDaoSpringJdbcTemplatesImpl = new TcategoryDaoSpringJdbcTemplatesImpl();
        tmpTcategoryDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTcategoryDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TissuesDao tissuesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TissuesDaoSpringJdbcTemplatesImpl tmpTissuesDaoSpringJdbcTemplatesImpl = new TissuesDaoSpringJdbcTemplatesImpl();
        tmpTissuesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTissuesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    ThtmlDao thtmlDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        ThtmlDaoSpringJdbcTemplatesImpl tmpThtmlDaoSpringJdbcTemplatesImpl = new ThtmlDaoSpringJdbcTemplatesImpl();
        tmpThtmlDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpThtmlDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TobjectresourceDao tobjectresourceDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TobjectresourceDaoSpringJdbcTemplatesImpl tmpTobjectresourceDaoSpringJdbcTemplatesImpl = new TobjectresourceDaoSpringJdbcTemplatesImpl();
        tmpTobjectresourceDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTobjectresourceDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    ToperationpresDao toperationpresDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        ToperationpresDaoSpringJdbcTemplatesImpl tmpToperationpresDaoSpringJdbcTemplatesImpl = new ToperationpresDaoSpringJdbcTemplatesImpl();
        tmpToperationpresDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpToperationpresDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TfilesDao tfilesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TfilesDaoSpringJdbcTemplatesImpl tmpTfilesDaoSpringJdbcTemplatesImpl = new TfilesDaoSpringJdbcTemplatesImpl();
        tmpTfilesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTfilesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TglossaryDao tglossaryDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TglossaryDaoSpringJdbcTemplatesImpl tmpTglossaryDaoSpringJdbcTemplatesImpl = new TglossaryDaoSpringJdbcTemplatesImpl();
        tmpTglossaryDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTglossaryDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TsecuserDao tsecuserDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TsecuserDaoSpringJdbcTemplatesImpl tmpTsecuserDaoSpringJdbcTemplatesImpl = new TsecuserDaoSpringJdbcTemplatesImpl();
        tmpTsecuserDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTsecuserDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TseclocksDao tseclocksDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TseclocksDaoSpringJdbcTemplatesImpl tmpTseclocksDaoSpringJdbcTemplatesImpl = new TseclocksDaoSpringJdbcTemplatesImpl();
        tmpTseclocksDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTseclocksDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TclientsDao tclientsDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TclientsDaoSpringJdbcTemplatesImpl tmpTclientsDaoSpringJdbcTemplatesImpl = new TclientsDaoSpringJdbcTemplatesImpl();
        tmpTclientsDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTclientsDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TdiagramlinksDao tdiagramlinksDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TdiagramlinksDaoSpringJdbcTemplatesImpl tmpTdiagramlinksDaoSpringJdbcTemplatesImpl = new TdiagramlinksDaoSpringJdbcTemplatesImpl();
        tmpTdiagramlinksDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTdiagramlinksDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TrequiretypesDao trequiretypesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TrequiretypesDaoSpringJdbcTemplatesImpl tmpTrequiretypesDaoSpringJdbcTemplatesImpl = new TrequiretypesDaoSpringJdbcTemplatesImpl();
        tmpTrequiretypesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTrequiretypesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TrtfreportDao trtfreportDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TrtfreportDaoSpringJdbcTemplatesImpl tmpTrtfreportDaoSpringJdbcTemplatesImpl = new TrtfreportDaoSpringJdbcTemplatesImpl();
        tmpTrtfreportDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTrtfreportDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TscenariotypesDao tscenariotypesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TscenariotypesDaoSpringJdbcTemplatesImpl tmpTscenariotypesDaoSpringJdbcTemplatesImpl = new TscenariotypesDaoSpringJdbcTemplatesImpl();
        tmpTscenariotypesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTscenariotypesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TattributetagDao tattributetagDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TattributetagDaoSpringJdbcTemplatesImpl tmpTattributetagDaoSpringJdbcTemplatesImpl = new TattributetagDaoSpringJdbcTemplatesImpl();
        tmpTattributetagDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTattributetagDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TcardinalityDao tcardinalityDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TcardinalityDaoSpringJdbcTemplatesImpl tmpTcardinalityDaoSpringJdbcTemplatesImpl = new TcardinalityDaoSpringJdbcTemplatesImpl();
        tmpTcardinalityDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTcardinalityDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TconstantsDao tconstantsDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TconstantsDaoSpringJdbcTemplatesImpl tmpTconstantsDaoSpringJdbcTemplatesImpl = new TconstantsDaoSpringJdbcTemplatesImpl();
        tmpTconstantsDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTconstantsDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TtrxtypesDao ttrxtypesDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TtrxtypesDaoSpringJdbcTemplatesImpl tmpTtrxtypesDaoSpringJdbcTemplatesImpl = new TtrxtypesDaoSpringJdbcTemplatesImpl();
        tmpTtrxtypesDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTtrxtypesDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TconnectorconstraintDao tconnectorconstraintDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TconnectorconstraintDaoSpringJdbcTemplatesImpl tmpTconnectorconstraintDaoSpringJdbcTemplatesImpl = new TconnectorconstraintDaoSpringJdbcTemplatesImpl();
        tmpTconnectorconstraintDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTconnectorconstraintDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    TtasksDao ttasksDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        TtasksDaoSpringJdbcTemplatesImpl tmpTtasksDaoSpringJdbcTemplatesImpl = new TtasksDaoSpringJdbcTemplatesImpl();
        tmpTtasksDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpTtasksDaoSpringJdbcTemplatesImpl;
    }

    @Bean
    ToperationpostsDao toperationpostsDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        ToperationpostsDaoSpringJdbcTemplatesImpl tmpToperationpostsDaoSpringJdbcTemplatesImpl = new ToperationpostsDaoSpringJdbcTemplatesImpl();
        tmpToperationpostsDaoSpringJdbcTemplatesImpl.setDataSource(dataSource());
        return tmpToperationpostsDaoSpringJdbcTemplatesImpl;
    }
    
    @Bean
    CompleteEapDatabase completeEapDatabase() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
    	CompleteEapDatabase completeEapDatabase = null;
    	CompleteEapDatabaseImpl completeEapDatabaseImpl = new CompleteEapDatabaseImpl();

    	completeEapDatabaseImpl.setPlatformTransactionManager(platformTransactionManager());

    	completeEapDatabaseImpl.setTattributeDao(tattributeDao());
    	completeEapDatabaseImpl.setTattributeconstraintsDao(tattributeconstraintsDao());
    	completeEapDatabaseImpl.setTattributetagDao(tattributetagDao());
    	completeEapDatabaseImpl.setTauthorsDao(tauthorsDao());
    	completeEapDatabaseImpl.setTcardinalityDao(tcardinalityDao());
    	completeEapDatabaseImpl.setTcategoryDao(tcategoryDao());
    	completeEapDatabaseImpl.setTclientsDao(tclientsDao());
    	completeEapDatabaseImpl.setTcomplexitytypesDao(tcomplexitytypesDao());
    	completeEapDatabaseImpl.setTconnectorDao(tconnectorDao());
    	completeEapDatabaseImpl.setTconnectorconstraintDao(tconnectorconstraintDao());
    	completeEapDatabaseImpl.setTconnectortagDao(tconnectortagDao());
    	completeEapDatabaseImpl.setTconnectortypesDao(tconnectortypesDao());
    	completeEapDatabaseImpl.setTconstantsDao(tconstantsDao());
    	completeEapDatabaseImpl.setTconstrainttypesDao(tconstrainttypesDao());
    	completeEapDatabaseImpl.setTdatatypesDao(tdatatypesDao());
    	completeEapDatabaseImpl.setTdiagramDao(tdiagramDao());
    	completeEapDatabaseImpl.setTdiagramlinksDao(tdiagramlinksDao());
    	completeEapDatabaseImpl.setTdiagramobjectsDao(tdiagramobjectsDao());
    	completeEapDatabaseImpl.setTdiagramtypesDao(tdiagramtypesDao());
    	completeEapDatabaseImpl.setTdocumentDao(tdocumentDao());
    	completeEapDatabaseImpl.setTecfDao(tecfDao());
    	completeEapDatabaseImpl.setTefforttypesDao(tefforttypesDao());
    	completeEapDatabaseImpl.setTfilesDao(tfilesDao());
    	completeEapDatabaseImpl.setTgenoptDao(tgenoptDao());
    	completeEapDatabaseImpl.setTglossaryDao(tglossaryDao());
    	completeEapDatabaseImpl.setThtmlDao(thtmlDao());
    	completeEapDatabaseImpl.setTimageDao(timageDao());
    	completeEapDatabaseImpl.setTimplementDao(timplementDao());
    	completeEapDatabaseImpl.setTissuesDao(tissuesDao());
    	completeEapDatabaseImpl.setTlistsDao(tlistsDao());
    	completeEapDatabaseImpl.setTmainttypesDao(tmainttypesDao());
    	completeEapDatabaseImpl.setTmethodDao(tmethodDao());
    	completeEapDatabaseImpl.setTmetrictypesDao(tmetrictypesDao());
    	completeEapDatabaseImpl.setTobjectDao(tobjectDao());
    	completeEapDatabaseImpl.setTobjectconstraintDao(tobjectconstraintDao());
    	completeEapDatabaseImpl.setTobjecteffortDao(tobjecteffortDao());
    	completeEapDatabaseImpl.setTobjectfilesDao(tobjectfilesDao());
    	completeEapDatabaseImpl.setTobjectmetricsDao(tobjectmetricsDao());
    	completeEapDatabaseImpl.setTobjectproblemsDao(tobjectproblemsDao());
    	completeEapDatabaseImpl.setTobjectpropertiesDao(tobjectpropertiesDao());
    	completeEapDatabaseImpl.setTobjectrequiresDao(tobjectrequiresDao());
    	completeEapDatabaseImpl.setTobjectresourceDao(tobjectresourceDao());
    	completeEapDatabaseImpl.setTobjectrisksDao(tobjectrisksDao());
    	completeEapDatabaseImpl.setTobjectscenariosDao(tobjectscenariosDao());
    	completeEapDatabaseImpl.setTobjecttestsDao(tobjecttestsDao());
    	completeEapDatabaseImpl.setTobjecttrxDao(tobjecttrxDao());
    	completeEapDatabaseImpl.setTobjecttypesDao(tobjecttypesDao());
    	completeEapDatabaseImpl.setTocfDao(tocfDao());
    	completeEapDatabaseImpl.setToperationDao(toperationDao());
    	completeEapDatabaseImpl.setToperationparamsDao(toperationparamsDao());
    	completeEapDatabaseImpl.setToperationpostsDao(toperationpostsDao());
    	completeEapDatabaseImpl.setToperationpresDao(toperationpresDao());
    	completeEapDatabaseImpl.setToperationtagDao(toperationtagDao());
    	completeEapDatabaseImpl.setTpackageDao(tpackageDao());
    	completeEapDatabaseImpl.setTpaletteDao(tpaletteDao());
    	completeEapDatabaseImpl.setTpaletteitemDao(tpaletteitemDao());
    	completeEapDatabaseImpl.setTphaseDao(tphaseDao());
    	completeEapDatabaseImpl.setTprimitivesDao(tprimitivesDao());
    	completeEapDatabaseImpl.setTproblemtypesDao(tproblemtypesDao());
    	completeEapDatabaseImpl.setTprojectrolesDao(tprojectrolesDao());
    	completeEapDatabaseImpl.setTpropertytypesDao(tpropertytypesDao());
    	completeEapDatabaseImpl.setTrequiretypesDao(trequiretypesDao());
    	completeEapDatabaseImpl.setTresourcesDao(tresourcesDao());
    	completeEapDatabaseImpl.setTrisktypesDao(trisktypesDao());
    	completeEapDatabaseImpl.setTroleconstraintDao(troleconstraintDao());
    	completeEapDatabaseImpl.setTrtfDao(trtfDao());
    	completeEapDatabaseImpl.setTrtfreportDao(trtfreportDao());
    	completeEapDatabaseImpl.setTrulesDao(trulesDao());
    	completeEapDatabaseImpl.setTscenariotypesDao(tscenariotypesDao());
    	completeEapDatabaseImpl.setTscriptDao(tscriptDao());
    	completeEapDatabaseImpl.setTsecgroupDao(tsecgroupDao());
    	completeEapDatabaseImpl.setTsecgrouppermissionDao(tsecgrouppermissionDao());
    	completeEapDatabaseImpl.setTseclocksDao(tseclocksDao());
    	completeEapDatabaseImpl.setTsecpermissionDao(tsecpermissionDao());
    	completeEapDatabaseImpl.setTsecpoliciesDao(tsecpoliciesDao());
    	completeEapDatabaseImpl.setTsecuserDao(tsecuserDao());
    	completeEapDatabaseImpl.setTsecusergroupDao(tsecusergroupDao());
    	completeEapDatabaseImpl.setTsecuserpermissionDao(tsecuserpermissionDao());
    	completeEapDatabaseImpl.setTsnapshotDao(tsnapshotDao());
    	completeEapDatabaseImpl.setTstatustypesDao(tstatustypesDao());
    	completeEapDatabaseImpl.setTstereotypesDao(tstereotypesDao());
    	completeEapDatabaseImpl.setTtaggedvalueDao(ttaggedvalueDao());
    	completeEapDatabaseImpl.setTtasksDao(ttasksDao());
    	completeEapDatabaseImpl.setTtcfDao(ttcfDao());
    	completeEapDatabaseImpl.setTtemplateDao(ttemplateDao());
    	completeEapDatabaseImpl.setTtestclassDao(ttestclassDao());
    	completeEapDatabaseImpl.setTtestplansDao(ttestplansDao());
    	completeEapDatabaseImpl.setTtesttypesDao(ttesttypesDao());
    	completeEapDatabaseImpl.setTtrxtypesDao(ttrxtypesDao());
    	completeEapDatabaseImpl.setTumlpatternDao(tumlpatternDao());
    	completeEapDatabaseImpl.setTversionDao(tversionDao());
    	completeEapDatabaseImpl.setTxrefDao(txrefDao());
    	completeEapDatabaseImpl.setTxrefsystemDao(txrefsystemDao());
    	completeEapDatabaseImpl.setTxrefuserDao(txrefuserDao());
    	completeEapDatabaseImpl.setUsysoldtablesDao(usysoldtablesDao());
    	completeEapDatabaseImpl.setUsysqueriesDao(usysqueriesDao());
    	completeEapDatabaseImpl.setUsyssystemDao(usyssystemDao());
    	completeEapDatabaseImpl.setUsystablesDao(usystablesDao());

    	completeEapDatabase = (CompleteEapDatabase) completeEapDatabaseImpl;
    	
    	return completeEapDatabase;
    }

    @Bean
	public ConverterUtils converterUtils() {
    	ConverterUtils converterUtils = null;
    	ConverterUtilsImpl converterUtilsImpl = new ConverterUtilsImpl();
    	converterUtils = (ConverterUtils) converterUtilsImpl;
    	return converterUtils;
    }

//    @Bean
//	public ConvertEapToEbs42 convertEapToEbs42() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
//		ConvertEapToEbs42 convertEapToEbs42 = null;
//		ConvertEapToEbs42Impl convertEapToEbs42Impl = null;
//		convertEapToEbs42Impl = new ConvertEapToEbs42Impl();
//		ConverterUtils converterUtils = converterUtils();
//		convertEapToEbs42Impl.setConverterUtils(converterUtils);
//		CompleteEapDatabase completeEapDatabase = completeEapDatabase();
//		convertEapToEbs42Impl.setCompleteEapDatabase(completeEapDatabase);
//		convertEapToEbs42 = (ConvertEapToEbs42) convertEapToEbs42Impl;
//		return convertEapToEbs42;
//	}
	
  @Bean
	public ConvertEapToEbs42 convertEapToEbs42() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		ConvertEapToEbs42 convertEapToEbs42 = null;
		ConvertEapToEbs42WithCacheImpl convertEapToEbs42WithCacheImpl = null;
		convertEapToEbs42WithCacheImpl = new ConvertEapToEbs42WithCacheImpl();
		ConverterUtils converterUtils = converterUtils();
		convertEapToEbs42WithCacheImpl.setConverterUtils(converterUtils);
		CompleteEapDatabase completeEapDatabase = completeEapDatabase();
		convertEapToEbs42WithCacheImpl.setCompleteEapDatabase(completeEapDatabase);
		convertEapToEbs42 = (ConvertEapToEbs42) convertEapToEbs42WithCacheImpl;
		return convertEapToEbs42;
	}

}
