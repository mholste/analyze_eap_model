package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TpropertytypesDo;

public interface TpropertytypesDao {

    public List <TpropertytypesDo> readListTpropertytypes() throws Exception;

}
