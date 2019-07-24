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

import com.ag01.ebs42.analyze.dbaccess.dao.api.TobjectproblemsDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TobjectproblemsDo;

public class TobjectproblemsDaoSpringJdbcTemplatesImpl implements TobjectproblemsDao {

    private static Logger LOGGER = LogManager.getLogger(TobjectproblemsDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TobjectproblemsDo> readListTobjectproblems() throws Exception {
        List <TobjectproblemsDo> resultTobjectproblemsDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`OBJECT_ID`, " + 
                    "`PROBLEM`, " + 
                    "`PROBLEMTYPE`, " + 
                    "`DATEREPORTED`, " + 
                    "`STATUS`, " + 
                    "`PROBLEMNOTES`, " + 
                    "`REPORTEDBY`, " + 
                    "`RESOLVEDBY`, " + 
                    "`DATERESOLVED`, " + 
                    "`VERSION`, " + 
                    "`RESOLVERNOTES`, " + 
                    "`PRIORITY`, " + 
                    "`SEVERITY` " + 
                    "FROM " + 
                    "T_OBJECTPROBLEMS";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTobjectproblemsDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tobjectproblems_objectToTobjectproblemsObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TobjectproblemsDaoSpringJdbcTemplatesImpl.readListTobjectproblems", e);
            throw e;
        }
        return resultTobjectproblemsDoList;
    }

}

class Tobjectproblems_objectToTobjectproblemsObjectDoRowMapper implements RowMapper <TobjectproblemsDo> {

    @Override
    public TobjectproblemsDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TobjectproblemsDo resultTobjectproblemsDo = new TobjectproblemsDo();
        resultTobjectproblemsDo.setObjectid(paramResultSet.getInt("OBJECT_ID"));
        resultTobjectproblemsDo.setProblem(paramResultSet.getString("PROBLEM"));
        resultTobjectproblemsDo.setProblemtype(paramResultSet.getString("PROBLEMTYPE"));
        resultTobjectproblemsDo.setDatereported(paramResultSet.getDate("DATEREPORTED"));
        resultTobjectproblemsDo.setStatus(paramResultSet.getString("STATUS"));
        resultTobjectproblemsDo.setProblemnotes(paramResultSet.getString("PROBLEMNOTES"));
        resultTobjectproblemsDo.setReportedby(paramResultSet.getString("REPORTEDBY"));
        resultTobjectproblemsDo.setResolvedby(paramResultSet.getString("RESOLVEDBY"));
        resultTobjectproblemsDo.setDateresolved(paramResultSet.getDate("DATERESOLVED"));
        resultTobjectproblemsDo.setVersion(paramResultSet.getString("VERSION"));
        resultTobjectproblemsDo.setResolvernotes(paramResultSet.getString("RESOLVERNOTES"));
        resultTobjectproblemsDo.setPriority(paramResultSet.getString("PRIORITY"));
        resultTobjectproblemsDo.setSeverity(paramResultSet.getString("SEVERITY"));
        return resultTobjectproblemsDo;
    }

}

