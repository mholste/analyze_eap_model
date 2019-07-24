package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TsecpermissionDo;

public interface TsecpermissionDao {

    public List <TsecpermissionDo> readListTsecpermission() throws Exception;

}
