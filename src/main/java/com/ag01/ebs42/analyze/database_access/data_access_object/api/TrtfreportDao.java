package com.ag01.ebs42.analyze.database_access.data_access_object.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TrtfreportDo;

public interface TrtfreportDao {

    public List <TrtfreportDo> readListTrtfreport() throws Exception;

}
