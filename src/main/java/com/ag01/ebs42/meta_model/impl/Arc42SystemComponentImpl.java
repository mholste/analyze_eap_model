package com.ag01.ebs42.meta_model.impl;

import com.ag01.ebs42.meta_model.api.Arc42SystemComponent;

/**
 * Simple implementaion of <code>Arc42SystemComponent</code> with only the methods 
 * of the interface and no additional functionalities.
 * 
 * @author Miochael Holste
 *
 */
public class Arc42SystemComponentImpl implements Arc42SystemComponent 
{
	private String packageName;
	private String systemName;
	private String corporateID;
	
	@Override
	public String getPackageName() 
	{
		return packageName;
	}
	
	@Override
	public void setPackageName(String packageName) 
	{
		this.packageName = packageName;
	}
	
	@Override
	public String getSystemName() 
	{
		return systemName;
	}
	
	@Override
	public void setSystemName(String systemName) 
	{
		this.systemName = systemName;
	}
	
	@Override
	public String getCorporateID() 
	{
		return corporateID;
	}
	
	@Override
	public void setCorporateID(String corporateID) 
	{
		this.corporateID = corporateID;
	}
	
}
