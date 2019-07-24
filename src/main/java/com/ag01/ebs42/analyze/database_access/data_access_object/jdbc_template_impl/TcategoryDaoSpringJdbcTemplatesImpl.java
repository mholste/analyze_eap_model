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

import com.ag01.ebs42.analyze.database_access.domain_object.TcategoryDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TcategoryDao;

public class TcategoryDaoSpringJdbcTemplatesImpl implements TcategoryDao {

    private static Logger LOGGER = LogManager.getLogger(TcategoryDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TcategoryDo> readListTcategory() throws Exception {
        List <TcategoryDo> resultTcategoryDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`CATEGORYID`, " + 
                    "`NAME`, " + 
                    "`TYPE`, " + 
                    "`NOTES` " + 
                    "FROM " + 
                    "T_CATEGORY";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTcategoryDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tcategory_objectToTcategoryObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TcategoryDaoSpringJdbcTemplatesImpl.readListTcategory", e);
            throw e;
        }
        return resultTcategoryDoList;
    }

}

class Tcategory_objectToTcategoryObjectDoRowMapper implements RowMapper <TcategoryDo> {

    @Override
    public TcategoryDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TcategoryDo resultTcategoryDo = new TcategoryDo();
        resultTcategoryDo.setCategoryid(paramResultSet.getInt("CATEGORYID"));
        resultTcategoryDo.setName(paramResultSet.getString("NAME"));
        resultTcategoryDo.setType(paramResultSet.getString("TYPE"));
        resultTcategoryDo.setNotes(paramResultSet.getString("NOTES"));
        return resultTcategoryDo;
    }

}

