package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.ToperationtagDo;

public interface ToperationtagDao {

    public List <ToperationtagDo> readListToperationtag() throws Exception;

}
