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

import com.ag01.ebs42.analyze.database_access.data_access_object.api.TsnapshotDao;
import com.ag01.ebs42.analyze.dbaccess.domobj.TsnapshotDo;

public class TsnapshotDaoSpringJdbcTemplatesImpl implements TsnapshotDao {

    private static Logger LOGGER = LogManager.getLogger(TsnapshotDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TsnapshotDo> readListTsnapshot() throws Exception {
        List <TsnapshotDo> resultTsnapshotDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`SNAPSHOTID`, " + 
                    "`SERIESID`, " + 
                    "`POSITION`, " + 
                    "`SNAPSHOTNAME`, " + 
                    "`NOTES`, " + 
                    "`STYLE`, " + 
                    "`ELEMENTID`, " + 
                    "`ELEMENTTYPE`, " + 
                    "`STRCONTENT`, " + 
                    "`BINCONTENT1`, " + 
                    "`BINCONTENT2` " + 
                    "FROM " + 
                    "T_SNAPSHOT";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTsnapshotDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Tsnapshot_objectToTsnapshotObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TsnapshotDaoSpringJdbcTemplatesImpl.readListTsnapshot", e);
            throw e;
        }
        return resultTsnapshotDoList;
    }

}

class Tsnapshot_objectToTsnapshotObjectDoRowMapper implements RowMapper <TsnapshotDo> {

    @Override
    public TsnapshotDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TsnapshotDo resultTsnapshotDo = new TsnapshotDo();
        resultTsnapshotDo.setSnapshotid(paramResultSet.getString("SNAPSHOTID"));
        resultTsnapshotDo.setSeriesid(paramResultSet.getString("SERIESID"));
        resultTsnapshotDo.setPosition(paramResultSet.getInt("POSITION"));
        resultTsnapshotDo.setSnapshotname(paramResultSet.getString("SNAPSHOTNAME"));
        resultTsnapshotDo.setNotes(paramResultSet.getString("NOTES"));
        resultTsnapshotDo.setStyle(paramResultSet.getString("STYLE"));
        resultTsnapshotDo.setElementid(paramResultSet.getString("ELEMENTID"));
        resultTsnapshotDo.setElementtype(paramResultSet.getString("ELEMENTTYPE"));
        resultTsnapshotDo.setStrcontent(paramResultSet.getString("STRCONTENT"));
        resultTsnapshotDo.setBincontent1(paramResultSet.getString("BINCONTENT1"));
        resultTsnapshotDo.setBincontent2(paramResultSet.getString("BINCONTENT2"));
        return resultTsnapshotDo;
    }

}

