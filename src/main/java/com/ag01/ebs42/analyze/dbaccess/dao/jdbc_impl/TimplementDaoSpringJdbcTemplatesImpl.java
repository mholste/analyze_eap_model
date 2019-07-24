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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TimplementDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TimplementDo;

public class TimplementDaoSpringJdbcTemplatesImpl implements TimplementDao {

    private static Logger LOGGER = LogManager.getLogger(TimplementDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TimplementDo> readListTimplement() throws Exception {
        List <TimplementDo> resultTimplementDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`TYPE` " + 
                    "FROM " + 
                    "T_IMPLEMENT";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTimplementDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Timplement_objectToTimplementObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TimplementDaoSpringJdbcTemplatesImpl.readListTimplement", e);
            throw e;
        }
        return resultTimplementDoList;
    }

}

class Timplement_objectToTimplementObjectDoRowMapper implements RowMapper <TimplementDo> {

    @Override
    public TimplementDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TimplementDo resultTimplementDo = new TimplementDo();
        resultTimplementDo.setType(paramResultSet.getString("TYPE"));
        return resultTimplementDo;
    }

}

