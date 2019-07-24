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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TproblemtypesDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TproblemtypesDo;

public class TproblemtypesDaoSpringJdbcTemplatesImpl implements TproblemtypesDao {

    private static Logger LOGGER = LogManager.getLogger(TproblemtypesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TproblemtypesDo> readListTproblemtypes() throws Exception {
        List <TproblemtypesDo> resultTproblemtypesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`PROBLEMTYPE`, " + 
                    "`DESCRIPTION`, " + 
                    "`NUMERICWEIGHT`, " + 
                    "`NOTES` " + 
                    "FROM " + 
                    "T_PROBLEMTYPES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTproblemtypesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tproblemtypes_objectToTproblemtypesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TproblemtypesDaoSpringJdbcTemplatesImpl.readListTproblemtypes", e);
            throw e;
        }
        return resultTproblemtypesDoList;
    }

}

class Tproblemtypes_objectToTproblemtypesObjectDoRowMapper implements RowMapper <TproblemtypesDo> {

    @Override
    public TproblemtypesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TproblemtypesDo resultTproblemtypesDo = new TproblemtypesDo();
        resultTproblemtypesDo.setProblemtype(paramResultSet.getString("PROBLEMTYPE"));
        resultTproblemtypesDo.setDescription(paramResultSet.getString("DESCRIPTION"));
        resultTproblemtypesDo.setNumericweight(paramResultSet.getLong("NUMERICWEIGHT"));
        resultTproblemtypesDo.setNotes(paramResultSet.getString("NOTES"));
        return resultTproblemtypesDo;
    }

}

