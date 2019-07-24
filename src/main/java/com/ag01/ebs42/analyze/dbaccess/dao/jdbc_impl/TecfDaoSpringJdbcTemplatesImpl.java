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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TecfDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TecfDo;

public class TecfDaoSpringJdbcTemplatesImpl implements TecfDao {

    private static Logger LOGGER = LogManager.getLogger(TecfDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TecfDo> readListTecf() throws Exception {
        List <TecfDo> resultTecfDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`ECFID`, " + 
                    "`DESCRIPTION`, " + 
                    "`WEIGHT`, " + 
                    "`VALUE`, " + 
                    "`NOTES` " + 
                    "FROM " + 
                    "T_ECF";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTecfDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tecf_objectToTecfObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TecfDaoSpringJdbcTemplatesImpl.readListTecf", e);
            throw e;
        }
        return resultTecfDoList;
    }

}

class Tecf_objectToTecfObjectDoRowMapper implements RowMapper <TecfDo> {

    @Override
    public TecfDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TecfDo resultTecfDo = new TecfDo();
        resultTecfDo.setEcfid(paramResultSet.getString("ECFID"));
        resultTecfDo.setDescription(paramResultSet.getString("DESCRIPTION"));
        resultTecfDo.setWeight(paramResultSet.getLong("WEIGHT"));
        resultTecfDo.setValue(paramResultSet.getLong("VALUE"));
        resultTecfDo.setNotes(paramResultSet.getString("NOTES"));
        return resultTecfDo;
    }

}

