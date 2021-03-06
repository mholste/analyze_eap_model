package com.ag01.ebs42.model.arc42.api;

import java.util.List;

import com.ag01.ebs42.model.arc42.domobj.Arc42SystemComponentImpl;
import com.ag01.ebs42.model.arc42.domobj.Arc42SystemInterfaceImpl;

public interface Arc42SystemDo 
{
	public long getuId();
	public void setuId(long uId);
	public String getSystemName();
	public void setSystemName(String systemName);
	public String getSystemPackageName();
	public void setSystemPackageName(String systemPackageName);
	public List<Arc42SystemComponent> getSystemComponentList();
	public void setSystemComponentList(List<Arc42SystemComponent> systemComponentList);
	public List<Arc42SystemInterface> getSystemInterfaceList();
	public void setSystemInterfaceList(List<Arc42SystemInterface> systemInterfaceList);
	public void addSystemComponent(Arc42SystemComponent component);
	public void removeSystemComponent(Arc42SystemComponent component);
	public void addSystemInterface(Arc42SystemInterface sysInterface);
	public void removeSystemInterface(Arc42SystemInterface sysInterface);
}
