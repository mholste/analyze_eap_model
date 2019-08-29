package com.ag01.ebs42.model.arc42.domobj;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ag01.ebs42.model.arc42.api.Arc42SystemComponent;
import com.ag01.ebs42.model.arc42.api.Arc42SystemDo;
import com.ag01.ebs42.model.arc42.api.Arc42SystemInterface;

public class Arc42SystemDoImpl implements Serializable, Arc42SystemDo {

	private static final long serialVersionUID = -847835343185268648L;
	
	private long uId;
	private String systemName;
	private String systemPackageName;
	private List <Arc42SystemComponent> systemComponentList;
	private List <Arc42SystemInterface> systemInterfaceList;

	public Arc42SystemDoImpl() {
		super();
	}

	public Arc42SystemDoImpl(long uId, String systemName, String systemPackageName, List<Arc42SystemComponent> systemComponentList, List<Arc42SystemInterface> systemInterfaceList) {
		super();
		this.uId = uId;
		this.systemName = systemName;
		this.systemPackageName = systemPackageName;
		this.systemComponentList = systemComponentList;
		this.systemInterfaceList = systemInterfaceList;
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
	public String getSystemName() 
	{
		return systemName;
	}

	@Override
	public void setSystemName(String systemName) 
	{
		this.systemName = systemName;
	}

	@Override
	public String getSystemPackageName() 
	{
		return systemPackageName;
	}

	@Override
	public void setSystemPackageName(String systemPackageName) 
	{
		this.systemPackageName = systemPackageName;
	}

	@Override
	public List<Arc42SystemInterface> getSystemInterfaceList() 
	{
		return systemInterfaceList;
	}

	@Override
	public void setSystemInterfaceList(List<Arc42SystemInterface> systemInterfaceList) 
	{
		this.systemInterfaceList = systemInterfaceList;
	}
	
	@Override
	public List<Arc42SystemComponent> getSystemComponentList()
	{
		return systemComponentList;
	}
	
	@Override
	public void setSystemComponentList(List<Arc42SystemComponent> systemComponentList) 
	{
		this.systemComponentList = systemComponentList;
	}
	
	@Override
	public void addSystemComponent(Arc42SystemComponent component) 
	{
		if (this.systemComponentList == null)
		{
			this.systemComponentList = new ArrayList<Arc42SystemComponent>();
		}
		this.systemComponentList.add(component);
	}
	
	@Override
	public void removeSystemComponent(Arc42SystemComponent component) 
	{
		this.systemComponentList.remove(component);
	}
	
	@Override
	public void addSystemInterface(Arc42SystemInterface sysInterface) 
	{
		if (this.systemInterfaceList == null)
		{
			this.systemInterfaceList = new ArrayList<Arc42SystemInterface>();
		}
		this.systemInterfaceList.add(sysInterface);		
	}
	
	@Override
	public void removeSystemInterface(Arc42SystemInterface sysInterface) 
	{
		this.systemInterfaceList.remove(sysInterface);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((systemComponentList == null) ? 0 : systemComponentList.hashCode());
		result = prime * result + ((systemInterfaceList == null) ? 0 : systemInterfaceList.hashCode());
		result = prime * result + ((systemName == null) ? 0 : systemName.hashCode());
		result = prime * result + ((systemPackageName == null) ? 0 : systemPackageName.hashCode());
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
		Arc42SystemDoImpl other = (Arc42SystemDoImpl) obj;
		if (systemComponentList == null) {
			if (other.systemComponentList != null)
				return false;
		} else if (!systemComponentList.equals(other.systemComponentList))
			return false;
		if (systemInterfaceList == null) {
			if (other.systemInterfaceList != null)
				return false;
		} else if (!systemInterfaceList.equals(other.systemInterfaceList))
			return false;
		if (systemName == null) {
			if (other.systemName != null)
				return false;
		} else if (!systemName.equals(other.systemName))
			return false;
		if (systemPackageName == null) {
			if (other.systemPackageName != null)
				return false;
		} else if (!systemPackageName.equals(other.systemPackageName))
			return false;
		if (uId != other.uId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Arc42SystemDoImpl [uId=" + uId + ", systemName=" + systemName + ", systemPackageName=" + systemPackageName
				+ ", systemComponentList=" + systemComponentList + ", systemInterfaceList=" + systemInterfaceList + "]";
	}
}
