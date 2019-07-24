package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TattributeDo;

public interface TattributeDao {

    public List <TattributeDo> readListTattribute() throws Exception;

}
