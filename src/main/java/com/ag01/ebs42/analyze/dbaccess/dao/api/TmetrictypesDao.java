package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TmetrictypesDo;

public interface TmetrictypesDao {

    public List <TmetrictypesDo> readListTmetrictypes() throws Exception;

}
