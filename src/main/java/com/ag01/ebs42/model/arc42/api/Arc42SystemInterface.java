package com.ag01.ebs42.model.arc42.api;

public interface Arc42SystemInterface 
{
	public long getuId();
	public void setuId(long uId);
	public String getSystemInterfaceName();
	public void setSystemInterfaceName(String systemInterfaceName);
	public String getPackageName();
	public void setPackageName(String packageName);
	public Arc42SystemDo getDefinedInSystem(); 
	public void setDefinedInSystem(Arc42SystemDo definedInSystem);
}
