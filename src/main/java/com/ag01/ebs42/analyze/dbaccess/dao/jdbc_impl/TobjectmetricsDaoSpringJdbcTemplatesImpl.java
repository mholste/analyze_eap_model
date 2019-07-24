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

import com.ag01.ebs42.analyze.dbaccess.dao.api.TobjectmetricsDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TobjectmetricsDo;

public class TobjectmetricsDaoSpringJdbcTemplatesImpl implements TobjectmetricsDao {

    private static Logger LOGGER = LogManager.getLogger(TobjectmetricsDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TobjectmetricsDo> readListTobjectmetrics() throws Exception {
        List <TobjectmetricsDo> resultTobjectmetricsDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`OBJECT_ID`, " + 
                    "`METRIC`, " + 
                    "`METRICTYPE`, " + 
                    "`EVALUE`, " + 
                    "`NOTES` " + 
                    "FROM " + 
                    "T_OBJECTMETRICS";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTobjectmetricsDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tobjectmetrics_objectToTobjectmetricsObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TobjectmetricsDaoSpringJdbcTemplatesImpl.readListTobjectmetrics", e);
            throw e;
        }
        return resultTobjectmetricsDoList;
    }

}

class Tobjectmetrics_objectToTobjectmetricsObjectDoRowMapper implements RowMapper <TobjectmetricsDo> {

    @Override
    public TobjectmetricsDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TobjectmetricsDo resultTobjectmetricsDo = new TobjectmetricsDo();
        resultTobjectmetricsDo.setObjectid(paramResultSet.getInt("OBJECT_ID"));
        resultTobjectmetricsDo.setMetric(paramResultSet.getString("METRIC"));
        resultTobjectmetricsDo.setMetrictype(paramResultSet.getString("METRICTYPE"));
        resultTobjectmetricsDo.setEvalue(paramResultSet.getLong("EVALUE"));
        resultTobjectmetricsDo.setNotes(paramResultSet.getString("NOTES"));
        return resultTobjectmetricsDo;
    }

}

