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

import com.ag01.ebs42.analyze.dbaccess.dao.api.TxrefDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TxrefDo;

public class TxrefDaoSpringJdbcTemplatesImpl implements TxrefDao {

    private static Logger LOGGER = LogManager.getLogger(TxrefDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TxrefDo> readListTxref() throws Exception {
        List <TxrefDo> resultTxrefDoList = null;
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
                    "`LINK` " + 
                    "FROM " + 
                    "T_XREF";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTxrefDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Txref_objectToTxrefObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TxrefDaoSpringJdbcTemplatesImpl.readListTxref", e);
            throw e;
        }
        return resultTxrefDoList;
    }

}

class Txref_objectToTxrefObjectDoRowMapper implements RowMapper <TxrefDo> {

    @Override
    public TxrefDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TxrefDo resultTxrefDo = new TxrefDo();
        resultTxrefDo.setXrefid(paramResultSet.getString("XREFID"));
        resultTxrefDo.setName(paramResultSet.getString("NAME"));
        resultTxrefDo.setType(paramResultSet.getString("TYPE"));
        resultTxrefDo.setVisibility(paramResultSet.getString("VISIBILITY"));
        resultTxrefDo.setNamespace(paramResultSet.getString("NAMESPACE"));
        resultTxrefDo.setRequirement(paramResultSet.getString("REQUIREMENT"));
        resultTxrefDo.setConstraint(paramResultSet.getString("CONSTRAINT"));
        resultTxrefDo.setBehavior(paramResultSet.getString("BEHAVIOR"));
        resultTxrefDo.setPartition(paramResultSet.getString("PARTITION"));
        resultTxrefDo.setDescription(paramResultSet.getString("DESCRIPTION"));
        resultTxrefDo.setClient(paramResultSet.getString("CLIENT"));
        resultTxrefDo.setSupplier(paramResultSet.getString("SUPPLIER"));
        resultTxrefDo.setLink(paramResultSet.getString("LINK"));
        return resultTxrefDo;
    }

}

