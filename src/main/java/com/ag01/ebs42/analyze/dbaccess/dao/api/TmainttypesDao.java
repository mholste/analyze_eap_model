package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TmainttypesDo;

public interface TmainttypesDao {

    public List <TmainttypesDo> readListTmainttypes() throws Exception;

}
