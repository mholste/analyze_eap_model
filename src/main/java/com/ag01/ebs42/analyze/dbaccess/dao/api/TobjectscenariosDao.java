package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TobjectscenariosDo;

public interface TobjectscenariosDao {

    public List <TobjectscenariosDo> readListTobjectscenarios() throws Exception;

}
