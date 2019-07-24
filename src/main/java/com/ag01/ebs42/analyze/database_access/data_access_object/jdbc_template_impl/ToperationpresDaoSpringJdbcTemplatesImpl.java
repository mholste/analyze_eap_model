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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.ToperationpresDao;
import com.ag01.ebs42.analyze.database_access.domain_object.ToperationpresDo;

public class ToperationpresDaoSpringJdbcTemplatesImpl implements ToperationpresDao {

    private static Logger LOGGER = LogManager.getLogger(ToperationpresDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <ToperationpresDo> readListToperationpres() throws Exception {
        List <ToperationpresDo> resultToperationpresDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`OPERATIONID`, " + 
                    "`PRECONDITION`, " + 
                    "`TYPE`, " + 
                    "`NOTES` " + 
                    "FROM " + 
                    "T_OPERATIONPRES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultToperationpresDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Toperationpres_objectToToperationpresObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in ToperationpresDaoSpringJdbcTemplatesImpl.readListToperationpres", e);
            throw e;
        }
        return resultToperationpresDoList;
    }

}

class Toperationpres_objectToToperationpresObjectDoRowMapper implements RowMapper <ToperationpresDo> {

    @Override
    public ToperationpresDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        ToperationpresDo resultToperationpresDo = new ToperationpresDo();
        resultToperationpresDo.setOperationid(paramResultSet.getInt("OPERATIONID"));
        resultToperationpresDo.setPrecondition(paramResultSet.getString("PRECONDITION"));
        resultToperationpresDo.setType(paramResultSet.getString("TYPE"));
        resultToperationpresDo.setNotes(paramResultSet.getString("NOTES"));
        return resultToperationpresDo;
    }

}

