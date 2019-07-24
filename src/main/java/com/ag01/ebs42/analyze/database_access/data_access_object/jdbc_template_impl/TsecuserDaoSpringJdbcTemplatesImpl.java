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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TsecuserDao;
import com.ag01.ebs42.analyze.database_access.domain_object.TsecuserDo;

public class TsecuserDaoSpringJdbcTemplatesImpl implements TsecuserDao {

    private static Logger LOGGER = LogManager.getLogger(TsecuserDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TsecuserDo> readListTsecuser() throws Exception {
        List <TsecuserDo> resultTsecuserDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`USERID`, " + 
                    "`USERLOGIN`, " + 
                    "`FIRSTNAME`, " + 
                    "`SURNAME`, " + 
                    "`DEPARTMENT`, " + 
                    "`PASSWORD` " + 
                    "FROM " + 
                    "T_SECUSER";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTsecuserDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tsecuser_objectToTsecuserObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TsecuserDaoSpringJdbcTemplatesImpl.readListTsecuser", e);
            throw e;
        }
        return resultTsecuserDoList;
    }

}

class Tsecuser_objectToTsecuserObjectDoRowMapper implements RowMapper <TsecuserDo> {

    @Override
    public TsecuserDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TsecuserDo resultTsecuserDo = new TsecuserDo();
        resultTsecuserDo.setUserid(paramResultSet.getString("USERID"));
        resultTsecuserDo.setUserlogin(paramResultSet.getString("USERLOGIN"));
        resultTsecuserDo.setFirstname(paramResultSet.getString("FIRSTNAME"));
        resultTsecuserDo.setSurname(paramResultSet.getString("SURNAME"));
        resultTsecuserDo.setDepartment(paramResultSet.getString("DEPARTMENT"));
        resultTsecuserDo.setPassword(paramResultSet.getString("PASSWORD"));
        return resultTsecuserDo;
    }

}

