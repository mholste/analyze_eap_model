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

import com.ag01.ebs42.analyze.dbaccess.dao.api.TtasksDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TtasksDo;

public class TtasksDaoSpringJdbcTemplatesImpl implements TtasksDao {

    private static Logger LOGGER = LogManager.getLogger(TtasksDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TtasksDo> readListTtasks() throws Exception {
        List <TtasksDo> resultTtasksDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`TASKID`, " + 
                    "`NAME`, " + 
                    "`TASKTYPE`, " + 
                    "`NOTES`, " + 
                    "`PRIORITY`, " + 
                    "`STATUS`, " + 
                    "`OWNER`, " + 
                    "`STARTDATE`, " + 
                    "`ENDDATE`, " + 
                    "`PHASE`, " + 
                    "`HISTORY`, " + 
                    "`PERCENT`, " + 
                    "`TOTALTIME`, " + 
                    "`ACTUALTIME`, " + 
                    "`ASSIGNEDTO` " + 
                    "FROM " + 
                    "T_TASKS";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTtasksDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Ttasks_objectToTtasksObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TtasksDaoSpringJdbcTemplatesImpl.readListTtasks", e);
            throw e;
        }
        return resultTtasksDoList;
    }

}

class Ttasks_objectToTtasksObjectDoRowMapper implements RowMapper <TtasksDo> {

    @Override
    public TtasksDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TtasksDo resultTtasksDo = new TtasksDo();
        resultTtasksDo.setTaskid(paramResultSet.getInt("TASKID"));
        resultTtasksDo.setName(paramResultSet.getString("NAME"));
        resultTtasksDo.setTasktype(paramResultSet.getString("TASKTYPE"));
        resultTtasksDo.setNotes(paramResultSet.getString("NOTES"));
        resultTtasksDo.setPriority(paramResultSet.getString("PRIORITY"));
        resultTtasksDo.setStatus(paramResultSet.getString("STATUS"));
        resultTtasksDo.setOwner(paramResultSet.getString("OWNER"));
        resultTtasksDo.setStartdate(paramResultSet.getDate("STARTDATE"));
        resultTtasksDo.setEnddate(paramResultSet.getDate("ENDDATE"));
        resultTtasksDo.setPhase(paramResultSet.getString("PHASE"));
        resultTtasksDo.setHistory(paramResultSet.getString("HISTORY"));
        resultTtasksDo.setPercent(paramResultSet.getInt("PERCENT"));
        resultTtasksDo.setTotaltime(paramResultSet.getInt("TOTALTIME"));
        resultTtasksDo.setActualtime(paramResultSet.getInt("ACTUALTIME"));
        resultTtasksDo.setAssignedto(paramResultSet.getString("ASSIGNEDTO"));
        return resultTtasksDo;
    }

}

