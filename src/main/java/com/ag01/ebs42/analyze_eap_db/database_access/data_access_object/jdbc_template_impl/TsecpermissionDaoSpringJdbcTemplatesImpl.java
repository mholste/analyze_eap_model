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

import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TsecpermissionDao;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TsecpermissionDo;

public class TsecpermissionDaoSpringJdbcTemplatesImpl implements TsecpermissionDao {

    private static Logger LOGGER = LogManager.getLogger(TsecpermissionDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TsecpermissionDo> readListTsecpermission() throws Exception {
        List <TsecpermissionDo> resultTsecpermissionDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`PERMISSIONID`, " + 
                    "`PERMISSIONNAME` " + 
                    "FROM " + 
                    "T_SECPERMISSION";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTsecpermissionDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tsecpermission_objectToTsecpermissionObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TsecpermissionDaoSpringJdbcTemplatesImpl.readListTsecpermission", e);
            throw e;
        }
        return resultTsecpermissionDoList;
    }

}

class Tsecpermission_objectToTsecpermissionObjectDoRowMapper implements RowMapper <TsecpermissionDo> {

    @Override
    public TsecpermissionDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TsecpermissionDo resultTsecpermissionDo = new TsecpermissionDo();
        resultTsecpermissionDo.setPermissionid(paramResultSet.getInt("PERMISSIONID"));
        resultTsecpermissionDo.setPermissionname(paramResultSet.getString("PERMISSIONNAME"));
        return resultTsecpermissionDo;
    }

}

