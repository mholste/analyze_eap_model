package com.ag01.ebs42.analyze_eap_db.database_access.domain_object;

import java.io.Serializable;
import java.util.List;

import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TattributeconstraintsDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TattributetagDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TauthorsDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TcardinalityDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TcategoryDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TclientsDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TcomplexitytypesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TconnectorDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TconnectorconstraintDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TconnectortagDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TconnectortypesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TconstantsDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TconstrainttypesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TdatatypesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TdiagramDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TdiagramlinksDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TdiagramobjectsDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TdiagramtypesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TdocumentDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TecfDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TefforttypesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TfilesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TgenoptDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TglossaryDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.ThtmlDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TimageDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TimplementDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TissuesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TlistsDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TmainttypesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TmethodDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TmetrictypesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TobjectDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TobjectconstraintDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TobjecteffortDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TobjectfilesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TobjectmetricsDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TobjectproblemsDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TobjectpropertiesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TobjectrequiresDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TobjectresourceDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TobjectrisksDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TobjectscenariosDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TobjecttestsDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TobjecttrxDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TobjecttypesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TocfDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.ToperationDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.ToperationparamsDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.ToperationpostsDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.ToperationpresDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.ToperationtagDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TpackageDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TpaletteDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TpaletteitemDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TphaseDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TprimitivesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TproblemtypesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TprojectrolesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TpropertytypesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TrequiretypesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TresourcesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TrisktypesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TroleconstraintDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TrtfDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TrtfreportDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TrulesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TscenariotypesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TscriptDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TsecgroupDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TsecgrouppermissionDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TseclocksDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TsecpermissionDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TsecpoliciesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TsecuserDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TsecusergroupDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TsecuserpermissionDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TsnapshotDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TstatustypesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TstereotypesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TtaggedvalueDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TtasksDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TtcfDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TtemplateDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TtestclassDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TtestplansDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TtesttypesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TtrxtypesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TumlpatternDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TversionDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TxrefDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TxrefsystemDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TxrefuserDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.UsysoldtablesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.UsysqueriesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.UsyssystemDo;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.UsystablesDo;

public class CompleteEabDatabaseDo implements Serializable {

	private static final long serialVersionUID = 2605440346564224873L;

	private List <TattributeDo> tattributeDoList;
	private List <TattributeconstraintsDo> tattributeconstraintsDoList;
	private List <TattributetagDo> tattributetagDoList;
	private List <TauthorsDo> tauthorsDoList;
	private List <TcardinalityDo> tcardinalityDoList;
	private List <TcategoryDo> tcategoryDoList;
	private List <TclientsDo> tclientsDoList;
	private List <TcomplexitytypesDo> tcomplexitytypesDoList;
	private List <TconnectorDo> tconnectorDoList;
	private List <TconnectorconstraintDo> tconnectorconstraintDoList;
	private List <TconnectortagDo> tconnectortagDoList;
	private List <TconnectortypesDo> tconnectortypesDoList;
	private List <TconstantsDo> tconstantsDoList;
	private List <TconstrainttypesDo> tconstrainttypesDoList;
	private List <TdatatypesDo> tdatatypesDoList;
	private List <TdiagramDo> tdiagramDoList;
	private List <TdiagramlinksDo> tdiagramlinksDoList;
	private List <TdiagramobjectsDo> tdiagramobjectsDoList;
	private List <TdiagramtypesDo> tdiagramtypesDoList;
	private List <TdocumentDo> tdocumentDoList;
	private List <TecfDo> tecfDoList;
	private List <TefforttypesDo> tefforttypesDoList;
	private List <TfilesDo> tfilesDoList;
	private List <TgenoptDo> tgenoptDoList;
	private List <TglossaryDo> tglossaryDoList;
	private List <ThtmlDo> thtmlDoList;
	private List <TimageDo> timageDoList;
	private List <TimplementDo> timplementDoList;
	private List <TissuesDo> tissuesDoList;
	private List <TlistsDo> tlistsDoList;
	private List <TmainttypesDo> tmainttypesDoList;
	private List <TmethodDo> tmethodDoList;
	private List <TmetrictypesDo> tmetrictypesDoList;
	private List <TobjectDo> tobjectDoList;
	private List <TobjectconstraintDo> tobjectconstraintDoList;
	private List <TobjecteffortDo> tobjecteffortDoList;
	private List <TobjectfilesDo> tobjectfilesDoList;
	private List <TobjectmetricsDo> tobjectmetricsDoList;
	private List <TobjectproblemsDo> tobjectproblemsDoList;
	private List <TobjectpropertiesDo> tobjectpropertiesDoList;
	private List <TobjectrequiresDo> tobjectrequiresDoList;
	private List <TobjectresourceDo> tobjectresourceDoList;
	private List <TobjectrisksDo> tobjectrisksDoList;
	private List <TobjectscenariosDo> tobjectscenariosDoList;
	private List <TobjecttestsDo> tobjecttestsDoList;
	private List <TobjecttrxDo> tobjecttrxDoList;
	private List <TobjecttypesDo> tobjecttypesDoList;
	private List <TocfDo> tocfDoList;
	private List <ToperationDo> toperationDoList;
	private List <ToperationparamsDo> toperationparamsDoList;
	private List <ToperationpostsDo> toperationpostsDoList;
	private List <ToperationpresDo> toperationpresDoList;
	private List <ToperationtagDo> toperationtagDoList;
	private List <TpackageDo> tpackageDoList;
	private List <TpaletteDo> tpaletteDoList;
	private List <TpaletteitemDo> tpaletteitemDoList;
	private List <TphaseDo> tphaseDoList;
	private List <TprimitivesDo> tprimitivesDoList;
	private List <TproblemtypesDo> tproblemtypesDoList;
	private List <TprojectrolesDo> tprojectrolesDoList;
	private List <TpropertytypesDo> tpropertytypesDoList;
	private List <TrequiretypesDo> trequiretypesDoList;
	private List <TresourcesDo> tresourcesDoList;
	private List <TrisktypesDo> trisktypesDoList;
	private List <TroleconstraintDo> troleconstraintDoList;
	private List <TrtfDo> trtfDoList;
	private List <TrtfreportDo> trtfreportDoList;
	private List <TrulesDo> trulesDoList;
	private List <TscenariotypesDo> tscenariotypesDoList;
	private List <TscriptDo> tscriptDoList;
	private List <TsecgroupDo> tsecgroupDoList;
	private List <TsecgrouppermissionDo> tsecgrouppermissionDoList;
	private List <TseclocksDo> tseclocksDoList;
	private List <TsecpermissionDo> tsecpermissionDoList;
	private List <TsecpoliciesDo> tsecpoliciesDoList;
	private List <TsecuserDo> tsecuserDoList;
	private List <TsecusergroupDo> tsecusergroupDoList;
	private List <TsecuserpermissionDo> tsecuserpermissionDoList;
	private List <TsnapshotDo> tsnapshotDoList;
	private List <TstatustypesDo> tstatustypesDoList;
	private List <TstereotypesDo> tstereotypesDoList;
	private List <TtaggedvalueDo> ttaggedvalueDoList;
	private List <TtasksDo> ttasksDoList;
	private List <TtcfDo> ttcfDoList;
	private List <TtemplateDo> ttemplateDoList;
	private List <TtestclassDo> ttestclassDoList;
	private List <TtestplansDo> ttestplansDoList;
	private List <TtesttypesDo> ttesttypesDoList;
	private List <TtrxtypesDo> ttrxtypesDoList;
	private List <TumlpatternDo> tumlpatternDoList;
	private List <TversionDo> tversionDoList;
	private List <TxrefDo> txrefDoList;
	private List <TxrefsystemDo> txrefsystemDoList;
	private List <TxrefuserDo> txrefuserDoList;
	private List <UsysoldtablesDo> usysoldtablesDoList;
	private List <UsysqueriesDo> usysqueriesDoList;
	private List <UsyssystemDo> usyssystemDoList;
	private List <UsystablesDo> usystablesDoList;
	
	public CompleteEabDatabaseDo() {
		super();
	}

