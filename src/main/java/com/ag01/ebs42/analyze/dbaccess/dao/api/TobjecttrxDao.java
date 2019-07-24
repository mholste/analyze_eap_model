package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TobjecttrxDo;

public interface TobjecttrxDao {

    public List <TobjecttrxDo> readListTobjecttrx() throws Exception;

}
