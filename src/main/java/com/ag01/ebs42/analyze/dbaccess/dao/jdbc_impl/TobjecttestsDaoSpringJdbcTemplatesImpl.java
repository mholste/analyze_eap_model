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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TobjecttestsDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TobjecttestsDo;

public class TobjecttestsDaoSpringJdbcTemplatesImpl implements TobjecttestsDao {

    private static Logger LOGGER = LogManager.getLogger(TobjecttestsDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TobjecttestsDo> readListTobjecttests() throws Exception {
        List <TobjecttestsDo> resultTobjecttestsDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`OBJECT_ID`, " + 
                    "`TEST`, " + 
                    "`TESTCLASS`, " + 
                    "`TESTTYPE`, " + 
                    "`NOTES`, " + 
                    "`INPUTDATA`, " + 
                    "`ACCEPTANCECRITERIA`, " + 
                    "`STATUS`, " + 
                    "`DATERUN`, " + 
                    "`RESULTS`, " + 
                    "`RUNBY`, " + 
                    "`CHECKBY` " + 
                    "FROM " + 
                    "T_OBJECTTESTS";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTobjecttestsDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tobjecttests_objectToTobjecttestsObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TobjecttestsDaoSpringJdbcTemplatesImpl.readListTobjecttests", e);
            throw e;
        }
        return resultTobjecttestsDoList;
    }

}

class Tobjecttests_objectToTobjecttestsObjectDoRowMapper implements RowMapper <TobjecttestsDo> {

    @Override
    public TobjecttestsDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TobjecttestsDo resultTobjecttestsDo = new TobjecttestsDo();
        resultTobjecttestsDo.setObjectid(paramResultSet.getInt("OBJECT_ID"));
        resultTobjecttestsDo.setTest(paramResultSet.getString("TEST"));
        resultTobjecttestsDo.setTestclass(paramResultSet.getInt("TESTCLASS"));
        resultTobjecttestsDo.setTesttype(paramResultSet.getString("TESTTYPE"));
        resultTobjecttestsDo.setNotes(paramResultSet.getString("NOTES"));
        resultTobjecttestsDo.setInputdata(paramResultSet.getString("INPUTDATA"));
        resultTobjecttestsDo.setAcceptancecriteria(paramResultSet.getString("ACCEPTANCECRITERIA"));
        resultTobjecttestsDo.setStatus(paramResultSet.getString("STATUS"));
        resultTobjecttestsDo.setDaterun(paramResultSet.getDate("DATERUN"));
        resultTobjecttestsDo.setResults(paramResultSet.getString("RESULTS"));
        resultTobjecttestsDo.setRunby(paramResultSet.getString("RUNBY"));
        resultTobjecttestsDo.setCheckby(paramResultSet.getString("CHECKBY"));
        return resultTobjecttestsDo;
    }

}

