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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TobjectfilesDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TobjectfilesDo;

public class TobjectfilesDaoSpringJdbcTemplatesImpl implements TobjectfilesDao {

    private static Logger LOGGER = LogManager.getLogger(TobjectfilesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TobjectfilesDo> readListTobjectfiles() throws Exception {
        List <TobjectfilesDo> resultTobjectfilesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`OBJECT_ID`, " + 
                    "`FILENAME`, " + 
                    "`TYPE`, " + 
                    "`NOTE`, " + 
                    "`FILESIZE`, " + 
                    "`FILEDATE` " + 
                    "FROM " + 
                    "T_OBJECTFILES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTobjectfilesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tobjectfiles_objectToTobjectfilesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TobjectfilesDaoSpringJdbcTemplatesImpl.readListTobjectfiles", e);
            throw e;
        }
        return resultTobjectfilesDoList;
    }

}

class Tobjectfiles_objectToTobjectfilesObjectDoRowMapper implements RowMapper <TobjectfilesDo> {

    @Override
    public TobjectfilesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TobjectfilesDo resultTobjectfilesDo = new TobjectfilesDo();
        resultTobjectfilesDo.setObjectid(paramResultSet.getInt("OBJECT_ID"));
        resultTobjectfilesDo.setFilename(paramResultSet.getString("FILENAME"));
        resultTobjectfilesDo.setType(paramResultSet.getString("TYPE"));
        resultTobjectfilesDo.setNote(paramResultSet.getString("NOTE"));
        resultTobjectfilesDo.setFilesize(paramResultSet.getString("FILESIZE"));
        resultTobjectfilesDo.setFiledate(paramResultSet.getString("FILEDATE"));
        return resultTobjectfilesDo;
    }

}

