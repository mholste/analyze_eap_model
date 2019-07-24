package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TobjectmetricsDo;

public interface TobjectmetricsDao {

    public List <TobjectmetricsDo> readListTobjectmetrics() throws Exception;

}
