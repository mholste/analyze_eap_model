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

import com.ag01.ebs42.analyze.database_access.domain_object.TobjectresourceDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TobjectresourceDao;

public class TobjectresourceDaoSpringJdbcTemplatesImpl implements TobjectresourceDao {

    private static Logger LOGGER = LogManager.getLogger(TobjectresourceDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TobjectresourceDo> readListTobjectresource() throws Exception {
        List <TobjectresourceDo> resultTobjectresourceDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`OBJECT_ID`, " + 
                    "`RESOURCE`, " + 
                    "`ROLE`, " + 
                    "`TIME`, " + 
                    "`NOTES`, " + 
                    "`PERCENTCOMPLETE`, " + 
                    "`DATESTART`, " + 
                    "`DATEEND`, " + 
                    "`HISTORY`, " + 
                    "`EXPECTEDHOURS`, " + 
                    "`ACTUALHOURS` " + 
                    "FROM " + 
                    "T_OBJECTRESOURCE";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTobjectresourceDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tobjectresource_objectToTobjectresourceObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TobjectresourceDaoSpringJdbcTemplatesImpl.readListTobjectresource", e);
            throw e;
        }
        return resultTobjectresourceDoList;
    }

}

class Tobjectresource_objectToTobjectresourceObjectDoRowMapper implements RowMapper <TobjectresourceDo> {

    @Override
    public TobjectresourceDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TobjectresourceDo resultTobjectresourceDo = new TobjectresourceDo();
        resultTobjectresourceDo.setObjectid(paramResultSet.getInt("OBJECT_ID"));
        resultTobjectresourceDo.setResource(paramResultSet.getString("RESOURCE"));
        resultTobjectresourceDo.setRole(paramResultSet.getString("ROLE"));
        resultTobjectresourceDo.setTime(paramResultSet.getLong("TIME"));
        resultTobjectresourceDo.setNotes(paramResultSet.getString("NOTES"));
        resultTobjectresourceDo.setPercentcomplete(paramResultSet.getShort("PERCENTCOMPLETE"));
        resultTobjectresourceDo.setDatestart(paramResultSet.getDate("DATESTART"));
        resultTobjectresourceDo.setDateend(paramResultSet.getDate("DATEEND"));
        resultTobjectresourceDo.setHistory(paramResultSet.getString("HISTORY"));
        resultTobjectresourceDo.setExpectedhours(paramResultSet.getInt("EXPECTEDHOURS"));
        resultTobjectresourceDo.setActualhours(paramResultSet.getInt("ACTUALHOURS"));
        return resultTobjectresourceDo;
    }

}

