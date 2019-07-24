package com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.jdbc_template_impl;

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

import com.ag01.ebs42.analyze.database_access.domain_object.TobjectDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TobjectDao;

public class TobjectDaoSpringJdbcTemplatesImpl implements TobjectDao {

    private static Logger LOGGER = LogManager.getLogger(TobjectDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TobjectDo> readListTobject() throws Exception {
        List <TobjectDo> resultTobjectDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`OBJECT_ID`, " + 
                    "`OBJECT_TYPE`, " + 
                    "`DIAGRAM_ID`, " + 
                    "`NAME`, " + 
                    "`ALIAS`, " + 
                    "`AUTHOR`, " + 
                    "`VERSION`, " + 
                    "`NOTE`, " + 
                    "`PACKAGE_ID`, " + 
                    "`STEREOTYPE`, " + 
                    "`NTYPE`, " + 
                    "`COMPLEXITY`, " + 
                    "`EFFORT`, " + 
                    "`STYLE`, " + 
                    "`BACKCOLOR`, " + 
                    "`BORDERSTYLE`, " + 
                    "`BORDERWIDTH`, " + 
                    "`FONTCOLOR`, " + 
                    "`BORDERCOLOR`, " + 
                    "`CREATEDDATE`, " + 
                    "`MODIFIEDDATE`, " + 
                    "`STATUS`, " + 
                    "`ABSTRACT`, " + 
                    "`TAGGED`, " + 
                    "`PDATA1`, " + 
                    "`PDATA2`, " + 
                    "`PDATA3`, " + 
                    "`PDATA4`, " + 
                    "`PDATA5`, " + 
                    "`CONCURRENCY`, " + 
                    "`VISIBILITY`, " + 
                    "`PERSISTENCE`, " + 
                    "`CARDINALITY`, " + 
                    "`GENTYPE`, " + 
                    "`GENFILE`, " + 
                    "`HEADER1`, " + 
                    "`HEADER2`, " + 
                    "`PHASE`, " + 
                    "`SCOPE`, " + 
                    "`GENOPTION`, " + 
                    "`GENLINKS`, " + 
                    "`CLASSIFIER`, " + 
                    "`EA_GUID`, " + 
                    "`PARENTID`, " + 
                    "`RUNSTATE`, " + 
                    "`CLASSIFIER_GUID`, " + 
                    "`TPOS`, " + 
                    "`ISROOT`, " + 
                    "`ISLEAF`, " + 
                    "`ISSPEC`, " + 
                    "`ISACTIVE`, " + 
                    "`STATEFLAGS`, " + 
                    "`PACKAGEFLAGS`, " + 
                    "`MULTIPLICITY`, " + 
                    "`STYLEEX`, " + 
                    "`ACTIONFLAGS`, " + 
                    "`EVENTFLAGS` " + 
                    "FROM " + 
                    "T_OBJECT";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTobjectDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tobject_objectToTobjectObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TobjectDaoSpringJdbcTemplatesImpl.readListTobject", e);
            throw e;
        }
        return resultTobjectDoList;
    }

}

class Tobject_objectToTobjectObjectDoRowMapper implements RowMapper <TobjectDo> {

