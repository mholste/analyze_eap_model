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

import com.ag01.ebs42.analyze.database_access.domain_object.TphaseDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TphaseDao;

public class TphaseDaoSpringJdbcTemplatesImpl implements TphaseDao {

    private static Logger LOGGER = LogManager.getLogger(TphaseDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TphaseDo> readListTphase() throws Exception {
        List <TphaseDo> resultTphaseDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`PHASEID`, " + 
                    "`PHASENAME`, " + 
                    "`PHASENOTES`, " + 
                    "`PHASESTYLE`, " + 
                    "`STARTDATE`, " + 
                    "`ENDDATE`, " + 
                    "`PHASECONTENT` " + 
                    "FROM " + 
                    "T_PHASE";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTphaseDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tphase_objectToTphaseObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TphaseDaoSpringJdbcTemplatesImpl.readListTphase", e);
            throw e;
        }
        return resultTphaseDoList;
    }

}

class Tphase_objectToTphaseObjectDoRowMapper implements RowMapper <TphaseDo> {

    @Override
    public TphaseDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TphaseDo resultTphaseDo = new TphaseDo();
        resultTphaseDo.setPhaseid(paramResultSet.getString("PHASEID"));
        resultTphaseDo.setPhasename(paramResultSet.getString("PHASENAME"));
        resultTphaseDo.setPhasenotes(paramResultSet.getString("PHASENOTES"));
        resultTphaseDo.setPhasestyle(paramResultSet.getString("PHASESTYLE"));
        resultTphaseDo.setStartdate(paramResultSet.getDate("STARTDATE"));
        resultTphaseDo.setEnddate(paramResultSet.getDate("ENDDATE"));
        resultTphaseDo.setPhasecontent(paramResultSet.getString("PHASECONTENT"));
        return resultTphaseDo;
    }

}

