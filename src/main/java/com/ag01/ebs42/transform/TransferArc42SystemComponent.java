package com.ag01.ebs42.transform;

import java.util.List;

import com.ag01.ebs42.model.arc42.api.Arc42SystemComponent;
import com.ag01.ebs42.model.arc42.api.Arc42SystemDo;
import com.ag01.ebs42.model.arc42.api.Arc42SystemInterface;
import com.ag01.ebs42.transform.wrapper.Arc42SystemComponentWrapper;

public class TransferArc42SystemComponent extends Arc42SystemComponentWrapper
{
	private String eaId;
	private String eaPackageId;
	private String corporateId;
	
	public TransferArc42SystemComponent(Arc42SystemComponent wrappedSystemComponent) {
		super(wrappedSystemComponent);
	}
	
	public Arc42SystemComponent getComponent()
	{
		return super.wrappedSystemComponent;
	}
	public String getCorporateId()
	{
		return this.corporateId;
	}
	
	public void setCorporateId(String id)
	{
		this.corporateId = id;
	}
	
	public String getEaId() 
	{
		return this.eaId;
	}

	public void setEaId(String eaId) 
	{
		this.eaId = eaId;
	}

	public String getEaPackageId() 
	{
		return this.eaPackageId;
	}

	public void setEaPackageId(String eaPackageId) 
	{
		this.eaPackageId = eaPackageId;
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
	public String getSystemComponentName() 
	{
		return super.getSystemComponentName();
	}

	@Override
	public void setSystemComponentName(String systemComponentName) 
	{
		super.setSystemComponentName(systemComponentName);
	}

	@Override
	public Arc42SystemDo getBaseSystem() 
	{
		return super.getBaseSystem();
	}

	@Override
	public void setBaseSystem(Arc42SystemDo baseSystem)
	{
		super.setBaseSystem(baseSystem);
	}

	@Override
	public List<Arc42SystemInterface> getServerInterfaces() 
	{
		return super.getServerInterfaces();
	}

	@Override
	public void setServerInterfaces(List<Arc42SystemInterface> serverInterfaces) 
	{
		super.setServerInterfaces(serverInterfaces);
	}

	@Override
	public List<Arc42SystemInterface> getClientInterfaces() 
	{
		return super.getClientInterfaces();
	}

	@Override
	public void setClientInterfaces(List<Arc42SystemInterface> clientInterfaces) 
	{
		super.setClientInterfaces(clientInterfaces);
	}
}
