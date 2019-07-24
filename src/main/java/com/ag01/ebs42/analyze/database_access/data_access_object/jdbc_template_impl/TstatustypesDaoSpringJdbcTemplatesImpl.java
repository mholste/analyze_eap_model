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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TstatustypesDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TstatustypesDo;

public class TstatustypesDaoSpringJdbcTemplatesImpl implements TstatustypesDao {

    private static Logger LOGGER = LogManager.getLogger(TstatustypesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TstatustypesDo> readListTstatustypes() throws Exception {
        List <TstatustypesDo> resultTstatustypesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`STATUS`, " + 
                    "`DESCRIPTION` " + 
                    "FROM " + 
                    "T_STATUSTYPES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTstatustypesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tstatustypes_objectToTstatustypesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TstatustypesDaoSpringJdbcTemplatesImpl.readListTstatustypes", e);
            throw e;
        }
        return resultTstatustypesDoList;
    }

}

class Tstatustypes_objectToTstatustypesObjectDoRowMapper implements RowMapper <TstatustypesDo> {

    @Override
    public TstatustypesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TstatustypesDo resultTstatustypesDo = new TstatustypesDo();
        resultTstatustypesDo.setStatus(paramResultSet.getString("STATUS"));
        resultTstatustypesDo.setDescription(paramResultSet.getString("DESCRIPTION"));
        return resultTstatustypesDo;
    }

}

