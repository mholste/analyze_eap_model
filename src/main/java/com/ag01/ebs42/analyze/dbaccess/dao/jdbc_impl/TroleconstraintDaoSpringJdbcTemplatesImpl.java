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

import com.ag01.ebs42.analyze.dbaccess.dao.api.TroleconstraintDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TroleconstraintDo;

public class TroleconstraintDaoSpringJdbcTemplatesImpl implements TroleconstraintDao {

    private static Logger LOGGER = LogManager.getLogger(TroleconstraintDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TroleconstraintDo> readListTroleconstraint() throws Exception {
        List <TroleconstraintDo> resultTroleconstraintDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`CONNECTORID`, " + 
                    "`CONSTRAINT`, " + 
                    "`CONNECTOREND`, " + 
                    "`CONSTRAINTTYPE`, " + 
                    "`NOTES` " + 
                    "FROM " + 
                    "T_ROLECONSTRAINT";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTroleconstraintDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Troleconstraint_objectToTroleconstraintObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TroleconstraintDaoSpringJdbcTemplatesImpl.readListTroleconstraint", e);
            throw e;
        }
        return resultTroleconstraintDoList;
    }

}

class Troleconstraint_objectToTroleconstraintObjectDoRowMapper implements RowMapper <TroleconstraintDo> {

    @Override
    public TroleconstraintDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TroleconstraintDo resultTroleconstraintDo = new TroleconstraintDo();
        resultTroleconstraintDo.setConnectorid(paramResultSet.getInt("CONNECTORID"));
        resultTroleconstraintDo.setConstraint(paramResultSet.getString("CONSTRAINT"));
        resultTroleconstraintDo.setConnectorend(paramResultSet.getString("CONNECTOREND"));
        resultTroleconstraintDo.setConstrainttype(paramResultSet.getString("CONSTRAINTTYPE"));
        resultTroleconstraintDo.setNotes(paramResultSet.getString("NOTES"));
        return resultTroleconstraintDo;
    }

}

