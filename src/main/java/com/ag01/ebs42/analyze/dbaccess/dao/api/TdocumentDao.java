package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TdocumentDo;

public interface TdocumentDao {

    public List <TdocumentDo> readListTdocument() throws Exception;

}
