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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TrtfreportDao;
import com.ag01.ebs42.analyze.database_access.domain_object.TrtfreportDo;

public class TrtfreportDaoSpringJdbcTemplatesImpl implements TrtfreportDao {

    private static Logger LOGGER = LogManager.getLogger(TrtfreportDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TrtfreportDo> readListTrtfreport() throws Exception {
        List <TrtfreportDo> resultTrtfreportDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`TEMPLATEID`, " + 
                    "`ROOTPACKAGE`, " + 
                    "`FILENAME`, " + 
                    "`DETAILS`, " + 
                    "`PROCESSCHILDREN`, " + 
                    "`SHOWDIAGRAMS`, " + 
                    "`HEADING`, " + 
                    "`REQUIREMENTS`, " + 
                    "`ASSOCIATIONS`, " + 
                    "`SCENARIOS`, " + 
                    "`CHILDDIAGRAMS`, " + 
                    "`ATTRIBUTES`, " + 
                    "`METHODS`, " + 
                    "`IMAGETYPE`, " + 
                    "`PAGING`, " + 
                    "`INTRO`, " + 
                    "`RESOURCES`, " + 
                    "`CONSTRAINTS`, " + 
                    "`TAGGED`, " + 
                    "`SHOWTAG`, " + 
                    "`SHOWALIAS`, " + 
                    "`PDATA1`, " + 
                    "`PDATA2`, " + 
                    "`PDATA3`, " + 
                    "`PDATA4` " + 
                    "FROM " + 
                    "T_RTFREPORT";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTrtfreportDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Trtfreport_objectToTrtfreportObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TrtfreportDaoSpringJdbcTemplatesImpl.readListTrtfreport", e);
            throw e;
        }
        return resultTrtfreportDoList;
    }

}

class Trtfreport_objectToTrtfreportObjectDoRowMapper implements RowMapper <TrtfreportDo> {

    @Override
    public TrtfreportDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TrtfreportDo resultTrtfreportDo = new TrtfreportDo();
        resultTrtfreportDo.setTemplateid(paramResultSet.getString("TEMPLATEID"));
        resultTrtfreportDo.setRootpackage(paramResultSet.getInt("ROOTPACKAGE"));
        resultTrtfreportDo.setFilename(paramResultSet.getString("FILENAME"));
        resultTrtfreportDo.setDetails(paramResultSet.getInt("DETAILS"));
        resultTrtfreportDo.setProcesschildren(paramResultSet.getInt("PROCESSCHILDREN"));
        resultTrtfreportDo.setShowdiagrams(paramResultSet.getInt("SHOWDIAGRAMS"));
        resultTrtfreportDo.setHeading(paramResultSet.getString("HEADING"));
        resultTrtfreportDo.setRequirements(paramResultSet.getInt("REQUIREMENTS"));
        resultTrtfreportDo.setAssociations(paramResultSet.getInt("ASSOCIATIONS"));
        resultTrtfreportDo.setScenarios(paramResultSet.getInt("SCENARIOS"));
        resultTrtfreportDo.setChilddiagrams(paramResultSet.getInt("CHILDDIAGRAMS"));
        resultTrtfreportDo.setAttributes(paramResultSet.getInt("ATTRIBUTES"));
        resultTrtfreportDo.setMethods(paramResultSet.getInt("METHODS"));
        resultTrtfreportDo.setImagetype(paramResultSet.getInt("IMAGETYPE"));
        resultTrtfreportDo.setPaging(paramResultSet.getInt("PAGING"));
        resultTrtfreportDo.setIntro(paramResultSet.getString("INTRO"));
        resultTrtfreportDo.setResources(paramResultSet.getInt("RESOURCES"));
        resultTrtfreportDo.setConstraints(paramResultSet.getInt("CONSTRAINTS"));
        resultTrtfreportDo.setTagged(paramResultSet.getInt("TAGGED"));
        resultTrtfreportDo.setShowtag(paramResultSet.getInt("SHOWTAG"));
        resultTrtfreportDo.setShowalias(paramResultSet.getInt("SHOWALIAS"));
        resultTrtfreportDo.setPdata1(paramResultSet.getString("PDATA1"));
        resultTrtfreportDo.setPdata2(paramResultSet.getString("PDATA2"));
        resultTrtfreportDo.setPdata3(paramResultSet.getString("PDATA3"));
        resultTrtfreportDo.setPdata4(paramResultSet.getString("PDATA4"));
        return resultTrtfreportDo;
    }

}

