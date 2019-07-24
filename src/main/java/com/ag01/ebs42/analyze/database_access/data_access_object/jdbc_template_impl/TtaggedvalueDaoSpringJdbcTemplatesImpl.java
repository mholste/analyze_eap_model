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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TtaggedvalueDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TtaggedvalueDo;

public class TtaggedvalueDaoSpringJdbcTemplatesImpl implements TtaggedvalueDao {

    private static Logger LOGGER = LogManager.getLogger(TtaggedvalueDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TtaggedvalueDo> readListTtaggedvalue() throws Exception {
        List <TtaggedvalueDo> resultTtaggedvalueDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`PROPERTYID`, " + 
                    "`ELEMENTID`, " + 
                    "`BASECLASS`, " + 
                    "`TAGVALUE`, " + 
                    "`NOTES` " + 
                    "FROM " + 
                    "T_TAGGEDVALUE";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTtaggedvalueDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Ttaggedvalue_objectToTtaggedvalueObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TtaggedvalueDaoSpringJdbcTemplatesImpl.readListTtaggedvalue", e);
            throw e;
        }
        return resultTtaggedvalueDoList;
    }

}

class Ttaggedvalue_objectToTtaggedvalueObjectDoRowMapper implements RowMapper <TtaggedvalueDo> {

    @Override
    public TtaggedvalueDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TtaggedvalueDo resultTtaggedvalueDo = new TtaggedvalueDo();
        resultTtaggedvalueDo.setPropertyid(paramResultSet.getString("PROPERTYID"));
        resultTtaggedvalueDo.setElementid(paramResultSet.getString("ELEMENTID"));
        resultTtaggedvalueDo.setBaseclass(paramResultSet.getString("BASECLASS"));
        resultTtaggedvalueDo.setTagvalue(paramResultSet.getString("TAGVALUE"));
        resultTtaggedvalueDo.setNotes(paramResultSet.getString("NOTES"));
        return resultTtaggedvalueDo;
    }

}

