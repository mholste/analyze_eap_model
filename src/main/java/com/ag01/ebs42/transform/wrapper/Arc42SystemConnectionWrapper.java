package com.ag01.ebs42.transform.wrapper;

import com.ag01.ebs42.model.arc42.api.Arc42SystemConnection;

public abstract class Arc42SystemConnectionWrapper implements Arc42SystemConnection 
{
protected Arc42SystemConnection wrappedSystemConnection;
	
	public Arc42SystemConnectionWrapper(Arc42SystemConnection wrappedSystemConnection)
	{
		this.wrappedSystemConnection = wrappedSystemConnection;
	}
	
	
}
