package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TstatustypesDo;

public interface TstatustypesDao {

    public List <TstatustypesDo> readListTstatustypes() throws Exception;

}
