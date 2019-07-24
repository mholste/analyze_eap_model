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

import com.ag01.ebs42.analyze.database_access.domain_object.TissuesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TissuesDao;

public class TissuesDaoSpringJdbcTemplatesImpl implements TissuesDao {

    private static Logger LOGGER = LogManager.getLogger(TissuesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TissuesDo> readListTissues() throws Exception {
        List <TissuesDo> resultTissuesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`ISSUE`, " + 
                    "`ISSUEDATE`, " + 
                    "`OWNER`, " + 
                    "`STATUS`, " + 
                    "`NOTES`, " + 
                    "`RESOLVER`, " + 
                    "`DATERESOLVED`, " + 
                    "`RESOLUTION`, " + 
                    "`ISSUEID`, " + 
                    "`CATEGORY`, " + 
                    "`PRIORITY`, " + 
                    "`SEVERITY`, " + 
                    "`ISSUETYPE` " + 
                    "FROM " + 
                    "T_ISSUES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTissuesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tissues_objectToTissuesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TissuesDaoSpringJdbcTemplatesImpl.readListTissues", e);
            throw e;
        }
        return resultTissuesDoList;
    }

}

class Tissues_objectToTissuesObjectDoRowMapper implements RowMapper <TissuesDo> {

    @Override
    public TissuesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TissuesDo resultTissuesDo = new TissuesDo();
        resultTissuesDo.setIssue(paramResultSet.getString("ISSUE"));
        resultTissuesDo.setIssuedate(paramResultSet.getDate("ISSUEDATE"));
        resultTissuesDo.setOwner(paramResultSet.getString("OWNER"));
        resultTissuesDo.setStatus(paramResultSet.getString("STATUS"));
        resultTissuesDo.setNotes(paramResultSet.getString("NOTES"));
        resultTissuesDo.setResolver(paramResultSet.getString("RESOLVER"));
        resultTissuesDo.setDateresolved(paramResultSet.getDate("DATERESOLVED"));
        resultTissuesDo.setResolution(paramResultSet.getString("RESOLUTION"));
        resultTissuesDo.setIssueid(paramResultSet.getInt("ISSUEID"));
        resultTissuesDo.setCategory(paramResultSet.getString("CATEGORY"));
        resultTissuesDo.setPriority(paramResultSet.getString("PRIORITY"));
        resultTissuesDo.setSeverity(paramResultSet.getString("SEVERITY"));
        resultTissuesDo.setIssuetype(paramResultSet.getString("ISSUETYPE"));
        return resultTissuesDo;
    }

}

