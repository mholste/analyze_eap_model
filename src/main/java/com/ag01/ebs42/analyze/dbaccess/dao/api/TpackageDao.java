package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TpackageDo;

public interface TpackageDao {

    public List <TpackageDo> readListTpackage() throws Exception;

}
