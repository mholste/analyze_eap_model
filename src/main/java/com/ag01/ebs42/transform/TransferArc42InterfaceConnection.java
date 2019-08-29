package com.ag01.ebs42.transform;

import com.ag01.ebs42.model.arc42.api.Arc42InterfaceConnection;
import com.ag01.ebs42.model.arc42.api.Arc42SystemComponent;
import com.ag01.ebs42.model.arc42.api.Arc42SystemInterface;
import com.ag01.ebs42.model.utils.ConnectionType;
import com.ag01.ebs42.model.utils.DirectionType;
import com.ag01.ebs42.transform.wrapper.Arc42InterfaceConnectionWrapper;

public class TransferArc42InterfaceConnection extends Arc42InterfaceConnectionWrapper
{
	private String eaId;
	private String eaStartId;
	private String eaEndId;
	private ConnectionType connection;
	private DirectionType direction;
	
	public TransferArc42InterfaceConnection(Arc42InterfaceConnection wrappedSystemConnection)
	{
		super(wrappedSystemConnection);
	}
	
	@Override
	public String getInterfaceConnectionName() 
	{
		return super.getInterfaceConnectionName();
	}

	@Override
	public void setInterfaceConnectionName(String interfaceConnectionName) 
	{
		super.setInterfaceConnectionName(interfaceConnectionName);
	}

	@Override
	public Arc42SystemComponent getClient() 
	{
		return super.getClient();
	}

	@Override
	public void setClient(Arc42SystemComponent client) 
	{
		super.setClient(client);
	}

	@Override
	public Arc42SystemComponent getServer() 
	{
		return super.getServer();
	}

	@Override
	public void setServer(Arc42SystemComponent server) 
	{
		super.setServer(server);
	}

	@Override
	public String getPackageName() 
	{
		return super.getPackageName();
	}

	@Override
	public void setPackageName(String packageName) 
	{
		super.setPackageName(packageName);
	}

	@Override
	public Arc42SystemInterface getInterfaceDefinition() 
	{
		return super.getInterfaceDefinition();
	}

	@Override
	public void setInterfaceDefinition(Arc42SystemInterface interfaceDef) 
	{
		super.setInterfaceDefinition(interfaceDef);
	}
	
	public ConnectionType getConnectorType() 
	{
		return this.connection;
	}
	
	public void setConnectorType(ConnectionType type) 
	{
		this.connection = type;
	}
	
	public DirectionType getDirection() 
	{
		return this.direction;
	}
	
	public void setDirection(DirectionType direction) 
	{
		this.direction = direction;
	}

	public String getEaId() 
	{
		return eaId;
	}
	
	public void setEaId(String eaId) 
	{
		this.eaId = eaId;
	}
	
	public String getEaStartId() 
	{
		return eaStartId;
	}
	
	public void setEaStartId(String eaStartId) 
	{
		this.eaStartId = eaStartId;
	}
	
	public String getEaEndId() 
	{
		return eaEndId;
	}
	
	public void setEaEndId(String eaEndId) 
	{
		this.eaEndId = eaEndId;
	}	
}
