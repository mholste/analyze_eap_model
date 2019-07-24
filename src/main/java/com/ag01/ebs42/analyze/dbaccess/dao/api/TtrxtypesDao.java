package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TtrxtypesDo;

public interface TtrxtypesDao {

    public List <TtrxtypesDo> readListTtrxtypes() throws Exception;

}
