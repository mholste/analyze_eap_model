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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TmainttypesDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TmainttypesDo;

public class TmainttypesDaoSpringJdbcTemplatesImpl implements TmainttypesDao {

    private static Logger LOGGER = LogManager.getLogger(TmainttypesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TmainttypesDo> readListTmainttypes() throws Exception {
        List <TmainttypesDo> resultTmainttypesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`MAINTTYPE`, " + 
                    "`DESCRIPTION`, " + 
                    "`NUMERICWEIGHT`, " + 
                    "`NOTES` " + 
                    "FROM " + 
                    "T_MAINTTYPES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTmainttypesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tmainttypes_objectToTmainttypesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TmainttypesDaoSpringJdbcTemplatesImpl.readListTmainttypes", e);
            throw e;
        }
        return resultTmainttypesDoList;
    }

}

class Tmainttypes_objectToTmainttypesObjectDoRowMapper implements RowMapper <TmainttypesDo> {

    @Override
    public TmainttypesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TmainttypesDo resultTmainttypesDo = new TmainttypesDo();
        resultTmainttypesDo.setMainttype(paramResultSet.getString("MAINTTYPE"));
        resultTmainttypesDo.setDescription(paramResultSet.getString("DESCRIPTION"));
        resultTmainttypesDo.setNumericweight(paramResultSet.getLong("NUMERICWEIGHT"));
        resultTmainttypesDo.setNotes(paramResultSet.getString("NOTES"));
        return resultTmainttypesDo;
    }

}

