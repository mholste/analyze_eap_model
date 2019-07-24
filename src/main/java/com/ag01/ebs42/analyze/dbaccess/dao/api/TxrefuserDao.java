package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TxrefuserDo;

public interface TxrefuserDao {

    public List <TxrefuserDo> readListTxrefuser() throws Exception;

}
