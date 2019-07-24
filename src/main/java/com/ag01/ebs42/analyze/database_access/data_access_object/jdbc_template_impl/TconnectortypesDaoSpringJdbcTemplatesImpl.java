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

import com.ag01.ebs42.analyze.database_access.domain_object.TconnectortypesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TconnectortypesDao;

public class TconnectortypesDaoSpringJdbcTemplatesImpl implements TconnectortypesDao {

    private static Logger LOGGER = LogManager.getLogger(TconnectortypesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TconnectortypesDo> readListTconnectortypes() throws Exception {
        List <TconnectortypesDo> resultTconnectortypesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`CONNECTOR_TYPE`, " + 
                    "`DESCRIPTION` " + 
                    "FROM " + 
                    "T_CONNECTORTYPES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTconnectortypesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tconnectortypes_objectToTconnectortypesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TconnectortypesDaoSpringJdbcTemplatesImpl.readListTconnectortypes", e);
            throw e;
        }
        return resultTconnectortypesDoList;
    }

}

class Tconnectortypes_objectToTconnectortypesObjectDoRowMapper implements RowMapper <TconnectortypesDo> {

    @Override
    public TconnectortypesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TconnectortypesDo resultTconnectortypesDo = new TconnectortypesDo();
        resultTconnectortypesDo.setConnectortype(paramResultSet.getString("CONNECTOR_TYPE"));
        resultTconnectortypesDo.setDescription(paramResultSet.getString("DESCRIPTION"));
        return resultTconnectortypesDo;
    }

}

