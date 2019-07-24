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

import com.ag01.ebs42.analyze.database_access.domain_object.ThtmlDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.ThtmlDao;

public class ThtmlDaoSpringJdbcTemplatesImpl implements ThtmlDao {

    private static Logger LOGGER = LogManager.getLogger(ThtmlDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <ThtmlDo> readListThtml() throws Exception {
        List <ThtmlDo> resultThtmlDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`TYPE`, " + 
                    "`TEMPLATE` " + 
                    "FROM " + 
                    "T_HTML";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultThtmlDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Thtml_objectToThtmlObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in ThtmlDaoSpringJdbcTemplatesImpl.readListThtml", e);
            throw e;
        }
        return resultThtmlDoList;
    }

}

class Thtml_objectToThtmlObjectDoRowMapper implements RowMapper <ThtmlDo> {

    @Override
    public ThtmlDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        ThtmlDo resultThtmlDo = new ThtmlDo();
        resultThtmlDo.setType(paramResultSet.getString("TYPE"));
        resultThtmlDo.setTemplate(paramResultSet.getString("TEMPLATE"));
        return resultThtmlDo;
    }

}

