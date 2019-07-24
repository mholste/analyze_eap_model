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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TcardinalityDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TcardinalityDo;

public class TcardinalityDaoSpringJdbcTemplatesImpl implements TcardinalityDao {

    private static Logger LOGGER = LogManager.getLogger(TcardinalityDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TcardinalityDo> readListTcardinality() throws Exception {
        List <TcardinalityDo> resultTcardinalityDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`CARDINALITY` " + 
                    "FROM " + 
                    "T_CARDINALITY";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTcardinalityDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tcardinality_objectToTcardinalityObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TcardinalityDaoSpringJdbcTemplatesImpl.readListTcardinality", e);
            throw e;
        }
        return resultTcardinalityDoList;
    }

}

class Tcardinality_objectToTcardinalityObjectDoRowMapper implements RowMapper <TcardinalityDo> {

    @Override
    public TcardinalityDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TcardinalityDo resultTcardinalityDo = new TcardinalityDo();
        resultTcardinalityDo.setCardinality(paramResultSet.getString("CARDINALITY"));
        return resultTcardinalityDo;
    }

}

