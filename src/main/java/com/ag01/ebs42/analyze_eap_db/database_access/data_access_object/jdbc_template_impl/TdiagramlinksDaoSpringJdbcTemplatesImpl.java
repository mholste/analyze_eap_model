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

import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TdiagramlinksDao;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TdiagramlinksDo;

public class TdiagramlinksDaoSpringJdbcTemplatesImpl implements TdiagramlinksDao {

    private static Logger LOGGER = LogManager.getLogger(TdiagramlinksDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TdiagramlinksDo> readListTdiagramlinks() throws Exception {
        List <TdiagramlinksDo> resultTdiagramlinksDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`DIAGRAMID`, " + 
                    "`CONNECTORID`, " + 
                    "`GEOMETRY`, " + 
                    "`STYLE`, " + 
                    "`HIDDEN`, " + 
                    "`PATH`, " + 
                    "`INSTANCE_ID` " + 
                    "FROM " + 
                    "T_DIAGRAMLINKS";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTdiagramlinksDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tdiagramlinks_objectToTdiagramlinksObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TdiagramlinksDaoSpringJdbcTemplatesImpl.readListTdiagramlinks", e);
            throw e;
        }
        return resultTdiagramlinksDoList;
    }

}

class Tdiagramlinks_objectToTdiagramlinksObjectDoRowMapper implements RowMapper <TdiagramlinksDo> {

    @Override
    public TdiagramlinksDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TdiagramlinksDo resultTdiagramlinksDo = new TdiagramlinksDo();
        resultTdiagramlinksDo.setDiagramid(paramResultSet.getInt("DIAGRAMID"));
        resultTdiagramlinksDo.setConnectorid(paramResultSet.getInt("CONNECTORID"));
        resultTdiagramlinksDo.setGeometry(paramResultSet.getString("GEOMETRY"));
        resultTdiagramlinksDo.setStyle(paramResultSet.getString("STYLE"));
        resultTdiagramlinksDo.setHidden(paramResultSet.getInt("HIDDEN"));
        resultTdiagramlinksDo.setPath(paramResultSet.getString("PATH"));
        resultTdiagramlinksDo.setInstanceid(paramResultSet.getInt("INSTANCE_ID"));
        return resultTdiagramlinksDo;
    }

}

