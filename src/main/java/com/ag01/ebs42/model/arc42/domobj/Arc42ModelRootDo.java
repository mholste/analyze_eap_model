package com.ag01.ebs42.model.arc42.domobj;

import java.io.Serializable;
import java.util.List;

public class Arc42ModelRootDo implements Serializable {

	private static final long serialVersionUID = -4106097424350515652L;
	
	private long uId;
	private List <Arc42FeatureDo> arc42FeatureList;
	private List <Arc42SystemDoImpl> arc42SystemsList;

	public Arc42ModelRootDo() {
		super();
	}

	public Arc42ModelRootDo(long uId, List<Arc42FeatureDo> arc42FeatureList, List<Arc42SystemDoImpl> arc42SystemsList) {
		super();
		this.uId = uId;
		this.arc42FeatureList = arc42FeatureList;
		this.arc42SystemsList = arc42SystemsList;
	}

	public long getuId() {
		return uId;
	}

	public void setuId(long uId) {
		this.uId = uId;
	}

	public List<Arc42FeatureDo> getArc42FeatureList() {
		return arc42FeatureList;
	}

	public void setArc42FeatureList(List<Arc42FeatureDo> arc42FeatureList) {
		this.arc42FeatureList = arc42FeatureList;
	}

	public List<Arc42SystemDoImpl> getArc42SystemsList() {
		return arc42SystemsList;
	}

	public void setArc42SystemsList(List<Arc42SystemDoImpl> arc42SystemsList) {
		this.arc42SystemsList = arc42SystemsList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arc42FeatureList == null) ? 0 : arc42FeatureList.hashCode());
		result = prime * result + ((arc42SystemsList == null) ? 0 : arc42SystemsList.hashCode());
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
		Arc42ModelRootDo other = (Arc42ModelRootDo) obj;
		if (arc42FeatureList == null) {
			if (other.arc42FeatureList != null)
				return false;
		} else if (!arc42FeatureList.equals(other.arc42FeatureList))
			return false;
		if (arc42SystemsList == null) {
			if (other.arc42SystemsList != null)
				return false;
		} else if (!arc42SystemsList.equals(other.arc42SystemsList))
			return false;
		if (uId != other.uId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Arc42ModelRootDo [uId=" + uId + ", arc42FeatureList=" + arc42FeatureList + ", arc42SystemsList="
				+ arc42SystemsList + "]";
	}

}
