package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TobjectresourceDo;

public interface TobjectresourceDao {

    public List <TobjectresourceDo> readListTobjectresource() throws Exception;

}
