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

import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.ToperationDao;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.ToperationDo;

public class ToperationDaoSpringJdbcTemplatesImpl implements ToperationDao {

    private static Logger LOGGER = LogManager.getLogger(ToperationDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <ToperationDo> readListToperation() throws Exception {
        List <ToperationDo> resultToperationDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`OPERATIONID`, " + 
                    "`OBJECT_ID`, " + 
                    "`NAME`, " + 
                    "`SCOPE`, " + 
                    "`TYPE`, " + 
                    "`RETURNARRAY`, " + 
                    "`STEREOTYPE`, " + 
                    "`ISSTATIC`, " + 
                    "`CONCURRENCY`, " + 
                    "`NOTES`, " + 
                    "`BEHAVIOUR`, " + 
                    "`ABSTRACT`, " + 
                    "`GENOPTION`, " + 
                    "`SYNCHRONIZED`, " + 
                    "`POS`, " + 
                    "`CONST`, " + 
                    "`STYLE`, " + 
                    "`PURE`, " + 
                    "`THROWS`, " + 
                    "`CLASSIFIER`, " + 
                    "`CODE`, " + 
                    "`ISROOT`, " + 
                    "`ISLEAF`, " + 
                    "`ISQUERY`, " + 
                    "`STATEFLAGS`, " + 
                    "`EA_GUID`, " + 
                    "`STYLEEX` " + 
                    "FROM " + 
                    "T_OPERATION";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultToperationDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Toperation_objectToToperationObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in ToperationDaoSpringJdbcTemplatesImpl.readListToperation", e);
            throw e;
        }
        return resultToperationDoList;
    }

}

class Toperation_objectToToperationObjectDoRowMapper implements RowMapper <ToperationDo> {

    @Override
    public ToperationDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        ToperationDo resultToperationDo = new ToperationDo();
        resultToperationDo.setOperationid(paramResultSet.getInt("OPERATIONID"));
        resultToperationDo.setObjectid(paramResultSet.getInt("OBJECT_ID"));
        resultToperationDo.setName(paramResultSet.getString("NAME"));
        resultToperationDo.setScope(paramResultSet.getString("SCOPE"));
        resultToperationDo.setType(paramResultSet.getString("TYPE"));
        resultToperationDo.setReturnarray(paramResultSet.getString("RETURNARRAY").charAt(0));
        resultToperationDo.setStereotype(paramResultSet.getString("STEREOTYPE"));
        resultToperationDo.setIsstatic(paramResultSet.getString("ISSTATIC").charAt(0));
        resultToperationDo.setConcurrency(paramResultSet.getString("CONCURRENCY"));
        resultToperationDo.setNotes(paramResultSet.getString("NOTES"));
        resultToperationDo.setBehaviour(paramResultSet.getString("BEHAVIOUR"));
        resultToperationDo.setAbstract(paramResultSet.getString("ABSTRACT").charAt(0));
        resultToperationDo.setGenoption(paramResultSet.getString("GENOPTION"));
        resultToperationDo.setSynchronized(paramResultSet.getString("SYNCHRONIZED").charAt(0));
        resultToperationDo.setPos(paramResultSet.getInt("POS"));
        resultToperationDo.setConst(paramResultSet.getInt("CONST"));
        resultToperationDo.setStyle(paramResultSet.getString("STYLE"));
        resultToperationDo.setPure(paramResultSet.getInt("PURE"));
        resultToperationDo.setThrows(paramResultSet.getString("THROWS"));
        resultToperationDo.setClassifier(paramResultSet.getString("CLASSIFIER"));
        resultToperationDo.setCode(paramResultSet.getString("CODE"));
        resultToperationDo.setIsroot(paramResultSet.getInt("ISROOT"));
        resultToperationDo.setIsleaf(paramResultSet.getInt("ISLEAF"));
        resultToperationDo.setIsquery(paramResultSet.getInt("ISQUERY"));
        resultToperationDo.setStateflags(paramResultSet.getString("STATEFLAGS"));
        resultToperationDo.setEaguid(paramResultSet.getString("EA_GUID"));
        resultToperationDo.setStyleex(paramResultSet.getString("STYLEEX"));
        return resultToperationDo;
    }

}

