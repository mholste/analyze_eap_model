package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TpaletteDo;

public interface TpaletteDao {

    public List <TpaletteDo> readListTpalette() throws Exception;

}
