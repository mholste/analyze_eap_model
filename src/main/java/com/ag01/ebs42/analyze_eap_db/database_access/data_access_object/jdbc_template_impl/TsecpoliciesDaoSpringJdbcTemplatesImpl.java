package com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.jdbc_template_impl;

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

import com.ag01.ebs42.analyze.database_access.domain_object.TsecpoliciesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TsecpoliciesDao;

public class TsecpoliciesDaoSpringJdbcTemplatesImpl implements TsecpoliciesDao {

    private static Logger LOGGER = LogManager.getLogger(TsecpoliciesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TsecpoliciesDo> readListTsecpolicies() throws Exception {
        List <TsecpoliciesDo> resultTsecpoliciesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`PROPERTY`, " + 
                    "`VALUE` " + 
                    "FROM " + 
                    "T_SECPOLICIES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTsecpoliciesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tsecpolicies_objectToTsecpoliciesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TsecpoliciesDaoSpringJdbcTemplatesImpl.readListTsecpolicies", e);
            throw e;
        }
        return resultTsecpoliciesDoList;
    }

}

class Tsecpolicies_objectToTsecpoliciesObjectDoRowMapper implements RowMapper <TsecpoliciesDo> {

    @Override
    public TsecpoliciesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TsecpoliciesDo resultTsecpoliciesDo = new TsecpoliciesDo();
        resultTsecpoliciesDo.setProperty(paramResultSet.getString("PROPERTY"));
        resultTsecpoliciesDo.setValue(paramResultSet.getString("VALUE"));
        return resultTsecpoliciesDo;
    }

}

