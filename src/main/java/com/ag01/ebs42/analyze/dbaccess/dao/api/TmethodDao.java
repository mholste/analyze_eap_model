package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TmethodDo;

public interface TmethodDao {

    public List <TmethodDo> readListTmethod() throws Exception;

}