	public CompleteEabDatabaseDo(List<TattributeDo> tattributeDoList,
			List<TattributeconstraintsDo> tattributeconstraintsDoList, List<TattributetagDo> tattributetagDoList,
			List<TauthorsDo> tauthorsDoList, List<TcardinalityDo> tcardinalityDoList, List<TcategoryDo> tcategoryDoList,
			List<TclientsDo> tclientsDoList, List<TcomplexitytypesDo> tcomplexitytypesDoList,
			List<TconnectorDo> tconnectorDoList, List<TconnectorconstraintDo> tconnectorconstraintDoList,
			List<TconnectortagDo> tconnectortagDoList, List<TconnectortypesDo> tconnectortypesDoList,
			List<TconstantsDo> tconstantsDoList, List<TconstrainttypesDo> tconstrainttypesDoList,
			List<TdatatypesDo> tdatatypesDoList, List<TdiagramDo> tdiagramDoList,
			List<TdiagramlinksDo> tdiagramlinksDoList, List<TdiagramobjectsDo> tdiagramobjectsDoList,
			List<TdiagramtypesDo> tdiagramtypesDoList, List<TdocumentDo> tdocumentDoList, List<TecfDo> tecfDoList,
			List<TefforttypesDo> tefforttypesDoList, List<TfilesDo> tfilesDoList, List<TgenoptDo> tgenoptDoList,
			List<TglossaryDo> tglossaryDoList, List<ThtmlDo> thtmlDoList, List<TimageDo> timageDoList,
			List<TimplementDo> timplementDoList, List<TissuesDo> tissuesDoList, List<TlistsDo> tlistsDoList,
			List<TmainttypesDo> tmainttypesDoList, List<TmethodDo> tmethodDoList,
			List<TmetrictypesDo> tmetrictypesDoList, List<TobjectDo> tobjectDoList,
			List<TobjectconstraintDo> tobjectconstraintDoList, List<TobjecteffortDo> tobjecteffortDoList,
			List<TobjectfilesDo> tobjectfilesDoList, List<TobjectmetricsDo> tobjectmetricsDoList,
			List<TobjectproblemsDo> tobjectproblemsDoList, List<TobjectpropertiesDo> tobjectpropertiesDoList,
			List<TobjectrequiresDo> tobjectrequiresDoList, List<TobjectresourceDo> tobjectresourceDoList,
			List<TobjectrisksDo> tobjectrisksDoList, List<TobjectscenariosDo> tobjectscenariosDoList,
			List<TobjecttestsDo> tobjecttestsDoList, List<TobjecttrxDo> tobjecttrxDoList,
			List<TobjecttypesDo> tobjecttypesDoList, List<TocfDo> tocfDoList, List<ToperationDo> toperationDoList,
			List<ToperationparamsDo> toperationparamsDoList, List<ToperationpostsDo> toperationpostsDoList,
			List<ToperationpresDo> toperationpresDoList, List<ToperationtagDo> toperationtagDoList,
			List<TpackageDo> tpackageDoList, List<TpaletteDo> tpaletteDoList, List<TpaletteitemDo> tpaletteitemDoList,
			List<TphaseDo> tphaseDoList, List<TprimitivesDo> tprimitivesDoList,
			List<TproblemtypesDo> tproblemtypesDoList, List<TprojectrolesDo> tprojectrolesDoList,
			List<TpropertytypesDo> tpropertytypesDoList, List<TrequiretypesDo> trequiretypesDoList,
			List<TresourcesDo> tresourcesDoList, List<TrisktypesDo> trisktypesDoList,
			List<TroleconstraintDo> troleconstraintDoList, List<TrtfDo> trtfDoList, List<TrtfreportDo> trtfreportDoList,
			List<TrulesDo> trulesDoList, List<TscenariotypesDo> tscenariotypesDoList, List<TscriptDo> tscriptDoList,
			List<TsecgroupDo> tsecgroupDoList, List<TsecgrouppermissionDo> tsecgrouppermissionDoList,
			List<TseclocksDo> tseclocksDoList, List<TsecpermissionDo> tsecpermissionDoList,
			List<TsecpoliciesDo> tsecpoliciesDoList, List<TsecuserDo> tsecuserDoList,
			List<TsecusergroupDo> tsecusergroupDoList, List<TsecuserpermissionDo> tsecuserpermissionDoList,
			List<TsnapshotDo> tsnapshotDoList, List<TstatustypesDo> tstatustypesDoList,
			List<TstereotypesDo> tstereotypesDoList, List<TtaggedvalueDo> ttaggedvalueDoList,
			List<TtasksDo> ttasksDoList, List<TtcfDo> ttcfDoList, List<TtemplateDo> ttemplateDoList,
			List<TtestclassDo> ttestclassDoList, List<TtestplansDo> ttestplansDoList,
			List<TtesttypesDo> ttesttypesDoList, List<TtrxtypesDo> ttrxtypesDoList,
			List<TumlpatternDo> tumlpatternDoList, List<TversionDo> tversionDoList, List<TxrefDo> txrefDoList,
			List<TxrefsystemDo> txrefsystemDoList, List<TxrefuserDo> txrefuserDoList,
			List<UsysoldtablesDo> usysoldtablesDoList, List<UsysqueriesDo> usysqueriesDoList,
			List<UsyssystemDo> usyssystemDoList, List<UsystablesDo> usystablesDoList) {
		super();
		this.tattributeDoList = tattributeDoList;
		this.tattributeconstraintsDoList = tattributeconstraintsDoList;
		this.tattributetagDoList = tattributetagDoList;
		this.tauthorsDoList = tauthorsDoList;
		this.tcardinalityDoList = tcardinalityDoList;
		this.tcategoryDoList = tcategoryDoList;
		this.tclientsDoList = tclientsDoList;
		this.tcomplexitytypesDoList = tcomplexitytypesDoList;
		this.tconnectorDoList = tconnectorDoList;
		this.tconnectorconstraintDoList = tconnectorconstraintDoList;
		this.tconnectortagDoList = tconnectortagDoList;
		this.tconnectortypesDoList = tconnectortypesDoList;
		this.tconstantsDoList = tconstantsDoList;
		this.tconstrainttypesDoList = tconstrainttypesDoList;
		this.tdatatypesDoList = tdatatypesDoList;
		this.tdiagramDoList = tdiagramDoList;
		this.tdiagramlinksDoList = tdiagramlinksDoList;
		this.tdiagramobjectsDoList = tdiagramobjectsDoList;
		this.tdiagramtypesDoList = tdiagramtypesDoList;
		this.tdocumentDoList = tdocumentDoList;
		this.tecfDoList = tecfDoList;
		this.tefforttypesDoList = tefforttypesDoList;
		this.tfilesDoList = tfilesDoList;
		this.tgenoptDoList = tgenoptDoList;
		this.tglossaryDoList = tglossaryDoList;
		this.thtmlDoList = thtmlDoList;
		this.timageDoList = timageDoList;
		this.timplementDoList = timplementDoList;
		this.tissuesDoList = tissuesDoList;
		this.tlistsDoList = tlistsDoList;
		this.tmainttypesDoList = tmainttypesDoList;
		this.tmethodDoList = tmethodDoList;
		this.tmetrictypesDoList = tmetrictypesDoList;
		this.tobjectDoList = tobjectDoList;
		this.tobjectconstraintDoList = tobjectconstraintDoList;
		this.tobjecteffortDoList = tobjecteffortDoList;
		this.tobjectfilesDoList = tobjectfilesDoList;
		this.tobjectmetricsDoList = tobjectmetricsDoList;
		this.tobjectproblemsDoList = tobjectproblemsDoList;
		this.tobjectpropertiesDoList = tobjectpropertiesDoList;
		this.tobjectrequiresDoList = tobjectrequiresDoList;
		this.tobjectresourceDoList = tobjectresourceDoList;
		this.tobjectrisksDoList = tobjectrisksDoList;
		this.tobjectscenariosDoList = tobjectscenariosDoList;
		this.tobjecttestsDoList = tobjecttestsDoList;
		this.tobjecttrxDoList = tobjecttrxDoList;
		this.tobjecttypesDoList = tobjecttypesDoList;
		this.tocfDoList = tocfDoList;
		this.toperationDoList = toperationDoList;
		this.toperationparamsDoList = toperationparamsDoList;
		this.toperationpostsDoList = toperationpostsDoList;
		this.toperationpresDoList = toperationpresDoList;
		this.toperationtagDoList = toperationtagDoList;
		this.tpackageDoList = tpackageDoList;
		this.tpaletteDoList = tpaletteDoList;
		this.tpaletteitemDoList = tpaletteitemDoList;
		this.tphaseDoList = tphaseDoList;
		this.tprimitivesDoList = tprimitivesDoList;
		this.tproblemtypesDoList = tproblemtypesDoList;
		this.tprojectrolesDoList = tprojectrolesDoList;
		this.tpropertytypesDoList = tpropertytypesDoList;
		this.trequiretypesDoList = trequiretypesDoList;
		this.tresourcesDoList = tresourcesDoList;
		this.trisktypesDoList = trisktypesDoList;
		this.troleconstraintDoList = troleconstraintDoList;
		this.trtfDoList = trtfDoList;
		this.trtfreportDoList = trtfreportDoList;
		this.trulesDoList = trulesDoList;
		this.tscenariotypesDoList = tscenariotypesDoList;
		this.tscriptDoList = tscriptDoList;
		this.tsecgroupDoList = tsecgroupDoList;
		this.tsecgrouppermissionDoList = tsecgrouppermissionDoList;
		this.tseclocksDoList = tseclocksDoList;
		this.tsecpermissionDoList = tsecpermissionDoList;
		this.tsecpoliciesDoList = tsecpoliciesDoList;
		this.tsecuserDoList = tsecuserDoList;
		this.tsecusergroupDoList = tsecusergroupDoList;
		this.tsecuserpermissionDoList = tsecuserpermissionDoList;
		this.tsnapshotDoList = tsnapshotDoList;
		this.tstatustypesDoList = tstatustypesDoList;
		this.tstereotypesDoList = tstereotypesDoList;
		this.ttaggedvalueDoList = ttaggedvalueDoList;
		this.ttasksDoList = ttasksDoList;
		this.ttcfDoList = ttcfDoList;
		this.ttemplateDoList = ttemplateDoList;
		this.ttestclassDoList = ttestclassDoList;
		this.ttestplansDoList = ttestplansDoList;
		this.ttesttypesDoList = ttesttypesDoList;
		this.ttrxtypesDoList = ttrxtypesDoList;
		this.tumlpatternDoList = tumlpatternDoList;
		this.tversionDoList = tversionDoList;
		this.txrefDoList = txrefDoList;
		this.txrefsystemDoList = txrefsystemDoList;
		this.txrefuserDoList = txrefuserDoList;
		this.usysoldtablesDoList = usysoldtablesDoList;
		this.usysqueriesDoList = usysqueriesDoList;
		this.usyssystemDoList = usyssystemDoList;
		this.usystablesDoList = usystablesDoList;
	}

	public List<TattributeDo> getTattributeDoList() {
		return tattributeDoList;
	}

	public void setTattributeDoList(List<TattributeDo> tattributeDoList) {
		this.tattributeDoList = tattributeDoList;
	}

	public List<TattributeconstraintsDo> getTattributeconstraintsDoList() {
		return tattributeconstraintsDoList;
	}

	public void setTattributeconstraintsDoList(List<TattributeconstraintsDo> tattributeconstraintsDoList) {
		this.tattributeconstraintsDoList = tattributeconstraintsDoList;
	}

	public List<TattributetagDo> getTattributetagDoList() {
		return tattributetagDoList;
	}

	public void setTattributetagDoList(List<TattributetagDo> tattributetagDoList) {
		this.tattributetagDoList = tattributetagDoList;
	}

