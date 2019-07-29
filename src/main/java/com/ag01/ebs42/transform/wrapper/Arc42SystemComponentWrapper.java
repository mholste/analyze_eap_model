package com.ag01.ebs42.transform.wrapper;

import java.util.List;

import com.ag01.ebs42.model.arc42.api.Arc42SystemComponent;
import com.ag01.ebs42.model.arc42.api.Arc42SystemDo;
import com.ag01.ebs42.model.arc42.domobj.Arc42SystemInterfaceImpl;

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
	public long getuId() 
	{
		return wrappedSystemComponent.getuId();
	}

	@Override
	public void setuId(long uId) 
	{
		wrappedSystemComponent.setuId(uId);
	}

	@Override
	public String getSystemComponentName() 
	{
		return wrappedSystemComponent.getSystemComponentName();
	}

	@Override
	public void setSystemComponentName(String systemComponentName) 
	{
		wrappedSystemComponent.setSystemComponentName(systemComponentName);
	}

	@Override
	public Arc42SystemDo getBaseSystem() 
	{
		return wrappedSystemComponent.getBaseSystem();
	}

	@Override
	public void setBaseSystem(Arc42SystemDo baseSystem) 
	{
		wrappedSystemComponent.setBaseSystem(baseSystem);
	}

	@Override
	public List<Arc42SystemInterfaceImpl> getServerInterfaces() 
	{
		return wrappedSystemComponent.getServerInterfaces();
	}

	@Override
	public void setServerInterfaces(List<Arc42SystemInterfaceImpl> serverInterfaces) 
	{
		wrappedSystemComponent.setServerInterfaces(serverInterfaces);
	}

	@Override
	public List<Arc42SystemInterfaceImpl> getClientInterfaces() 
	{
		return wrappedSystemComponent.getClientInterfaces();
	}

	@Override
	public void setClientInterfaces(List<Arc42SystemInterfaceImpl> clientInterfaces) 
	{
		wrappedSystemComponent.setClientInterfaces(clientInterfaces);
	}	
}
