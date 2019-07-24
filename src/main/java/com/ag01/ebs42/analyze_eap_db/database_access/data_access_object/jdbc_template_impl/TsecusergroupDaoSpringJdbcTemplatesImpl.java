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

import com.ag01.ebs42.analyze.database_access.domain_object.TsecusergroupDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TsecusergroupDao;

public class TsecusergroupDaoSpringJdbcTemplatesImpl implements TsecusergroupDao {

    private static Logger LOGGER = LogManager.getLogger(TsecusergroupDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TsecusergroupDo> readListTsecusergroup() throws Exception {
        List <TsecusergroupDo> resultTsecusergroupDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`USERID`, " + 
                    "`GROUPID` " + 
                    "FROM " + 
                    "T_SECUSERGROUP";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTsecusergroupDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tsecusergroup_objectToTsecusergroupObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TsecusergroupDaoSpringJdbcTemplatesImpl.readListTsecusergroup", e);
            throw e;
        }
        return resultTsecusergroupDoList;
    }

}

class Tsecusergroup_objectToTsecusergroupObjectDoRowMapper implements RowMapper <TsecusergroupDo> {

    @Override
    public TsecusergroupDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TsecusergroupDo resultTsecusergroupDo = new TsecusergroupDo();
        resultTsecusergroupDo.setUserid(paramResultSet.getString("USERID"));
        resultTsecusergroupDo.setGroupid(paramResultSet.getString("GROUPID"));
        return resultTsecusergroupDo;
    }

}

