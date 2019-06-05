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

import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TobjectpropertiesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TobjectpropertiesDo;

public class TobjectpropertiesDaoSpringJdbcTemplatesImpl implements TobjectpropertiesDao {

    private static Logger LOGGER = LogManager.getLogger(TobjectpropertiesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TobjectpropertiesDo> readListTobjectproperties() throws Exception {
        List <TobjectpropertiesDo> resultTobjectpropertiesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`PROPERTYID`, " + 
                    "`OBJECT_ID`, " + 
                    "`PROPERTY`, " + 
                    "`VALUE`, " + 
                    "`NOTES`, " + 
                    "`EA_GUID` " + 
                    "FROM " + 
                    "T_OBJECTPROPERTIES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTobjectpropertiesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tobjectproperties_objectToTobjectpropertiesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TobjectpropertiesDaoSpringJdbcTemplatesImpl.readListTobjectproperties", e);
            throw e;
        }
        return resultTobjectpropertiesDoList;
    }

}

class Tobjectproperties_objectToTobjectpropertiesObjectDoRowMapper implements RowMapper <TobjectpropertiesDo> {

    @Override
    public TobjectpropertiesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TobjectpropertiesDo resultTobjectpropertiesDo = new TobjectpropertiesDo();
        resultTobjectpropertiesDo.setPropertyid(paramResultSet.getInt("PROPERTYID"));
        resultTobjectpropertiesDo.setObjectid(paramResultSet.getInt("OBJECT_ID"));
        resultTobjectpropertiesDo.setProperty(paramResultSet.getString("PROPERTY"));
        resultTobjectpropertiesDo.setValue(paramResultSet.getString("VALUE"));
        resultTobjectpropertiesDo.setNotes(paramResultSet.getString("NOTES"));
        resultTobjectpropertiesDo.setEaguid(paramResultSet.getString("EA_GUID"));
        return resultTobjectpropertiesDo;
    }

}

