package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.ToperationpresDo;

public interface ToperationpresDao {

    public List <ToperationpresDo> readListToperationpres() throws Exception;

}
