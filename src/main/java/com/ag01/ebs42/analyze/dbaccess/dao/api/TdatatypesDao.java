package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TdatatypesDo;

public interface TdatatypesDao {

    public List <TdatatypesDo> readListTdatatypes() throws Exception;

}
