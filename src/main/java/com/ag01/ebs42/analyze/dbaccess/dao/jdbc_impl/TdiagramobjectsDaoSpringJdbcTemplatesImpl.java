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

import com.ag01.ebs42.analyze.dbaccess.dao.api.TdiagramobjectsDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TdiagramobjectsDo;

public class TdiagramobjectsDaoSpringJdbcTemplatesImpl implements TdiagramobjectsDao {

    private static Logger LOGGER = LogManager.getLogger(TdiagramobjectsDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TdiagramobjectsDo> readListTdiagramobjects() throws Exception {
        List <TdiagramobjectsDo> resultTdiagramobjectsDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`DIAGRAM_ID`, " + 
                    "`OBJECT_ID`, " + 
                    "`RECTTOP`, " + 
                    "`RECTLEFT`, " + 
                    "`RECTRIGHT`, " + 
                    "`RECTBOTTOM`, " + 
                    "`SEQUENCE`, " + 
                    "`OBJECTSTYLE`, " + 
                    "`INSTANCE_ID` " + 
                    "FROM " + 
                    "T_DIAGRAMOBJECTS";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTdiagramobjectsDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tdiagramobjects_objectToTdiagramobjectsObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TdiagramobjectsDaoSpringJdbcTemplatesImpl.readListTdiagramobjects", e);
            throw e;
        }
        return resultTdiagramobjectsDoList;
    }

}

class Tdiagramobjects_objectToTdiagramobjectsObjectDoRowMapper implements RowMapper <TdiagramobjectsDo> {

    @Override
    public TdiagramobjectsDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TdiagramobjectsDo resultTdiagramobjectsDo = new TdiagramobjectsDo();
        resultTdiagramobjectsDo.setDiagramid(paramResultSet.getInt("DIAGRAM_ID"));
        resultTdiagramobjectsDo.setObjectid(paramResultSet.getInt("OBJECT_ID"));
        resultTdiagramobjectsDo.setRecttop(paramResultSet.getInt("RECTTOP"));
        resultTdiagramobjectsDo.setRectleft(paramResultSet.getInt("RECTLEFT"));
        resultTdiagramobjectsDo.setRectright(paramResultSet.getInt("RECTRIGHT"));
        resultTdiagramobjectsDo.setRectbottom(paramResultSet.getInt("RECTBOTTOM"));
        resultTdiagramobjectsDo.setSequence(paramResultSet.getInt("SEQUENCE"));
        resultTdiagramobjectsDo.setObjectstyle(paramResultSet.getString("OBJECTSTYLE"));
        resultTdiagramobjectsDo.setInstanceid(paramResultSet.getInt("INSTANCE_ID"));
        return resultTdiagramobjectsDo;
    }

}

