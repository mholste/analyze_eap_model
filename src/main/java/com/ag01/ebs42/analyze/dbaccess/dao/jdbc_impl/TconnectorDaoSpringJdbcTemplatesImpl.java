package com.ag01.ebs42.analyze.dbaccess.dao.jdbc_impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TconnectorDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TconnectorDo;

public class TconnectorDaoSpringJdbcTemplatesImpl implements TconnectorDao {

    private static Logger LOGGER = LogManager.getLogger(TconnectorDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TconnectorDo> readListTconnector() throws Exception {
        List <TconnectorDo> resultTconnectorDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`CONNECTOR_ID`, " + 
                    "`NAME`, " + 
                    "`DIRECTION`, " + 
                    "`NOTES`, " + 
                    "`CONNECTOR_TYPE`, " + 
                    "`SUBTYPE`, " + 
                    "`SOURCECARD`, " + 
                    "`SOURCEACCESS`, " + 
                    "`SOURCEELEMENT`, " + 
                    "`DESTCARD`, " + 
                    "`DESTACCESS`, " + 
                    "`DESTELEMENT`, " + 
                    "`SOURCEROLE`, " + 
                    "`SOURCEROLETYPE`, " + 
                    "`SOURCEROLENOTE`, " + 
                    "`SOURCECONTAINMENT`, " + 
                    "`SOURCEISAGGREGATE`, " + 
                    "`SOURCEISORDERED`, " + 
                    "`SOURCEQUALIFIER`, " + 
                    "`DESTROLE`, " + 
                    "`DESTROLETYPE`, " + 
                    "`DESTROLENOTE`, " + 
                    "`DESTCONTAINMENT`, " + 
                    "`DESTISAGGREGATE`, " + 
                    "`DESTISORDERED`, " + 
                    "`DESTQUALIFIER`, " + 
                    "`START_OBJECT_ID`, " + 
                    "`END_OBJECT_ID`, " + 
                    "`TOP_START_LABEL`, " + 
                    "`TOP_MID_LABEL`, " + 
                    "`TOP_END_LABEL`, " + 
                    "`BTM_START_LABEL`, " + 
                    "`BTM_MID_LABEL`, " + 
                    "`BTM_END_LABEL`, " + 
                    "`START_EDGE`, " + 
                    "`END_EDGE`, " + 
                    "`PTSTARTX`, " + 
                    "`PTSTARTY`, " + 
                    "`PTENDX`, " + 
                    "`PTENDY`, " + 
                    "`SEQNO`, " + 
                    "`HEADSTYLE`, " + 
                    "`LINESTYLE`, " + 
                    "`ROUTESTYLE`, " + 
                    "`ISBOLD`, " + 
                    "`LINECOLOR`, " + 
                    "`STEREOTYPE`, " + 
                    "`VIRTUALINHERITANCE`, " + 
                    "`LINKACCESS`, " + 
                    "`PDATA1`, " + 
                    "`PDATA2`, " + 
                    "`PDATA3`, " + 
                    "`PDATA4`, " + 
                    "`PDATA5`, " + 
                    "`DIAGRAMID`, " + 
                    "`EA_GUID`, " + 
                    "`SOURCECONSTRAINT`, " + 
                    "`DESTCONSTRAINT`, " + 
                    "`SOURCEISNAVIGABLE`, " + 
                    "`DESTISNAVIGABLE`, " + 
                    "`ISROOT`, " + 
                    "`ISLEAF`, " + 
                    "`ISSPEC`, " + 
                    "`SOURCECHANGEABLE`, " + 
                    "`DESTCHANGEABLE`, " + 
                    "`SOURCETS`, " + 
                    "`DESTTS`, " + 
                    "`STATEFLAGS`, " + 
                    "`ACTIONFLAGS`, " + 
                    "`ISSIGNAL`, " + 
                    "`ISSTIMULUS`, " + 
                    "`DISPATCHACTION`, " + 
                    "`TARGET2`, " + 
                    "`STYLEEX`, " + 
                    "`SOURCESTEREOTYPE`, " + 
                    "`DESTSTEREOTYPE`, " + 
                    "`SOURCESTYLE`, " + 
                    "`DESTSTYLE`, " + 
                    "`EVENTFLAGS` " + 
                    "FROM " + 
                    "T_CONNECTOR";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTconnectorDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tconnector_objectToTconnectorObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TconnectorDaoSpringJdbcTemplatesImpl.readListTconnector", e);
            throw e;
        }
        return resultTconnectorDoList;
    }

}

