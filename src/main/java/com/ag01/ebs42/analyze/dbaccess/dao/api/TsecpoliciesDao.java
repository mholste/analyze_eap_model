package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TsecpoliciesDo;

public interface TsecpoliciesDao {

    public List <TsecpoliciesDo> readListTsecpolicies() throws Exception;

}
