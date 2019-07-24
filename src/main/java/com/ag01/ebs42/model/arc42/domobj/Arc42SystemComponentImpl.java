package com.ag01.ebs42.model.arc42.domobj;

import java.io.Serializable;
import java.util.List;

public class Arc42SystemComponentImpl implements Serializable {

	private static final long serialVersionUID = 2933493620446266608L;
	
	private long uId;
	private String systemComponentName;
	private String packageName;
	private Arc42SystemDo baseSystem;
	private List <Arc42SystemInterface> serverInterfaces;
	private List <Arc42SystemInterface> clientInterfaces;

	public Arc42SystemComponentImpl() {
		super();
	}

	public Arc42SystemComponentImpl(long uId, String systemComponentName, String packageName, Arc42SystemDo baseSystem,
			List<Arc42SystemInterface> serverInterfaces, List<Arc42SystemInterface> clientInterfaces) {
		super();
		this.uId = uId;
		this.systemComponentName = systemComponentName;
		this.packageName = packageName;
		this.baseSystem = baseSystem;
		this.serverInterfaces = serverInterfaces;
		this.clientInterfaces = clientInterfaces;
	}

	public long getuId() {
		return uId;
	}

	public void setuId(long uId) {
		this.uId = uId;
	}

	public String getSystemComponentName() {
		return systemComponentName;
	}

	public void setSystemComponentName(String systemComponentName) {
		this.systemComponentName = systemComponentName;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public Arc42SystemDo getBaseSystem() {
		return baseSystem;
	}

	public void setBaseSystem(Arc42SystemDo baseSystem) {
		this.baseSystem = baseSystem;
	}

	public List<Arc42SystemInterface> getServerInterfaces() {
		return serverInterfaces;
	}

	public void setServerInterfaces(List<Arc42SystemInterface> serverInterfaces) {
		this.serverInterfaces = serverInterfaces;
	}

	public List<Arc42SystemInterface> getClientInterfaces() {
		return clientInterfaces;
	}

	public void setClientInterfaces(List<Arc42SystemInterface> clientInterfaces) {
		this.clientInterfaces = clientInterfaces;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((baseSystem == null) ? 0 : baseSystem.hashCode());
		result = prime * result + ((clientInterfaces == null) ? 0 : clientInterfaces.hashCode());
		result = prime * result + ((packageName == null) ? 0 : packageName.hashCode());
		result = prime * result + ((serverInterfaces == null) ? 0 : serverInterfaces.hashCode());
		result = prime * result + ((systemComponentName == null) ? 0 : systemComponentName.hashCode());
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
		Arc42SystemComponentImpl other = (Arc42SystemComponentImpl) obj;
		if (baseSystem == null) {
			if (other.baseSystem != null)
				return false;
		} else if (!baseSystem.equals(other.baseSystem))
			return false;
		if (clientInterfaces == null) {
			if (other.clientInterfaces != null)
				return false;
		} else if (!clientInterfaces.equals(other.clientInterfaces))
			return false;
		if (packageName == null) {
			if (other.packageName != null)
				return false;
		} else if (!packageName.equals(other.packageName))
			return false;
		if (serverInterfaces == null) {
			if (other.serverInterfaces != null)
				return false;
		} else if (!serverInterfaces.equals(other.serverInterfaces))
			return false;
		if (systemComponentName == null) {
			if (other.systemComponentName != null)
				return false;
		} else if (!systemComponentName.equals(other.systemComponentName))
			return false;
		if (uId != other.uId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Arc42SystemComponentImpl [uId=" + uId + ", systemComponentName=" + systemComponentName + ", packageName="
				+ packageName + ", serverInterfaces=" + serverInterfaces
				+ ", clientInterfaces=" + clientInterfaces + "]";
	}
	
}
