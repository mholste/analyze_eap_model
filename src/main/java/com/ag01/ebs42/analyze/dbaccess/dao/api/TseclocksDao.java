package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TseclocksDo;

public interface TseclocksDao {

    public List <TseclocksDo> readListTseclocks() throws Exception;

}
