package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TsecuserDo;

public interface TsecuserDao {

    public List <TsecuserDo> readListTsecuser() throws Exception;

}
