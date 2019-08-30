package com.ag01.ebs42.transform.wrapper;

import com.ag01.ebs42.model.arc42.api.Arc42SystemDo;
import com.ag01.ebs42.model.arc42.api.Arc42SystemInterface;

/**
 * Wrapper class around Arc42SystemInterfaceImpl to keep EA-specific functionalities 
 * out of the meta model.
 * 
 * @author Michael Holste
 *
 */

public abstract class Arc42SystemInterfaceWrapper implements Arc42SystemInterface
{
	private int tmp;
	protected Arc42SystemInterface wrappedSystemInterface;
	
	public Arc42SystemInterfaceWrapper(Arc42SystemInterface wrappedSystemInterface)
	{
		this.wrappedSystemInterface = wrappedSystemInterface;
	}

	@Override
	public long getuId() 
	{
		return wrappedSystemInterface.getuId();
	}

	@Override
	public void setuId(long uId) 
	{
		wrappedSystemInterface.setuId(uId);
	}

	@Override
	public String getSystemInterfaceName() 
	{
		return wrappedSystemInterface.getSystemInterfaceName();
	}

	@Override
	public void setSystemInterfaceName(String systemInterfaceName) 
	{
		wrappedSystemInterface.setSystemInterfaceName(systemInterfaceName);
	}

	@Override
	public String getPackageName() 
	{
		return wrappedSystemInterface.getPackageName();
	}

	@Override
	public void setPackageName(String packageName) 
	{
		wrappedSystemInterface.setPackageName(packageName);
	}

	@Override
	public Arc42SystemDo getDefinedInSystem() 
	{
		return wrappedSystemInterface.getDefinedInSystem();
	}

	@Override
	public void setDefinedInSystem(Arc42SystemDo definedInSystem) 
	{
		wrappedSystemInterface.setDefinedInSystem(definedInSystem);
	}	
}