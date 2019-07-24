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

import com.ag01.ebs42.analyze.dbaccess.dao.api.TprimitivesDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TprimitivesDo;

public class TprimitivesDaoSpringJdbcTemplatesImpl implements TprimitivesDao {

    private static Logger LOGGER = LogManager.getLogger(TprimitivesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TprimitivesDo> readListTprimitives() throws Exception {
        List <TprimitivesDo> resultTprimitivesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`DATATYPE`, " + 
                    "`DESCRIPTION` " + 
                    "FROM " + 
                    "T_PRIMITIVES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTprimitivesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tprimitives_objectToTprimitivesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TprimitivesDaoSpringJdbcTemplatesImpl.readListTprimitives", e);
            throw e;
        }
        return resultTprimitivesDoList;
    }

}

class Tprimitives_objectToTprimitivesObjectDoRowMapper implements RowMapper <TprimitivesDo> {

    @Override
    public TprimitivesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TprimitivesDo resultTprimitivesDo = new TprimitivesDo();
        resultTprimitivesDo.setDatatype(paramResultSet.getString("DATATYPE"));
        resultTprimitivesDo.setDescription(paramResultSet.getString("DESCRIPTION"));
        return resultTprimitivesDo;
    }

}

