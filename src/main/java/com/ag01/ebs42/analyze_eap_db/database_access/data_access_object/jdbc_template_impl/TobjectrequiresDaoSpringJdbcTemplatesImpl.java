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

import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TobjectrequiresDao;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TobjectrequiresDo;

public class TobjectrequiresDaoSpringJdbcTemplatesImpl implements TobjectrequiresDao {

    private static Logger LOGGER = LogManager.getLogger(TobjectrequiresDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TobjectrequiresDo> readListTobjectrequires() throws Exception {
        List <TobjectrequiresDo> resultTobjectrequiresDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`REQID`, " + 
                    "`OBJECT_ID`, " + 
                    "`REQUIREMENT`, " + 
                    "`REQTYPE`, " + 
                    "`STATUS`, " + 
                    "`NOTES`, " + 
                    "`STABILITY`, " + 
                    "`DIFFICULTY`, " + 
                    "`PRIORITY`, " + 
                    "`LASTUPDATE` " + 
                    "FROM " + 
                    "T_OBJECTREQUIRES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTobjectrequiresDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tobjectrequires_objectToTobjectrequiresObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TobjectrequiresDaoSpringJdbcTemplatesImpl.readListTobjectrequires", e);
            throw e;
        }
        return resultTobjectrequiresDoList;
    }

}

class Tobjectrequires_objectToTobjectrequiresObjectDoRowMapper implements RowMapper <TobjectrequiresDo> {

    @Override
    public TobjectrequiresDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TobjectrequiresDo resultTobjectrequiresDo = new TobjectrequiresDo();
        resultTobjectrequiresDo.setReqid(paramResultSet.getInt("REQID"));
        resultTobjectrequiresDo.setObjectid(paramResultSet.getInt("OBJECT_ID"));
        resultTobjectrequiresDo.setRequirement(paramResultSet.getString("REQUIREMENT"));
        resultTobjectrequiresDo.setReqtype(paramResultSet.getString("REQTYPE"));
        resultTobjectrequiresDo.setStatus(paramResultSet.getString("STATUS"));
        resultTobjectrequiresDo.setNotes(paramResultSet.getString("NOTES"));
        resultTobjectrequiresDo.setStability(paramResultSet.getString("STABILITY"));
        resultTobjectrequiresDo.setDifficulty(paramResultSet.getString("DIFFICULTY"));
        resultTobjectrequiresDo.setPriority(paramResultSet.getString("PRIORITY"));
        resultTobjectrequiresDo.setLastupdate(paramResultSet.getString("LASTUPDATE"));
        return resultTobjectrequiresDo;
    }

}

