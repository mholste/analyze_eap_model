package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TtemplateDo;

public interface TtemplateDao {

    public List <TtemplateDo> readListTtemplate() throws Exception;

}
