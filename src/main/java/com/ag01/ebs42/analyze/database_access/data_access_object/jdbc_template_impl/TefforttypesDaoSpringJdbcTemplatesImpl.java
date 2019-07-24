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

import com.ag01.ebs42.analyze.database_access.domain_object.TefforttypesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TefforttypesDao;

public class TefforttypesDaoSpringJdbcTemplatesImpl implements TefforttypesDao {

    private static Logger LOGGER = LogManager.getLogger(TefforttypesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TefforttypesDo> readListTefforttypes() throws Exception {
        List <TefforttypesDo> resultTefforttypesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`EFFORTTYPE`, " + 
                    "`DESCRIPTION`, " + 
                    "`NUMERICWEIGHT`, " + 
                    "`NOTES` " + 
                    "FROM " + 
                    "T_EFFORTTYPES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTefforttypesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tefforttypes_objectToTefforttypesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TefforttypesDaoSpringJdbcTemplatesImpl.readListTefforttypes", e);
            throw e;
        }
        return resultTefforttypesDoList;
    }

}

class Tefforttypes_objectToTefforttypesObjectDoRowMapper implements RowMapper <TefforttypesDo> {

    @Override
    public TefforttypesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TefforttypesDo resultTefforttypesDo = new TefforttypesDo();
        resultTefforttypesDo.setEfforttype(paramResultSet.getString("EFFORTTYPE"));
        resultTefforttypesDo.setDescription(paramResultSet.getString("DESCRIPTION"));
        resultTefforttypesDo.setNumericweight(paramResultSet.getLong("NUMERICWEIGHT"));
        resultTefforttypesDo.setNotes(paramResultSet.getString("NOTES"));
        return resultTefforttypesDo;
    }

}

