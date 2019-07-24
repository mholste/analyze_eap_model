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

import com.ag01.ebs42.analyze.dbaccess.dao.api.TattributetagDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TattributetagDo;

public class TattributetagDaoSpringJdbcTemplatesImpl implements TattributetagDao {

    private static Logger LOGGER = LogManager.getLogger(TattributetagDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TattributetagDo> readListTattributetag() throws Exception {
        List <TattributetagDo> resultTattributetagDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`PROPERTYID`, " + 
                    "`ELEMENTID`, " + 
                    "`PROPERTY`, " + 
                    "`VALUE`, " + 
                    "`NOTES`, " + 
                    "`EA_GUID` " + 
                    "FROM " + 
                    "T_ATTRIBUTETAG";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTattributetagDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tattributetag_objectToTattributetagObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TattributetagDaoSpringJdbcTemplatesImpl.readListTattributetag", e);
            throw e;
        }
        return resultTattributetagDoList;
    }

}

class Tattributetag_objectToTattributetagObjectDoRowMapper implements RowMapper <TattributetagDo> {

    @Override
    public TattributetagDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TattributetagDo resultTattributetagDo = new TattributetagDo();
        resultTattributetagDo.setPropertyid(paramResultSet.getInt("PROPERTYID"));
        resultTattributetagDo.setElementid(paramResultSet.getInt("ELEMENTID"));
        resultTattributetagDo.setProperty(paramResultSet.getString("PROPERTY"));
        resultTattributetagDo.setValue(paramResultSet.getString("VALUE"));
        resultTattributetagDo.setNotes(paramResultSet.getString("NOTES"));
        resultTattributetagDo.setEaguid(paramResultSet.getString("EA_GUID"));
        return resultTattributetagDo;
    }

}

