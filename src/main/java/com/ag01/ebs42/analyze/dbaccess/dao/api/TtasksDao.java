package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TtasksDo;

public interface TtasksDao {

    public List <TtasksDo> readListTtasks() throws Exception;

}
