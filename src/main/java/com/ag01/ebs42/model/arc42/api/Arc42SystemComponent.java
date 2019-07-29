package com.ag01.ebs42.model.arc42.api;

import java.util.List;

import com.ag01.ebs42.model.arc42.domobj.Arc42SystemInterfaceImpl;

public interface Arc42SystemComponent 
{
	public long getuId();
	public void setuId(long uId);
	public String getSystemComponentName();
	public void setSystemComponentName(String systemComponentName);
	public String getPackageName();
	public void setPackageName(String packageName);
	public Arc42SystemDo getBaseSystem();
	public void setBaseSystem(Arc42SystemDo baseSystem);
	public List<Arc42SystemInterfaceImpl> getServerInterfaces() ;
	public void setServerInterfaces(List<Arc42SystemInterfaceImpl> serverInterfaces);
	public List<Arc42SystemInterfaceImpl> getClientInterfaces();
	public void setClientInterfaces(List<Arc42SystemInterfaceImpl> clientInterfaces);
}
