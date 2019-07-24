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

import com.ag01.ebs42.analyze.database_access.domain_object.TpackageDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TpackageDao;

public class TpackageDaoSpringJdbcTemplatesImpl implements TpackageDao {

    private static Logger LOGGER = LogManager.getLogger(TpackageDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TpackageDo> readListTpackage() throws Exception {
        List <TpackageDo> resultTpackageDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`PACKAGE_ID`, " + 
                    "`NAME`, " + 
                    "`PARENT_ID`, " + 
                    "`CREATEDDATE`, " + 
                    "`MODIFIEDDATE`, " + 
                    "`NOTES`, " + 
                    "`EA_GUID`, " + 
                    "`XMLPATH`, " + 
                    "`ISCONTROLLED`, " + 
                    "`LASTLOADDATE`, " + 
                    "`LASTSAVEDATE`, " + 
                    "`VERSION`, " + 
                    "`PROTECTED`, " + 
                    "`PKGOWNER`, " + 
                    "`UMLVERSION`, " + 
                    "`USEDTD`, " + 
                    "`LOGXML`, " + 
                    "`CODEPATH`, " + 
                    "`NAMESPACE`, " + 
                    "`TPOS`, " + 
                    "`PACKAGEFLAGS`, " + 
                    "`BATCHSAVE`, " + 
                    "`BATCHLOAD` " + 
                    "FROM " + 
                    "T_PACKAGE";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTpackageDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tpackage_objectToTpackageObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TpackageDaoSpringJdbcTemplatesImpl.readListTpackage", e);
            throw e;
        }
        return resultTpackageDoList;
    }

}

class Tpackage_objectToTpackageObjectDoRowMapper implements RowMapper <TpackageDo> {

    @Override
    public TpackageDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TpackageDo resultTpackageDo = new TpackageDo();
        resultTpackageDo.setPackageid(paramResultSet.getInt("PACKAGE_ID"));
        resultTpackageDo.setName(paramResultSet.getString("NAME"));
        resultTpackageDo.setParentid(paramResultSet.getInt("PARENT_ID"));
        resultTpackageDo.setCreateddate(paramResultSet.getDate("CREATEDDATE"));
        resultTpackageDo.setModifieddate(paramResultSet.getDate("MODIFIEDDATE"));
        resultTpackageDo.setNotes(paramResultSet.getString("NOTES"));
        resultTpackageDo.setEaguid(paramResultSet.getString("EA_GUID"));
        resultTpackageDo.setXmlpath(paramResultSet.getString("XMLPATH"));
        resultTpackageDo.setIscontrolled(paramResultSet.getInt("ISCONTROLLED"));
        resultTpackageDo.setLastloaddate(paramResultSet.getDate("LASTLOADDATE"));
        resultTpackageDo.setLastsavedate(paramResultSet.getDate("LASTSAVEDATE"));
        resultTpackageDo.setVersion(paramResultSet.getString("VERSION"));
        resultTpackageDo.setProtected(paramResultSet.getInt("PROTECTED"));
        resultTpackageDo.setPkgowner(paramResultSet.getString("PKGOWNER"));
        resultTpackageDo.setUmlversion(paramResultSet.getString("UMLVERSION"));
        resultTpackageDo.setUsedtd(paramResultSet.getInt("USEDTD"));
        resultTpackageDo.setLogxml(paramResultSet.getInt("LOGXML"));
        resultTpackageDo.setCodepath(paramResultSet.getString("CODEPATH"));
        resultTpackageDo.setNamespace(paramResultSet.getString("NAMESPACE"));
        resultTpackageDo.setTpos(paramResultSet.getInt("TPOS"));
        resultTpackageDo.setPackageflags(paramResultSet.getString("PACKAGEFLAGS"));
        resultTpackageDo.setBatchsave(paramResultSet.getInt("BATCHSAVE"));
        resultTpackageDo.setBatchload(paramResultSet.getInt("BATCHLOAD"));
        return resultTpackageDo;
    }

}

