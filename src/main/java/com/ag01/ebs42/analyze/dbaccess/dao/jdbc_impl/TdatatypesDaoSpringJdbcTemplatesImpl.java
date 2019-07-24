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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TdatatypesDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TdatatypesDo;

public class TdatatypesDaoSpringJdbcTemplatesImpl implements TdatatypesDao {

    private static Logger LOGGER = LogManager.getLogger(TdatatypesDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TdatatypesDo> readListTdatatypes() throws Exception {
        List <TdatatypesDo> resultTdatatypesDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`TYPE`, " + 
                    "`PRODUCTNAME`, " + 
                    "`DATATYPE`, " + 
                    "`SIZE`, " + 
                    "`MAXLEN`, " + 
                    "`MAXPREC`, " + 
                    "`MAXSCALE`, " + 
                    "`DEFAULTLEN`, " + 
                    "`DEFAULTPREC`, " + 
                    "`DEFAULTSCALE`, " + 
                    "`USER`, " + 
                    "`PDATA1`, " + 
                    "`PDATA2`, " + 
                    "`PDATA3`, " + 
                    "`PDATA4`, " + 
                    "`HASLENGTH`, " + 
                    "`GENERICTYPE`, " + 
                    "`DATATYPEID` " + 
                    "FROM " + 
                    "T_DATATYPES";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTdatatypesDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tdatatypes_objectToTdatatypesObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TdatatypesDaoSpringJdbcTemplatesImpl.readListTdatatypes", e);
            throw e;
        }
        return resultTdatatypesDoList;
    }

}

class Tdatatypes_objectToTdatatypesObjectDoRowMapper implements RowMapper <TdatatypesDo> {

    @Override
    public TdatatypesDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TdatatypesDo resultTdatatypesDo = new TdatatypesDo();
        resultTdatatypesDo.setType(paramResultSet.getString("TYPE"));
        resultTdatatypesDo.setProductname(paramResultSet.getString("PRODUCTNAME"));
        resultTdatatypesDo.setDatatype(paramResultSet.getString("DATATYPE"));
        resultTdatatypesDo.setSize(paramResultSet.getInt("SIZE"));
        resultTdatatypesDo.setMaxlen(paramResultSet.getInt("MAXLEN"));
        resultTdatatypesDo.setMaxprec(paramResultSet.getInt("MAXPREC"));
        resultTdatatypesDo.setMaxscale(paramResultSet.getInt("MAXSCALE"));
        resultTdatatypesDo.setDefaultlen(paramResultSet.getInt("DEFAULTLEN"));
        resultTdatatypesDo.setDefaultprec(paramResultSet.getInt("DEFAULTPREC"));
        resultTdatatypesDo.setDefaultscale(paramResultSet.getInt("DEFAULTSCALE"));
        resultTdatatypesDo.setUser(paramResultSet.getInt("USER"));
        resultTdatatypesDo.setPdata1(paramResultSet.getString("PDATA1"));
        resultTdatatypesDo.setPdata2(paramResultSet.getString("PDATA2"));
        resultTdatatypesDo.setPdata3(paramResultSet.getString("PDATA3"));
        resultTdatatypesDo.setPdata4(paramResultSet.getString("PDATA4"));
        resultTdatatypesDo.setHaslength(paramResultSet.getString("HASLENGTH"));
        resultTdatatypesDo.setGenerictype(paramResultSet.getString("GENERICTYPE"));
        resultTdatatypesDo.setDatatypeid(paramResultSet.getInt("DATATYPEID"));
        return resultTdatatypesDo;
    }

}

