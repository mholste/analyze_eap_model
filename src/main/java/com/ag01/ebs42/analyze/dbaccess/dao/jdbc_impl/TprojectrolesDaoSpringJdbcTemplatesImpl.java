package com.ag01.ebs42.analyze.dbaccess.dao.jdbc_impl;

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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TprojectrolesDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TprojectrolesDo;

public class TprojectrolesDaoSpringJdbcTemplatesImpl implements TprojectrolesDao {

    private static Logger LOGGER = LogManager.getLogger(TprojectrolesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TprojectrolesDo> readListTprojectroles() throws Exception {
        List <TprojectrolesDo> resultTprojectrolesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`ROLE`, " + 
                    "`DESCRIPTION`, " + 
                    "`NOTES` " + 
                    "FROM " + 
                    "T_PROJECTROLES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTprojectrolesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tprojectroles_objectToTprojectrolesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TprojectrolesDaoSpringJdbcTemplatesImpl.readListTprojectroles", e);
            throw e;
        }
        return resultTprojectrolesDoList;
    }

}

class Tprojectroles_objectToTprojectrolesObjectDoRowMapper implements RowMapper <TprojectrolesDo> {

    @Override
    public TprojectrolesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TprojectrolesDo resultTprojectrolesDo = new TprojectrolesDo();
        resultTprojectrolesDo.setRole(paramResultSet.getString("ROLE"));
        resultTprojectrolesDo.setDescription(paramResultSet.getString("DESCRIPTION"));
        resultTprojectrolesDo.setNotes(paramResultSet.getString("NOTES"));
        return resultTprojectrolesDo;
    }

}

