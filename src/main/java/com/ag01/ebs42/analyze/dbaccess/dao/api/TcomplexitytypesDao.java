package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TcomplexitytypesDo;

public interface TcomplexitytypesDao {

    public List <TcomplexitytypesDo> readListTcomplexitytypes() throws Exception;

}
