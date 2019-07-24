package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TconnectorDo;

public interface TconnectorDao {

    public List <TconnectorDo> readListTconnector() throws Exception;

}