	public List<TauthorsDo> getTauthorsDoList() {
		return tauthorsDoList;
	}

	public void setTauthorsDoList(List<TauthorsDo> tauthorsDoList) {
		this.tauthorsDoList = tauthorsDoList;
	}

	public List<TcardinalityDo> getTcardinalityDoList() {
		return tcardinalityDoList;
	}

	public void setTcardinalityDoList(List<TcardinalityDo> tcardinalityDoList) {
		this.tcardinalityDoList = tcardinalityDoList;
	}

	public List<TcategoryDo> getTcategoryDoList() {
		return tcategoryDoList;
	}

	public void setTcategoryDoList(List<TcategoryDo> tcategoryDoList) {
		this.tcategoryDoList = tcategoryDoList;
	}

	public List<TclientsDo> getTclientsDoList() {
		return tclientsDoList;
	}

	public void setTclientsDoList(List<TclientsDo> tclientsDoList) {
		this.tclientsDoList = tclientsDoList;
	}

	public List<TcomplexitytypesDo> getTcomplexitytypesDoList() {
		return tcomplexitytypesDoList;
	}

	public void setTcomplexitytypesDoList(List<TcomplexitytypesDo> tcomplexitytypesDoList) {
		this.tcomplexitytypesDoList = tcomplexitytypesDoList;
	}

	public List<TconnectorDo> getTconnectorDoList() {
		return tconnectorDoList;
	}

	public void setTconnectorDoList(List<TconnectorDo> tconnectorDoList) {
		this.tconnectorDoList = tconnectorDoList;
	}

	public List<TconnectorconstraintDo> getTconnectorconstraintDoList() {
		return tconnectorconstraintDoList;
	}

	public void setTconnectorconstraintDoList(List<TconnectorconstraintDo> tconnectorconstraintDoList) {
		this.tconnectorconstraintDoList = tconnectorconstraintDoList;
	}

	public List<TconnectortagDo> getTconnectortagDoList() {
		return tconnectortagDoList;
	}

	public void setTconnectortagDoList(List<TconnectortagDo> tconnectortagDoList) {
		this.tconnectortagDoList = tconnectortagDoList;
	}

	public List<TconnectortypesDo> getTconnectortypesDoList() {
		return tconnectortypesDoList;
	}

	public void setTconnectortypesDoList(List<TconnectortypesDo> tconnectortypesDoList) {
		this.tconnectortypesDoList = tconnectortypesDoList;
	}

	public List<TconstantsDo> getTconstantsDoList() {
		return tconstantsDoList;
	}

	public void setTconstantsDoList(List<TconstantsDo> tconstantsDoList) {
		this.tconstantsDoList = tconstantsDoList;
	}

	public List<TconstrainttypesDo> getTconstrainttypesDoList() {
		return tconstrainttypesDoList;
	}

	public void setTconstrainttypesDoList(List<TconstrainttypesDo> tconstrainttypesDoList) {
		this.tconstrainttypesDoList = tconstrainttypesDoList;
	}

	public List<TdatatypesDo> getTdatatypesDoList() {
		return tdatatypesDoList;
	}

	public void setTdatatypesDoList(List<TdatatypesDo> tdatatypesDoList) {
		this.tdatatypesDoList = tdatatypesDoList;
	}

	public List<TdiagramDo> getTdiagramDoList() {
		return tdiagramDoList;
	}

	public void setTdiagramDoList(List<TdiagramDo> tdiagramDoList) {
		this.tdiagramDoList = tdiagramDoList;
	}

	public List<TdiagramlinksDo> getTdiagramlinksDoList() {
		return tdiagramlinksDoList;
	}

	public void setTdiagramlinksDoList(List<TdiagramlinksDo> tdiagramlinksDoList) {
		this.tdiagramlinksDoList = tdiagramlinksDoList;
	}

	public List<TdiagramobjectsDo> getTdiagramobjectsDoList() {
		return tdiagramobjectsDoList;
	}

	public void setTdiagramobjectsDoList(List<TdiagramobjectsDo> tdiagramobjectsDoList) {
		this.tdiagramobjectsDoList = tdiagramobjectsDoList;
	}

	public List<TdiagramtypesDo> getTdiagramtypesDoList() {
		return tdiagramtypesDoList;
	}

	public void setTdiagramtypesDoList(List<TdiagramtypesDo> tdiagramtypesDoList) {
		this.tdiagramtypesDoList = tdiagramtypesDoList;
	}

	public List<TdocumentDo> getTdocumentDoList() {
		return tdocumentDoList;
	}

	public void setTdocumentDoList(List<TdocumentDo> tdocumentDoList) {
		this.tdocumentDoList = tdocumentDoList;
	}

	public List<TecfDo> getTecfDoList() {
		return tecfDoList;
	}

	public void setTecfDoList(List<TecfDo> tecfDoList) {
		this.tecfDoList = tecfDoList;
	}

	public List<TefforttypesDo> getTefforttypesDoList() {
		return tefforttypesDoList;
	}

	public void setTefforttypesDoList(List<TefforttypesDo> tefforttypesDoList) {
		this.tefforttypesDoList = tefforttypesDoList;
	}

	public List<TfilesDo> getTfilesDoList() {
		return tfilesDoList;
	}

	public void setTfilesDoList(List<TfilesDo> tfilesDoList) {
		this.tfilesDoList = tfilesDoList;
	}

	public List<TgenoptDo> getTgenoptDoList() {
		return tgenoptDoList;
	}

	public void setTgenoptDoList(List<TgenoptDo> tgenoptDoList) {
		this.tgenoptDoList = tgenoptDoList;
	}

	public List<TglossaryDo> getTglossaryDoList() {
		return tglossaryDoList;
	}

	public void setTglossaryDoList(List<TglossaryDo> tglossaryDoList) {
		this.tglossaryDoList = tglossaryDoList;
	}

	public List<ThtmlDo> getThtmlDoList() {
		return thtmlDoList;
	}

	public void setThtmlDoList(List<ThtmlDo> thtmlDoList) {
		this.thtmlDoList = thtmlDoList;
	}

	public List<TimageDo> getTimageDoList() {
		return timageDoList;
	}

	public void setTimageDoList(List<TimageDo> timageDoList) {
		this.timageDoList = timageDoList;
	}

	public List<TimplementDo> getTimplementDoList() {
		return timplementDoList;
	}

	public void setTimplementDoList(List<TimplementDo> timplementDoList) {
		this.timplementDoList = timplementDoList;
	}

	public List<TissuesDo> getTissuesDoList() {
		return tissuesDoList;
	}

	public void setTissuesDoList(List<TissuesDo> tissuesDoList) {
		this.tissuesDoList = tissuesDoList;
	}

	public List<TlistsDo> getTlistsDoList() {
		return tlistsDoList;
	}

	public void setTlistsDoList(List<TlistsDo> tlistsDoList) {
		this.tlistsDoList = tlistsDoList;
	}

	public List<TmainttypesDo> getTmainttypesDoList() {
		return tmainttypesDoList;
	}

	public void setTmainttypesDoList(List<TmainttypesDo> tmainttypesDoList) {
		this.tmainttypesDoList = tmainttypesDoList;
	}

	public List<TmethodDo> getTmethodDoList() {
		return tmethodDoList;
	}

	public void setTmethodDoList(List<TmethodDo> tmethodDoList) {
		this.tmethodDoList = tmethodDoList;
	}

	public List<TmetrictypesDo> getTmetrictypesDoList() {
		return tmetrictypesDoList;
	}

	public void setTmetrictypesDoList(List<TmetrictypesDo> tmetrictypesDoList) {
		this.tmetrictypesDoList = tmetrictypesDoList;
	}

	public List<TobjectDo> getTobjectDoList() {
		return tobjectDoList;
	}

	public void setTobjectDoList(List<TobjectDo> tobjectDoList) {
		this.tobjectDoList = tobjectDoList;
	}

	public List<TobjectconstraintDo> getTobjectconstraintDoList() {
		return tobjectconstraintDoList;
	}

	public void setTobjectconstraintDoList(List<TobjectconstraintDo> tobjectconstraintDoList) {
		this.tobjectconstraintDoList = tobjectconstraintDoList;
	}

	public List<TobjecteffortDo> getTobjecteffortDoList() {
		return tobjecteffortDoList;
	}

	public void setTobjecteffortDoList(List<TobjecteffortDo> tobjecteffortDoList) {
		this.tobjecteffortDoList = tobjecteffortDoList;
	}

	public List<TobjectfilesDo> getTobjectfilesDoList() {
		return tobjectfilesDoList;
	}

	public void setTobjectfilesDoList(List<TobjectfilesDo> tobjectfilesDoList) {
		this.tobjectfilesDoList = tobjectfilesDoList;
	}

	public List<TobjectmetricsDo> getTobjectmetricsDoList() {
		return tobjectmetricsDoList;
	}

	public void setTobjectmetricsDoList(List<TobjectmetricsDo> tobjectmetricsDoList) {
		this.tobjectmetricsDoList = tobjectmetricsDoList;
	}

	public List<TobjectproblemsDo> getTobjectproblemsDoList() {
		return tobjectproblemsDoList;
	}

	public void setTobjectproblemsDoList(List<TobjectproblemsDo> tobjectproblemsDoList) {
		this.tobjectproblemsDoList = tobjectproblemsDoList;
	}

	public List<TobjectpropertiesDo> getTobjectpropertiesDoList() {
		return tobjectpropertiesDoList;
	}

	public void setTobjectpropertiesDoList(List<TobjectpropertiesDo> tobjectpropertiesDoList) {
		this.tobjectpropertiesDoList = tobjectpropertiesDoList;
	}

	public List<TobjectrequiresDo> getTobjectrequiresDoList() {
		return tobjectrequiresDoList;
	}

	public void setTobjectrequiresDoList(List<TobjectrequiresDo> tobjectrequiresDoList) {
		this.tobjectrequiresDoList = tobjectrequiresDoList;
	}

	public List<TobjectresourceDo> getTobjectresourceDoList() {
		return tobjectresourceDoList;
	}

