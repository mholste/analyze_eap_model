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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TimageDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TimageDo;

public class TimageDaoSpringJdbcTemplatesImpl implements TimageDao {

    private static Logger LOGGER = LogManager.getLogger(TimageDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TimageDo> readListTimage() throws Exception {
        List <TimageDo> resultTimageDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`IMAGEID`, " + 
                    "`NAME`, " + 
                    "`TYPE`, " + 
                    "`IMAGE` " + 
                    "FROM " + 
                    "T_IMAGE";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTimageDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Timage_objectToTimageObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TimageDaoSpringJdbcTemplatesImpl.readListTimage", e);
            throw e;
        }
        return resultTimageDoList;
    }

}

class Timage_objectToTimageObjectDoRowMapper implements RowMapper <TimageDo> {

    @Override
    public TimageDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TimageDo resultTimageDo = new TimageDo();
        resultTimageDo.setImageid(paramResultSet.getInt("IMAGEID"));
        resultTimageDo.setName(paramResultSet.getString("NAME"));
        resultTimageDo.setType(paramResultSet.getString("TYPE"));
        resultTimageDo.setImage(paramResultSet.getString("IMAGE"));
        return resultTimageDo;
    }

}

