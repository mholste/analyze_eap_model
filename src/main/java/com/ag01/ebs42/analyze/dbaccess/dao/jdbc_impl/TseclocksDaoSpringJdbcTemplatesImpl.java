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

import com.ag01.ebs42.analyze.dbaccess.dao.api.TseclocksDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TseclocksDo;

public class TseclocksDaoSpringJdbcTemplatesImpl implements TseclocksDao {

    private static Logger LOGGER = LogManager.getLogger(TseclocksDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TseclocksDo> readListTseclocks() throws Exception {
        List <TseclocksDo> resultTseclocksDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`USERID`, " + 
                    "`GROUPID`, " + 
                    "`ENTITYTYPE`, " + 
                    "`ENTITYID`, " + 
                    "`TIMESTAMP`, " + 
                    "`LOCKTYPE` " + 
                    "FROM " + 
                    "T_SECLOCKS";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTseclocksDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tseclocks_objectToTseclocksObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TseclocksDaoSpringJdbcTemplatesImpl.readListTseclocks", e);
            throw e;
        }
        return resultTseclocksDoList;
    }

}

class Tseclocks_objectToTseclocksObjectDoRowMapper implements RowMapper <TseclocksDo> {

    @Override
    public TseclocksDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TseclocksDo resultTseclocksDo = new TseclocksDo();
        resultTseclocksDo.setUserid(paramResultSet.getString("USERID"));
        resultTseclocksDo.setGroupid(paramResultSet.getString("GROUPID"));
        resultTseclocksDo.setEntitytype(paramResultSet.getString("ENTITYTYPE"));
        resultTseclocksDo.setEntityid(paramResultSet.getString("ENTITYID"));
        resultTseclocksDo.setTimestamp(paramResultSet.getDate("TIMESTAMP"));
        resultTseclocksDo.setLocktype(paramResultSet.getString("LOCKTYPE"));
        return resultTseclocksDo;
    }

}

