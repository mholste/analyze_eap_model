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

import com.ag01.ebs42.analyze.database_access.domain_object.TtrxtypesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TtrxtypesDao;

public class TtrxtypesDaoSpringJdbcTemplatesImpl implements TtrxtypesDao {

    private static Logger LOGGER = LogManager.getLogger(TtrxtypesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TtrxtypesDo> readListTtrxtypes() throws Exception {
        List <TtrxtypesDo> resultTtrxtypesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`TRX`, " + 
                    "`DESCRIPTION`, " + 
                    "`NUMERICWEIGHT`, " + 
                    "`NOTES`, " + 
                    "`STYLE`, " + 
                    "`TRX_ID` " + 
                    "FROM " + 
                    "T_TRXTYPES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTtrxtypesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Ttrxtypes_objectToTtrxtypesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TtrxtypesDaoSpringJdbcTemplatesImpl.readListTtrxtypes", e);
            throw e;
        }
        return resultTtrxtypesDoList;
    }

}

class Ttrxtypes_objectToTtrxtypesObjectDoRowMapper implements RowMapper <TtrxtypesDo> {

    @Override
    public TtrxtypesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TtrxtypesDo resultTtrxtypesDo = new TtrxtypesDo();
        resultTtrxtypesDo.setTrx(paramResultSet.getString("TRX"));
        resultTtrxtypesDo.setDescription(paramResultSet.getString("DESCRIPTION"));
        resultTtrxtypesDo.setNumericweight(paramResultSet.getLong("NUMERICWEIGHT"));
        resultTtrxtypesDo.setNotes(paramResultSet.getString("NOTES"));
        resultTtrxtypesDo.setStyle(paramResultSet.getString("STYLE"));
        resultTtrxtypesDo.setTrxid(paramResultSet.getInt("TRX_ID"));
        return resultTtrxtypesDo;
    }

}

