package com.ag01.ebs42.model.arc42.domobj;

import java.io.Serializable;

public class Bpa42ModelRootDo implements Serializable {

	private static final long serialVersionUID = 2690983293818654617L;

	private long uId;

	public Bpa42ModelRootDo() {
		super();
	}

	public Bpa42ModelRootDo(long uId) {
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
		Bpa42ModelRootDo other = (Bpa42ModelRootDo) obj;
		if (uId != other.uId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bpa42ModelRootDo [uId=" + uId + "]";
	}

}
