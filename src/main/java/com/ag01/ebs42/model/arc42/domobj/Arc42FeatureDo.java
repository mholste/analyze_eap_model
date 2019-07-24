package com.ag01.ebs42.model.arc42.domobj;

import java.io.Serializable;

public class Arc42FeatureDo implements Serializable {

	private static final long serialVersionUID = -5094719419759391323L;
	
	private long uId;

	public Arc42FeatureDo() {
		super();
	}

	public Arc42FeatureDo(long uId) {
		super();
		this.uId = uId;
	}

	public long getuId() {
		return uId;
	}

	public void setuId(long uId) {
		this.uId = uId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Arc42FeatureDo other = (Arc42FeatureDo) obj;
		if (uId != other.uId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Arc42FeatureDo [uId=" + uId + "]";
	}

}
