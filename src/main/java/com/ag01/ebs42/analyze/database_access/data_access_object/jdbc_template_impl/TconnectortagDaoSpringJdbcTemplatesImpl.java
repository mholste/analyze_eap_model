package com.ag01.ebs42.analyze.database_access.data_access_object.jdbc_template_impl;

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

import com.ag01.ebs42.analyze.database_access.domain_object.TconnectortagDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TconnectortagDao;

public class TconnectortagDaoSpringJdbcTemplatesImpl implements TconnectortagDao {

    private static Logger LOGGER = LogManager.getLogger(TconnectortagDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TconnectortagDo> readListTconnectortag() throws Exception {
        List <TconnectortagDo> resultTconnectortagDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`PROPERTYID`, " + 
                    "`ELEMENTID`, " + 
                    "`PROPERTY`, " + 
                    "`VALUE`, " + 
                    "`NOTES`, " + 
                    "`EA_GUID` " + 
                    "FROM " + 
                    "T_CONNECTORTAG";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTconnectortagDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tconnectortag_objectToTconnectortagObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TconnectortagDaoSpringJdbcTemplatesImpl.readListTconnectortag", e);
            throw e;
        }
        return resultTconnectortagDoList;
    }

}

class Tconnectortag_objectToTconnectortagObjectDoRowMapper implements RowMapper <TconnectortagDo> {

    @Override
    public TconnectortagDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TconnectortagDo resultTconnectortagDo = new TconnectortagDo();
        resultTconnectortagDo.setPropertyid(paramResultSet.getInt("PROPERTYID"));
        resultTconnectortagDo.setElementid(paramResultSet.getInt("ELEMENTID"));
        resultTconnectortagDo.setProperty(paramResultSet.getString("PROPERTY"));
        resultTconnectortagDo.setValue(paramResultSet.getString("VALUE"));
        resultTconnectortagDo.setNotes(paramResultSet.getString("NOTES"));
        resultTconnectortagDo.setEaguid(paramResultSet.getString("EA_GUID"));
        return resultTconnectortagDo;
    }

}

