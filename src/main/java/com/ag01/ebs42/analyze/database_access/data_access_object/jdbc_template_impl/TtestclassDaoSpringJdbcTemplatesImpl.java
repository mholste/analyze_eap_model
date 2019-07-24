package com.ag01.ebs42.analyze.database_access.data_access_object.jdbc_template_impl;

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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TtestclassDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TtestclassDo;

public class TtestclassDaoSpringJdbcTemplatesImpl implements TtestclassDao {

    private static Logger LOGGER = LogManager.getLogger(TtestclassDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TtestclassDo> readListTtestclass() throws Exception {
        List <TtestclassDo> resultTtestclassDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`TESTCLASS`, " + 
                    "`DESCRIPTION` " + 
                    "FROM " + 
                    "T_TESTCLASS";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTtestclassDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Ttestclass_objectToTtestclassObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TtestclassDaoSpringJdbcTemplatesImpl.readListTtestclass", e);
            throw e;
        }
        return resultTtestclassDoList;
    }

}

class Ttestclass_objectToTtestclassObjectDoRowMapper implements RowMapper <TtestclassDo> {

    @Override
    public TtestclassDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TtestclassDo resultTtestclassDo = new TtestclassDo();
        resultTtestclassDo.setTestclass(paramResultSet.getString("TESTCLASS"));
        resultTtestclassDo.setDescription(paramResultSet.getString("DESCRIPTION"));
        return resultTtestclassDo;
    }

}

