package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TconstantsDo;

public interface TconstantsDao {

    public List <TconstantsDo> readListTconstants() throws Exception;

}
