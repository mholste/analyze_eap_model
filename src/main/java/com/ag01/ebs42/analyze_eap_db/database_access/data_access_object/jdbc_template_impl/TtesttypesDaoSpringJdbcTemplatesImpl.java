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

import com.ag01.ebs42.analyze.database_access.domain_object.TtesttypesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TtesttypesDao;

public class TtesttypesDaoSpringJdbcTemplatesImpl implements TtesttypesDao {

    private static Logger LOGGER = LogManager.getLogger(TtesttypesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TtesttypesDo> readListTtesttypes() throws Exception {
        List <TtesttypesDo> resultTtesttypesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`TESTTYPE`, " + 
                    "`DESCRIPTION`, " + 
                    "`NUMERICWEIGHT`, " + 
                    "`NOTES` " + 
                    "FROM " + 
                    "T_TESTTYPES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTtesttypesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Ttesttypes_objectToTtesttypesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TtesttypesDaoSpringJdbcTemplatesImpl.readListTtesttypes", e);
            throw e;
        }
        return resultTtesttypesDoList;
    }

}

class Ttesttypes_objectToTtesttypesObjectDoRowMapper implements RowMapper <TtesttypesDo> {

    @Override
    public TtesttypesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TtesttypesDo resultTtesttypesDo = new TtesttypesDo();
        resultTtesttypesDo.setTesttype(paramResultSet.getString("TESTTYPE"));
        resultTtesttypesDo.setDescription(paramResultSet.getString("DESCRIPTION"));
        resultTtesttypesDo.setNumericweight(paramResultSet.getLong("NUMERICWEIGHT"));
        resultTtesttypesDo.setNotes(paramResultSet.getString("NOTES"));
        return resultTtesttypesDo;
    }

}

