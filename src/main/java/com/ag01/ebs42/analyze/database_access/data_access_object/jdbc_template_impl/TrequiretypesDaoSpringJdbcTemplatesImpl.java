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

import com.ag01.ebs42.analyze.database_access.domain_object.TrequiretypesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TrequiretypesDao;

public class TrequiretypesDaoSpringJdbcTemplatesImpl implements TrequiretypesDao {

    private static Logger LOGGER = LogManager.getLogger(TrequiretypesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TrequiretypesDo> readListTrequiretypes() throws Exception {
        List <TrequiretypesDo> resultTrequiretypesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`REQUIREMENT`, " + 
                    "`DESCRIPTION`, " + 
                    "`NUMERICWEIGHT`, " + 
                    "`NOTES` " + 
                    "FROM " + 
                    "T_REQUIRETYPES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTrequiretypesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Trequiretypes_objectToTrequiretypesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TrequiretypesDaoSpringJdbcTemplatesImpl.readListTrequiretypes", e);
            throw e;
        }
        return resultTrequiretypesDoList;
    }

}

class Trequiretypes_objectToTrequiretypesObjectDoRowMapper implements RowMapper <TrequiretypesDo> {

    @Override
    public TrequiretypesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TrequiretypesDo resultTrequiretypesDo = new TrequiretypesDo();
        resultTrequiretypesDo.setRequirement(paramResultSet.getString("REQUIREMENT"));
        resultTrequiretypesDo.setDescription(paramResultSet.getString("DESCRIPTION"));
        resultTrequiretypesDo.setNumericweight(paramResultSet.getLong("NUMERICWEIGHT"));
        resultTrequiretypesDo.setNotes(paramResultSet.getString("NOTES"));
        return resultTrequiretypesDo;
    }

}

