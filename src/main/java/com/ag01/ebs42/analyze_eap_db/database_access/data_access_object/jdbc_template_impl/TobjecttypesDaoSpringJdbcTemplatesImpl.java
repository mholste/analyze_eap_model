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

import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TobjecttypesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TobjecttypesDo;

public class TobjecttypesDaoSpringJdbcTemplatesImpl implements TobjecttypesDao {

    private static Logger LOGGER = LogManager.getLogger(TobjecttypesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TobjecttypesDo> readListTobjecttypes() throws Exception {
        List <TobjecttypesDo> resultTobjecttypesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`OBJECT_TYPE`, " + 
                    "`DESCRIPTION`, " + 
                    "`DESIGNOBJECT`, " + 
                    "`IMAGEID` " + 
                    "FROM " + 
                    "T_OBJECTTYPES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTobjecttypesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tobjecttypes_objectToTobjecttypesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TobjecttypesDaoSpringJdbcTemplatesImpl.readListTobjecttypes", e);
            throw e;
        }
        return resultTobjecttypesDoList;
    }

}

class Tobjecttypes_objectToTobjecttypesObjectDoRowMapper implements RowMapper <TobjecttypesDo> {

    @Override
    public TobjecttypesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TobjecttypesDo resultTobjecttypesDo = new TobjecttypesDo();
        resultTobjecttypesDo.setObjecttype(paramResultSet.getString("OBJECT_TYPE"));
        resultTobjecttypesDo.setDescription(paramResultSet.getString("DESCRIPTION"));
        resultTobjecttypesDo.setDesignobject(paramResultSet.getInt("DESIGNOBJECT"));
        resultTobjecttypesDo.setImageid(paramResultSet.getShort("IMAGEID"));
        return resultTobjecttypesDo;
    }

}

