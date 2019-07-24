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

import com.ag01.ebs42.analyze.database_access.domain_object.TresourcesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TresourcesDao;

public class TresourcesDaoSpringJdbcTemplatesImpl implements TresourcesDao {

    private static Logger LOGGER = LogManager.getLogger(TresourcesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TresourcesDo> readListTresources() throws Exception {
        List <TresourcesDo> resultTresourcesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`NAME`, " + 
                    "`ORGANISATION`, " + 
                    "`PHONE1`, " + 
                    "`PHONE2`, " + 
                    "`MOBILE`, " + 
                    "`FAX`, " + 
                    "`EMAIL`, " + 
                    "`ROLES`, " + 
                    "`NOTES` " + 
                    "FROM " + 
                    "T_RESOURCES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTresourcesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tresources_objectToTresourcesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TresourcesDaoSpringJdbcTemplatesImpl.readListTresources", e);
            throw e;
        }
        return resultTresourcesDoList;
    }

}

class Tresources_objectToTresourcesObjectDoRowMapper implements RowMapper <TresourcesDo> {

    @Override
    public TresourcesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TresourcesDo resultTresourcesDo = new TresourcesDo();
        resultTresourcesDo.setName(paramResultSet.getString("NAME"));
        resultTresourcesDo.setOrganisation(paramResultSet.getString("ORGANISATION"));
        resultTresourcesDo.setPhone1(paramResultSet.getString("PHONE1"));
        resultTresourcesDo.setPhone2(paramResultSet.getString("PHONE2"));
        resultTresourcesDo.setMobile(paramResultSet.getString("MOBILE"));
        resultTresourcesDo.setFax(paramResultSet.getString("FAX"));
        resultTresourcesDo.setEmail(paramResultSet.getString("EMAIL"));
        resultTresourcesDo.setRoles(paramResultSet.getString("ROLES"));
        resultTresourcesDo.setNotes(paramResultSet.getString("NOTES"));
        return resultTresourcesDo;
    }

}

