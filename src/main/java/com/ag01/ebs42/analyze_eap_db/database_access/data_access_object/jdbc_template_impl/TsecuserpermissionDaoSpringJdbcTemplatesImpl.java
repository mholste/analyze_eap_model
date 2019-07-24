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

import com.ag01.ebs42.analyze.database_access.domain_object.TsecuserpermissionDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TsecuserpermissionDao;

public class TsecuserpermissionDaoSpringJdbcTemplatesImpl implements TsecuserpermissionDao {

    private static Logger LOGGER = LogManager.getLogger(TsecuserpermissionDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TsecuserpermissionDo> readListTsecuserpermission() throws Exception {
        List <TsecuserpermissionDo> resultTsecuserpermissionDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`USERID`, " + 
                    "`PERMISSIONID` " + 
                    "FROM " + 
                    "T_SECUSERPERMISSION";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTsecuserpermissionDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tsecuserpermission_objectToTsecuserpermissionObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TsecuserpermissionDaoSpringJdbcTemplatesImpl.readListTsecuserpermission", e);
            throw e;
        }
        return resultTsecuserpermissionDoList;
    }

}

class Tsecuserpermission_objectToTsecuserpermissionObjectDoRowMapper implements RowMapper <TsecuserpermissionDo> {

    @Override
    public TsecuserpermissionDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TsecuserpermissionDo resultTsecuserpermissionDo = new TsecuserpermissionDo();
        resultTsecuserpermissionDo.setUserid(paramResultSet.getString("USERID"));
        resultTsecuserpermissionDo.setPermissionid(paramResultSet.getInt("PERMISSIONID"));
        return resultTsecuserpermissionDo;
    }

}

