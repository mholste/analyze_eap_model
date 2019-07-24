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

import com.ag01.ebs42.analyze.database_access.domain_object.TsecgroupDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TsecgroupDao;

public class TsecgroupDaoSpringJdbcTemplatesImpl implements TsecgroupDao {

    private static Logger LOGGER = LogManager.getLogger(TsecgroupDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TsecgroupDo> readListTsecgroup() throws Exception {
        List <TsecgroupDo> resultTsecgroupDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`GROUPID`, " + 
                    "`GROUPNAME`, " + 
                    "`DESCRIPTION` " + 
                    "FROM " + 
                    "T_SECGROUP";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTsecgroupDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tsecgroup_objectToTsecgroupObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TsecgroupDaoSpringJdbcTemplatesImpl.readListTsecgroup", e);
            throw e;
        }
        return resultTsecgroupDoList;
    }

}

class Tsecgroup_objectToTsecgroupObjectDoRowMapper implements RowMapper <TsecgroupDo> {

    @Override
    public TsecgroupDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TsecgroupDo resultTsecgroupDo = new TsecgroupDo();
        resultTsecgroupDo.setGroupid(paramResultSet.getString("GROUPID"));
        resultTsecgroupDo.setGroupname(paramResultSet.getString("GROUPNAME"));
        resultTsecgroupDo.setDescription(paramResultSet.getString("DESCRIPTION"));
        return resultTsecgroupDo;
    }

}

