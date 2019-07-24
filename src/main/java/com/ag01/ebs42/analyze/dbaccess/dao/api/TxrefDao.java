package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TxrefDo;

public interface TxrefDao {

    public List <TxrefDo> readListTxref() throws Exception;

}
