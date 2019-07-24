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

import com.ag01.ebs42.analyze.dbaccess.dao.api.TconstantsDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TconstantsDo;

public class TconstantsDaoSpringJdbcTemplatesImpl implements TconstantsDao {

    private static Logger LOGGER = LogManager.getLogger(TconstantsDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TconstantsDo> readListTconstants() throws Exception {
        List <TconstantsDo> resultTconstantsDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`CONSTANTNAME`, " + 
                    "`CONSTANTVALUE` " + 
                    "FROM " + 
                    "T_CONSTANTS";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTconstantsDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tconstants_objectToTconstantsObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TconstantsDaoSpringJdbcTemplatesImpl.readListTconstants", e);
            throw e;
        }
        return resultTconstantsDoList;
    }

}

class Tconstants_objectToTconstantsObjectDoRowMapper implements RowMapper <TconstantsDo> {

    @Override
    public TconstantsDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TconstantsDo resultTconstantsDo = new TconstantsDo();
        resultTconstantsDo.setConstantname(paramResultSet.getString("CONSTANTNAME"));
        resultTconstantsDo.setConstantvalue(paramResultSet.getString("CONSTANTVALUE"));
        return resultTconstantsDo;
    }

}

