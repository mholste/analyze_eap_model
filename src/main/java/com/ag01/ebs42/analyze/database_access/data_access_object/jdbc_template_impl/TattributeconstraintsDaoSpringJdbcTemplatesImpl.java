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

import com.ag01.ebs42.analyze.database_access.domain_object.TattributeconstraintsDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TattributeconstraintsDao;

public class TattributeconstraintsDaoSpringJdbcTemplatesImpl implements TattributeconstraintsDao {

    private static Logger LOGGER = LogManager.getLogger(TattributeconstraintsDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TattributeconstraintsDo> readListTattributeconstraints() throws Exception {
        List <TattributeconstraintsDo> resultTattributeconstraintsDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`OBJECT_ID`, " + 
                    "`CONSTRAINT`, " + 
                    "`ATTNAME`, " + 
                    "`TYPE`, " + 
                    "`NOTES`, " + 
                    "`ID` " + 
                    "FROM " + 
                    "T_ATTRIBUTECONSTRAINTS";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTattributeconstraintsDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tattributeconstraints_objectToTattributeconstraintsObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TattributeconstraintsDaoSpringJdbcTemplatesImpl.readListTattributeconstraints", e);
            throw e;
        }
        return resultTattributeconstraintsDoList;
    }

}

class Tattributeconstraints_objectToTattributeconstraintsObjectDoRowMapper implements RowMapper <TattributeconstraintsDo> {

    @Override
    public TattributeconstraintsDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TattributeconstraintsDo resultTattributeconstraintsDo = new TattributeconstraintsDo();
        resultTattributeconstraintsDo.setObjectid(paramResultSet.getInt("OBJECT_ID"));
        resultTattributeconstraintsDo.setConstraint(paramResultSet.getString("CONSTRAINT"));
        resultTattributeconstraintsDo.setAttname(paramResultSet.getString("ATTNAME"));
        resultTattributeconstraintsDo.setType(paramResultSet.getString("TYPE"));
        resultTattributeconstraintsDo.setNotes(paramResultSet.getString("NOTES"));
        resultTattributeconstraintsDo.setId(paramResultSet.getInt("ID"));
        return resultTattributeconstraintsDo;
    }

}

