package com.ag01.ebs42.model.arc42.domobj;

import java.io.Serializable;

public class Ted42ModelRootDo implements Serializable {

	private static final long serialVersionUID = -5149036222680954736L;

	private long uId;

	public Ted42ModelRootDo() {
		super();
	}

	public Ted42ModelRootDo(long uId) {
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
		Ted42ModelRootDo other = (Ted42ModelRootDo) obj;
		if (uId != other.uId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ted42ModelRootDo [uId=" + uId + "]";
	}

}
