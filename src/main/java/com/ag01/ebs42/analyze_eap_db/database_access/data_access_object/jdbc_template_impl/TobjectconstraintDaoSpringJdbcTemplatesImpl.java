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

import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TobjectconstraintDao;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TobjectconstraintDo;

public class TobjectconstraintDaoSpringJdbcTemplatesImpl implements TobjectconstraintDao {

    private static Logger LOGGER = LogManager.getLogger(TobjectconstraintDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TobjectconstraintDo> readListTobjectconstraint() throws Exception {
        List <TobjectconstraintDo> resultTobjectconstraintDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`OBJECT_ID`, " + 
                    "`CONSTRAINT`, " + 
                    "`CONSTRAINTTYPE`, " + 
                    "`WEIGHT`, " + 
                    "`NOTES`, " + 
                    "`STATUS` " + 
                    "FROM " + 
                    "T_OBJECTCONSTRAINT";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTobjectconstraintDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tobjectconstraint_objectToTobjectconstraintObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TobjectconstraintDaoSpringJdbcTemplatesImpl.readListTobjectconstraint", e);
            throw e;
        }
        return resultTobjectconstraintDoList;
    }

}

class Tobjectconstraint_objectToTobjectconstraintObjectDoRowMapper implements RowMapper <TobjectconstraintDo> {

    @Override
    public TobjectconstraintDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TobjectconstraintDo resultTobjectconstraintDo = new TobjectconstraintDo();
        resultTobjectconstraintDo.setObjectid(paramResultSet.getInt("OBJECT_ID"));
        resultTobjectconstraintDo.setConstraint(paramResultSet.getString("CONSTRAINT"));
        resultTobjectconstraintDo.setConstrainttype(paramResultSet.getString("CONSTRAINTTYPE"));
        resultTobjectconstraintDo.setWeight(paramResultSet.getLong("WEIGHT"));
        resultTobjectconstraintDo.setNotes(paramResultSet.getString("NOTES"));
        resultTobjectconstraintDo.setStatus(paramResultSet.getString("STATUS"));
        return resultTobjectconstraintDo;
    }

}

