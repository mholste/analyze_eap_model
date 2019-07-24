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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.UsysqueriesDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.UsysqueriesDo;

public class UsysqueriesDaoSpringJdbcTemplatesImpl implements UsysqueriesDao {

    private static Logger LOGGER = LogManager.getLogger(UsysqueriesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <UsysqueriesDo> readListUsysqueries() throws Exception {
        List <UsysqueriesDo> resultUsysqueriesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`QUERYNAME`, " + 
                    "`NEWNAME`, " + 
                    "`FIXCODE` " + 
                    "FROM " + 
                    "USYSQUERIES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultUsysqueriesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Usysqueries_objectToUsysqueriesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in UsysqueriesDaoSpringJdbcTemplatesImpl.readListUsysqueries", e);
            throw e;
        }
        return resultUsysqueriesDoList;
    }

}

class Usysqueries_objectToUsysqueriesObjectDoRowMapper implements RowMapper <UsysqueriesDo> {

    @Override
    public UsysqueriesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        UsysqueriesDo resultUsysqueriesDo = new UsysqueriesDo();
        resultUsysqueriesDo.setQueryname(paramResultSet.getString("QUERYNAME"));
        resultUsysqueriesDo.setNewname(paramResultSet.getString("NEWNAME"));
        resultUsysqueriesDo.setFixcode(paramResultSet.getInt("FIXCODE"));
        return resultUsysqueriesDo;
    }

}

