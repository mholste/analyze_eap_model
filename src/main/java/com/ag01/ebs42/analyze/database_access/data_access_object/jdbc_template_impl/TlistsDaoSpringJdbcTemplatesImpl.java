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

import com.ag01.ebs42.analyze.database_access.domain_object.TlistsDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TlistsDao;

public class TlistsDaoSpringJdbcTemplatesImpl implements TlistsDao {

    private static Logger LOGGER = LogManager.getLogger(TlistsDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TlistsDo> readListTlists() throws Exception {
        List <TlistsDo> resultTlistsDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`LISTID`, " + 
                    "`CATEGORY`, " + 
                    "`NAME`, " + 
                    "`NVAL`, " + 
                    "`NOTES` " + 
                    "FROM " + 
                    "T_LISTS";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTlistsDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tlists_objectToTlistsObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TlistsDaoSpringJdbcTemplatesImpl.readListTlists", e);
            throw e;
        }
        return resultTlistsDoList;
    }

}

class Tlists_objectToTlistsObjectDoRowMapper implements RowMapper <TlistsDo> {

    @Override
    public TlistsDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TlistsDo resultTlistsDo = new TlistsDo();
        resultTlistsDo.setListid(paramResultSet.getString("LISTID"));
        resultTlistsDo.setCategory(paramResultSet.getString("CATEGORY"));
        resultTlistsDo.setName(paramResultSet.getString("NAME"));
        resultTlistsDo.setNval(paramResultSet.getInt("NVAL"));
        resultTlistsDo.setNotes(paramResultSet.getString("NOTES"));
        return resultTlistsDo;
    }

}

