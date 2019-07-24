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

import com.ag01.ebs42.analyze.database_access.domain_object.ToperationparamsDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.ToperationparamsDao;

public class ToperationparamsDaoSpringJdbcTemplatesImpl implements ToperationparamsDao {

    private static Logger LOGGER = LogManager.getLogger(ToperationparamsDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <ToperationparamsDo> readListToperationparams() throws Exception {
        List <ToperationparamsDo> resultToperationparamsDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`OPERATIONID`, " + 
                    "`NAME`, " + 
                    "`TYPE`, " + 
                    "`DEFAULT`, " + 
                    "`NOTES`, " + 
                    "`POS`, " + 
                    "`CONST`, " + 
                    "`STYLE`, " + 
                    "`KIND`, " + 
                    "`CLASSIFIER`, " + 
                    "`EA_GUID`, " + 
                    "`STYLEEX` " + 
                    "FROM " + 
                    "T_OPERATIONPARAMS";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultToperationparamsDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Toperationparams_objectToToperationparamsObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in ToperationparamsDaoSpringJdbcTemplatesImpl.readListToperationparams", e);
            throw e;
        }
        return resultToperationparamsDoList;
    }

}

class Toperationparams_objectToToperationparamsObjectDoRowMapper implements RowMapper <ToperationparamsDo> {

    @Override
    public ToperationparamsDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        ToperationparamsDo resultToperationparamsDo = new ToperationparamsDo();
        resultToperationparamsDo.setOperationid(paramResultSet.getInt("OPERATIONID"));
        resultToperationparamsDo.setName(paramResultSet.getString("NAME"));
        resultToperationparamsDo.setType(paramResultSet.getString("TYPE"));
        resultToperationparamsDo.setDefault(paramResultSet.getString("DEFAULT"));
        resultToperationparamsDo.setNotes(paramResultSet.getString("NOTES"));
        resultToperationparamsDo.setPos(paramResultSet.getInt("POS"));
        resultToperationparamsDo.setConst(paramResultSet.getInt("CONST"));
        resultToperationparamsDo.setStyle(paramResultSet.getString("STYLE"));
        resultToperationparamsDo.setKind(paramResultSet.getString("KIND"));
        resultToperationparamsDo.setClassifier(paramResultSet.getString("CLASSIFIER"));
        resultToperationparamsDo.setEaguid(paramResultSet.getString("EA_GUID"));
        resultToperationparamsDo.setStyleex(paramResultSet.getString("STYLEEX"));
        return resultToperationparamsDo;
    }

}

