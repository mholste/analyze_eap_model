package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TsecgroupDo;

public interface TsecgroupDao {

    public List <TsecgroupDo> readListTsecgroup() throws Exception;

}