    @Override
    public TobjectDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TobjectDo resultTobjectDo = new TobjectDo();
        resultTobjectDo.setObjectid(paramResultSet.getInt("OBJECT_ID"));
        resultTobjectDo.setObjecttype(paramResultSet.getString("OBJECT_TYPE"));
        resultTobjectDo.setDiagramid(paramResultSet.getInt("DIAGRAM_ID"));
        resultTobjectDo.setName(paramResultSet.getString("NAME"));
        resultTobjectDo.setAlias(paramResultSet.getString("ALIAS"));
        resultTobjectDo.setAuthor(paramResultSet.getString("AUTHOR"));
        resultTobjectDo.setVersion(paramResultSet.getString("VERSION"));
        resultTobjectDo.setNote(paramResultSet.getString("NOTE"));
        resultTobjectDo.setPackageid(paramResultSet.getInt("PACKAGE_ID"));
        resultTobjectDo.setStereotype(paramResultSet.getString("STEREOTYPE"));
        resultTobjectDo.setNtype(paramResultSet.getInt("NTYPE"));
        resultTobjectDo.setComplexity(paramResultSet.getString("COMPLEXITY"));
        resultTobjectDo.setEffort(paramResultSet.getInt("EFFORT"));
        resultTobjectDo.setStyle(paramResultSet.getString("STYLE"));
        resultTobjectDo.setBackcolor(paramResultSet.getInt("BACKCOLOR"));
        resultTobjectDo.setBorderstyle(paramResultSet.getInt("BORDERSTYLE"));
        resultTobjectDo.setBorderwidth(paramResultSet.getInt("BORDERWIDTH"));
        resultTobjectDo.setFontcolor(paramResultSet.getInt("FONTCOLOR"));
        resultTobjectDo.setBordercolor(paramResultSet.getInt("BORDERCOLOR"));
        resultTobjectDo.setCreateddate(paramResultSet.getDate("CREATEDDATE"));
        resultTobjectDo.setModifieddate(paramResultSet.getDate("MODIFIEDDATE"));
        resultTobjectDo.setStatus(paramResultSet.getString("STATUS"));
        resultTobjectDo.setAbstract(paramResultSet.getString("ABSTRACT").charAt(0));
        resultTobjectDo.setTagged(paramResultSet.getInt("TAGGED"));
        resultTobjectDo.setPdata1(paramResultSet.getString("PDATA1"));
        resultTobjectDo.setPdata2(paramResultSet.getString("PDATA2"));
        resultTobjectDo.setPdata3(paramResultSet.getString("PDATA3"));
        resultTobjectDo.setPdata4(paramResultSet.getString("PDATA4"));
        resultTobjectDo.setPdata5(paramResultSet.getString("PDATA5"));
        resultTobjectDo.setConcurrency(paramResultSet.getString("CONCURRENCY"));
        resultTobjectDo.setVisibility(paramResultSet.getString("VISIBILITY"));
        resultTobjectDo.setPersistence(paramResultSet.getString("PERSISTENCE"));
        resultTobjectDo.setCardinality(paramResultSet.getString("CARDINALITY"));
        resultTobjectDo.setGentype(paramResultSet.getString("GENTYPE"));
        resultTobjectDo.setGenfile(paramResultSet.getString("GENFILE"));
        resultTobjectDo.setHeader1(paramResultSet.getString("HEADER1"));
        resultTobjectDo.setHeader2(paramResultSet.getString("HEADER2"));
        resultTobjectDo.setPhase(paramResultSet.getString("PHASE"));
        resultTobjectDo.setScope(paramResultSet.getString("SCOPE"));
        resultTobjectDo.setGenoption(paramResultSet.getString("GENOPTION"));
        resultTobjectDo.setGenlinks(paramResultSet.getString("GENLINKS"));
        resultTobjectDo.setClassifier(paramResultSet.getInt("CLASSIFIER"));
        resultTobjectDo.setEaguid(paramResultSet.getString("EA_GUID"));
        resultTobjectDo.setParentid(paramResultSet.getInt("PARENTID"));
        resultTobjectDo.setRunstate(paramResultSet.getString("RUNSTATE"));
        resultTobjectDo.setClassifierguid(paramResultSet.getString("CLASSIFIER_GUID"));
        resultTobjectDo.setTpos(paramResultSet.getInt("TPOS"));
        resultTobjectDo.setIsroot(paramResultSet.getInt("ISROOT"));
        resultTobjectDo.setIsleaf(paramResultSet.getInt("ISLEAF"));
        resultTobjectDo.setIsspec(paramResultSet.getInt("ISSPEC"));
        resultTobjectDo.setIsactive(paramResultSet.getInt("ISACTIVE"));
        resultTobjectDo.setStateflags(paramResultSet.getString("STATEFLAGS"));
        resultTobjectDo.setPackageflags(paramResultSet.getString("PACKAGEFLAGS"));
        resultTobjectDo.setMultiplicity(paramResultSet.getString("MULTIPLICITY"));
        resultTobjectDo.setStyleex(paramResultSet.getString("STYLEEX"));
        resultTobjectDo.setActionflags(paramResultSet.getString("ACTIONFLAGS"));
        resultTobjectDo.setEventflags(paramResultSet.getString("EVENTFLAGS"));
        return resultTobjectDo;
    }

}

