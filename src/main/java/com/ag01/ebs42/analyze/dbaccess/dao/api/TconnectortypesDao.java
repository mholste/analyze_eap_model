package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TconnectortypesDo;

public interface TconnectortypesDao {

    public List <TconnectortypesDo> readListTconnectortypes() throws Exception;

}
