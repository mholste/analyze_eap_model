package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TsnapshotDo;

public interface TsnapshotDao {

    public List <TsnapshotDo> readListTsnapshot() throws Exception;

}
