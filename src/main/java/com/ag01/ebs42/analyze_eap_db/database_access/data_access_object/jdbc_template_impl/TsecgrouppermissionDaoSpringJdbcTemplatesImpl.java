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

import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TsecgrouppermissionDao;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TsecgrouppermissionDo;

public class TsecgrouppermissionDaoSpringJdbcTemplatesImpl implements TsecgrouppermissionDao {

    private static Logger LOGGER = LogManager.getLogger(TsecgrouppermissionDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TsecgrouppermissionDo> readListTsecgrouppermission() throws Exception {
        List <TsecgrouppermissionDo> resultTsecgrouppermissionDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`GROUPID`, " + 
                    "`PERMISSIONID` " + 
                    "FROM " + 
                    "T_SECGROUPPERMISSION";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTsecgrouppermissionDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tsecgrouppermission_objectToTsecgrouppermissionObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TsecgrouppermissionDaoSpringJdbcTemplatesImpl.readListTsecgrouppermission", e);
            throw e;
        }
        return resultTsecgrouppermissionDoList;
    }

}

class Tsecgrouppermission_objectToTsecgrouppermissionObjectDoRowMapper implements RowMapper <TsecgrouppermissionDo> {

    @Override
    public TsecgrouppermissionDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TsecgrouppermissionDo resultTsecgrouppermissionDo = new TsecgrouppermissionDo();
        resultTsecgrouppermissionDo.setGroupid(paramResultSet.getString("GROUPID"));
        resultTsecgrouppermissionDo.setPermissionid(paramResultSet.getInt("PERMISSIONID"));
        return resultTsecgrouppermissionDo;
    }

}

