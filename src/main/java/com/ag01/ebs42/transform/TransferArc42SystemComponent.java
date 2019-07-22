package com.ag01.ebs42.transform;

import com.ag01.ebs42.meta_model.api.Arc42SystemComponent;
import com.ag01.ebs42.transform.wrapper.Arc42SystemComponentWrapper;

public class TransferArc42SystemComponent extends Arc42SystemComponentWrapper
{
	private String eaId;
	private String eaPackageId;
	
	public TransferArc42SystemComponent(Arc42SystemComponent wrappedSystemComponent) {
		super(wrappedSystemComponent);
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
	public void setCorporateID(String corporateID) 
	{
		wrappedSystemComponent.setCorporateID(corporateID);
	}

	public String getEaId() 
	{
		return eaId;
	}

	public void setEaId(String eaId) 
	{
		this.eaId = eaId;
	}

	public String getEaPackageId() 
	{
		return eaPackageId;
	}

	public void setEaPackageId(String eaPackageId) 
	{
		this.eaPackageId = eaPackageId;
	}	
}
