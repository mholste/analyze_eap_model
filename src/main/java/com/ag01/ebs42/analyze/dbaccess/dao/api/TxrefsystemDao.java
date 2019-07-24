package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TxrefsystemDo;

public interface TxrefsystemDao {

    public List <TxrefsystemDo> readListTxrefsystem() throws Exception;

}
