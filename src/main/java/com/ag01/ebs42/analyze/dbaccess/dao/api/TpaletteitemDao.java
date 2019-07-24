package com.ag01.ebs42.analyze.dbaccess.dao.api;

import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TpaletteitemDo;

public interface TpaletteitemDao {

    public List <TpaletteitemDo> readListTpaletteitem() throws Exception;

}
