package com.ag01.ebs42.model.arc42.api;

import com.ag01.ebs42.model.utils.ConnectionType;
import com.ag01.ebs42.model.utils.DirectionType;

public interface Arc42InterfaceConnection 
{
	public long getuId();
	public void setuId(long uId);
	public String getInterfaceConnectionName();
	public void setInterfaceConnectionName(String interfaceConnectionName);
	public Arc42SystemComponent getClient();
	public void setClient(Arc42SystemComponent client);
	public Arc42SystemComponent getServer();
	public void setServer(Arc42SystemComponent server);
	public String getPackageName();
	public void setPackageName(String packageName);
	public Arc42SystemInterface getInterfaceDefinition();
	public void setInterfaceDefinition(Arc42SystemInterface interfaceDef);
}
