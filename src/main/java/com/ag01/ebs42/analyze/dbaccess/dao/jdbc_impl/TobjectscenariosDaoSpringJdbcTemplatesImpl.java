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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TobjectscenariosDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TobjectscenariosDo;

public class TobjectscenariosDaoSpringJdbcTemplatesImpl implements TobjectscenariosDao {

    private static Logger LOGGER = LogManager.getLogger(TobjectscenariosDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TobjectscenariosDo> readListTobjectscenarios() throws Exception {
        List <TobjectscenariosDo> resultTobjectscenariosDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`OBJECT_ID`, " + 
                    "`SCENARIO`, " + 
                    "`SCENARIOTYPE`, " + 
                    "`EVALUE`, " + 
                    "`NOTES`, " + 
                    "`EA_GUID`, " + 
                    "`XMLCONTENT` " + 
                    "FROM " + 
                    "T_OBJECTSCENARIOS";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTobjectscenariosDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tobjectscenarios_objectToTobjectscenariosObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TobjectscenariosDaoSpringJdbcTemplatesImpl.readListTobjectscenarios", e);
            throw e;
        }
        return resultTobjectscenariosDoList;
    }

}

class Tobjectscenarios_objectToTobjectscenariosObjectDoRowMapper implements RowMapper <TobjectscenariosDo> {

    @Override
    public TobjectscenariosDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TobjectscenariosDo resultTobjectscenariosDo = new TobjectscenariosDo();
        resultTobjectscenariosDo.setObjectid(paramResultSet.getInt("OBJECT_ID"));
        resultTobjectscenariosDo.setScenario(paramResultSet.getString("SCENARIO"));
        resultTobjectscenariosDo.setScenariotype(paramResultSet.getString("SCENARIOTYPE"));
        resultTobjectscenariosDo.setEvalue(paramResultSet.getLong("EVALUE"));
        resultTobjectscenariosDo.setNotes(paramResultSet.getString("NOTES"));
        resultTobjectscenariosDo.setEaguid(paramResultSet.getString("EA_GUID"));
        resultTobjectscenariosDo.setXmlcontent(paramResultSet.getString("XMLCONTENT"));
        return resultTobjectscenariosDo;
    }

}

