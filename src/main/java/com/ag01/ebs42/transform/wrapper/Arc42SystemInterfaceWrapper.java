package com.ag01.ebs42.transform.wrapper;

import com.ag01.ebs42.meta_model.api.Arc42SystemInterface;
import com.ag01.ebs42.meta_model.api.InterfaceType;

/**
 * Wrapper class around Arc42SystemInterface to keep EA-specific functionalities 
 * out of the meta model.
 * 
 * @author Michael Holste
 *
 */
public abstract class Arc42SystemInterfaceWrapper implements Arc42SystemInterface
{
	// Instance of the wrapped class
	protected Arc42SystemInterface wrappedSystemInterface;
	
	public Arc42SystemInterfaceWrapper(Arc42SystemInterface wrappedSystemInterface)
	{
		this.wrappedSystemInterface = wrappedSystemInterface;
	}

	@Override
	public String getInterfaceName() 
	{
		return wrappedSystemInterface.getInterfaceName();
	}

	@Override
	public void setInterfaceName(String interfaceName) 
	{
		wrappedSystemInterface.setInterfaceName(interfaceName);
	}

	@Override
	public InterfaceType getInterfaceType() 
	{
		return wrappedSystemInterface.getInterfaceType();
	}

	@Override
	public void setInterfaceType(InterfaceType type) 
	{
		wrappedSystemInterface.setInterfaceType(type);
	}

	@Override
	public String getSystemName() 
	{
		return wrappedSystemInterface.getSystemName();
	}

	@Override
	public void setSystemName(String systemName) 
	{
		wrappedSystemInterface.setSystemName(systemName);
	}

	@Override
	public String getTechnology() 
	{
		return wrappedSystemInterface.getTechnology();
	}

	@Override
	public void setTechnology(String technology) 
	{
		wrappedSystemInterface.setTechnology(technology);
	}
	
	
}
