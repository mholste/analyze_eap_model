package com.ag01.ebs42.meta_model.api;

public interface Arc42SystemConnection 
{
	public String getInterface();
	public void setInterface(String interfaceName);
	public String getProvidedSystem();
	public void setProvidedSystem(String providedSystem);
	public String getRequiredSystem();
	public void setRequiredSystem(String requiredSystem);	
}
