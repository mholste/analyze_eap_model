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

import com.ag01.ebs42.analyze.database_access.domain_object.TrisktypesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TrisktypesDao;

public class TrisktypesDaoSpringJdbcTemplatesImpl implements TrisktypesDao {

    private static Logger LOGGER = LogManager.getLogger(TrisktypesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TrisktypesDo> readListTrisktypes() throws Exception {
        List <TrisktypesDo> resultTrisktypesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`RISK`, " + 
                    "`DESCRIPTION`, " + 
                    "`NUMERICWEIGHT`, " + 
                    "`NOTES` " + 
                    "FROM " + 
                    "T_RISKTYPES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTrisktypesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Trisktypes_objectToTrisktypesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TrisktypesDaoSpringJdbcTemplatesImpl.readListTrisktypes", e);
            throw e;
        }
        return resultTrisktypesDoList;
    }

}

class Trisktypes_objectToTrisktypesObjectDoRowMapper implements RowMapper <TrisktypesDo> {

    @Override
    public TrisktypesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TrisktypesDo resultTrisktypesDo = new TrisktypesDo();
        resultTrisktypesDo.setRisk(paramResultSet.getString("RISK"));
        resultTrisktypesDo.setDescription(paramResultSet.getString("DESCRIPTION"));
        resultTrisktypesDo.setNumericweight(paramResultSet.getLong("NUMERICWEIGHT"));
        resultTrisktypesDo.setNotes(paramResultSet.getString("NOTES"));
        return resultTrisktypesDo;
    }

}

