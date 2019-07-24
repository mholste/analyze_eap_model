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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TdocumentDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TdocumentDo;

public class TdocumentDaoSpringJdbcTemplatesImpl implements TdocumentDao {

    private static Logger LOGGER = LogManager.getLogger(TdocumentDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TdocumentDo> readListTdocument() throws Exception {
        List <TdocumentDo> resultTdocumentDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`DOCID`, " + 
                    "`DOCNAME`, " + 
                    "`NOTES`, " + 
                    "`STYLE`, " + 
                    "`ELEMENTID`, " + 
                    "`ELEMENTTYPE`, " + 
                    "`STRCONTENT`, " + 
                    "`BINCONTENT`, " + 
                    "`DOCTYPE`, " + 
                    "`AUTHOR`, " + 
                    "`VERSION`, " + 
                    "`ISACTIVE`, " + 
                    "`SEQUENCE`, " + 
                    "`DOCDATE` " + 
                    "FROM " + 
                    "T_DOCUMENT";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTdocumentDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tdocument_objectToTdocumentObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TdocumentDaoSpringJdbcTemplatesImpl.readListTdocument", e);
            throw e;
        }
        return resultTdocumentDoList;
    }

}

class Tdocument_objectToTdocumentObjectDoRowMapper implements RowMapper <TdocumentDo> {

    @Override
    public TdocumentDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TdocumentDo resultTdocumentDo = new TdocumentDo();
        resultTdocumentDo.setDocid(paramResultSet.getString("DOCID"));
        resultTdocumentDo.setDocname(paramResultSet.getString("DOCNAME"));
        resultTdocumentDo.setNotes(paramResultSet.getString("NOTES"));
        resultTdocumentDo.setStyle(paramResultSet.getString("STYLE"));
        resultTdocumentDo.setElementid(paramResultSet.getString("ELEMENTID"));
        resultTdocumentDo.setElementtype(paramResultSet.getString("ELEMENTTYPE"));
        resultTdocumentDo.setStrcontent(paramResultSet.getString("STRCONTENT"));
        resultTdocumentDo.setBincontent(paramResultSet.getString("BINCONTENT"));
        resultTdocumentDo.setDoctype(paramResultSet.getString("DOCTYPE"));
        resultTdocumentDo.setAuthor(paramResultSet.getString("AUTHOR"));
        resultTdocumentDo.setVersion(paramResultSet.getString("VERSION"));
        resultTdocumentDo.setIsactive(paramResultSet.getInt("ISACTIVE"));
        resultTdocumentDo.setSequence(paramResultSet.getInt("SEQUENCE"));
        resultTdocumentDo.setDocdate(paramResultSet.getDate("DOCDATE"));
        return resultTdocumentDo;
    }

}

