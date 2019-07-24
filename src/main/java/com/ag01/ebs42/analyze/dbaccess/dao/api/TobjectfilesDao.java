package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TobjectfilesDo;

public interface TobjectfilesDao {

    public List <TobjectfilesDo> readListTobjectfiles() throws Exception;

}
