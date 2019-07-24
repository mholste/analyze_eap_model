package com.ag01.ebs42.model.arc42.domobj;

import java.io.Serializable;

public class Ebs42ModelRootDo implements Serializable {

	private static final long serialVersionUID = 9103480664581067592L;
	
	private long uId;
	private Bpa42ModelRootDo bpa42ModelRootDo;
	private Arc42ModelRootDo arc42ModelRootDo;
	private Ted42ModelRootDo ted42ModelRootDo;

	public Ebs42ModelRootDo() {
		super();
	}

	public Ebs42ModelRootDo(long uId, Bpa42ModelRootDo bpa42ModelRootDo, Arc42ModelRootDo arc42ModelRootDo, Ted42ModelRootDo ted42ModelRootDo) {
		super();
		this.uId = uId;
		this.bpa42ModelRootDo = bpa42ModelRootDo;
		this.arc42ModelRootDo = arc42ModelRootDo;
		this.ted42ModelRootDo = ted42ModelRootDo;
	}

	public long getuId() {
		return uId;
	}

	public void setuId(long uId) {
		this.uId = uId;
	}

	public Bpa42ModelRootDo getBpa42ModelRootDo() {
		return bpa42ModelRootDo;
	}

	public void setBpa42ModelRootDo(Bpa42ModelRootDo bpa42ModelRootDo) {
		this.bpa42ModelRootDo = bpa42ModelRootDo;
	}

	public Arc42ModelRootDo getArc42ModelRootDo() {
		return arc42ModelRootDo;
	}

	public void setArc42ModelRootDo(Arc42ModelRootDo arc42ModelRootDo) {
		this.arc42ModelRootDo = arc42ModelRootDo;
	}

	public Ted42ModelRootDo getTed42ModelRootDo() {
		return ted42ModelRootDo;
	}

	public void setTed42ModelRootDo(Ted42ModelRootDo ted42ModelRootDo) {
		this.ted42ModelRootDo = ted42ModelRootDo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arc42ModelRootDo == null) ? 0 : arc42ModelRootDo.hashCode());
		result = prime * result + ((bpa42ModelRootDo == null) ? 0 : bpa42ModelRootDo.hashCode());
		result = prime * result + ((ted42ModelRootDo == null) ? 0 : ted42ModelRootDo.hashCode());
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
		Ebs42ModelRootDo other = (Ebs42ModelRootDo) obj;
		if (arc42ModelRootDo == null) {
			if (other.arc42ModelRootDo != null)
				return false;
		} else if (!arc42ModelRootDo.equals(other.arc42ModelRootDo))
			return false;
		if (bpa42ModelRootDo == null) {
			if (other.bpa42ModelRootDo != null)
				return false;
		} else if (!bpa42ModelRootDo.equals(other.bpa42ModelRootDo))
			return false;
		if (ted42ModelRootDo == null) {
			if (other.ted42ModelRootDo != null)
				return false;
		} else if (!ted42ModelRootDo.equals(other.ted42ModelRootDo))
			return false;
		if (uId != other.uId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ebs42ModelRootDo [uId=" + uId + ", bpa42ModelRootDo=" + bpa42ModelRootDo + ", arc42ModelRootDo="
				+ arc42ModelRootDo + ", ted42ModelRootDo=" + ted42ModelRootDo + "]";
	}

}
