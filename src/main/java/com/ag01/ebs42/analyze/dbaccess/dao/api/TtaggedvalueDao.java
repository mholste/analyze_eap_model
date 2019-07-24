package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TtaggedvalueDo;

public interface TtaggedvalueDao {

    public List <TtaggedvalueDo> readListTtaggedvalue() throws Exception;

}
