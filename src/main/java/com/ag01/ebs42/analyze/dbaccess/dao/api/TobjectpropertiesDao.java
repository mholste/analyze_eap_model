package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TobjectpropertiesDo;

public interface TobjectpropertiesDao {

    public List <TobjectpropertiesDo> readListTobjectproperties() throws Exception;

}
