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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TocfDao;
import com.ag01.ebs42.analyze.database_access.domain_object.TocfDo;

public class TocfDaoSpringJdbcTemplatesImpl implements TocfDao {

    private static Logger LOGGER = LogManager.getLogger(TocfDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TocfDo> readListTocf() throws Exception {
        List <TocfDo> resultTocfDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`OBJECTTYPE`, " + 
                    "`COMPLEXITYWEIGHT` " + 
                    "FROM " + 
                    "T_OCF";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTocfDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tocf_objectToTocfObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TocfDaoSpringJdbcTemplatesImpl.readListTocf", e);
            throw e;
        }
        return resultTocfDoList;
    }

}

class Tocf_objectToTocfObjectDoRowMapper implements RowMapper <TocfDo> {

    @Override
    public TocfDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TocfDo resultTocfDo = new TocfDo();
        resultTocfDo.setObjecttype(paramResultSet.getString("OBJECTTYPE"));
        resultTocfDo.setComplexityweight(paramResultSet.getLong("COMPLEXITYWEIGHT"));
        return resultTocfDo;
    }

}

