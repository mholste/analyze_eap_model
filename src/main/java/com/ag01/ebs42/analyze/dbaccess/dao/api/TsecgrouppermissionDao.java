package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TsecgrouppermissionDo;

public interface TsecgrouppermissionDao {

    public List <TsecgrouppermissionDo> readListTsecgrouppermission() throws Exception;

}
