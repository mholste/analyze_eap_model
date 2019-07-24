package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TclientsDo;

public interface TclientsDao {

    public List <TclientsDo> readListTclients() throws Exception;

}
