package com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.jdbc_template_impl;

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

import com.ag01.ebs42.analyze.database_access.domain_object.TauthorsDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TauthorsDao;

public class TauthorsDaoSpringJdbcTemplatesImpl implements TauthorsDao {

    private static Logger LOGGER = LogManager.getLogger(TauthorsDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TauthorsDo> readListTauthors() throws Exception {
        List <TauthorsDo> resultTauthorsDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`AUTHORNAME`, " + 
                    "`ROLES`, " + 
                    "`NOTES` " + 
                    "FROM " + 
                    "T_AUTHORS";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTauthorsDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tauthors_objectToTauthorsObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TauthorsDaoSpringJdbcTemplatesImpl.readListTauthors", e);
            throw e;
        }
        return resultTauthorsDoList;
    }

}

class Tauthors_objectToTauthorsObjectDoRowMapper implements RowMapper <TauthorsDo> {

    @Override
    public TauthorsDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TauthorsDo resultTauthorsDo = new TauthorsDo();
        resultTauthorsDo.setAuthorname(paramResultSet.getString("AUTHORNAME"));
        resultTauthorsDo.setRoles(paramResultSet.getString("ROLES"));
        resultTauthorsDo.setNotes(paramResultSet.getString("NOTES"));
        return resultTauthorsDo;
    }

}

