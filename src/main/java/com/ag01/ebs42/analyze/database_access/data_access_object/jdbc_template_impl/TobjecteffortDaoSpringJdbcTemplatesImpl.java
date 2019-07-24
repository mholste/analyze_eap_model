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

import com.ag01.ebs42.analyze.database_access.domain_object.TobjecteffortDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TobjecteffortDao;

public class TobjecteffortDaoSpringJdbcTemplatesImpl implements TobjecteffortDao {

    private static Logger LOGGER = LogManager.getLogger(TobjecteffortDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TobjecteffortDo> readListTobjecteffort() throws Exception {
        List <TobjecteffortDo> resultTobjecteffortDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`OBJECT_ID`, " + 
                    "`EFFORT`, " + 
                    "`EFFORTTYPE`, " + 
                    "`EVALUE`, " + 
                    "`NOTES` " + 
                    "FROM " + 
                    "T_OBJECTEFFORT";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTobjecteffortDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tobjecteffort_objectToTobjecteffortObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TobjecteffortDaoSpringJdbcTemplatesImpl.readListTobjecteffort", e);
            throw e;
        }
        return resultTobjecteffortDoList;
    }

}

class Tobjecteffort_objectToTobjecteffortObjectDoRowMapper implements RowMapper <TobjecteffortDo> {

    @Override
    public TobjecteffortDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TobjecteffortDo resultTobjecteffortDo = new TobjecteffortDo();
        resultTobjecteffortDo.setObjectid(paramResultSet.getInt("OBJECT_ID"));
        resultTobjecteffortDo.setEffort(paramResultSet.getString("EFFORT"));
        resultTobjecteffortDo.setEfforttype(paramResultSet.getString("EFFORTTYPE"));
        resultTobjecteffortDo.setEvalue(paramResultSet.getLong("EVALUE"));
        resultTobjecteffortDo.setNotes(paramResultSet.getString("NOTES"));
        return resultTobjecteffortDo;
    }

}

