package com.ag01.ebs42.model.arc42.api;

import com.ag01.ebs42.model.arc42.ConnectionType;
import com.ag01.ebs42.model.arc42.DirectionType;

public interface Arc42SystemConnection 
{
	public String getInterface();
	public void setInterface(String interfaceName);
	public String getProvidedSystem();
	public void setProvidedSystem(String providedSystem);
	public String getRequiredSystem();
	public void setRequiredSystem(String requiredSystem);
	public String getConnectionName();
	public void setConnectionName(String connectionName);
	public ConnectionType getConnectorType();
	public void setConnectorType(ConnectionType type);
	public DirectionType getDirection();
	public void setDirection(DirectionType direction);
}
