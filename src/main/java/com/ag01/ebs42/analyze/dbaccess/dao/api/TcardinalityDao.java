package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TcardinalityDo;

public interface TcardinalityDao {

    public List <TcardinalityDo> readListTcardinality() throws Exception;

}
