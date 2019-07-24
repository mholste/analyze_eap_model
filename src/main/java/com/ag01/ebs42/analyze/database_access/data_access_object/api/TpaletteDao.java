package com.ag01.ebs42.analyze.database_access.data_access_object.api;

import java.util.List;

import com.ag01.ebs42.analyze.database_access.domain_object.TpaletteDo;

public interface TpaletteDao {

    public List <TpaletteDo> readListTpalette() throws Exception;

}
