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

import com.ag01.ebs42.analyze.database_access.domain_object.TtcfDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TtcfDao;

public class TtcfDaoSpringJdbcTemplatesImpl implements TtcfDao {

    private static Logger LOGGER = LogManager.getLogger(TtcfDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TtcfDo> readListTtcf() throws Exception {
        List <TtcfDo> resultTtcfDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`TCFID`, " + 
                    "`DESCRIPTION`, " + 
                    "`WEIGHT`, " + 
                    "`VALUE`, " + 
                    "`NOTES` " + 
                    "FROM " + 
                    "T_TCF";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTtcfDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Ttcf_objectToTtcfObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TtcfDaoSpringJdbcTemplatesImpl.readListTtcf", e);
            throw e;
        }
        return resultTtcfDoList;
    }

}

class Ttcf_objectToTtcfObjectDoRowMapper implements RowMapper <TtcfDo> {

    @Override
    public TtcfDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TtcfDo resultTtcfDo = new TtcfDo();
        resultTtcfDo.setTcfid(paramResultSet.getString("TCFID"));
        resultTtcfDo.setDescription(paramResultSet.getString("DESCRIPTION"));
        resultTtcfDo.setWeight(paramResultSet.getLong("WEIGHT"));
        resultTtcfDo.setValue(paramResultSet.getLong("VALUE"));
        resultTtcfDo.setNotes(paramResultSet.getString("NOTES"));
        return resultTtcfDo;
    }

}

