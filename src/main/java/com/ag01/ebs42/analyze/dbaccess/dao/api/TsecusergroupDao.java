package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TsecusergroupDo;

public interface TsecusergroupDao {

    public List <TsecusergroupDo> readListTsecusergroup() throws Exception;

}
