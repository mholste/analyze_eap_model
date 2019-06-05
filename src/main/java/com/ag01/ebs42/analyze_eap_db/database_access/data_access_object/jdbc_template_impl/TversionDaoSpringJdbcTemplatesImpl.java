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

import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TversionDao;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TversionDo;

public class TversionDaoSpringJdbcTemplatesImpl implements TversionDao {

    private static Logger LOGGER = LogManager.getLogger(TversionDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TversionDo> readListTversion() throws Exception {
        List <TversionDo> resultTversionDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`ELEMENTID`, " + 
                    "`VERSIONID`, " + 
                    "`ELEMENTTYPE`, " + 
                    "`FLAGS`, " + 
                    "`EXTERNALFILE`, " + 
                    "`NOTES`, " + 
                    "`OWNER`, " + 
                    "`VERSIONDATE`, " + 
                    "`BRANCH`, " + 
                    "`ELEMENTXML` " + 
                    "FROM " + 
                    "T_VERSION";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTversionDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tversion_objectToTversionObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TversionDaoSpringJdbcTemplatesImpl.readListTversion", e);
            throw e;
        }
        return resultTversionDoList;
    }

}

class Tversion_objectToTversionObjectDoRowMapper implements RowMapper <TversionDo> {

    @Override
    public TversionDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TversionDo resultTversionDo = new TversionDo();
        resultTversionDo.setElementid(paramResultSet.getString("ELEMENTID"));
        resultTversionDo.setVersionid(paramResultSet.getString("VERSIONID"));
        resultTversionDo.setElementtype(paramResultSet.getString("ELEMENTTYPE"));
        resultTversionDo.setFlags(paramResultSet.getString("FLAGS"));
        resultTversionDo.setExternalfile(paramResultSet.getString("EXTERNALFILE"));
        resultTversionDo.setNotes(paramResultSet.getString("NOTES"));
        resultTversionDo.setOwner(paramResultSet.getString("OWNER"));
        resultTversionDo.setVersiondate(paramResultSet.getDate("VERSIONDATE"));
        resultTversionDo.setBranch(paramResultSet.getString("BRANCH"));
        resultTversionDo.setElementxml(paramResultSet.getString("ELEMENTXML"));
        return resultTversionDo;
    }

}

