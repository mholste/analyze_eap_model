package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TversionDo;

public interface TversionDao {

    public List <TversionDo> readListTversion() throws Exception;

}
