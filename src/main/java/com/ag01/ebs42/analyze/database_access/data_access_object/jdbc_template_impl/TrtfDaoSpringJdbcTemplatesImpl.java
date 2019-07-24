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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TrtfDao;
import com.ag01.ebs42.analyze.database_access.domain_object.TrtfDo;

public class TrtfDaoSpringJdbcTemplatesImpl implements TrtfDao {

    private static Logger LOGGER = LogManager.getLogger(TrtfDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TrtfDo> readListTrtf() throws Exception {
        List <TrtfDo> resultTrtfDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`TYPE`, " + 
                    "`TEMPLATE` " + 
                    "FROM " + 
                    "T_RTF";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTrtfDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Trtf_objectToTrtfObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TrtfDaoSpringJdbcTemplatesImpl.readListTrtf", e);
            throw e;
        }
        return resultTrtfDoList;
    }

}

class Trtf_objectToTrtfObjectDoRowMapper implements RowMapper <TrtfDo> {

    @Override
    public TrtfDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TrtfDo resultTrtfDo = new TrtfDo();
        resultTrtfDo.setType(paramResultSet.getString("TYPE"));
        resultTrtfDo.setTemplate(paramResultSet.getString("TEMPLATE"));
        return resultTrtfDo;
    }

}

