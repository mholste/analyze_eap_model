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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TumlpatternDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TumlpatternDo;

public class TumlpatternDaoSpringJdbcTemplatesImpl implements TumlpatternDao {

    private static Logger LOGGER = LogManager.getLogger(TumlpatternDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TumlpatternDo> readListTumlpattern() throws Exception {
        List <TumlpatternDo> resultTumlpatternDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`PATTERNID`, " + 
                    "`PATTERNCATEGORY`, " + 
                    "`PATTERNNAME`, " + 
                    "`STYLE`, " + 
                    "`NOTES`, " + 
                    "`PATTERNXML`, " + 
                    "`VERSION` " + 
                    "FROM " + 
                    "T_UMLPATTERN";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTumlpatternDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tumlpattern_objectToTumlpatternObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TumlpatternDaoSpringJdbcTemplatesImpl.readListTumlpattern", e);
            throw e;
        }
        return resultTumlpatternDoList;
    }

}

class Tumlpattern_objectToTumlpatternObjectDoRowMapper implements RowMapper <TumlpatternDo> {

    @Override
    public TumlpatternDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TumlpatternDo resultTumlpatternDo = new TumlpatternDo();
        resultTumlpatternDo.setPatternid(paramResultSet.getInt("PATTERNID"));
        resultTumlpatternDo.setPatterncategory(paramResultSet.getString("PATTERNCATEGORY"));
        resultTumlpatternDo.setPatternname(paramResultSet.getString("PATTERNNAME"));
        resultTumlpatternDo.setStyle(paramResultSet.getString("STYLE"));
        resultTumlpatternDo.setNotes(paramResultSet.getString("NOTES"));
        resultTumlpatternDo.setPatternxml(paramResultSet.getString("PATTERNXML"));
        resultTumlpatternDo.setVersion(paramResultSet.getString("VERSION"));
        return resultTumlpatternDo;
    }

}

