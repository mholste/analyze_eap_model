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

import com.ag01.ebs42.analyze.dbaccess.dao.api.UsyssystemDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.UsyssystemDo;

public class UsyssystemDaoSpringJdbcTemplatesImpl implements UsyssystemDao {

    private static Logger LOGGER = LogManager.getLogger(UsyssystemDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <UsyssystemDo> readListUsyssystem() throws Exception {
        List <UsyssystemDo> resultUsyssystemDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`PROPERTY`, " + 
                    "`VALUE` " + 
                    "FROM " + 
                    "USYS_SYSTEM";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultUsyssystemDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Usyssystem_objectToUsyssystemObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in UsyssystemDaoSpringJdbcTemplatesImpl.readListUsyssystem", e);
            throw e;
        }
        return resultUsyssystemDoList;
    }

}

class Usyssystem_objectToUsyssystemObjectDoRowMapper implements RowMapper <UsyssystemDo> {

    @Override
    public UsyssystemDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        UsyssystemDo resultUsyssystemDo = new UsyssystemDo();
        resultUsyssystemDo.setProperty(paramResultSet.getString("PROPERTY"));
        resultUsyssystemDo.setValue(paramResultSet.getString("VALUE"));
        return resultUsyssystemDo;
    }

}

