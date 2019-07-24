package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TobjectconstraintDo;

public interface TobjectconstraintDao {

    public List <TobjectconstraintDo> readListTobjectconstraint() throws Exception;

}
