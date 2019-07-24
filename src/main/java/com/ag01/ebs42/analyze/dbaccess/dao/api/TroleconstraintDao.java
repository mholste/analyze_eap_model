package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TroleconstraintDo;

public interface TroleconstraintDao {

    public List <TroleconstraintDo> readListTroleconstraint() throws Exception;

}
