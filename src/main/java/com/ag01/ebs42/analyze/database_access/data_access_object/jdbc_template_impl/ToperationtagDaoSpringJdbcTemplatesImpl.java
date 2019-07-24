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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.ToperationtagDao;
import com.ag01.ebs42.analyze.database_access.domain_object.ToperationtagDo;

public class ToperationtagDaoSpringJdbcTemplatesImpl implements ToperationtagDao {

    private static Logger LOGGER = LogManager.getLogger(ToperationtagDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <ToperationtagDo> readListToperationtag() throws Exception {
        List <ToperationtagDo> resultToperationtagDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`PROPERTYID`, " + 
                    "`ELEMENTID`, " + 
                    "`PROPERTY`, " + 
                    "`VALUE`, " + 
                    "`NOTES`, " + 
                    "`EA_GUID` " + 
                    "FROM " + 
                    "T_OPERATIONTAG";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultToperationtagDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Toperationtag_objectToToperationtagObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in ToperationtagDaoSpringJdbcTemplatesImpl.readListToperationtag", e);
            throw e;
        }
        return resultToperationtagDoList;
    }

}

class Toperationtag_objectToToperationtagObjectDoRowMapper implements RowMapper <ToperationtagDo> {

    @Override
    public ToperationtagDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        ToperationtagDo resultToperationtagDo = new ToperationtagDo();
        resultToperationtagDo.setPropertyid(paramResultSet.getInt("PROPERTYID"));
        resultToperationtagDo.setElementid(paramResultSet.getInt("ELEMENTID"));
        resultToperationtagDo.setProperty(paramResultSet.getString("PROPERTY"));
        resultToperationtagDo.setValue(paramResultSet.getString("VALUE"));
        resultToperationtagDo.setNotes(paramResultSet.getString("NOTES"));
        resultToperationtagDo.setEaguid(paramResultSet.getString("EA_GUID"));
        return resultToperationtagDo;
    }

}

