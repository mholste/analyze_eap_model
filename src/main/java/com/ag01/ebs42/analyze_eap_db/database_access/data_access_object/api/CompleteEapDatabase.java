package com.ag01.ebs42.analyze_eap_db.database_access.data_access_object.api;

import com.ag01.ebs42.analyze_eap_db.database_access.domain_object.CompleteEabDatabaseDo;

public interface CompleteEapDatabase {
	
	public CompleteEabDatabaseDo readCompleteEabDatabase() throws Exception;

}
