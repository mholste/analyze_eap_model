package com.ag01.ebs42.transform.wrapper;

import com.ag01.ebs42.model.arc42.api.Arc42InterfaceConnection;
import com.ag01.ebs42.model.arc42.api.Arc42SystemComponent;
import com.ag01.ebs42.model.arc42.api.Arc42SystemInterface;

public abstract class Arc42InterfaceConnectionWrapper implements Arc42InterfaceConnection 
{
protected Arc42InterfaceConnection wrappedSystemConnection;
	
	public Arc42InterfaceConnectionWrapper(Arc42InterfaceConnection wrappedSystemConnection)
	{
		this.wrappedSystemConnection = wrappedSystemConnection;
	}

	@Override
	public String getInterfaceConnectionName() 
	{
		return wrappedSystemConnection.getInterfaceConnectionName();
	}

	@Override
	public void setInterface(String interfaceConnectionName) 
	{
		wrappedSystemConnection.setInterface(interfaceConnectionName);	
	}

	@Override
	public Arc42SystemComponent getClient() 
	{
		return wrappedSystemConnection.getClient();
	}

	@Override
	public void setClient(Arc42SystemComponent client) 
	{
		wrappedSystemConnection.setClient(client);
	}

	@Override
	public Arc42SystemComponent getServer() 
	{
		return wrappedSystemConnection.getServer();
	}

	@Override
	public void setServer(Arc42SystemComponent server) 
	{
		wrappedSystemConnection.setServer(server);
	}

	@Override
	public String getPackageName() 
	{
		return wrappedSystemConnection.getPackageName();
	}

	@Override
	public void setPackageName(String packageName) 
	{
		wrappedSystemConnection.setPackageName(packageName);
	}

	@Override
	public Arc42SystemInterface getInterfaceDefinition() 
	{
		return wrappedSystemConnection.getInterfaceDefinition();
	}

	@Override
	public void setInterfaceDefinition(Arc42SystemInterface interfaceDef) 
	{
		wrappedSystemConnection.setInterfaceDefinition(interfaceDef);
	}
}
