package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TobjecttestsDo;

public interface TobjecttestsDao {

    public List <TobjecttestsDo> readListTobjecttests() throws Exception;

}
