package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.UsysoldtablesDo;

public interface UsysoldtablesDao {

    public List <UsysoldtablesDo> readListUsysoldtables() throws Exception;

}
