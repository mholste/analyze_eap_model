package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TdiagramtypesDo;

public interface TdiagramtypesDao {

    public List <TdiagramtypesDo> readListTdiagramtypes() throws Exception;

}
