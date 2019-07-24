package com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api;

import java.util.List;

import com.ag01.ebs42.analyze.database_access.domain_object.TsecgrouppermissionDo;

public interface TsecgrouppermissionDao {

    public List <TsecgrouppermissionDo> readListTsecgrouppermission() throws Exception;

}
