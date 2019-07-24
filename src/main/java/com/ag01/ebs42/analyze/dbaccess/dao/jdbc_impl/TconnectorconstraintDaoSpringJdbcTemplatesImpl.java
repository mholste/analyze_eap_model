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

import com.ag01.ebs42.analyze.dbaccess.dao.api.TconnectorconstraintDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TconnectorconstraintDo;

public class TconnectorconstraintDaoSpringJdbcTemplatesImpl implements TconnectorconstraintDao {

    private static Logger LOGGER = LogManager.getLogger(TconnectorconstraintDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TconnectorconstraintDo> readListTconnectorconstraint() throws Exception {
        List <TconnectorconstraintDo> resultTconnectorconstraintDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`CONNECTORID`, " + 
                    "`CONSTRAINT`, " + 
                    "`CONSTRAINTTYPE`, " + 
                    "`NOTES` " + 
                    "FROM " + 
                    "T_CONNECTORCONSTRAINT";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTconnectorconstraintDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tconnectorconstraint_objectToTconnectorconstraintObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TconnectorconstraintDaoSpringJdbcTemplatesImpl.readListTconnectorconstraint", e);
            throw e;
        }
        return resultTconnectorconstraintDoList;
    }

}

class Tconnectorconstraint_objectToTconnectorconstraintObjectDoRowMapper implements RowMapper <TconnectorconstraintDo> {

    @Override
    public TconnectorconstraintDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TconnectorconstraintDo resultTconnectorconstraintDo = new TconnectorconstraintDo();
        resultTconnectorconstraintDo.setConnectorid(paramResultSet.getInt("CONNECTORID"));
        resultTconnectorconstraintDo.setConstraint(paramResultSet.getString("CONSTRAINT"));
        resultTconnectorconstraintDo.setConstrainttype(paramResultSet.getString("CONSTRAINTTYPE"));
        resultTconnectorconstraintDo.setNotes(paramResultSet.getString("NOTES"));
        return resultTconnectorconstraintDo;
    }

}

