package com.ag01.ebs42.software_model.eap_to_ebs42.domain_object;

import java.io.Serializable;

import com.ag01.ebs42.analyze.dbaccess.domobj.TobjectDo;

public class TobjectDoElementDo implements Serializable {

	private static final long serialVersionUID = -2235820795665052267L;
	
	private TobjectDo element;

	public TobjectDoElementDo() {
		super();
	}

	public TobjectDoElementDo(TobjectDo element) {
		super();
		this.element = element;
	}

	public TobjectDo getElement() {
		return element;
	}

	public void setElement(TobjectDo element) {
		this.element = element;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((element == null) ? 0 : element.hashCode());
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
		TobjectDoElementDo other = (TobjectDoElementDo) obj;
		if (element == null) {
			if (other.element != null)
				return false;
		} else if (!element.equals(other.element))
			return false;
		return true;
	}

}
