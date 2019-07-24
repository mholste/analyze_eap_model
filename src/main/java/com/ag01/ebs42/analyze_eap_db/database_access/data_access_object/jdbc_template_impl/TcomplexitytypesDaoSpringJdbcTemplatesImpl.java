package com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.jdbc_template_impl;

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

import com.ag01.ebs42.analyze.database_access.domain_object.TcomplexitytypesDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TcomplexitytypesDao;

public class TcomplexitytypesDaoSpringJdbcTemplatesImpl implements TcomplexitytypesDao {

    private static Logger LOGGER = LogManager.getLogger(TcomplexitytypesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TcomplexitytypesDo> readListTcomplexitytypes() throws Exception {
        List <TcomplexitytypesDo> resultTcomplexitytypesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`COMPLEXITY`, " + 
                    "`NUMERICWEIGHT` " + 
                    "FROM " + 
                    "T_COMPLEXITYTYPES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTcomplexitytypesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tcomplexitytypes_objectToTcomplexitytypesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TcomplexitytypesDaoSpringJdbcTemplatesImpl.readListTcomplexitytypes", e);
            throw e;
        }
        return resultTcomplexitytypesDoList;
    }

}

class Tcomplexitytypes_objectToTcomplexitytypesObjectDoRowMapper implements RowMapper <TcomplexitytypesDo> {

    @Override
    public TcomplexitytypesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TcomplexitytypesDo resultTcomplexitytypesDo = new TcomplexitytypesDo();
        resultTcomplexitytypesDo.setComplexity(paramResultSet.getString("COMPLEXITY"));
        resultTcomplexitytypesDo.setNumericweight(paramResultSet.getInt("NUMERICWEIGHT"));
        return resultTcomplexitytypesDo;
    }

}

