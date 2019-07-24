package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TdiagramlinksDo;

public interface TdiagramlinksDao {

    public List <TdiagramlinksDo> readListTdiagramlinks() throws Exception;

}
