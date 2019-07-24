package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TcategoryDo;

public interface TcategoryDao {

    public List <TcategoryDo> readListTcategory() throws Exception;

}
