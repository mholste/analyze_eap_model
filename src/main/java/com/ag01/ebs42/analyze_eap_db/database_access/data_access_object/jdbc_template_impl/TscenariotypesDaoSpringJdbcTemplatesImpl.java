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

import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TscenariotypesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TscenariotypesDo;

public class TscenariotypesDaoSpringJdbcTemplatesImpl implements TscenariotypesDao {

    private static Logger LOGGER = LogManager.getLogger(TscenariotypesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TscenariotypesDo> readListTscenariotypes() throws Exception {
        List <TscenariotypesDo> resultTscenariotypesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`SCENARIOTYPE`, " + 
                    "`DESCRIPTION`, " + 
                    "`NUMERICWEIGHT`, " + 
                    "`NOTES` " + 
                    "FROM " + 
                    "T_SCENARIOTYPES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTscenariotypesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tscenariotypes_objectToTscenariotypesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TscenariotypesDaoSpringJdbcTemplatesImpl.readListTscenariotypes", e);
            throw e;
        }
        return resultTscenariotypesDoList;
    }

}

class Tscenariotypes_objectToTscenariotypesObjectDoRowMapper implements RowMapper <TscenariotypesDo> {

    @Override
    public TscenariotypesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TscenariotypesDo resultTscenariotypesDo = new TscenariotypesDo();
        resultTscenariotypesDo.setScenariotype(paramResultSet.getString("SCENARIOTYPE"));
        resultTscenariotypesDo.setDescription(paramResultSet.getString("DESCRIPTION"));
        resultTscenariotypesDo.setNumericweight(paramResultSet.getLong("NUMERICWEIGHT"));
        resultTscenariotypesDo.setNotes(paramResultSet.getString("NOTES"));
        return resultTscenariotypesDo;
    }

}

