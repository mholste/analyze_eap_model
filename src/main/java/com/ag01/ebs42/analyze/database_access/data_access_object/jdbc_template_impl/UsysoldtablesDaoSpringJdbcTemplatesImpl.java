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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.UsysoldtablesDao;
import com.ag01.ebs42.analyze.database_access.domain_object.UsysoldtablesDo;

public class UsysoldtablesDaoSpringJdbcTemplatesImpl implements UsysoldtablesDao {

    private static Logger LOGGER = LogManager.getLogger(UsysoldtablesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <UsysoldtablesDo> readListUsysoldtables() throws Exception {
        List <UsysoldtablesDo> resultUsysoldtablesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`TABLENAME`, " + 
                    "`NEWNAME`, " + 
                    "`RELORDER`, " + 
                    "`FIXCODE` " + 
                    "FROM " + 
                    "USYSOLDTABLES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultUsysoldtablesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Usysoldtables_objectToUsysoldtablesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in UsysoldtablesDaoSpringJdbcTemplatesImpl.readListUsysoldtables", e);
            throw e;
        }
        return resultUsysoldtablesDoList;
    }

}

class Usysoldtables_objectToUsysoldtablesObjectDoRowMapper implements RowMapper <UsysoldtablesDo> {

    @Override
    public UsysoldtablesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        UsysoldtablesDo resultUsysoldtablesDo = new UsysoldtablesDo();
        resultUsysoldtablesDo.setTablename(paramResultSet.getString("TABLENAME"));
        resultUsysoldtablesDo.setNewname(paramResultSet.getString("NEWNAME"));
        resultUsysoldtablesDo.setRelorder(paramResultSet.getInt("RELORDER"));
        resultUsysoldtablesDo.setFixcode(paramResultSet.getInt("FIXCODE"));
        return resultUsysoldtablesDo;
    }

}

