package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TphaseDo;

public interface TphaseDao {

    public List <TphaseDo> readListTphase() throws Exception;

}
