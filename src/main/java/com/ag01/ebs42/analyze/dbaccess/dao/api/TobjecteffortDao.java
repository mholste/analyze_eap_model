package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TobjecteffortDo;

public interface TobjecteffortDao {

    public List <TobjecteffortDo> readListTobjecteffort() throws Exception;

}
