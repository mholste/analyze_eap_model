package com.ag01.ebs42.model.arc42.api;

import com.ag01.ebs42.model.arc42.domobj.Arc42SystemDoImpl;

public interface Arc42SystemInterface 
{
	public long getuId();
	public void setuId(long uId);
	public String getSystemInterfaceName();
	public void setSystemInterfaceName(String systemInterfaceName);
	public String getPackageName();
	public void setPackageName(String packageName);
	public Arc42SystemDoImpl getDefinedInSystem(); 
	public void setDefinedInSystem(Arc42SystemDoImpl definedInSystem);
}
