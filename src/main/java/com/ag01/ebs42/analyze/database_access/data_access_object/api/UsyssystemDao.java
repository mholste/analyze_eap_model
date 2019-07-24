package com.ag01.ebs42.analyze.database_access.data_access_object.api;

import java.util.List;

import com.ag01.ebs42.analyze.database_access.domain_object.UsyssystemDo;

public interface UsyssystemDao {

    public List <UsyssystemDo> readListUsyssystem() throws Exception;

}
