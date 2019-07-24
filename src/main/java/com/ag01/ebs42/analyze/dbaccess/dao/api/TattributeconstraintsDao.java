package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TattributeconstraintsDo;

public interface TattributeconstraintsDao {

    public List <TattributeconstraintsDo> readListTattributeconstraints() throws Exception;

}
