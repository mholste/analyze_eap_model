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
	public List<Arc42SystemInterface> getServerInterfaces() ;
	public void setServerInterfaces(List<Arc42SystemInterface> serverInterfaces);
	public List<Arc42SystemInterface> getClientInterfaces();
	public void setClientInterfaces(List<Arc42SystemInterface> clientInterfaces);
}
