package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TrulesDo;

public interface TrulesDao {

    public List <TrulesDo> readListTrules() throws Exception;

}
