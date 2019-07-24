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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TattributeDao;
import com.ag01.ebs42.analyze.database_access.domain_object.TattributeDo;

public class TattributeDaoSpringJdbcTemplatesImpl implements TattributeDao {

    private static Logger LOGGER = LogManager.getLogger(TattributeDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TattributeDo> readListTattribute() throws Exception {
        List <TattributeDo> resultTattributeDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`OBJECT_ID`, " + 
                    "`NAME`, " + 
                    "`SCOPE`, " + 
                    "`STEREOTYPE`, " + 
                    "`CONTAINMENT`, " + 
                    "`ISSTATIC`, " + 
                    "`ISCOLLECTION`, " + 
                    "`ISORDERED`, " + 
                    "`ALLOWDUPLICATES`, " + 
                    "`LOWERBOUND`, " + 
                    "`UPPERBOUND`, " + 
                    "`CONTAINER`, " + 
                    "`NOTES`, " + 
                    "`DERIVED`, " + 
                    "`ID`, " + 
                    "`POS`, " + 
                    "`GENOPTION`, " + 
                    "`LENGTH`, " + 
                    "`PRECISION`, " + 
                    "`SCALE`, " + 
                    "`CONST`, " + 
                    "`STYLE`, " + 
                    "`CLASSIFIER`, " + 
                    "`DEFAULT`, " + 
                    "`TYPE`, " + 
                    "`EA_GUID`, " + 
                    "`STYLEEX` " + 
                    "FROM " + 
                    "T_ATTRIBUTE";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTattributeDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tattribute_objectToTattributeObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TattributeDaoSpringJdbcTemplatesImpl.readListTattribute", e);
            throw e;
        }
        return resultTattributeDoList;
    }

}

class Tattribute_objectToTattributeObjectDoRowMapper implements RowMapper <TattributeDo> {

    @Override
    public TattributeDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TattributeDo resultTattributeDo = new TattributeDo();
        resultTattributeDo.setObjectid(paramResultSet.getInt("OBJECT_ID"));
        resultTattributeDo.setName(paramResultSet.getString("NAME"));
        resultTattributeDo.setScope(paramResultSet.getString("SCOPE"));
        resultTattributeDo.setStereotype(paramResultSet.getString("STEREOTYPE"));
        resultTattributeDo.setContainment(paramResultSet.getString("CONTAINMENT"));
        resultTattributeDo.setIsstatic(paramResultSet.getInt("ISSTATIC"));
        resultTattributeDo.setIscollection(paramResultSet.getInt("ISCOLLECTION"));
        resultTattributeDo.setIsordered(paramResultSet.getInt("ISORDERED"));
        resultTattributeDo.setAllowduplicates(paramResultSet.getInt("ALLOWDUPLICATES"));
        resultTattributeDo.setLowerbound(paramResultSet.getString("LOWERBOUND"));
        resultTattributeDo.setUpperbound(paramResultSet.getString("UPPERBOUND"));
        resultTattributeDo.setContainer(paramResultSet.getString("CONTAINER"));
        resultTattributeDo.setNotes(paramResultSet.getString("NOTES"));
        resultTattributeDo.setDerived(paramResultSet.getString("DERIVED").charAt(0));
        resultTattributeDo.setId(paramResultSet.getInt("ID"));
        resultTattributeDo.setPos(paramResultSet.getInt("POS"));
        resultTattributeDo.setGenoption(paramResultSet.getString("GENOPTION"));
        resultTattributeDo.setLength(paramResultSet.getInt("LENGTH"));
        resultTattributeDo.setPrecision(paramResultSet.getInt("PRECISION"));
        resultTattributeDo.setScale(paramResultSet.getInt("SCALE"));
        resultTattributeDo.setConst(paramResultSet.getInt("CONST"));
        resultTattributeDo.setStyle(paramResultSet.getString("STYLE"));
        resultTattributeDo.setClassifier(paramResultSet.getString("CLASSIFIER"));
        resultTattributeDo.setDefault(paramResultSet.getString("DEFAULT"));
        resultTattributeDo.setType(paramResultSet.getString("TYPE"));
        resultTattributeDo.setEaguid(paramResultSet.getString("EA_GUID"));
        resultTattributeDo.setStyleex(paramResultSet.getString("STYLEEX"));
        return resultTattributeDo;
    }

}

