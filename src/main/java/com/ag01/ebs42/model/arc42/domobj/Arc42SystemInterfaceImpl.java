package com.ag01.ebs42.model.arc42.domobj;

import java.io.Serializable;

public class Arc42SystemInterfaceImpl implements Serializable {

	private static final long serialVersionUID = -8987450253873466844L;
	
	private long uId;
	private String systemInterfaceName;
	private String packageName;
	private Arc42SystemDoImpl definedInSystem;

	public Arc42SystemInterfaceImpl() {
		super();
	}

	public Arc42SystemInterfaceImpl(long uId, String systemInterfaceName, String packageName,
			Arc42SystemDoImpl defindedInSystem) {
		super();
		this.uId = uId;
		this.systemInterfaceName = systemInterfaceName;
		this.packageName = packageName;
		this.definedInSystem = defindedInSystem;
	}

	public long getuId() {
		return uId;
	}

	public void setuId(long uId) {
		this.uId = uId;
	}

	public String getSystemInterfaceName() {
		return systemInterfaceName;
	}

	public void setSystemInterfaceName(String systemInterfaceName) {
		this.systemInterfaceName = systemInterfaceName;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public Arc42SystemDoImpl getDefinedInSystem() {
		return definedInSystem;
	}

	public void setDefinedInSystem(Arc42SystemDoImpl definedInSystem) {
		this.definedInSystem = definedInSystem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((definedInSystem == null) ? 0 : definedInSystem.hashCode());
		result = prime * result + ((packageName == null) ? 0 : packageName.hashCode());
		result = prime * result + ((systemInterfaceName == null) ? 0 : systemInterfaceName.hashCode());
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
		Arc42SystemInterfaceImpl other = (Arc42SystemInterfaceImpl) obj;
		if (definedInSystem == null) {
			if (other.definedInSystem != null)
				return false;
		} else if (!definedInSystem.equals(other.definedInSystem))
			return false;
		if (packageName == null) {
			if (other.packageName != null)
				return false;
		} else if (!packageName.equals(other.packageName))
			return false;
		if (systemInterfaceName == null) {
			if (other.systemInterfaceName != null)
				return false;
		} else if (!systemInterfaceName.equals(other.systemInterfaceName))
			return false;
		if (uId != other.uId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Arc42SystemInterfaceImpl [uId=" + uId + ", systemInterfaceName=" + systemInterfaceName + ", packageName="
				+ packageName + "]";
	}

}
