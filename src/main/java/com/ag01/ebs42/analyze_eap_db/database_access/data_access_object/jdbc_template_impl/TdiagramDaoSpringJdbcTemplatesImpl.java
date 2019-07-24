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

import com.ag01.ebs42.analyze.database_access.domain_object.TdiagramDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TdiagramDao;

public class TdiagramDaoSpringJdbcTemplatesImpl implements TdiagramDao {

    private static Logger LOGGER = LogManager.getLogger(TdiagramDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TdiagramDo> readListTdiagram() throws Exception {
        List <TdiagramDo> resultTdiagramDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`DIAGRAM_ID`, " + 
                    "`PACKAGE_ID`, " + 
                    "`PARENTID`, " + 
                    "`DIAGRAM_TYPE`, " + 
                    "`NAME`, " + 
                    "`VERSION`, " + 
                    "`AUTHOR`, " + 
                    "`SHOWDETAILS`, " + 
                    "`NOTES`, " + 
                    "`STEREOTYPE`, " + 
                    "`ATTPUB`, " + 
                    "`ATTPRI`, " + 
                    "`ATTPRO`, " + 
                    "`ORIENTATION`, " + 
                    "`CX`, " + 
                    "`CY`, " + 
                    "`SCALE`, " + 
                    "`CREATEDDATE`, " + 
                    "`MODIFIEDDATE`, " + 
                    "`HTMLPATH`, " + 
                    "`SHOWFOREIGN`, " + 
                    "`SHOWBORDER`, " + 
                    "`SHOWPACKAGECONTENTS`, " + 
                    "`PDATA`, " + 
                    "`LOCKED`, " + 
                    "`EA_GUID`, " + 
                    "`TPOS`, " + 
                    "`SWIMLANES`, " + 
                    "`STYLEEX` " + 
                    "FROM " + 
                    "T_DIAGRAM";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTdiagramDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tdiagram_objectToTdiagramObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TdiagramDaoSpringJdbcTemplatesImpl.readListTdiagram", e);
            throw e;
        }
        return resultTdiagramDoList;
    }

}

class Tdiagram_objectToTdiagramObjectDoRowMapper implements RowMapper <TdiagramDo> {

    @Override
    public TdiagramDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TdiagramDo resultTdiagramDo = new TdiagramDo();
        resultTdiagramDo.setDiagramid(paramResultSet.getInt("DIAGRAM_ID"));
        resultTdiagramDo.setPackageid(paramResultSet.getInt("PACKAGE_ID"));
        resultTdiagramDo.setParentid(paramResultSet.getInt("PARENTID"));
        resultTdiagramDo.setDiagramtype(paramResultSet.getString("DIAGRAM_TYPE"));
        resultTdiagramDo.setName(paramResultSet.getString("NAME"));
        resultTdiagramDo.setVersion(paramResultSet.getString("VERSION"));
        resultTdiagramDo.setAuthor(paramResultSet.getString("AUTHOR"));
        resultTdiagramDo.setShowdetails(paramResultSet.getInt("SHOWDETAILS"));
        resultTdiagramDo.setNotes(paramResultSet.getString("NOTES"));
        resultTdiagramDo.setStereotype(paramResultSet.getString("STEREOTYPE"));
        resultTdiagramDo.setAttpub(paramResultSet.getInt("ATTPUB"));
        resultTdiagramDo.setAttpri(paramResultSet.getInt("ATTPRI"));
        resultTdiagramDo.setAttpro(paramResultSet.getInt("ATTPRO"));
        resultTdiagramDo.setOrientation(paramResultSet.getString("ORIENTATION").charAt(0));
        resultTdiagramDo.setCx(paramResultSet.getInt("CX"));
        resultTdiagramDo.setCy(paramResultSet.getInt("CY"));
        resultTdiagramDo.setScale(paramResultSet.getInt("SCALE"));
        resultTdiagramDo.setCreateddate(paramResultSet.getDate("CREATEDDATE"));
        resultTdiagramDo.setModifieddate(paramResultSet.getDate("MODIFIEDDATE"));
        resultTdiagramDo.setHtmlpath(paramResultSet.getString("HTMLPATH"));
        resultTdiagramDo.setShowforeign(paramResultSet.getInt("SHOWFOREIGN"));
        resultTdiagramDo.setShowborder(paramResultSet.getInt("SHOWBORDER"));
        resultTdiagramDo.setShowpackagecontents(paramResultSet.getInt("SHOWPACKAGECONTENTS"));
        resultTdiagramDo.setPdata(paramResultSet.getString("PDATA"));
        resultTdiagramDo.setLocked(paramResultSet.getInt("LOCKED"));
        resultTdiagramDo.setEaguid(paramResultSet.getString("EA_GUID"));
        resultTdiagramDo.setTpos(paramResultSet.getInt("TPOS"));
        resultTdiagramDo.setSwimlanes(paramResultSet.getString("SWIMLANES"));
        resultTdiagramDo.setStyleex(paramResultSet.getString("STYLEEX"));
        return resultTdiagramDo;
    }

}

