package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TtestclassDo;

public interface TtestclassDao {

    public List <TtestclassDo> readListTtestclass() throws Exception;

}
