package com.ag01.ebs42.transform.wrapper;

import com.ag01.ebs42.meta_model.api.Arc42SystemComponent;

public abstract class Arc42SystemComponentWrapper implements Arc42SystemComponent
{
	protected Arc42SystemComponent wrappedSystemComponent;
	
	public Arc42SystemComponentWrapper(Arc42SystemComponent wrappedSystemComponent)
	{
		this.wrappedSystemComponent = wrappedSystemComponent;
	}

	@Override
	public String getPackageName() 
	{
		return wrappedSystemComponent.getPackageName();
	}

	@Override
	public void setPackageName(String packageName) 
	{
		wrappedSystemComponent.setPackageName(packageName);
	}

	@Override
	public String getSystemName() 
	{
		return wrappedSystemComponent.getSystemName();
	}

	@Override
	public void setSystemName(String systemName) 
	{
		wrappedSystemComponent.setSystemName(systemName);
	}

	@Override
	public String getCorporateID() 
	{
		return wrappedSystemComponent.getCorporateID();
	}

	@Override
	public void setCorporateIDe(String corporateID) 
	{
		wrappedSystemComponent.setCorporateIDe(corporateID);
	}
	
	
}
