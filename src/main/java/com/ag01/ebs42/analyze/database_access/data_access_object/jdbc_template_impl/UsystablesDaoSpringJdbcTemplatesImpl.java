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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.UsystablesDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.UsystablesDo;

public class UsystablesDaoSpringJdbcTemplatesImpl implements UsystablesDao {

    private static Logger LOGGER = LogManager.getLogger(UsystablesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <UsystablesDo> readListUsystables() throws Exception {
        List <UsystablesDo> resultUsystablesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`TABLENAME`, " + 
                    "`RELORDER`, " + 
                    "`DISPLAYNAME`, " + 
                    "`FROMVER`, " + 
                    "`TOVER` " + 
                    "FROM " + 
                    "USYSTABLES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultUsystablesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Usystables_objectToUsystablesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in UsystablesDaoSpringJdbcTemplatesImpl.readListUsystables", e);
            throw e;
        }
        return resultUsystablesDoList;
    }

}

class Usystables_objectToUsystablesObjectDoRowMapper implements RowMapper <UsystablesDo> {

    @Override
    public UsystablesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        UsystablesDo resultUsystablesDo = new UsystablesDo();
        resultUsystablesDo.setTablename(paramResultSet.getString("TABLENAME"));
        resultUsystablesDo.setRelorder(paramResultSet.getInt("RELORDER"));
        resultUsystablesDo.setDisplayname(paramResultSet.getString("DISPLAYNAME"));
        resultUsystablesDo.setFromver(paramResultSet.getString("FROMVER"));
        resultUsystablesDo.setTover(paramResultSet.getString("TOVER"));
        return resultUsystablesDo;
    }

}

