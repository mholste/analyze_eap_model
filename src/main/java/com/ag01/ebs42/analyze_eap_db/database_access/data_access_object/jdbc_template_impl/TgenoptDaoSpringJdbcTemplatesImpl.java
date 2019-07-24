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

import com.ag01.ebs42.analyze.database_access.domain_object.TgenoptDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TgenoptDao;

public class TgenoptDaoSpringJdbcTemplatesImpl implements TgenoptDao {

    private static Logger LOGGER = LogManager.getLogger(TgenoptDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TgenoptDo> readListTgenopt() throws Exception {
        List <TgenoptDo> resultTgenoptDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`APPLIESTO`, " + 
                    "`OPTION` " + 
                    "FROM " + 
                    "T_GENOPT";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTgenoptDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tgenopt_objectToTgenoptObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TgenoptDaoSpringJdbcTemplatesImpl.readListTgenopt", e);
            throw e;
        }
        return resultTgenoptDoList;
    }

}

class Tgenopt_objectToTgenoptObjectDoRowMapper implements RowMapper <TgenoptDo> {

    @Override
    public TgenoptDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TgenoptDo resultTgenoptDo = new TgenoptDo();
        resultTgenoptDo.setAppliesto(paramResultSet.getString("APPLIESTO"));
        resultTgenoptDo.setOption(paramResultSet.getString("OPTION"));
        return resultTgenoptDo;
    }

}

