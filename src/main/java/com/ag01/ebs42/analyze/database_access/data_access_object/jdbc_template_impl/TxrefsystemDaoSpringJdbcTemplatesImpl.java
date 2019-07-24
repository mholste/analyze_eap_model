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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TxrefsystemDao;
import com.ag01.ebs42.analyze.database_access.domain_object.TxrefsystemDo;

public class TxrefsystemDaoSpringJdbcTemplatesImpl implements TxrefsystemDao {

    private static Logger LOGGER = LogManager.getLogger(TxrefsystemDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TxrefsystemDo> readListTxrefsystem() throws Exception {
        List <TxrefsystemDo> resultTxrefsystemDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`XREFID`, " + 
                    "`NAME`, " + 
                    "`TYPE`, " + 
                    "`VISIBILITY`, " + 
                    "`NAMESPACE`, " + 
                    "`REQUIREMENT`, " + 
                    "`CONSTRAINT`, " + 
                    "`BEHAVIOR`, " + 
                    "`PARTITION`, " + 
                    "`DESCRIPTION`, " + 
                    "`CLIENT`, " + 
                    "`SUPPLIER`, " + 
                    "`LINK`, " + 
                    "`TOOLID` " + 
                    "FROM " + 
                    "T_XREFSYSTEM";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTxrefsystemDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Txrefsystem_objectToTxrefsystemObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TxrefsystemDaoSpringJdbcTemplatesImpl.readListTxrefsystem", e);
            throw e;
        }
        return resultTxrefsystemDoList;
    }

}

class Txrefsystem_objectToTxrefsystemObjectDoRowMapper implements RowMapper <TxrefsystemDo> {

    @Override
    public TxrefsystemDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TxrefsystemDo resultTxrefsystemDo = new TxrefsystemDo();
        resultTxrefsystemDo.setXrefid(paramResultSet.getString("XREFID"));
        resultTxrefsystemDo.setName(paramResultSet.getString("NAME"));
        resultTxrefsystemDo.setType(paramResultSet.getString("TYPE"));
        resultTxrefsystemDo.setVisibility(paramResultSet.getString("VISIBILITY"));
        resultTxrefsystemDo.setNamespace(paramResultSet.getString("NAMESPACE"));
        resultTxrefsystemDo.setRequirement(paramResultSet.getString("REQUIREMENT"));
        resultTxrefsystemDo.setConstraint(paramResultSet.getString("CONSTRAINT"));
        resultTxrefsystemDo.setBehavior(paramResultSet.getString("BEHAVIOR"));
        resultTxrefsystemDo.setPartition(paramResultSet.getString("PARTITION"));
        resultTxrefsystemDo.setDescription(paramResultSet.getString("DESCRIPTION"));
        resultTxrefsystemDo.setClient(paramResultSet.getString("CLIENT"));
        resultTxrefsystemDo.setSupplier(paramResultSet.getString("SUPPLIER"));
        resultTxrefsystemDo.setLink(paramResultSet.getString("LINK"));
        resultTxrefsystemDo.setToolid(paramResultSet.getString("TOOLID"));
        return resultTxrefsystemDo;
    }

}

