package com.ag01.ebs42.analyze.database_access.data_access_object.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TobjectresourceDo;

public interface TobjectresourceDao {

    public List <TobjectresourceDo> readListTobjectresource() throws Exception;

}
