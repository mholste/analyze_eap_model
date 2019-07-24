package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TrequiretypesDo;

public interface TrequiretypesDao {

    public List <TrequiretypesDo> readListTrequiretypes() throws Exception;

}
