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

import com.ag01.ebs42.analyze.dbaccess.dao.api.TtestplansDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TtestplansDo;

public class TtestplansDaoSpringJdbcTemplatesImpl implements TtestplansDao {

    private static Logger LOGGER = LogManager.getLogger(TtestplansDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TtestplansDo> readListTtestplans() throws Exception {
        List <TtestplansDo> resultTtestplansDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`PLANID`, " + 
                    "`CATEGORY`, " + 
                    "`NAME`, " + 
                    "`AUTHOR`, " + 
                    "`NOTES`, " + 
                    "`TESTPLAN` " + 
                    "FROM " + 
                    "T_TESTPLANS";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTtestplansDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Ttestplans_objectToTtestplansObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TtestplansDaoSpringJdbcTemplatesImpl.readListTtestplans", e);
            throw e;
        }
        return resultTtestplansDoList;
    }

}

class Ttestplans_objectToTtestplansObjectDoRowMapper implements RowMapper <TtestplansDo> {

    @Override
    public TtestplansDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TtestplansDo resultTtestplansDo = new TtestplansDo();
        resultTtestplansDo.setPlanid(paramResultSet.getString("PLANID"));
        resultTtestplansDo.setCategory(paramResultSet.getString("CATEGORY"));
        resultTtestplansDo.setName(paramResultSet.getString("NAME"));
        resultTtestplansDo.setAuthor(paramResultSet.getString("AUTHOR"));
        resultTtestplansDo.setNotes(paramResultSet.getString("NOTES"));
        resultTtestplansDo.setTestplan(paramResultSet.getString("TESTPLAN"));
        return resultTtestplansDo;
    }

}

