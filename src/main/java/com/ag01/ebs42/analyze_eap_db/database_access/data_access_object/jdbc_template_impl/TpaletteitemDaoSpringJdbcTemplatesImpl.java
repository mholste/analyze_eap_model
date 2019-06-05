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

import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TpaletteitemDao;
import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.TpaletteitemDo;

public class TpaletteitemDaoSpringJdbcTemplatesImpl implements TpaletteitemDao {

    private static Logger LOGGER = LogManager.getLogger(TpaletteitemDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TpaletteitemDo> readListTpaletteitem() throws Exception {
        List <TpaletteitemDo> resultTpaletteitemDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`PALETTEID`, " + 
                    "`ITEMID` " + 
                    "FROM " + 
                    "T_PALETTEITEM";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTpaletteitemDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tpaletteitem_objectToTpaletteitemObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TpaletteitemDaoSpringJdbcTemplatesImpl.readListTpaletteitem", e);
            throw e;
        }
        return resultTpaletteitemDoList;
    }

}

class Tpaletteitem_objectToTpaletteitemObjectDoRowMapper implements RowMapper <TpaletteitemDo> {

    @Override
    public TpaletteitemDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TpaletteitemDo resultTpaletteitemDo = new TpaletteitemDo();
        resultTpaletteitemDo.setPaletteid(paramResultSet.getInt("PALETTEID"));
        resultTpaletteitemDo.setItemid(paramResultSet.getInt("ITEMID"));
        return resultTpaletteitemDo;
    }

}

