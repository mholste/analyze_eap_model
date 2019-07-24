package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.UsystablesDo;

public interface UsystablesDao {

    public List <UsystablesDo> readListUsystables() throws Exception;

}
