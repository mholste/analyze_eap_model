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

import com.ag01.ebs42.analyze.database_access.domain_object.TmetrictypesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TmetrictypesDao;

public class TmetrictypesDaoSpringJdbcTemplatesImpl implements TmetrictypesDao {

    private static Logger LOGGER = LogManager.getLogger(TmetrictypesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TmetrictypesDo> readListTmetrictypes() throws Exception {
        List <TmetrictypesDo> resultTmetrictypesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`METRIC`, " + 
                    "`DESCRIPTION`, " + 
                    "`NUMERICWEIGHT`, " + 
                    "`NOTES` " + 
                    "FROM " + 
                    "T_METRICTYPES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTmetrictypesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tmetrictypes_objectToTmetrictypesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TmetrictypesDaoSpringJdbcTemplatesImpl.readListTmetrictypes", e);
            throw e;
        }
        return resultTmetrictypesDoList;
    }

}

class Tmetrictypes_objectToTmetrictypesObjectDoRowMapper implements RowMapper <TmetrictypesDo> {

    @Override
    public TmetrictypesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TmetrictypesDo resultTmetrictypesDo = new TmetrictypesDo();
        resultTmetrictypesDo.setMetric(paramResultSet.getString("METRIC"));
        resultTmetrictypesDo.setDescription(paramResultSet.getString("DESCRIPTION"));
        resultTmetrictypesDo.setNumericweight(paramResultSet.getLong("NUMERICWEIGHT"));
        resultTmetrictypesDo.setNotes(paramResultSet.getString("NOTES"));
        return resultTmetrictypesDo;
    }

}

