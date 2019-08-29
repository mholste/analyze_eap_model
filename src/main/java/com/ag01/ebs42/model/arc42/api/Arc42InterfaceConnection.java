package com.ag01.ebs42.model.arc42.api;

import com.ag01.ebs42.model.arc42.ConnectionType;
import com.ag01.ebs42.model.arc42.DirectionType;

public interface Arc42InterfaceConnection 
{
	public String getInterfaceConnectionName();
	public void setInterface(String interfaceConnectionName);
	public Arc42SystemComponent getClient();
	public void setClient(Arc42SystemComponent client);
	public Arc42SystemComponent getServer();
	public void setServer(Arc42SystemComponent server);
	public String getPackageName();
	public void setPackageName(String packageName);
	public Arc42SystemInterface getInterfaceDefinition();
	public void setInterfaceDefinition(Arc42SystemInterface interfaceDef);
}
