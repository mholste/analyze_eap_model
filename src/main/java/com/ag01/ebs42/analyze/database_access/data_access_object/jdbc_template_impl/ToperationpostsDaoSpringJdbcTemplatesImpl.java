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

import com.ag01.ebs42.analyze.database_access.domain_object.ToperationpostsDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.ToperationpostsDao;

public class ToperationpostsDaoSpringJdbcTemplatesImpl implements ToperationpostsDao {

    private static Logger LOGGER = LogManager.getLogger(ToperationpostsDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <ToperationpostsDo> readListToperationposts() throws Exception {
        List <ToperationpostsDo> resultToperationpostsDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`OPERATIONID`, " + 
                    "`POSTCONDITION`, " + 
                    "`TYPE`, " + 
                    "`NOTES` " + 
                    "FROM " + 
                    "T_OPERATIONPOSTS";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultToperationpostsDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Toperationposts_objectToToperationpostsObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in ToperationpostsDaoSpringJdbcTemplatesImpl.readListToperationposts", e);
            throw e;
        }
        return resultToperationpostsDoList;
    }

}

class Toperationposts_objectToToperationpostsObjectDoRowMapper implements RowMapper <ToperationpostsDo> {

    @Override
    public ToperationpostsDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        ToperationpostsDo resultToperationpostsDo = new ToperationpostsDo();
        resultToperationpostsDo.setOperationid(paramResultSet.getInt("OPERATIONID"));
        resultToperationpostsDo.setPostcondition(paramResultSet.getString("POSTCONDITION"));
        resultToperationpostsDo.setType(paramResultSet.getString("TYPE"));
        resultToperationpostsDo.setNotes(paramResultSet.getString("NOTES"));
        return resultToperationpostsDo;
    }

}

