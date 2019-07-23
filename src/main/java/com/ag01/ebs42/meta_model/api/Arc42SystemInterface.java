package com.ag01.ebs42.meta_model.api;

/**
 * Definition of an interface in the system model.
 *  
 * @author Michael Holste
 *
 */
public interface Arc42SystemInterface 
{
	public String getInterfaceName();
	public void setInterfaceName(String interfaceName);
	public InterfaceType getInterfaceType();
	public void setInterfaceType(InterfaceType type);
	public String getSystemName();
	public void setSystemName(String systemName);
	public String getTechnology();
	public void setTechnology(String technology);
}
