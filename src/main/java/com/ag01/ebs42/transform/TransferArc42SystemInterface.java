package com.ag01.ebs42.transform;

import com.ag01.ebs42.meta_model.api.Arc42SystemInterface;
import com.ag01.ebs42.meta_model.api.InterfaceType;
import com.ag01.ebs42.transform.wrapper.Arc42SystemInterfaceWrapper;

/** Transfer class for <code>Arc42SystemInterface</code> that shifts additional 
 * functionality from EA to a temporary layer for the model.
 * 
 * @author Michael Holste
 *
 */
public class TransferArc42SystemInterface extends Arc42SystemInterfaceWrapper 
{
	private String eaId;
	private String eaPackageId;
	private String eaParentId;
	private String corporateId;
	public TransferArc42SystemInterface(Arc42SystemInterface wrappedSystemInterface) 
	{
		super(wrappedSystemInterface);
	}
	
	@Override
	public String getInterfaceName() 
	{
		return super.getInterfaceName();
	}

	@Override
	public void setInterfaceName(String interfaceName) 
	{
		super.setInterfaceName(interfaceName);
	}

	@Override
	public InterfaceType getInterfaceType() 
	{
		return super.getInterfaceType();
	}

	@Override
	public void setInterfaceType(InterfaceType type) 
	{
		super.setInterfaceType(type);
	}

	@Override
	public String getSystemName() 
	{
		return super.getSystemName();
	}

	@Override
	public void setSystemName(String systemName) 
	{
		super.setSystemName(systemName);
	}

	@Override
	public String getTechnology() 
	{
		return super.getTechnology();
	}

	@Override
	public void setTechnology(String technology) 
	{
		super.setTechnology(technology);
	}

	public String getEaId() 
	{
		return eaId;
	}

	public void setEaId(String eaId) 
	{
		this.eaId = eaId;
	}

	public String getEaPackageId() 
	{
		return eaPackageId;
	}

	public void setEaPackageId(String eaPackageId) 
	{
		this.eaPackageId = eaPackageId;
	}

	public String getEaParentId() 
	{
		return eaParentId;
	}

	public void setEaParentId(String eaParentId) 
	{
		this.eaParentId = eaParentId;
	}
	
	public void setCorporateId(String corporateId)
	{
		this.corporateId = corporateId;
	}
	
	public String getCorporateId()
	{
		return corporateId;
	}
}
