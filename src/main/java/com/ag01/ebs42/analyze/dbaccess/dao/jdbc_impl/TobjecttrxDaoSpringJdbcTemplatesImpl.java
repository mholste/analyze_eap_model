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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TobjecttrxDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TobjecttrxDo;

public class TobjecttrxDaoSpringJdbcTemplatesImpl implements TobjecttrxDao {

    private static Logger LOGGER = LogManager.getLogger(TobjecttrxDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TobjecttrxDo> readListTobjecttrx() throws Exception {
        List <TobjecttrxDo> resultTobjecttrxDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`OBJECT_ID`, " + 
                    "`TRX`, " + 
                    "`TRXTYPE`, " + 
                    "`WEIGHT`, " + 
                    "`NOTES` " + 
                    "FROM " + 
                    "T_OBJECTTRX";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTobjecttrxDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tobjecttrx_objectToTobjecttrxObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TobjecttrxDaoSpringJdbcTemplatesImpl.readListTobjecttrx", e);
            throw e;
        }
        return resultTobjecttrxDoList;
    }

}

class Tobjecttrx_objectToTobjecttrxObjectDoRowMapper implements RowMapper <TobjecttrxDo> {

    @Override
    public TobjecttrxDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TobjecttrxDo resultTobjecttrxDo = new TobjecttrxDo();
        resultTobjecttrxDo.setObjectid(paramResultSet.getInt("OBJECT_ID"));
        resultTobjecttrxDo.setTrx(paramResultSet.getString("TRX"));
        resultTobjecttrxDo.setTrxtype(paramResultSet.getString("TRXTYPE"));
        resultTobjecttrxDo.setWeight(paramResultSet.getLong("WEIGHT"));
        resultTobjecttrxDo.setNotes(paramResultSet.getString("NOTES"));
        return resultTobjecttrxDo;
    }

}

