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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TrulesDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TrulesDo;

public class TrulesDaoSpringJdbcTemplatesImpl implements TrulesDao {

    private static Logger LOGGER = LogManager.getLogger(TrulesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TrulesDo> readListTrules() throws Exception {
        List <TrulesDo> resultTrulesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`RULEID`, " + 
                    "`RULENAME`, " + 
                    "`RULETYPE`, " + 
                    "`RULEACTIVE`, " + 
                    "`ERRORMSG`, " + 
                    "`FLAGS`, " + 
                    "`RULEOCL`, " + 
                    "`RULEXML`, " + 
                    "`NOTES` " + 
                    "FROM " + 
                    "T_RULES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTrulesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Trules_objectToTrulesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TrulesDaoSpringJdbcTemplatesImpl.readListTrules", e);
            throw e;
        }
        return resultTrulesDoList;
    }

}

class Trules_objectToTrulesObjectDoRowMapper implements RowMapper <TrulesDo> {

    @Override
    public TrulesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TrulesDo resultTrulesDo = new TrulesDo();
        resultTrulesDo.setRuleid(paramResultSet.getString("RULEID"));
        resultTrulesDo.setRulename(paramResultSet.getString("RULENAME"));
        resultTrulesDo.setRuletype(paramResultSet.getString("RULETYPE"));
        resultTrulesDo.setRuleactive(paramResultSet.getInt("RULEACTIVE"));
        resultTrulesDo.setErrormsg(paramResultSet.getString("ERRORMSG"));
        resultTrulesDo.setFlags(paramResultSet.getString("FLAGS"));
        resultTrulesDo.setRuleocl(paramResultSet.getString("RULEOCL"));
        resultTrulesDo.setRulexml(paramResultSet.getString("RULEXML"));
        resultTrulesDo.setNotes(paramResultSet.getString("NOTES"));
        return resultTrulesDo;
    }

}

