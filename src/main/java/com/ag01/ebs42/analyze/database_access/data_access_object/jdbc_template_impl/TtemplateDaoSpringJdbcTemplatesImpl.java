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

import com.ag01.ebs42.analyze.database_access.domain_object.TtemplateDo;
import com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api.TtemplateDao;

public class TtemplateDaoSpringJdbcTemplatesImpl implements TtemplateDao {

    private static Logger LOGGER = LogManager.getLogger(TtemplateDaoSpringJdbcTemplatesImpl.class);

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List <TtemplateDo> readListTtemplate() throws Exception {
        List <TtemplateDo> resultTtemplateDoList = null;
        try {
            String sqlSelectString = "SELECT " +
                    "`TEMPLATEID`, " + 
                    "`TEMPLATETYPE`, " + 
                    "`TEMPLATENAME`, " + 
                    "`NOTES`, " + 
                    "`STYLE`, " + 
                    "`TEMPLATE` " + 
                    "FROM " + 
                    "T_TEMPLATE";
            SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
            resultTtemplateDoList = namedParameterJdbcTemplate.query(sqlSelectString, sqlParameterSource, new Ttemplate_objectToTtemplateObjectDoRowMapper());
        } catch(Exception e) {
            LOGGER.debug("exception in TtemplateDaoSpringJdbcTemplatesImpl.readListTtemplate", e);
            throw e;
        }
        return resultTtemplateDoList;
    }

}

class Ttemplate_objectToTtemplateObjectDoRowMapper implements RowMapper <TtemplateDo> {

    @Override
    public TtemplateDo mapRow(ResultSet paramResultSet, int paramInt) throws SQLException {
        TtemplateDo resultTtemplateDo = new TtemplateDo();
        resultTtemplateDo.setTemplateid(paramResultSet.getString("TEMPLATEID"));
        resultTtemplateDo.setTemplatetype(paramResultSet.getString("TEMPLATETYPE"));
        resultTtemplateDo.setTemplatename(paramResultSet.getString("TEMPLATENAME"));
        resultTtemplateDo.setNotes(paramResultSet.getString("NOTES"));
        resultTtemplateDo.setStyle(paramResultSet.getString("STYLE"));
        resultTtemplateDo.setTemplate(paramResultSet.getString("TEMPLATE"));
        return resultTtemplateDo;
    }

}