	public void setTobjectresourceDoList(List<TobjectresourceDo> tobjectresourceDoList) {
		this.tobjectresourceDoList = tobjectresourceDoList;
	}

	public List<TobjectrisksDo> getTobjectrisksDoList() {
		return tobjectrisksDoList;
	}

	public void setTobjectrisksDoList(List<TobjectrisksDo> tobjectrisksDoList) {
		this.tobjectrisksDoList = tobjectrisksDoList;
	}

	public List<TobjectscenariosDo> getTobjectscenariosDoList() {
		return tobjectscenariosDoList;
	}

	public void setTobjectscenariosDoList(List<TobjectscenariosDo> tobjectscenariosDoList) {
		this.tobjectscenariosDoList = tobjectscenariosDoList;
	}

	public List<TobjecttestsDo> getTobjecttestsDoList() {
		return tobjecttestsDoList;
	}

	public void setTobjecttestsDoList(List<TobjecttestsDo> tobjecttestsDoList) {
		this.tobjecttestsDoList = tobjecttestsDoList;
	}

	public List<TobjecttrxDo> getTobjecttrxDoList() {
		return tobjecttrxDoList;
	}

	public void setTobjecttrxDoList(List<TobjecttrxDo> tobjecttrxDoList) {
		this.tobjecttrxDoList = tobjecttrxDoList;
	}

	public List<TobjecttypesDo> getTobjecttypesDoList() {
		return tobjecttypesDoList;
	}

	public void setTobjecttypesDoList(List<TobjecttypesDo> tobjecttypesDoList) {
		this.tobjecttypesDoList = tobjecttypesDoList;
	}

	public List<TocfDo> getTocfDoList() {
		return tocfDoList;
	}

	public void setTocfDoList(List<TocfDo> tocfDoList) {
		this.tocfDoList = tocfDoList;
	}

	public List<ToperationDo> getToperationDoList() {
		return toperationDoList;
	}

	public void setToperationDoList(List<ToperationDo> toperationDoList) {
		this.toperationDoList = toperationDoList;
	}

	public List<ToperationparamsDo> getToperationparamsDoList() {
		return toperationparamsDoList;
	}

	public void setToperationparamsDoList(List<ToperationparamsDo> toperationparamsDoList) {
		this.toperationparamsDoList = toperationparamsDoList;
	}

	public List<ToperationpostsDo> getToperationpostsDoList() {
		return toperationpostsDoList;
	}

	public void setToperationpostsDoList(List<ToperationpostsDo> toperationpostsDoList) {
		this.toperationpostsDoList = toperationpostsDoList;
	}

	public List<ToperationpresDo> getToperationpresDoList() {
		return toperationpresDoList;
	}

	public void setToperationpresDoList(List<ToperationpresDo> toperationpresDoList) {
		this.toperationpresDoList = toperationpresDoList;
	}

	public List<ToperationtagDo> getToperationtagDoList() {
		return toperationtagDoList;
	}

	public void setToperationtagDoList(List<ToperationtagDo> toperationtagDoList) {
		this.toperationtagDoList = toperationtagDoList;
	}

	public List<TpackageDo> getTpackageDoList() {
		return tpackageDoList;
	}

	public void setTpackageDoList(List<TpackageDo> tpackageDoList) {
		this.tpackageDoList = tpackageDoList;
	}

	public List<TpaletteDo> getTpaletteDoList() {
		return tpaletteDoList;
	}

	public void setTpaletteDoList(List<TpaletteDo> tpaletteDoList) {
		this.tpaletteDoList = tpaletteDoList;
	}

	public List<TpaletteitemDo> getTpaletteitemDoList() {
		return tpaletteitemDoList;
	}

	public void setTpaletteitemDoList(List<TpaletteitemDo> tpaletteitemDoList) {
		this.tpaletteitemDoList = tpaletteitemDoList;
	}

	public List<TphaseDo> getTphaseDoList() {
		return tphaseDoList;
	}

	public void setTphaseDoList(List<TphaseDo> tphaseDoList) {
		this.tphaseDoList = tphaseDoList;
	}

	public List<TprimitivesDo> getTprimitivesDoList() {
		return tprimitivesDoList;
	}

	public void setTprimitivesDoList(List<TprimitivesDo> tprimitivesDoList) {
		this.tprimitivesDoList = tprimitivesDoList;
	}

	public List<TproblemtypesDo> getTproblemtypesDoList() {
		return tproblemtypesDoList;
	}

	public void setTproblemtypesDoList(List<TproblemtypesDo> tproblemtypesDoList) {
		this.tproblemtypesDoList = tproblemtypesDoList;
	}

	public List<TprojectrolesDo> getTprojectrolesDoList() {
		return tprojectrolesDoList;
	}

	public void setTprojectrolesDoList(List<TprojectrolesDo> tprojectrolesDoList) {
		this.tprojectrolesDoList = tprojectrolesDoList;
	}

	public List<TpropertytypesDo> getTpropertytypesDoList() {
		return tpropertytypesDoList;
	}

	public void setTpropertytypesDoList(List<TpropertytypesDo> tpropertytypesDoList) {
		this.tpropertytypesDoList = tpropertytypesDoList;
	}

	public List<TrequiretypesDo> getTrequiretypesDoList() {
		return trequiretypesDoList;
	}

	public void setTrequiretypesDoList(List<TrequiretypesDo> trequiretypesDoList) {
		this.trequiretypesDoList = trequiretypesDoList;
	}

	public List<TresourcesDo> getTresourcesDoList() {
		return tresourcesDoList;
	}

	public void setTresourcesDoList(List<TresourcesDo> tresourcesDoList) {
		this.tresourcesDoList = tresourcesDoList;
	}

	public List<TrisktypesDo> getTrisktypesDoList() {
		return trisktypesDoList;
	}

	public void setTrisktypesDoList(List<TrisktypesDo> trisktypesDoList) {
		this.trisktypesDoList = trisktypesDoList;
	}

	public List<TroleconstraintDo> getTroleconstraintDoList() {
		return troleconstraintDoList;
	}

	public void setTroleconstraintDoList(List<TroleconstraintDo> troleconstraintDoList) {
		this.troleconstraintDoList = troleconstraintDoList;
	}

	public List<TrtfDo> getTrtfDoList() {
		return trtfDoList;
	}

	public void setTrtfDoList(List<TrtfDo> trtfDoList) {
		this.trtfDoList = trtfDoList;
	}

	public List<TrtfreportDo> getTrtfreportDoList() {
		return trtfreportDoList;
	}

	public void setTrtfreportDoList(List<TrtfreportDo> trtfreportDoList) {
		this.trtfreportDoList = trtfreportDoList;
	}

	public List<TrulesDo> getTrulesDoList() {
		return trulesDoList;
	}

	public void setTrulesDoList(List<TrulesDo> trulesDoList) {
		this.trulesDoList = trulesDoList;
	}

	public List<TscenariotypesDo> getTscenariotypesDoList() {
		return tscenariotypesDoList;
	}

	public void setTscenariotypesDoList(List<TscenariotypesDo> tscenariotypesDoList) {
		this.tscenariotypesDoList = tscenariotypesDoList;
	}

	public List<TscriptDo> getTscriptDoList() {
		return tscriptDoList;
	}

	public void setTscriptDoList(List<TscriptDo> tscriptDoList) {
		this.tscriptDoList = tscriptDoList;
	}

	public List<TsecgroupDo> getTsecgroupDoList() {
		return tsecgroupDoList;
	}

	public void setTsecgroupDoList(List<TsecgroupDo> tsecgroupDoList) {
		this.tsecgroupDoList = tsecgroupDoList;
	}

	public List<TsecgrouppermissionDo> getTsecgrouppermissionDoList() {
		return tsecgrouppermissionDoList;
	}

	public void setTsecgrouppermissionDoList(List<TsecgrouppermissionDo> tsecgrouppermissionDoList) {
		this.tsecgrouppermissionDoList = tsecgrouppermissionDoList;
	}

	public List<TseclocksDo> getTseclocksDoList() {
		return tseclocksDoList;
	}

	public void setTseclocksDoList(List<TseclocksDo> tseclocksDoList) {
		this.tseclocksDoList = tseclocksDoList;
	}

	public List<TsecpermissionDo> getTsecpermissionDoList() {
		return tsecpermissionDoList;
	}

	public void setTsecpermissionDoList(List<TsecpermissionDo> tsecpermissionDoList) {
		this.tsecpermissionDoList = tsecpermissionDoList;
	}

	public List<TsecpoliciesDo> getTsecpoliciesDoList() {
		return tsecpoliciesDoList;
	}

	public void setTsecpoliciesDoList(List<TsecpoliciesDo> tsecpoliciesDoList) {
		this.tsecpoliciesDoList = tsecpoliciesDoList;
	}

	public List<TsecuserDo> getTsecuserDoList() {
		return tsecuserDoList;
	}

	public void setTsecuserDoList(List<TsecuserDo> tsecuserDoList) {
		this.tsecuserDoList = tsecuserDoList;
	}

	public List<TsecusergroupDo> getTsecusergroupDoList() {
		return tsecusergroupDoList;
	}

	public void setTsecusergroupDoList(List<TsecusergroupDo> tsecusergroupDoList) {
		this.tsecusergroupDoList = tsecusergroupDoList;
	}

	public List<TsecuserpermissionDo> getTsecuserpermissionDoList() {
		return tsecuserpermissionDoList;
	}

	public void setTsecuserpermissionDoList(List<TsecuserpermissionDo> tsecuserpermissionDoList) {
		this.tsecuserpermissionDoList = tsecuserpermissionDoList;
	}

	public List<TsnapshotDo> getTsnapshotDoList() {
		return tsnapshotDoList;
	}

	public void setTsnapshotDoList(List<TsnapshotDo> tsnapshotDoList) {
		this.tsnapshotDoList = tsnapshotDoList;
	}

	public List<TstatustypesDo> getTstatustypesDoList() {
		return tstatustypesDoList;
	}

