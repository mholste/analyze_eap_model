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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TxrefuserDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TxrefuserDo;

public class TxrefuserDaoSpringJdbcTemplatesImpl implements TxrefuserDao {

    private static Logger LOGGER = LogManager.getLogger(TxrefuserDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TxrefuserDo> readListTxrefuser() throws Exception {
        List <TxrefuserDo> resultTxrefuserDoList = null;
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
                    "T_XREFUSER";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTxrefuserDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Txrefuser_objectToTxrefuserObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TxrefuserDaoSpringJdbcTemplatesImpl.readListTxrefuser", e);
            throw e;
        }
        return resultTxrefuserDoList;
    }

}

class Txrefuser_objectToTxrefuserObjectDoRowMapper implements RowMapper <TxrefuserDo> {

    @Override
    public TxrefuserDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TxrefuserDo resultTxrefuserDo = new TxrefuserDo();
        resultTxrefuserDo.setXrefid(paramResultSet.getString("XREFID"));
        resultTxrefuserDo.setName(paramResultSet.getString("NAME"));
        resultTxrefuserDo.setType(paramResultSet.getString("TYPE"));
        resultTxrefuserDo.setVisibility(paramResultSet.getString("VISIBILITY"));
        resultTxrefuserDo.setNamespace(paramResultSet.getString("NAMESPACE"));
        resultTxrefuserDo.setRequirement(paramResultSet.getString("REQUIREMENT"));
        resultTxrefuserDo.setConstraint(paramResultSet.getString("CONSTRAINT"));
        resultTxrefuserDo.setBehavior(paramResultSet.getString("BEHAVIOR"));
        resultTxrefuserDo.setPartition(paramResultSet.getString("PARTITION"));
        resultTxrefuserDo.setDescription(paramResultSet.getString("DESCRIPTION"));
        resultTxrefuserDo.setClient(paramResultSet.getString("CLIENT"));
        resultTxrefuserDo.setSupplier(paramResultSet.getString("SUPPLIER"));
        resultTxrefuserDo.setLink(paramResultSet.getString("LINK"));
        resultTxrefuserDo.setToolid(paramResultSet.getString("TOOLID"));
        return resultTxrefuserDo;
    }

}

