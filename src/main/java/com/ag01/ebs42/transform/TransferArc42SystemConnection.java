package com.ag01.ebs42.transform;

import com.ag01.ebs42.meta_model.api.Arc42SystemConnection;
import com.ag01.ebs42.transform.wrapper.Arc42SystemConnectionWrapper;

public class TransferArc42SystemConnection extends Arc42SystemConnectionWrapper
{
	private String eaId;
	private String eaStartId;
	private String eaEndId;
	
	public TransferArc42SystemConnection(Arc42SystemConnection wrappedSystemConnection)
	{
		super(wrappedSystemConnection);
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
	
	public String getEsEndId() 
	{
		return eaEndId;
	}
	
	public void setEsEndId(String eaEndId) 
	{
		this.eaEndId = eaEndId;
	}	
}