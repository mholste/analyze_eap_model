package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TconnectortagDo;

public interface TconnectortagDao {

    public List <TconnectortagDo> readListTconnectortag() throws Exception;

}