	public void setTstatustypesDoList(List<TstatustypesDo> tstatustypesDoList) {
		this.tstatustypesDoList = tstatustypesDoList;
	}

	public List<TstereotypesDo> getTstereotypesDoList() {
		return tstereotypesDoList;
	}

	public void setTstereotypesDoList(List<TstereotypesDo> tstereotypesDoList) {
		this.tstereotypesDoList = tstereotypesDoList;
	}

	public List<TtaggedvalueDo> getTtaggedvalueDoList() {
		return ttaggedvalueDoList;
	}

	public void setTtaggedvalueDoList(List<TtaggedvalueDo> ttaggedvalueDoList) {
		this.ttaggedvalueDoList = ttaggedvalueDoList;
	}

	public List<TtasksDo> getTtasksDoList() {
		return ttasksDoList;
	}

	public void setTtasksDoList(List<TtasksDo> ttasksDoList) {
		this.ttasksDoList = ttasksDoList;
	}

	public List<TtcfDo> getTtcfDoList() {
		return ttcfDoList;
	}

	public void setTtcfDoList(List<TtcfDo> ttcfDoList) {
		this.ttcfDoList = ttcfDoList;
	}

	public List<TtemplateDo> getTtemplateDoList() {
		return ttemplateDoList;
	}

	public void setTtemplateDoList(List<TtemplateDo> ttemplateDoList) {
		this.ttemplateDoList = ttemplateDoList;
	}

	public List<TtestclassDo> getTtestclassDoList() {
		return ttestclassDoList;
	}

	public void setTtestclassDoList(List<TtestclassDo> ttestclassDoList) {
		this.ttestclassDoList = ttestclassDoList;
	}

	public List<TtestplansDo> getTtestplansDoList() {
		return ttestplansDoList;
	}

	public void setTtestplansDoList(List<TtestplansDo> ttestplansDoList) {
		this.ttestplansDoList = ttestplansDoList;
	}

	public List<TtesttypesDo> getTtesttypesDoList() {
		return ttesttypesDoList;
	}

	public void setTtesttypesDoList(List<TtesttypesDo> ttesttypesDoList) {
		this.ttesttypesDoList = ttesttypesDoList;
	}

	public List<TtrxtypesDo> getTtrxtypesDoList() {
		return ttrxtypesDoList;
	}

	public void setTtrxtypesDoList(List<TtrxtypesDo> ttrxtypesDoList) {
		this.ttrxtypesDoList = ttrxtypesDoList;
	}

	public List<TumlpatternDo> getTumlpatternDoList() {
		return tumlpatternDoList;
	}

	public void setTumlpatternDoList(List<TumlpatternDo> tumlpatternDoList) {
		this.tumlpatternDoList = tumlpatternDoList;
	}

	public List<TversionDo> getTversionDoList() {
		return tversionDoList;
	}

	public void setTversionDoList(List<TversionDo> tversionDoList) {
		this.tversionDoList = tversionDoList;
	}

	public List<TxrefDo> getTxrefDoList() {
		return txrefDoList;
	}

	public void setTxrefDoList(List<TxrefDo> txrefDoList) {
		this.txrefDoList = txrefDoList;
	}

	public List<TxrefsystemDo> getTxrefsystemDoList() {
		return txrefsystemDoList;
	}

	public void setTxrefsystemDoList(List<TxrefsystemDo> txrefsystemDoList) {
		this.txrefsystemDoList = txrefsystemDoList;
	}

	public List<TxrefuserDo> getTxrefuserDoList() {
		return txrefuserDoList;
	}

	public void setTxrefuserDoList(List<TxrefuserDo> txrefuserDoList) {
		this.txrefuserDoList = txrefuserDoList;
	}

	public List<UsysoldtablesDo> getUsysoldtablesDoList() {
		return usysoldtablesDoList;
	}

	public void setUsysoldtablesDoList(List<UsysoldtablesDo> usysoldtablesDoList) {
		this.usysoldtablesDoList = usysoldtablesDoList;
	}

	public List<UsysqueriesDo> getUsysqueriesDoList() {
		return usysqueriesDoList;
	}

	public void setUsysqueriesDoList(List<UsysqueriesDo> usysqueriesDoList) {
		this.usysqueriesDoList = usysqueriesDoList;
	}

	public List<UsyssystemDo> getUsyssystemDoList() {
		return usyssystemDoList;
	}

	public void setUsyssystemDoList(List<UsyssystemDo> usyssystemDoList) {
		this.usyssystemDoList = usyssystemDoList;
	}

	public List<UsystablesDo> getUsystablesDoList() {
		return usystablesDoList;
	}