class Tconnector_objectToTconnectorObjectDoRowMapper implements RowMapper <TconnectorDo> {

    @Override
    public TconnectorDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TconnectorDo resultTconnectorDo = new TconnectorDo();
        resultTconnectorDo.setConnectorid(paramResultSet.getInt("CONNECTOR_ID"));
        resultTconnectorDo.setName(paramResultSet.getString("NAME"));
        resultTconnectorDo.setDirection(paramResultSet.getString("DIRECTION"));
        resultTconnectorDo.setNotes(paramResultSet.getString("NOTES"));
        resultTconnectorDo.setConnectortype(paramResultSet.getString("CONNECTOR_TYPE"));
        resultTconnectorDo.setSubtype(paramResultSet.getString("SUBTYPE"));
        resultTconnectorDo.setSourcecard(paramResultSet.getString("SOURCECARD"));
        resultTconnectorDo.setSourceaccess(paramResultSet.getString("SOURCEACCESS"));
        resultTconnectorDo.setSourceelement(paramResultSet.getString("SOURCEELEMENT"));
        resultTconnectorDo.setDestcard(paramResultSet.getString("DESTCARD"));
        resultTconnectorDo.setDestaccess(paramResultSet.getString("DESTACCESS"));
        resultTconnectorDo.setDestelement(paramResultSet.getString("DESTELEMENT"));
        resultTconnectorDo.setSourcerole(paramResultSet.getString("SOURCEROLE"));
        resultTconnectorDo.setSourceroletype(paramResultSet.getString("SOURCEROLETYPE"));
        resultTconnectorDo.setSourcerolenote(paramResultSet.getString("SOURCEROLENOTE"));
        resultTconnectorDo.setSourcecontainment(paramResultSet.getString("SOURCECONTAINMENT"));
        resultTconnectorDo.setSourceisaggregate(paramResultSet.getInt("SOURCEISAGGREGATE"));
        resultTconnectorDo.setSourceisordered(paramResultSet.getInt("SOURCEISORDERED"));
        resultTconnectorDo.setSourcequalifier(paramResultSet.getString("SOURCEQUALIFIER"));
        resultTconnectorDo.setDestrole(paramResultSet.getString("DESTROLE"));
        resultTconnectorDo.setDestroletype(paramResultSet.getString("DESTROLETYPE"));
        resultTconnectorDo.setDestrolenote(paramResultSet.getString("DESTROLENOTE"));
        resultTconnectorDo.setDestcontainment(paramResultSet.getString("DESTCONTAINMENT"));
        resultTconnectorDo.setDestisaggregate(paramResultSet.getInt("DESTISAGGREGATE"));
        resultTconnectorDo.setDestisordered(paramResultSet.getInt("DESTISORDERED"));
        resultTconnectorDo.setDestqualifier(paramResultSet.getString("DESTQUALIFIER"));
        resultTconnectorDo.setStartobjectid(paramResultSet.getInt("START_OBJECT_ID"));
        resultTconnectorDo.setEndobjectid(paramResultSet.getInt("END_OBJECT_ID"));
        resultTconnectorDo.setTopstartlabel(paramResultSet.getString("TOP_START_LABEL"));
        resultTconnectorDo.setTopmidlabel(paramResultSet.getString("TOP_MID_LABEL"));
        resultTconnectorDo.setTopendlabel(paramResultSet.getString("TOP_END_LABEL"));
        resultTconnectorDo.setBtmstartlabel(paramResultSet.getString("BTM_START_LABEL"));
        resultTconnectorDo.setBtmmidlabel(paramResultSet.getString("BTM_MID_LABEL"));
        resultTconnectorDo.setBtmendlabel(paramResultSet.getString("BTM_END_LABEL"));
        resultTconnectorDo.setStartedge(paramResultSet.getInt("START_EDGE"));
        resultTconnectorDo.setEndedge(paramResultSet.getInt("END_EDGE"));
        resultTconnectorDo.setPtstartx(paramResultSet.getInt("PTSTARTX"));
        resultTconnectorDo.setPtstarty(paramResultSet.getInt("PTSTARTY"));
        resultTconnectorDo.setPtendx(paramResultSet.getInt("PTENDX"));
        resultTconnectorDo.setPtendy(paramResultSet.getInt("PTENDY"));
        resultTconnectorDo.setSeqno(paramResultSet.getInt("SEQNO"));
        resultTconnectorDo.setHeadstyle(paramResultSet.getInt("HEADSTYLE"));
        resultTconnectorDo.setLinestyle(paramResultSet.getInt("LINESTYLE"));
        resultTconnectorDo.setRoutestyle(paramResultSet.getInt("ROUTESTYLE"));
        resultTconnectorDo.setIsbold(paramResultSet.getInt("ISBOLD"));
        resultTconnectorDo.setLinecolor(paramResultSet.getInt("LINECOLOR"));
        resultTconnectorDo.setStereotype(paramResultSet.getString("STEREOTYPE"));
        resultTconnectorDo.setVirtualinheritance(paramResultSet.getString("VIRTUALINHERITANCE").charAt(0));
        resultTconnectorDo.setLinkaccess(paramResultSet.getString("LINKACCESS"));
        resultTconnectorDo.setPdata1(paramResultSet.getString("PDATA1"));
        resultTconnectorDo.setPdata2(paramResultSet.getString("PDATA2"));
        resultTconnectorDo.setPdata3(paramResultSet.getString("PDATA3"));
        resultTconnectorDo.setPdata4(paramResultSet.getString("PDATA4"));
        resultTconnectorDo.setPdata5(paramResultSet.getString("PDATA5"));
        resultTconnectorDo.setDiagramid(paramResultSet.getInt("DIAGRAMID"));
        resultTconnectorDo.setEaguid(paramResultSet.getString("EA_GUID"));
        resultTconnectorDo.setSourceconstraint(paramResultSet.getString("SOURCECONSTRAINT"));
        resultTconnectorDo.setDestconstraint(paramResultSet.getString("DESTCONSTRAINT"));
        resultTconnectorDo.setSourceisnavigable(paramResultSet.getInt("SOURCEISNAVIGABLE"));
        resultTconnectorDo.setDestisnavigable(paramResultSet.getInt("DESTISNAVIGABLE"));
        resultTconnectorDo.setIsroot(paramResultSet.getInt("ISROOT"));
        resultTconnectorDo.setIsleaf(paramResultSet.getInt("ISLEAF"));
        resultTconnectorDo.setIsspec(paramResultSet.getInt("ISSPEC"));
        resultTconnectorDo.setSourcechangeable(paramResultSet.getString("SOURCECHANGEABLE"));
        resultTconnectorDo.setDestchangeable(paramResultSet.getString("DESTCHANGEABLE"));
        resultTconnectorDo.setSourcets(paramResultSet.getString("SOURCETS"));
        resultTconnectorDo.setDestts(paramResultSet.getString("DESTTS"));
        resultTconnectorDo.setStateflags(paramResultSet.getString("STATEFLAGS"));
        resultTconnectorDo.setActionflags(paramResultSet.getString("ACTIONFLAGS"));
        resultTconnectorDo.setIssignal(paramResultSet.getInt("ISSIGNAL"));
        resultTconnectorDo.setIsstimulus(paramResultSet.getInt("ISSTIMULUS"));
        resultTconnectorDo.setDispatchaction(paramResultSet.getString("DISPATCHACTION"));
        resultTconnectorDo.setTarget2(paramResultSet.getInt("TARGET2"));
        resultTconnectorDo.setStyleex(paramResultSet.getString("STYLEEX"));
        resultTconnectorDo.setSourcestereotype(paramResultSet.getString("SOURCESTEREOTYPE"));
        resultTconnectorDo.setDeststereotype(paramResultSet.getString("DESTSTEREOTYPE"));
        resultTconnectorDo.setSourcestyle(paramResultSet.getString("SOURCESTYLE"));
        resultTconnectorDo.setDeststyle(paramResultSet.getString("DESTSTYLE"));
        resultTconnectorDo.setEventflags(paramResultSet.getString("EVENTFLAGS"));
        return resultTconnectorDo;
    }

}

