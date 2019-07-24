package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TstereotypesDo;

public interface TstereotypesDao {

    public List <TstereotypesDo> readListTstereotypes() throws Exception;

}