	public void setUsystablesDoList(List<UsystablesDo> usystablesDoList) {
		this.usystablesDoList = usystablesDoList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tattributeDoList == null) ? 0 : tattributeDoList.hashCode());
		result = prime * result + ((tattributeconstraintsDoList == null) ? 0 : tattributeconstraintsDoList.hashCode());
		result = prime * result + ((tattributetagDoList == null) ? 0 : tattributetagDoList.hashCode());
		result = prime * result + ((tauthorsDoList == null) ? 0 : tauthorsDoList.hashCode());
		result = prime * result + ((tcardinalityDoList == null) ? 0 : tcardinalityDoList.hashCode());
		result = prime * result + ((tcategoryDoList == null) ? 0 : tcategoryDoList.hashCode());
		result = prime * result + ((tclientsDoList == null) ? 0 : tclientsDoList.hashCode());
		result = prime * result + ((tcomplexitytypesDoList == null) ? 0 : tcomplexitytypesDoList.hashCode());
		result = prime * result + ((tconnectorDoList == null) ? 0 : tconnectorDoList.hashCode());
		result = prime * result + ((tconnectorconstraintDoList == null) ? 0 : tconnectorconstraintDoList.hashCode());
		result = prime * result + ((tconnectortagDoList == null) ? 0 : tconnectortagDoList.hashCode());
		result = prime * result + ((tconnectortypesDoList == null) ? 0 : tconnectortypesDoList.hashCode());
		result = prime * result + ((tconstantsDoList == null) ? 0 : tconstantsDoList.hashCode());
		result = prime * result + ((tconstrainttypesDoList == null) ? 0 : tconstrainttypesDoList.hashCode());
		result = prime * result + ((tdatatypesDoList == null) ? 0 : tdatatypesDoList.hashCode());
		result = prime * result + ((tdiagramDoList == null) ? 0 : tdiagramDoList.hashCode());
		result = prime * result + ((tdiagramlinksDoList == null) ? 0 : tdiagramlinksDoList.hashCode());
		result = prime * result + ((tdiagramobjectsDoList == null) ? 0 : tdiagramobjectsDoList.hashCode());
		result = prime * result + ((tdiagramtypesDoList == null) ? 0 : tdiagramtypesDoList.hashCode());
		result = prime * result + ((tdocumentDoList == null) ? 0 : tdocumentDoList.hashCode());
		result = prime * result + ((tecfDoList == null) ? 0 : tecfDoList.hashCode());
		result = prime * result + ((tefforttypesDoList == null) ? 0 : tefforttypesDoList.hashCode());
		result = prime * result + ((tfilesDoList == null) ? 0 : tfilesDoList.hashCode());
		result = prime * result + ((tgenoptDoList == null) ? 0 : tgenoptDoList.hashCode());
		result = prime * result + ((tglossaryDoList == null) ? 0 : tglossaryDoList.hashCode());
		result = prime * result + ((thtmlDoList == null) ? 0 : thtmlDoList.hashCode());
		result = prime * result + ((timageDoList == null) ? 0 : timageDoList.hashCode());
		result = prime * result + ((timplementDoList == null) ? 0 : timplementDoList.hashCode());
		result = prime * result + ((tissuesDoList == null) ? 0 : tissuesDoList.hashCode());
		result = prime * result + ((tlistsDoList == null) ? 0 : tlistsDoList.hashCode());
		result = prime * result + ((tmainttypesDoList == null) ? 0 : tmainttypesDoList.hashCode());
		result = prime * result + ((tmethodDoList == null) ? 0 : tmethodDoList.hashCode());
		result = prime * result + ((tmetrictypesDoList == null) ? 0 : tmetrictypesDoList.hashCode());
		result = prime * result + ((tobjectDoList == null) ? 0 : tobjectDoList.hashCode());
		result = prime * result + ((tobjectconstraintDoList == null) ? 0 : tobjectconstraintDoList.hashCode());
		result = prime * result + ((tobjecteffortDoList == null) ? 0 : tobjecteffortDoList.hashCode());
		result = prime * result + ((tobjectfilesDoList == null) ? 0 : tobjectfilesDoList.hashCode());
		result = prime * result + ((tobjectmetricsDoList == null) ? 0 : tobjectmetricsDoList.hashCode());
		result = prime * result + ((tobjectproblemsDoList == null) ? 0 : tobjectproblemsDoList.hashCode());
		result = prime * result + ((tobjectpropertiesDoList == null) ? 0 : tobjectpropertiesDoList.hashCode());
		result = prime * result + ((tobjectrequiresDoList == null) ? 0 : tobjectrequiresDoList.hashCode());
		result = prime * result + ((tobjectresourceDoList == null) ? 0 : tobjectresourceDoList.hashCode());
		result = prime * result + ((tobjectrisksDoList == null) ? 0 : tobjectrisksDoList.hashCode());
		result = prime * result + ((tobjectscenariosDoList == null) ? 0 : tobjectscenariosDoList.hashCode());
		result = prime * result + ((tobjecttestsDoList == null) ? 0 : tobjecttestsDoList.hashCode());
		result = prime * result + ((tobjecttrxDoList == null) ? 0 : tobjecttrxDoList.hashCode());
		result = prime * result + ((tobjecttypesDoList == null) ? 0 : tobjecttypesDoList.hashCode());
		result = prime * result + ((tocfDoList == null) ? 0 : tocfDoList.hashCode());
		result = prime * result + ((toperationDoList == null) ? 0 : toperationDoList.hashCode());
		result = prime * result + ((toperationparamsDoList == null) ? 0 : toperationparamsDoList.hashCode());
		result = prime * result + ((toperationpostsDoList == null) ? 0 : toperationpostsDoList.hashCode());
		result = prime * result + ((toperationpresDoList == null) ? 0 : toperationpresDoList.hashCode());
		result = prime * result + ((toperationtagDoList == null) ? 0 : toperationtagDoList.hashCode());
		result = prime * result + ((tpackageDoList == null) ? 0 : tpackageDoList.hashCode());
		result = prime * result + ((tpaletteDoList == null) ? 0 : tpaletteDoList.hashCode());
		result = prime * result + ((tpaletteitemDoList == null) ? 0 : tpaletteitemDoList.hashCode());
		result = prime * result + ((tphaseDoList == null) ? 0 : tphaseDoList.hashCode());
		result = prime * result + ((tprimitivesDoList == null) ? 0 : tprimitivesDoList.hashCode());
		result = prime * result + ((tproblemtypesDoList == null) ? 0 : tproblemtypesDoList.hashCode());
		result = prime * result + ((tprojectrolesDoList == null) ? 0 : tprojectrolesDoList.hashCode());
		result = prime * result + ((tpropertytypesDoList == null) ? 0 : tpropertytypesDoList.hashCode());
		result = prime * result + ((trequiretypesDoList == null) ? 0 : trequiretypesDoList.hashCode());
		result = prime * result + ((tresourcesDoList == null) ? 0 : tresourcesDoList.hashCode());
		result = prime * result + ((trisktypesDoList == null) ? 0 : trisktypesDoList.hashCode());
		result = prime * result + ((troleconstraintDoList == null) ? 0 : troleconstraintDoList.hashCode());
		result = prime * result + ((trtfDoList == null) ? 0 : trtfDoList.hashCode());
		result = prime * result + ((trtfreportDoList == null) ? 0 : trtfreportDoList.hashCode());
		result = prime * result + ((trulesDoList == null) ? 0 : trulesDoList.hashCode());
		result = prime * result + ((tscenariotypesDoList == null) ? 0 : tscenariotypesDoList.hashCode());
		result = prime * result + ((tscriptDoList == null) ? 0 : tscriptDoList.hashCode());
		result = prime * result + ((tsecgroupDoList == null) ? 0 : tsecgroupDoList.hashCode());
		result = prime * result + ((tsecgrouppermissionDoList == null) ? 0 : tsecgrouppermissionDoList.hashCode());
		result = prime * result + ((tseclocksDoList == null) ? 0 : tseclocksDoList.hashCode());
		result = prime * result + ((tsecpermissionDoList == null) ? 0 : tsecpermissionDoList.hashCode());
		result = prime * result + ((tsecpoliciesDoList == null) ? 0 : tsecpoliciesDoList.hashCode());
		result = prime * result + ((tsecuserDoList == null) ? 0 : tsecuserDoList.hashCode());
		result = prime * result + ((tsecusergroupDoList == null) ? 0 : tsecusergroupDoList.hashCode());
		result = prime * result + ((tsecuserpermissionDoList == null) ? 0 : tsecuserpermissionDoList.hashCode());
		result = prime * result + ((tsnapshotDoList == null) ? 0 : tsnapshotDoList.hashCode());
		result = prime * result + ((tstatustypesDoList == null) ? 0 : tstatustypesDoList.hashCode());
		result = prime * result + ((tstereotypesDoList == null) ? 0 : tstereotypesDoList.hashCode());
		result = prime * result + ((ttaggedvalueDoList == null) ? 0 : ttaggedvalueDoList.hashCode());
		result = prime * result + ((ttasksDoList == null) ? 0 : ttasksDoList.hashCode());
		result = prime * result + ((ttcfDoList == null) ? 0 : ttcfDoList.hashCode());
		result = prime * result + ((ttemplateDoList == null) ? 0 : ttemplateDoList.hashCode());
		result = prime * result + ((ttestclassDoList == null) ? 0 : ttestclassDoList.hashCode());
		result = prime * result + ((ttestplansDoList == null) ? 0 : ttestplansDoList.hashCode());
		result = prime * result + ((ttesttypesDoList == null) ? 0 : ttesttypesDoList.hashCode());
		result = prime * result + ((ttrxtypesDoList == null) ? 0 : ttrxtypesDoList.hashCode());
		result = prime * result + ((tumlpatternDoList == null) ? 0 : tumlpatternDoList.hashCode());
		result = prime * result + ((tversionDoList == null) ? 0 : tversionDoList.hashCode());
		result = prime * result + ((txrefDoList == null) ? 0 : txrefDoList.hashCode());
		result = prime * result + ((txrefsystemDoList == null) ? 0 : txrefsystemDoList.hashCode());
		result = prime * result + ((txrefuserDoList == null) ? 0 : txrefuserDoList.hashCode());
		result = prime * result + ((usysoldtablesDoList == null) ? 0 : usysoldtablesDoList.hashCode());
		result = prime * result + ((usysqueriesDoList == null) ? 0 : usysqueriesDoList.hashCode());
		result = prime * result + ((usyssystemDoList == null) ? 0 : usyssystemDoList.hashCode());
		result = prime * result + ((usystablesDoList == null) ? 0 : usystablesDoList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompleteEabDatabaseDo other = (CompleteEabDatabaseDo) obj;
		if (tattributeDoList == null) {
			if (other.tattributeDoList != null)
				return false;
		} else if (!tattributeDoList.equals(other.tattributeDoList))
			return false;
		if (tattributeconstraintsDoList == null) {
			if (other.tattributeconstraintsDoList != null)
				return false;
		} else if (!tattributeconstraintsDoList.equals(other.tattributeconstraintsDoList))
			return false;
		if (tattributetagDoList == null) {
			if (other.tattributetagDoList != null)
				return false;
		} else if (!tattributetagDoList.equals(other.tattributetagDoList))
			return false;
		if (tauthorsDoList == null) {
			if (other.tauthorsDoList != null)
				return false;
		} else if (!tauthorsDoList.equals(other.tauthorsDoList))
			return false;
		if (tcardinalityDoList == null) {
			if (other.tcardinalityDoList != null)
				return false;
		} else if (!tcardinalityDoList.equals(other.tcardinalityDoList))
			return false;
		if (tcategoryDoList == null) {
			if (other.tcategoryDoList != null)
				return false;
		} else if (!tcategoryDoList.equals(other.tcategoryDoList))
			return false;
		if (tclientsDoList == null) {
			if (other.tclientsDoList != null)
				return false;
		} else if (!tclientsDoList.equals(other.tclientsDoList))
			return false;
		if (tcomplexitytypesDoList == null) {
			if (other.tcomplexitytypesDoList != null)
				return false;
		} else if (!tcomplexitytypesDoList.equals(other.tcomplexitytypesDoList))
			return false;
		if (tconnectorDoList == null) {
			if (other.tconnectorDoList != null)
				return false;
		} else if (!tconnectorDoList.equals(other.tconnectorDoList))
			return false;
		if (tconnectorconstraintDoList == null) {
			if (other.tconnectorconstraintDoList != null)
				return false;
		} else if (!tconnectorconstraintDoList.equals(other.tconnectorconstraintDoList))
			return false;
		if (tconnectortagDoList == null) {
			if (other.tconnectortagDoList != null)
				return false;
		} else if (!tconnectortagDoList.equals(other.tconnectortagDoList))
			return false;
		if (tconnectortypesDoList == null) {
			if (other.tconnectortypesDoList != null)
				return false;
		} else if (!tconnectortypesDoList.equals(other.tconnectortypesDoList))
			return false;
		if (tconstantsDoList == null) {
			if (other.tconstantsDoList != null)
				return false;
		} else if (!tconstantsDoList.equals(other.tconstantsDoList))
			return false;
		if (tconstrainttypesDoList == null) {
			if (other.tconstrainttypesDoList != null)
				return false;
		} else if (!tconstrainttypesDoList.equals(other.tconstrainttypesDoList))
			return false;
		if (tdatatypesDoList == null) {
			if (other.tdatatypesDoList != null)
				return false;
		} else if (!tdatatypesDoList.equals(other.tdatatypesDoList))
			return false;
		if (tdiagramDoList == null) {
			if (other.tdiagramDoList != null)
				return false;
		} else if (!tdiagramDoList.equals(other.tdiagramDoList))
			return false;
		if (tdiagramlinksDoList == null) {
			if (other.tdiagramlinksDoList != null)
				return false;
		} else if (!tdiagramlinksDoList.equals(other.tdiagramlinksDoList))
			return false;
		if (tdiagramobjectsDoList == null) {
			if (other.tdiagramobjectsDoList != null)
				return false;
		} else if (!tdiagramobjectsDoList.equals(other.tdiagramobjectsDoList))
			return false;
		if (tdiagramtypesDoList == null) {
			if (other.tdiagramtypesDoList != null)
				return false;
		} else if (!tdiagramtypesDoList.equals(other.tdiagramtypesDoList))
			return false;
		if (tdocumentDoList == null) {
			if (other.tdocumentDoList != null)
				return false;
		} else if (!tdocumentDoList.equals(other.tdocumentDoList))
			return false;
		if (tecfDoList == null) {
			if (other.tecfDoList != null)
				return false;
		} else if (!tecfDoList.equals(other.tecfDoList))
			return false;
		if (tefforttypesDoList == null) {
			if (other.tefforttypesDoList != null)
				return false;
		} else if (!tefforttypesDoList.equals(other.tefforttypesDoList))
			return false;
		if (tfilesDoList == null) {
			if (other.tfilesDoList != null)
				return false;
		} else if (!tfilesDoList.equals(other.tfilesDoList))
			return false;
		if (tgenoptDoList == null) {
			if (other.tgenoptDoList != null)
				return false;
		} else if (!tgenoptDoList.equals(other.tgenoptDoList))
			return false;
		if (tglossaryDoList == null) {
			if (other.tglossaryDoList != null)
				return false;
		} else if (!tglossaryDoList.equals(other.tglossaryDoList))
			return false;
		if (thtmlDoList == null) {
			if (other.thtmlDoList != null)
				return false;
		} else if (!thtmlDoList.equals(other.thtmlDoList))
			return false;
		if (timageDoList == null) {
			if (other.timageDoList != null)
				return false;
		} else if (!timageDoList.equals(other.timageDoList))
			return false;
		if (timplementDoList == null) {
			if (other.timplementDoList != null)
				return false;
		} else if (!timplementDoList.equals(other.timplementDoList))
			return false;
		if (tissuesDoList == null) {
			if (other.tissuesDoList != null)
				return false;
		} else if (!tissuesDoList.equals(other.tissuesDoList))
			return false;
		if (tlistsDoList == null) {
			if (other.tlistsDoList != null)
				return false;
		} else if (!tlistsDoList.equals(other.tlistsDoList))
			return false;
		if (tmainttypesDoList == null) {
			if (other.tmainttypesDoList != null)
				return false;
		} else if (!tmainttypesDoList.equals(other.tmainttypesDoList))
			return false;
		if (tmethodDoList == null) {
			if (other.tmethodDoList != null)
				return false;
		} else if (!tmethodDoList.equals(other.tmethodDoList))
			return false;
		if (tmetrictypesDoList == null) {
			if (other.tmetrictypesDoList != null)
				return false;
		} else if (!tmetrictypesDoList.equals(other.tmetrictypesDoList))
			return false;
		if (tobjectDoList == null) {
			if (other.tobjectDoList != null)
				return false;
		} else if (!tobjectDoList.equals(other.tobjectDoList))
			return false;
		if (tobjectconstraintDoList == null) {
			if (other.tobjectconstraintDoList != null)
				return false;
		} else if (!tobjectconstraintDoList.equals(other.tobjectconstraintDoList))
			return false;
		if (tobjecteffortDoList == null) {
			if (other.tobjecteffortDoList != null)
				return false;
		} else if (!tobjecteffortDoList.equals(other.tobjecteffortDoList))
			return false;
		if (tobjectfilesDoList == null) {
			if (other.tobjectfilesDoList != null)
				return false;
		} else if (!tobjectfilesDoList.equals(other.tobjectfilesDoList))
			return false;
		if (tobjectmetricsDoList == null) {
			if (other.tobjectmetricsDoList != null)
				return false;
		} else if (!tobjectmetricsDoList.equals(other.tobjectmetricsDoList))
			return false;
		if (tobjectproblemsDoList == null) {
			if (other.tobjectproblemsDoList != null)
				return false;
		} else if (!tobjectproblemsDoList.equals(other.tobjectproblemsDoList))
			return false;
		if (tobjectpropertiesDoList == null) {
			if (other.tobjectpropertiesDoList != null)
				return false;
		} else if (!tobjectpropertiesDoList.equals(other.tobjectpropertiesDoList))
			return false;
		if (tobjectrequiresDoList == null) {
			if (other.tobjectrequiresDoList != null)
				return false;
		} else if (!tobjectrequiresDoList.equals(other.tobjectrequiresDoList))
			return false;
		if (tobjectresourceDoList == null) {
			if (other.tobjectresourceDoList != null)
				return false;
		} else if (!tobjectresourceDoList.equals(other.tobjectresourceDoList))
			return false;
		if (tobjectrisksDoList == null) {
			if (other.tobjectrisksDoList != null)
				return false;
		} else if (!tobjectrisksDoList.equals(other.tobjectrisksDoList))
			return false;
		if (tobjectscenariosDoList == null) {
			if (other.tobjectscenariosDoList != null)
				return false;
		} else if (!tobjectscenariosDoList.equals(other.tobjectscenariosDoList))
			return false;
		if (tobjecttestsDoList == null) {
			if (other.tobjecttestsDoList != null)
				return false;
		} else if (!tobjecttestsDoList.equals(other.tobjecttestsDoList))
			return false;
		if (tobjecttrxDoList == null) {
			if (other.tobjecttrxDoList != null)
				return false;
		} else if (!tobjecttrxDoList.equals(other.tobjecttrxDoList))
			return false;
		if (tobjecttypesDoList == null) {
			if (other.tobjecttypesDoList != null)
				return false;
		} else if (!tobjecttypesDoList.equals(other.tobjecttypesDoList))
			return false;
		if (tocfDoList == null) {
			if (other.tocfDoList != null)
				return false;
		} else if (!tocfDoList.equals(other.tocfDoList))
			return false;
		if (toperationDoList == null) {
			if (other.toperationDoList != null)
				return false;
		} else if (!toperationDoList.equals(other.toperationDoList))
			return false;
		if (toperationparamsDoList == null) {
			if (other.toperationparamsDoList != null)
				return false;
		} else if (!toperationparamsDoList.equals(other.toperationparamsDoList))
			return false;
		if (toperationpostsDoList == null) {
			if (other.toperationpostsDoList != null)
				return false;
		} else if (!toperationpostsDoList.equals(other.toperationpostsDoList))
			return false;
		if (toperationpresDoList == null) {
			if (other.toperationpresDoList != null)
				return false;
		} else if (!toperationpresDoList.equals(other.toperationpresDoList))
			return false;
		if (toperationtagDoList == null) {
			if (other.toperationtagDoList != null)
				return false;
		} else if (!toperationtagDoList.equals(other.toperationtagDoList))
			return false;
		if (tpackageDoList == null) {
			if (other.tpackageDoList != null)
				return false;
		} else if (!tpackageDoList.equals(other.tpackageDoList))
			return false;
		if (tpaletteDoList == null) {
			if (other.tpaletteDoList != null)
				return false;
		} else if (!tpaletteDoList.equals(other.tpaletteDoList))
			return false;
		if (tpaletteitemDoList == null) {
			if (other.tpaletteitemDoList != null)
				return false;
		} else if (!tpaletteitemDoList.equals(other.tpaletteitemDoList))
			return false;
		if (tphaseDoList == null) {
			if (other.tphaseDoList != null)
				return false;
		} else if (!tphaseDoList.equals(other.tphaseDoList))
			return false;
		if (tprimitivesDoList == null) {
			if (other.tprimitivesDoList != null)
				return false;
		} else if (!tprimitivesDoList.equals(other.tprimitivesDoList))
			return false;
		if (tproblemtypesDoList == null) {
			if (other.tproblemtypesDoList != null)
				return false;
		} else if (!tproblemtypesDoList.equals(other.tproblemtypesDoList))
			return false;
		if (tprojectrolesDoList == null) {
			if (other.tprojectrolesDoList != null)
				return false;
		} else if (!tprojectrolesDoList.equals(other.tprojectrolesDoList))
			return false;
		if (tpropertytypesDoList == null) {
			if (other.tpropertytypesDoList != null)
				return false;
		} else if (!tpropertytypesDoList.equals(other.tpropertytypesDoList))
			return false;
		if (trequiretypesDoList == null) {
			if (other.trequiretypesDoList != null)
				return false;
		} else if (!trequiretypesDoList.equals(other.trequiretypesDoList))
			return false;
		if (tresourcesDoList == null) {
			if (other.tresourcesDoList != null)
				return false;
		} else if (!tresourcesDoList.equals(other.tresourcesDoList))
			return false;
		if (trisktypesDoList == null) {
			if (other.trisktypesDoList != null)
				return false;
		} else if (!trisktypesDoList.equals(other.trisktypesDoList))
			return false;
		if (troleconstraintDoList == null) {
			if (other.troleconstraintDoList != null)
				return false;
		} else if (!troleconstraintDoList.equals(other.troleconstraintDoList))
			return false;
		if (trtfDoList == null) {
			if (other.trtfDoList != null)
				return false;
		} else if (!trtfDoList.equals(other.trtfDoList))
			return false;
		if (trtfreportDoList == null) {
			if (other.trtfreportDoList != null)
				return false;
		} else if (!trtfreportDoList.equals(other.trtfreportDoList))
			return false;
		if (trulesDoList == null) {
			if (other.trulesDoList != null)
				return false;
		} else if (!trulesDoList.equals(other.trulesDoList))
			return false;
		if (tscenariotypesDoList == null) {
			if (other.tscenariotypesDoList != null)
				return false;
		} else if (!tscenariotypesDoList.equals(other.tscenariotypesDoList))
			return false;
		if (tscriptDoList == null) {
			if (other.tscriptDoList != null)
				return false;
		} else if (!tscriptDoList.equals(other.tscriptDoList))
			return false;
		if (tsecgroupDoList == null) {
			if (other.tsecgroupDoList != null)
				return false;
		} else if (!tsecgroupDoList.equals(other.tsecgroupDoList))
			return false;
		if (tsecgrouppermissionDoList == null) {
			if (other.tsecgrouppermissionDoList != null)
				return false;
		} else if (!tsecgrouppermissionDoList.equals(other.tsecgrouppermissionDoList))
			return false;
		if (tseclocksDoList == null) {
			if (other.tseclocksDoList != null)
				return false;
		} else if (!tseclocksDoList.equals(other.tseclocksDoList))
			return false;
		if (tsecpermissionDoList == null) {
			if (other.tsecpermissionDoList != null)
				return false;
		} else if (!tsecpermissionDoList.equals(other.tsecpermissionDoList))
			return false;
		if (tsecpoliciesDoList == null) {
			if (other.tsecpoliciesDoList != null)
				return false;
		} else if (!tsecpoliciesDoList.equals(other.tsecpoliciesDoList))
			return false;
		if (tsecuserDoList == null) {
			if (other.tsecuserDoList != null)
				return false;
		} else if (!tsecuserDoList.equals(other.tsecuserDoList))
			return false;
		if (tsecusergroupDoList == null) {
			if (other.tsecusergroupDoList != null)
				return false;
		} else if (!tsecusergroupDoList.equals(other.tsecusergroupDoList))
			return false;
		if (tsecuserpermissionDoList == null) {
			if (other.tsecuserpermissionDoList != null)
				return false;
		} else if (!tsecuserpermissionDoList.equals(other.tsecuserpermissionDoList))
			return false;
		if (tsnapshotDoList == null) {
			if (other.tsnapshotDoList != null)
				return false;
		} else if (!tsnapshotDoList.equals(other.tsnapshotDoList))
			return false;
		if (tstatustypesDoList == null) {
			if (other.tstatustypesDoList != null)
				return false;
		} else if (!tstatustypesDoList.equals(other.tstatustypesDoList))
			return false;
		if (tstereotypesDoList == null) {
			if (other.tstereotypesDoList != null)
				return false;
		} else if (!tstereotypesDoList.equals(other.tstereotypesDoList))
			return false;
		if (ttaggedvalueDoList == null) {
			if (other.ttaggedvalueDoList != null)
				return false;
		} else if (!ttaggedvalueDoList.equals(other.ttaggedvalueDoList))
			return false;
		if (ttasksDoList == null) {
			if (other.ttasksDoList != null)
				return false;
		} else if (!ttasksDoList.equals(other.ttasksDoList))
			return false;
		if (ttcfDoList == null) {
			if (other.ttcfDoList != null)
				return false;
		} else if (!ttcfDoList.equals(other.ttcfDoList))
			return false;
		if (ttemplateDoList == null) {
			if (other.ttemplateDoList != null)
				return false;
		} else if (!ttemplateDoList.equals(other.ttemplateDoList))
			return false;
		if (ttestclassDoList == null) {
			if (other.ttestclassDoList != null)
				return false;
		} else if (!ttestclassDoList.equals(other.ttestclassDoList))
			return false;
		if (ttestplansDoList == null) {
			if (other.ttestplansDoList != null)
				return false;
		} else if (!ttestplansDoList.equals(other.ttestplansDoList))
			return false;
		if (ttesttypesDoList == null) {
			if (other.ttesttypesDoList != null)
				return false;
		} else if (!ttesttypesDoList.equals(other.ttesttypesDoList))
			return false;
		if (ttrxtypesDoList == null) {
			if (other.ttrxtypesDoList != null)
				return false;
		} else if (!ttrxtypesDoList.equals(other.ttrxtypesDoList))
			return false;
		if (tumlpatternDoList == null) {
			if (other.tumlpatternDoList != null)
				return false;
		} else if (!tumlpatternDoList.equals(other.tumlpatternDoList))
			return false;
		if (tversionDoList == null) {
			if (other.tversionDoList != null)
				return false;
		} else if (!tversionDoList.equals(other.tversionDoList))
			return false;
		if (txrefDoList == null) {
			if (other.txrefDoList != null)
				return false;
		} else if (!txrefDoList.equals(other.txrefDoList))
			return false;
		if (txrefsystemDoList == null) {
			if (other.txrefsystemDoList != null)
				return false;
		} else if (!txrefsystemDoList.equals(other.txrefsystemDoList))
			return false;
		if (txrefuserDoList == null) {
			if (other.txrefuserDoList != null)
				return false;
		} else if (!txrefuserDoList.equals(other.txrefuserDoList))
			return false;
		if (usysoldtablesDoList == null) {
			if (other.usysoldtablesDoList != null)
				return false;
		} else if (!usysoldtablesDoList.equals(other.usysoldtablesDoList))
			return false;
		if (usysqueriesDoList == null) {
			if (other.usysqueriesDoList != null)
				return false;
		} else if (!usysqueriesDoList.equals(other.usysqueriesDoList))
			return false;
		if (usyssystemDoList == null) {
			if (other.usyssystemDoList != null)
				return false;
		} else if (!usyssystemDoList.equals(other.usyssystemDoList))
			return false;
		if (usystablesDoList == null) {
			if (other.usystablesDoList != null)
				return false;
		} else if (!usystablesDoList.equals(other.usystablesDoList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CompleteEabDatabaseDo [tattributeDoList=" + tattributeDoList + ", tattributeconstraintsDoList="
				+ tattributeconstraintsDoList + ", tattributetagDoList=" + tattributetagDoList + ", tauthorsDoList="
				+ tauthorsDoList + ", tcardinalityDoList=" + tcardinalityDoList + ", tcategoryDoList=" + tcategoryDoList
				+ ", tclientsDoList=" + tclientsDoList + ", tcomplexitytypesDoList=" + tcomplexitytypesDoList
				+ ", tconnectorDoList=" + tconnectorDoList + ", tconnectorconstraintDoList="
				+ tconnectorconstraintDoList + ", tconnectortagDoList=" + tconnectortagDoList
				+ ", tconnectortypesDoList=" + tconnectortypesDoList + ", tconstantsDoList=" + tconstantsDoList
				+ ", tconstrainttypesDoList=" + tconstrainttypesDoList + ", tdatatypesDoList=" + tdatatypesDoList
				+ ", tdiagramDoList=" + tdiagramDoList + ", tdiagramlinksDoList=" + tdiagramlinksDoList
				+ ", tdiagramobjectsDoList=" + tdiagramobjectsDoList + ", tdiagramtypesDoList=" + tdiagramtypesDoList
				+ ", tdocumentDoList=" + tdocumentDoList + ", tecfDoList=" + tecfDoList + ", tefforttypesDoList="
				+ tefforttypesDoList + ", tfilesDoList=" + tfilesDoList + ", tgenoptDoList=" + tgenoptDoList
				+ ", tglossaryDoList=" + tglossaryDoList + ", thtmlDoList=" + thtmlDoList + ", timageDoList="
				+ timageDoList + ", timplementDoList=" + timplementDoList + ", tissuesDoList=" + tissuesDoList
				+ ", tlistsDoList=" + tlistsDoList + ", tmainttypesDoList=" + tmainttypesDoList + ", tmethodDoList="
				+ tmethodDoList + ", tmetrictypesDoList=" + tmetrictypesDoList + ", tobjectDoList=" + tobjectDoList
				+ ", tobjectconstraintDoList=" + tobjectconstraintDoList + ", tobjecteffortDoList="
				+ tobjecteffortDoList + ", tobjectfilesDoList=" + tobjectfilesDoList + ", tobjectmetricsDoList="
				+ tobjectmetricsDoList + ", tobjectproblemsDoList=" + tobjectproblemsDoList
				+ ", tobjectpropertiesDoList=" + tobjectpropertiesDoList + ", tobjectrequiresDoList="
				+ tobjectrequiresDoList + ", tobjectresourceDoList=" + tobjectresourceDoList + ", tobjectrisksDoList="
				+ tobjectrisksDoList + ", tobjectscenariosDoList=" + tobjectscenariosDoList + ", tobjecttestsDoList="
				+ tobjecttestsDoList + ", tobjecttrxDoList=" + tobjecttrxDoList + ", tobjecttypesDoList="
				+ tobjecttypesDoList + ", tocfDoList=" + tocfDoList + ", toperationDoList=" + toperationDoList
				+ ", toperationparamsDoList=" + toperationparamsDoList + ", toperationpostsDoList="
				+ toperationpostsDoList + ", toperationpresDoList=" + toperationpresDoList + ", toperationtagDoList="
				+ toperationtagDoList + ", tpackageDoList=" + tpackageDoList + ", tpaletteDoList=" + tpaletteDoList
				+ ", tpaletteitemDoList=" + tpaletteitemDoList + ", tphaseDoList=" + tphaseDoList
				+ ", tprimitivesDoList=" + tprimitivesDoList + ", tproblemtypesDoList=" + tproblemtypesDoList
				+ ", tprojectrolesDoList=" + tprojectrolesDoList + ", tpropertytypesDoList=" + tpropertytypesDoList
				+ ", trequiretypesDoList=" + trequiretypesDoList + ", tresourcesDoList=" + tresourcesDoList
				+ ", trisktypesDoList=" + trisktypesDoList + ", troleconstraintDoList=" + troleconstraintDoList
				+ ", trtfDoList=" + trtfDoList + ", trtfreportDoList=" + trtfreportDoList + ", trulesDoList="
				+ trulesDoList + ", tscenariotypesDoList=" + tscenariotypesDoList + ", tscriptDoList=" + tscriptDoList
				+ ", tsecgroupDoList=" + tsecgroupDoList + ", tsecgrouppermissionDoList=" + tsecgrouppermissionDoList
				+ ", tseclocksDoList=" + tseclocksDoList + ", tsecpermissionDoList=" + tsecpermissionDoList
				+ ", tsecpoliciesDoList=" + tsecpoliciesDoList + ", tsecuserDoList=" + tsecuserDoList
				+ ", tsecusergroupDoList=" + tsecusergroupDoList + ", tsecuserpermissionDoList="
				+ tsecuserpermissionDoList + ", tsnapshotDoList=" + tsnapshotDoList + ", tstatustypesDoList="
				+ tstatustypesDoList + ", tstereotypesDoList=" + tstereotypesDoList + ", ttaggedvalueDoList="
				+ ttaggedvalueDoList + ", ttasksDoList=" + ttasksDoList + ", ttcfDoList=" + ttcfDoList
				+ ", ttemplateDoList=" + ttemplateDoList + ", ttestclassDoList=" + ttestclassDoList
				+ ", ttestplansDoList=" + ttestplansDoList + ", ttesttypesDoList=" + ttesttypesDoList
				+ ", ttrxtypesDoList=" + ttrxtypesDoList + ", tumlpatternDoList=" + tumlpatternDoList
				+ ", tversionDoList=" + tversionDoList + ", txrefDoList=" + txrefDoList + ", txrefsystemDoList="
				+ txrefsystemDoList + ", txrefuserDoList=" + txrefuserDoList + ", usysoldtablesDoList="
				+ usysoldtablesDoList + ", usysqueriesDoList=" + usysqueriesDoList + ", usyssystemDoList="
				+ usyssystemDoList + ", usystablesDoList=" + usystablesDoList + "]";
	}
	
}
