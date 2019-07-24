package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TrisktypesDo;

public interface TrisktypesDao {

    public List <TrisktypesDo> readListTrisktypes() throws Exception;

}
