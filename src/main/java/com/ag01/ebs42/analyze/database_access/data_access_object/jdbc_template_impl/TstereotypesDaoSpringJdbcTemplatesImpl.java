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

import com.ag01.ebs42.analyze.database_access.domain_object.TstereotypesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TstereotypesDao;

public class TstereotypesDaoSpringJdbcTemplatesImpl implements TstereotypesDao {

    private static Logger LOGGER = LogManager.getLogger(TstereotypesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TstereotypesDo> readListTstereotypes() throws Exception {
        List <TstereotypesDo> resultTstereotypesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`STEREOTYPE`, " + 
                    "`APPLIESTO`, " + 
                    "`DESCRIPTION`, " + 
                    "`MFENABLED`, " + 
                    "`MFPATH`, " + 
                    "`METAFILE`, " + 
                    "`STYLE`, " + 
                    "`EA_GUID`, " + 
                    "`VISUALTYPE` " + 
                    "FROM " + 
                    "T_STEREOTYPES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTstereotypesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tstereotypes_objectToTstereotypesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TstereotypesDaoSpringJdbcTemplatesImpl.readListTstereotypes", e);
            throw e;
        }
        return resultTstereotypesDoList;
    }

}

class Tstereotypes_objectToTstereotypesObjectDoRowMapper implements RowMapper <TstereotypesDo> {

    @Override
    public TstereotypesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TstereotypesDo resultTstereotypesDo = new TstereotypesDo();
        resultTstereotypesDo.setStereotype(paramResultSet.getString("STEREOTYPE"));
        resultTstereotypesDo.setAppliesto(paramResultSet.getString("APPLIESTO"));
        resultTstereotypesDo.setDescription(paramResultSet.getString("DESCRIPTION"));
        resultTstereotypesDo.setMfenabled(paramResultSet.getInt("MFENABLED"));
        resultTstereotypesDo.setMfpath(paramResultSet.getString("MFPATH"));
        resultTstereotypesDo.setMetafile(paramResultSet.getString("METAFILE"));
        resultTstereotypesDo.setStyle(paramResultSet.getString("STYLE"));
        resultTstereotypesDo.setEaguid(paramResultSet.getString("EA_GUID"));
        resultTstereotypesDo.setVisualtype(paramResultSet.getString("VISUALTYPE"));
        return resultTstereotypesDo;
    }

}

