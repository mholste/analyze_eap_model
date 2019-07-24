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

import com.ag01.ebs42.analyze.dbaccess.dao.api.TconstrainttypesDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TconstrainttypesDo;

public class TconstrainttypesDaoSpringJdbcTemplatesImpl implements TconstrainttypesDao {

    private static Logger LOGGER = LogManager.getLogger(TconstrainttypesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TconstrainttypesDo> readListTconstrainttypes() throws Exception {
        List <TconstrainttypesDo> resultTconstrainttypesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`CONSTRAINT`, " + 
                    "`DESCRIPTION`, " + 
                    "`NOTES` " + 
                    "FROM " + 
                    "T_CONSTRAINTTYPES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTconstrainttypesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tconstrainttypes_objectToTconstrainttypesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TconstrainttypesDaoSpringJdbcTemplatesImpl.readListTconstrainttypes", e);
            throw e;
        }
        return resultTconstrainttypesDoList;
    }

}

class Tconstrainttypes_objectToTconstrainttypesObjectDoRowMapper implements RowMapper <TconstrainttypesDo> {

    @Override
    public TconstrainttypesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TconstrainttypesDo resultTconstrainttypesDo = new TconstrainttypesDo();
        resultTconstrainttypesDo.setConstraint(paramResultSet.getString("CONSTRAINT"));
        resultTconstrainttypesDo.setDescription(paramResultSet.getString("DESCRIPTION"));
        resultTconstrainttypesDo.setNotes(paramResultSet.getString("NOTES"));
        return resultTconstrainttypesDo;
    }

}

