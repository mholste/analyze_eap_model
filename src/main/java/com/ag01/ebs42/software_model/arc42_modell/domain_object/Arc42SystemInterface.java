package com.ag01.ebs42.software_model.arc42_modell.domain_object;

import java.io.Serializable;

public class Arc42SystemInterface implements Serializable {

	private static final long serialVersionUID = -8987450253873466844L;
	
	private long uId;
	private String systemInterfaceName;
	private String packageName;
	private Arc42SystemDo defindedInSystem;

	public Arc42SystemInterface() {
		super();
	}

	public Arc42SystemInterface(long uId, String systemInterfaceName, String packageName,
			Arc42SystemDo defindedInSystem) {
		super();
		this.uId = uId;
		this.systemInterfaceName = systemInterfaceName;
		this.packageName = packageName;
		this.defindedInSystem = defindedInSystem;
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

	public Arc42SystemDo getDefindedInSystem() {
		return defindedInSystem;
	}

	public void setDefindedInSystem(Arc42SystemDo defindedInSystem) {
		this.defindedInSystem = defindedInSystem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((defindedInSystem == null) ? 0 : defindedInSystem.hashCode());
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
		Arc42SystemInterface other = (Arc42SystemInterface) obj;
		if (defindedInSystem == null) {
			if (other.defindedInSystem != null)
				return false;
		} else if (!defindedInSystem.equals(other.defindedInSystem))
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
		return "Arc42SystemInterface [uId=" + uId + ", systemInterfaceName=" + systemInterfaceName + ", packageName="
				+ packageName + "]";
	}

}
