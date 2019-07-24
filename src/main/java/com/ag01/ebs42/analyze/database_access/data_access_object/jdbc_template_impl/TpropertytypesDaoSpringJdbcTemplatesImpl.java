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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TpropertytypesDao;
import com.ag01.ebs42.analyze.database_access.domain_object.TpropertytypesDo;

public class TpropertytypesDaoSpringJdbcTemplatesImpl implements TpropertytypesDao {

    private static Logger LOGGER = LogManager.getLogger(TpropertytypesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TpropertytypesDo> readListTpropertytypes() throws Exception {
        List <TpropertytypesDo> resultTpropertytypesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`PROPERTY`, " + 
                    "`DESCRIPTION`, " + 
                    "`NOTES` " + 
                    "FROM " + 
                    "T_PROPERTYTYPES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTpropertytypesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tpropertytypes_objectToTpropertytypesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TpropertytypesDaoSpringJdbcTemplatesImpl.readListTpropertytypes", e);
            throw e;
        }
        return resultTpropertytypesDoList;
    }

}

class Tpropertytypes_objectToTpropertytypesObjectDoRowMapper implements RowMapper <TpropertytypesDo> {

    @Override
    public TpropertytypesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TpropertytypesDo resultTpropertytypesDo = new TpropertytypesDo();
        resultTpropertytypesDo.setProperty(paramResultSet.getString("PROPERTY"));
        resultTpropertytypesDo.setDescription(paramResultSet.getString("DESCRIPTION"));
        resultTpropertytypesDo.setNotes(paramResultSet.getString("NOTES"));
        return resultTpropertytypesDo;
    }

}

