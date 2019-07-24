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

import com.ag01.ebs42.analyze.database_access.domain_object.TobjectrisksDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TobjectrisksDao;

public class TobjectrisksDaoSpringJdbcTemplatesImpl implements TobjectrisksDao {

    private static Logger LOGGER = LogManager.getLogger(TobjectrisksDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TobjectrisksDo> readListTobjectrisks() throws Exception {
        List <TobjectrisksDo> resultTobjectrisksDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`OBJECT_ID`, " + 
                    "`RISK`, " + 
                    "`RISKTYPE`, " + 
                    "`EVALUE`, " + 
                    "`NOTES` " + 
                    "FROM " + 
                    "T_OBJECTRISKS";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTobjectrisksDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tobjectrisks_objectToTobjectrisksObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TobjectrisksDaoSpringJdbcTemplatesImpl.readListTobjectrisks", e);
            throw e;
        }
        return resultTobjectrisksDoList;
    }

}

class Tobjectrisks_objectToTobjectrisksObjectDoRowMapper implements RowMapper <TobjectrisksDo> {

    @Override
    public TobjectrisksDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TobjectrisksDo resultTobjectrisksDo = new TobjectrisksDo();
        resultTobjectrisksDo.setObjectid(paramResultSet.getInt("OBJECT_ID"));
        resultTobjectrisksDo.setRisk(paramResultSet.getString("RISK"));
        resultTobjectrisksDo.setRisktype(paramResultSet.getString("RISKTYPE"));
        resultTobjectrisksDo.setEvalue(paramResultSet.getLong("EVALUE"));
        resultTobjectrisksDo.setNotes(paramResultSet.getString("NOTES"));
        return resultTobjectrisksDo;
    }

}

