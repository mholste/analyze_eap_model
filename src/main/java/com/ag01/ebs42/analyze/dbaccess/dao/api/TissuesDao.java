package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TissuesDo;

public interface TissuesDao {

    public List <TissuesDo> readListTissues() throws Exception;

}
