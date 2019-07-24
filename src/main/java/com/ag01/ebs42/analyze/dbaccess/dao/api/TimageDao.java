package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TimageDo;

public interface TimageDao {

    public List <TimageDo> readListTimage() throws Exception;

}
