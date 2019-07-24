package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TtcfDo;

public interface TtcfDao {

    public List <TtcfDo> readListTtcf() throws Exception;

}
