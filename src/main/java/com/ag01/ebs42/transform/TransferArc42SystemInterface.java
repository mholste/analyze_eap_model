package com.ag01.ebs42.transform;

import com.ag01.ebs42.model.arc42.InterfaceType;
import com.ag01.ebs42.model.arc42.api.Arc42SystemDo;
import com.ag01.ebs42.model.arc42.api.Arc42SystemInterface;
import com.ag01.ebs42.transform.wrapper.Arc42SystemInterfaceWrapper;

/** Transfer class for <code>Arc42SystemInterfaceImpl</code> that shifts additional 
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
	private String interfaceName;
	private InterfaceType interfaceType;
	public TransferArc42SystemInterface(Arc42SystemInterface wrappedSystemInterface) 
	{
		super(wrappedSystemInterface);
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
	
	public void setInterfaceType(InterfaceType type)
	{
		this.interfaceType = type;
	}
	public InterfaceType getInterfaceType()
	{
		return interfaceType;
	}

	@Override
	public long getuId() 
	{
		return super.getuId();
	}

	@Override
	public void setuId(long uId) 
	{
		super.setuId(uId);
	}

	@Override
	public String getSystemInterfaceName() 
	{
		return super.getSystemInterfaceName();
	}

	@Override
	public void setSystemInterfaceName(String systemInterfaceName) 
	{
		super.setSystemInterfaceName(systemInterfaceName);
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
	public Arc42SystemDo getDefinedInSystem() 
	{
		return super.getDefinedInSystem();
	}

	@Override
	public void setDefinedInSystem(Arc42SystemDo definedInSystem) 
	{
		super.setDefinedInSystem(definedInSystem);
	}	
}
