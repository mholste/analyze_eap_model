package com.ag01.ebs42.transform.wrapper;

import com.ag01.ebs42.model.arc42.ConnectionType;
import com.ag01.ebs42.model.arc42.DirectionType;
import com.ag01.ebs42.model.arc42.api.Arc42SystemConnection;

public abstract class Arc42SystemConnectionWrapper implements Arc42SystemConnection 
{
protected Arc42SystemConnection wrappedSystemConnection;
	
	public Arc42SystemConnectionWrapper(Arc42SystemConnection wrappedSystemConnection)
	{
		this.wrappedSystemConnection = wrappedSystemConnection;
	}

	@Override
	public String getInterface() 
	{
		return wrappedSystemConnection.getInterface();
	}

	@Override
	public void setInterface(String interfaceName) 
	{
		wrappedSystemConnection.setInterface(interfaceName);
	}

	@Override
	public String getProvidedSystem() 
	{
		return wrappedSystemConnection.getProvidedSystem();
	}

	@Override
	public void setProvidedSystem(String providedSystem) 
	{
		wrappedSystemConnection.setProvidedSystem(providedSystem);
	}

	@Override
	public String getRequiredSystem() 
	{
		return wrappedSystemConnection.getRequiredSystem();
	}

	@Override
	public void setRequiredSystem(String requiredSystem) 
	{
		wrappedSystemConnection.setRequiredSystem(requiredSystem);
	}

	@Override
	public String getConnectionName() 
	{
		return wrappedSystemConnection.getConnectionName();
	}

	@Override
	public void setConnectionName(String connectionName) 
	{
		wrappedSystemConnection.setConnectionName(connectionName);
	}

	@Override
	public ConnectionType getConnectorType() 
	{
		return wrappedSystemConnection.getConnectorType();
	}

	@Override
	public void setConnectorType(ConnectionType type) 
	{
		wrappedSystemConnection.setConnectorType(type);
	}

	@Override
	public DirectionType getDirection() 
	{
		return wrappedSystemConnection.getDirection();
	}

	@Override
	public void setDirection(DirectionType direction) 
	{
		wrappedSystemConnection.setDirection(direction);
	}
	
	
}
