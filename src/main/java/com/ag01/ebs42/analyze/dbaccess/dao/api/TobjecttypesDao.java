package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TobjecttypesDo;

public interface TobjecttypesDao {

    public List <TobjecttypesDo> readListTobjecttypes() throws Exception;

}
