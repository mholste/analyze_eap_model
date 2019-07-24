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

import com.ag01.ebs42.analyze.database_access.domain_object.TglossaryDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TglossaryDao;

public class TglossaryDaoSpringJdbcTemplatesImpl implements TglossaryDao {

    private static Logger LOGGER = LogManager.getLogger(TglossaryDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TglossaryDo> readListTglossary() throws Exception {
        List <TglossaryDo> resultTglossaryDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`TERM`, " + 
                    "`TYPE`, " + 
                    "`MEANING`, " + 
                    "`GLOSSARYID` " + 
                    "FROM " + 
                    "T_GLOSSARY";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTglossaryDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tglossary_objectToTglossaryObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TglossaryDaoSpringJdbcTemplatesImpl.readListTglossary", e);
            throw e;
        }
        return resultTglossaryDoList;
    }

}

class Tglossary_objectToTglossaryObjectDoRowMapper implements RowMapper <TglossaryDo> {

    @Override
    public TglossaryDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TglossaryDo resultTglossaryDo = new TglossaryDo();
        resultTglossaryDo.setTerm(paramResultSet.getString("TERM"));
        resultTglossaryDo.setType(paramResultSet.getString("TYPE"));
        resultTglossaryDo.setMeaning(paramResultSet.getString("MEANING"));
        resultTglossaryDo.setGlossaryid(paramResultSet.getInt("GLOSSARYID"));
        return resultTglossaryDo;
    }

}

