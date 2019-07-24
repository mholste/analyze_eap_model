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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TscriptDao;
import com.ag01.ebs42.analyze.database_access.domain_object.TscriptDo;

public class TscriptDaoSpringJdbcTemplatesImpl implements TscriptDao {

    private static Logger LOGGER = LogManager.getLogger(TscriptDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TscriptDo> readListTscript() throws Exception {
        List <TscriptDo> resultTscriptDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`SCRIPTID`, " + 
                    "`SCRIPTCATEGORY`, " + 
                    "`SCRIPTNAME`, " + 
                    "`SCRIPTAUTHOR`, " + 
                    "`NOTES`, " + 
                    "`SCRIPT` " + 
                    "FROM " + 
                    "T_SCRIPT";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTscriptDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tscript_objectToTscriptObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TscriptDaoSpringJdbcTemplatesImpl.readListTscript", e);
            throw e;
        }
        return resultTscriptDoList;
    }

}

class Tscript_objectToTscriptObjectDoRowMapper implements RowMapper <TscriptDo> {

    @Override
    public TscriptDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TscriptDo resultTscriptDo = new TscriptDo();
        resultTscriptDo.setScriptid(paramResultSet.getInt("SCRIPTID"));
        resultTscriptDo.setScriptcategory(paramResultSet.getString("SCRIPTCATEGORY"));
        resultTscriptDo.setScriptname(paramResultSet.getString("SCRIPTNAME"));
        resultTscriptDo.setScriptauthor(paramResultSet.getString("SCRIPTAUTHOR"));
        resultTscriptDo.setNotes(paramResultSet.getString("NOTES"));
        resultTscriptDo.setScript(paramResultSet.getString("SCRIPT"));
        return resultTscriptDo;
    }

}

