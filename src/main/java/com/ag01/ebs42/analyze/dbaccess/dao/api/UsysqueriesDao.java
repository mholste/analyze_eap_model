package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.UsysqueriesDo;

public interface UsysqueriesDao {

    public List <UsysqueriesDo> readListUsysqueries() throws Exception;

}
