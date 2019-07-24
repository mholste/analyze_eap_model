package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TdiagramDo;

public interface TdiagramDao {

    public List <TdiagramDo> readListTdiagram() throws Exception;

}
