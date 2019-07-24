package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TscriptDo;

public interface TscriptDao {

    public List <TscriptDo> readListTscript() throws Exception;

}
