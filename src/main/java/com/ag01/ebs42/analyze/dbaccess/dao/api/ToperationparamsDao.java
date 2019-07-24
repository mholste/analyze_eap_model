package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.ToperationparamsDo;

public interface ToperationparamsDao {

    public List <ToperationparamsDo> readListToperationparams() throws Exception;

}
