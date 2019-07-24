package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TocfDo;

public interface TocfDao {

    public List <TocfDo> readListTocf() throws Exception;

}
