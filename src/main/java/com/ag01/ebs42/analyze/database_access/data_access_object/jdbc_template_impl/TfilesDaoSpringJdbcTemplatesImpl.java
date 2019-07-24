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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TfilesDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TfilesDo;

public class TfilesDaoSpringJdbcTemplatesImpl implements TfilesDao {

    private static Logger LOGGER = LogManager.getLogger(TfilesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TfilesDo> readListTfiles() throws Exception {
        List <TfilesDo> resultTfilesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`FILEID`, " + 
                    "`APPLIESTO`, " + 
                    "`CATEGORY`, " + 
                    "`NAME`, " + 
                    "`FILE`, " + 
                    "`NOTES`, " + 
                    "`FILEDATE`, " + 
                    "`FILESIZE` " + 
                    "FROM " + 
                    "T_FILES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTfilesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tfiles_objectToTfilesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TfilesDaoSpringJdbcTemplatesImpl.readListTfiles", e);
            throw e;
        }
        return resultTfilesDoList;
    }

}

class Tfiles_objectToTfilesObjectDoRowMapper implements RowMapper <TfilesDo> {

    @Override
    public TfilesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TfilesDo resultTfilesDo = new TfilesDo();
        resultTfilesDo.setFileid(paramResultSet.getString("FILEID"));
        resultTfilesDo.setAppliesto(paramResultSet.getString("APPLIESTO"));
        resultTfilesDo.setCategory(paramResultSet.getString("CATEGORY"));
        resultTfilesDo.setName(paramResultSet.getString("NAME"));
        resultTfilesDo.setFile(paramResultSet.getString("FILE"));
        resultTfilesDo.setNotes(paramResultSet.getString("NOTES"));
        resultTfilesDo.setFiledate(paramResultSet.getDate("FILEDATE"));
        resultTfilesDo.setFilesize(paramResultSet.getInt("FILESIZE"));
        return resultTfilesDo;
    }

}

