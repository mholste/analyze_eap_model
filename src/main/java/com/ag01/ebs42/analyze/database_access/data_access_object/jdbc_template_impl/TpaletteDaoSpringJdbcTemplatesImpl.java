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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TpaletteDao;
import com.ag01.ebs42.analyze.database_access.domain_object.TpaletteDo;

public class TpaletteDaoSpringJdbcTemplatesImpl implements TpaletteDao {

    private static Logger LOGGER = LogManager.getLogger(TpaletteDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TpaletteDo> readListTpalette() throws Exception {
        List <TpaletteDo> resultTpaletteDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`PALETTEID`, " + 
                    "`NAME`, " + 
                    "`TYPE` " + 
                    "FROM " + 
                    "T_PALETTE";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTpaletteDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tpalette_objectToTpaletteObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TpaletteDaoSpringJdbcTemplatesImpl.readListTpalette", e);
            throw e;
        }
        return resultTpaletteDoList;
    }

}

class Tpalette_objectToTpaletteObjectDoRowMapper implements RowMapper <TpaletteDo> {

    @Override
    public TpaletteDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TpaletteDo resultTpaletteDo = new TpaletteDo();
        resultTpaletteDo.setPaletteid(paramResultSet.getInt("PALETTEID"));
        resultTpaletteDo.setName(paramResultSet.getString("NAME"));
        resultTpaletteDo.setType(paramResultSet.getString("TYPE"));
        return resultTpaletteDo;
    }

}

