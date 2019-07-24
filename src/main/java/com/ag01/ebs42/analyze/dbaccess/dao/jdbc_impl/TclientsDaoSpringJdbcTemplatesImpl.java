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

import com.ag01.ebs42.analyze.dbaccess.dao.api.TclientsDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TclientsDo;

public class TclientsDaoSpringJdbcTemplatesImpl implements TclientsDao {

    private static Logger LOGGER = LogManager.getLogger(TclientsDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TclientsDo> readListTclients() throws Exception {
        List <TclientsDo> resultTclientsDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`NAME`, " + 
                    "`ORGANISATION`, " + 
                    "`PHONE1`, " + 
                    "`PHONE2`, " + 
                    "`MOBILE`, " + 
                    "`FAX`, " + 
                    "`EMAIL`, " + 
                    "`ROLES`, " + 
                    "`NOTES` " + 
                    "FROM " + 
                    "T_CLIENTS";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTclientsDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tclients_objectToTclientsObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TclientsDaoSpringJdbcTemplatesImpl.readListTclients", e);
            throw e;
        }
        return resultTclientsDoList;
    }

}

class Tclients_objectToTclientsObjectDoRowMapper implements RowMapper <TclientsDo> {

    @Override
    public TclientsDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TclientsDo resultTclientsDo = new TclientsDo();
        resultTclientsDo.setName(paramResultSet.getString("NAME"));
        resultTclientsDo.setOrganisation(paramResultSet.getString("ORGANISATION"));
        resultTclientsDo.setPhone1(paramResultSet.getString("PHONE1"));
        resultTclientsDo.setPhone2(paramResultSet.getString("PHONE2"));
        resultTclientsDo.setMobile(paramResultSet.getString("MOBILE"));
        resultTclientsDo.setFax(paramResultSet.getString("FAX"));
        resultTclientsDo.setEmail(paramResultSet.getString("EMAIL"));
        resultTclientsDo.setRoles(paramResultSet.getString("ROLES"));
        resultTclientsDo.setNotes(paramResultSet.getString("NOTES"));
        return resultTclientsDo;
    }

}

