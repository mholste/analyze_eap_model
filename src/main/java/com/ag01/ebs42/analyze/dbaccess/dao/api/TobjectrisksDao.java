package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TobjectrisksDo;

public interface TobjectrisksDao {

    public List <TobjectrisksDo> readListTobjectrisks() throws Exception;

}
