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

import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TdiagramtypesDao;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TdiagramtypesDo;

public class TdiagramtypesDaoSpringJdbcTemplatesImpl implements TdiagramtypesDao {

    private static Logger LOGGER = LogManager.getLogger(TdiagramtypesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TdiagramtypesDo> readListTdiagramtypes() throws Exception {
        List <TdiagramtypesDo> resultTdiagramtypesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`DIAGRAM_TYPE`, " + 
                    "`NAME`, " + 
                    "`PACKAGE_ID` " + 
                    "FROM " + 
                    "T_DIAGRAMTYPES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTdiagramtypesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tdiagramtypes_objectToTdiagramtypesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TdiagramtypesDaoSpringJdbcTemplatesImpl.readListTdiagramtypes", e);
            throw e;
        }
        return resultTdiagramtypesDoList;
    }

}

class Tdiagramtypes_objectToTdiagramtypesObjectDoRowMapper implements RowMapper <TdiagramtypesDo> {

    @Override
    public TdiagramtypesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TdiagramtypesDo resultTdiagramtypesDo = new TdiagramtypesDo();
        resultTdiagramtypesDo.setDiagramtype(paramResultSet.getString("DIAGRAM_TYPE"));
        resultTdiagramtypesDo.setName(paramResultSet.getString("NAME"));
        resultTdiagramtypesDo.setPackageid(paramResultSet.getInt("PACKAGE_ID"));
        return resultTdiagramtypesDo;
    }

}

