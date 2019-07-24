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

import com.ag01.ebs42.analyze.dbaccess.dao.api.TmethodDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TmethodDo;

public class TmethodDaoSpringJdbcTemplatesImpl implements TmethodDao {

    private static Logger LOGGER = LogManager.getLogger(TmethodDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TmethodDo> readListTmethod() throws Exception {
        List <TmethodDo> resultTmethodDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`OBJECT_ID`, " + 
                    "`NAME`, " + 
                    "`SCOPE`, " + 
                    "`TYPE` " + 
                    "FROM " + 
                    "T_METHOD";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTmethodDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tmethod_objectToTmethodObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TmethodDaoSpringJdbcTemplatesImpl.readListTmethod", e);
            throw e;
        }
        return resultTmethodDoList;
    }

}

class Tmethod_objectToTmethodObjectDoRowMapper implements RowMapper <TmethodDo> {

    @Override
    public TmethodDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TmethodDo resultTmethodDo = new TmethodDo();
        resultTmethodDo.setObjectid(paramResultSet.getInt("OBJECT_ID"));
        resultTmethodDo.setName(paramResultSet.getString("NAME"));
        resultTmethodDo.setScope(paramResultSet.getString("SCOPE"));
        resultTmethodDo.setType(paramResultSet.getString("TYPE"));
        return resultTmethodDo;
    }

}

