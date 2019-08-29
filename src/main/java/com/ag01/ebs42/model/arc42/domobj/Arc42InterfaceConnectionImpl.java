package com.ag01.ebs42.model.arc42.domobj;

import java.io.Serializable;

import com.ag01.ebs42.model.arc42.api.Arc42InterfaceConnection;
import com.ag01.ebs42.model.arc42.api.Arc42SystemComponent;
import com.ag01.ebs42.model.arc42.api.Arc42SystemInterface;
import com.ag01.ebs42.model.utils.ConnectionType;
import com.ag01.ebs42.model.utils.DirectionType;

public class Arc42InterfaceConnectionImpl implements Serializable, Arc42InterfaceConnection
{
	private static final long serialVersionUID = 1305793179181261351L;
	
	private long uId;
	private String interfaceConnectionName;
	private String packageName;
	private Arc42SystemInterface interfaceDefinition;
	private Arc42SystemComponent client;
	private Arc42SystemComponent server;
	
	public Arc42InterfaceConnectionImpl()
	{
		super();
	}
	
	public Arc42InterfaceConnectionImpl(long uId, String interfaceConnectionName, 
			String packageName, Arc42SystemInterface interfaceDefinition, 
			Arc42SystemComponent client, Arc42SystemComponent server)
	{
		super();
		this.uId = uId;
		this.interfaceConnectionName = interfaceConnectionName;
		this.packageName = packageName;
		this.interfaceDefinition = interfaceDefinition;
		this.client = client;
		this.server = server;
	}
	
	@Override
	public long getuId()
	{
		return uId;
	}
	
	@Override
	public void setuId(long uId)
	{
		this.uId = uId;
	}
	
	@Override
	public String getInterfaceConnectionName() 
	{
		return interfaceConnectionName;
	}
	@Override
	public void setInterfaceConnectionName(String interfaceConnectionName) 
	{
		this.interfaceConnectionName = interfaceConnectionName;
	}
	@Override
	public Arc42SystemComponent getClient() 
	{
		return client;
	}
	@Override
	public void setClient(Arc42SystemComponent client) 
	{
		this.client = client;
	}
	@Override
	public Arc42SystemComponent getServer() 
	{
		return server;
	}
	@Override
	public void setServer(Arc42SystemComponent server) 
	{
		this.server = server;
	}
	@Override
	public String getPackageName() 
	{
		return packageName;
	}
	@Override
	public void setPackageName(String packageName) 
	{
		this.packageName = packageName;
	}
	@Override
	public Arc42SystemInterface getInterfaceDefinition() 
	{
		return interfaceDefinition;
	}
	@Override
	public void setInterfaceDefinition(Arc42SystemInterface interfaceDef) 
	{
		this.interfaceDefinition = interfaceDef;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((interfaceConnectionName == null) ? 0 : interfaceConnectionName.hashCode());
		result = prime * result + ((packageName == null) ? 0 : packageName.hashCode());
		result = prime * result + ((interfaceDefinition == null) ? 0 : interfaceDefinition.hashCode());
		result = prime * result + ((client == null) ? 0 : client.hashCode());
		result = prime * result + ((server == null) ? 0 : server.hashCode());
		result = prime * result + (int) (uId ^ (uId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arc42InterfaceConnectionImpl other = (Arc42InterfaceConnectionImpl) obj;
		if (interfaceConnectionName == null) {
			if (other.interfaceConnectionName != null)
				return false;
		} else if (!interfaceConnectionName.equals(other.interfaceConnectionName))
			return false;
		if (packageName == null) {
			if (other.packageName != null)
				return false;
		} else if (!packageName.equals(other.packageName))
			return false;
		if (interfaceDefinition == null) {
			if (other.interfaceDefinition != null)
				return false;
		} else if (!interfaceDefinition.equals(other.interfaceDefinition))
			return false;
		if (client == null) {
			if (other.client != null)
				return false;
		} else if (!client.equals(other.client))
			return false;
		if (server == null) {
			if (other.server != null)
				return false;
		} else if (!server.equals(other.server))
			return false;
		if (uId != other.uId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Arc42InterfaceConnectionImpl [uId=" + uId + ", interfaceConnectionName=" + interfaceConnectionName + ", packageName="
				+ packageName + ", interfaceDefinition=" + interfaceDefinition
				+ ", client=" + client + ", server=" + server + "]";
	}
	

}
