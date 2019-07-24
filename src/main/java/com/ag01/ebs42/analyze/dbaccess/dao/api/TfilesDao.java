package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TfilesDo;

public interface TfilesDao {

    public List <TfilesDo> readListTfiles() throws Exception;

}
