package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TlistsDo;

public interface TlistsDao {

    public List <TlistsDo> readListTlists() throws Exception;

}
