package com.ag01.ebs42.meta_model.impl;

import com.ag01.ebs42.meta_model.api.Arc42SystemInterface;
import com.ag01.ebs42.meta_model.api.InterfaceType;

/**
 * Simple implementaion of <code>Arc42SystemInterfacet</code> with only the methods 
 * of the interface and no additional functionalities.
 * 
 * @author Miochael Holste
 *
 */
public class Arc42SystemInterfaceImpl implements Arc42SystemInterface 
{
	private String interfaceName;
	private InterfaceType interfaceType;
	private String systemName;
	private String technology;
	
	@Override
	public String getInterfaceName() 
	{
		return interfaceName;
	}
	
	@Override
	public void setInterfaceName(String interfaceName) 
	{
		this.interfaceName = interfaceName;
	}
	
	@Override
	public InterfaceType getInterfaceType() 
	{
		return interfaceType;
	}
	
	@Override
	public void setInterfaceType(InterfaceType interfaceType) 
	{
		this.interfaceType = interfaceType;
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
	public String getTechnology() 
	{
		return technology;
	}
	
	@Override
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	
}
