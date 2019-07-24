package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TconstrainttypesDo;

public interface TconstrainttypesDao {

    public List <TconstrainttypesDo> readListTconstrainttypes() throws Exception;

}
