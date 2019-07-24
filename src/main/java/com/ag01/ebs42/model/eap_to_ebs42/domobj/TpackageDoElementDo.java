package com.ag01.ebs42.software_model.eap_to_ebs42.domain_object;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ag01.ebs42.analyze.dbaccess.domobj.TobjectDo;
import com.ag01.ebs42.analyze.dbaccess.domobj.TpackageDo;

public class TpackageDoElementDo implements Serializable {

	private static final long serialVersionUID = -2348629543733658010L;

	private TpackageDo element;
	private TobjectDo elementObject;
	private List<TobjectDo> dependentComponentObjects;
	private List<TobjectDo> dependentInterfaceObjects;
	private List<TobjectDo> dependentProvidedInterfaceObjects;
	private List<TobjectDo> dependentRequiredInterfaceObjects;
	private List<TobjectDo> dependentActorObjects;
	private TpackageDoElementDo parent;
	private List<TpackageDoElementDo> children;
	
	public TpackageDoElementDo() {
		super();
		dependentComponentObjects = new ArrayList <TobjectDo> ();
		dependentInterfaceObjects = new ArrayList <TobjectDo> ();
		dependentProvidedInterfaceObjects = new ArrayList <TobjectDo> ();
		dependentRequiredInterfaceObjects = new ArrayList <TobjectDo> ();
		dependentActorObjects = new ArrayList <TobjectDo> ();
		children = new ArrayList <TpackageDoElementDo> ();
	}

	public TpackageDo getElement() {
		return element;
	}

	public void setElement(TpackageDo element) {
		this.element = element;
	}

	public TobjectDo getElementObject() {
		return elementObject;
	}

	public void setElementObject(TobjectDo elementObject) {
		this.elementObject = elementObject;
	}

	public TpackageDoElementDo getParent() {
		return parent;
	}

	public void setParent(TpackageDoElementDo parent) {
		this.parent = parent;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<TobjectDo> getDependentComponentObjects() {
		return dependentComponentObjects;
	}

	public List<TobjectDo> getDependentInterfaceObjects() {
		return dependentInterfaceObjects;
	}

	public List<TobjectDo> getDependentProvidedInterfaceObjects() {
		return dependentProvidedInterfaceObjects;
	}

	public List<TobjectDo> getDependentRequiredInterfaceObjects() {
		return dependentRequiredInterfaceObjects;
	}

	public List<TobjectDo> getDependentActorObjects() {
		return dependentActorObjects;
	}

	public List<TpackageDoElementDo> getChildren() {
		return children;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((children == null) ? 0 : children.hashCode());
		result = prime * result + ((dependentActorObjects == null) ? 0 : dependentActorObjects.hashCode());
		result = prime * result + ((dependentComponentObjects == null) ? 0 : dependentComponentObjects.hashCode());
		result = prime * result + ((dependentInterfaceObjects == null) ? 0 : dependentInterfaceObjects.hashCode());
		result = prime * result
				+ ((dependentProvidedInterfaceObjects == null) ? 0 : dependentProvidedInterfaceObjects.hashCode());
		result = prime * result
				+ ((dependentRequiredInterfaceObjects == null) ? 0 : dependentRequiredInterfaceObjects.hashCode());
		result = prime * result + ((element == null) ? 0 : element.hashCode());
		result = prime * result + ((elementObject == null) ? 0 : elementObject.hashCode());
		result = prime * result + ((parent == null) ? 0 : parent.hashCode());
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
		TpackageDoElementDo other = (TpackageDoElementDo) obj;
		if (children == null) {
			if (other.children != null)
				return false;
		} else if (!children.equals(other.children))
			return false;
		if (dependentActorObjects == null) {
			if (other.dependentActorObjects != null)
				return false;
		} else if (!dependentActorObjects.equals(other.dependentActorObjects))
			return false;
		if (dependentComponentObjects == null) {
			if (other.dependentComponentObjects != null)
				return false;
		} else if (!dependentComponentObjects.equals(other.dependentComponentObjects))
			return false;
		if (dependentInterfaceObjects == null) {
			if (other.dependentInterfaceObjects != null)
				return false;
		} else if (!dependentInterfaceObjects.equals(other.dependentInterfaceObjects))
			return false;
		if (dependentProvidedInterfaceObjects == null) {
			if (other.dependentProvidedInterfaceObjects != null)
				return false;
		} else if (!dependentProvidedInterfaceObjects.equals(other.dependentProvidedInterfaceObjects))
			return false;
		if (dependentRequiredInterfaceObjects == null) {
			if (other.dependentRequiredInterfaceObjects != null)
				return false;
		} else if (!dependentRequiredInterfaceObjects.equals(other.dependentRequiredInterfaceObjects))
			return false;
		if (element == null) {
			if (other.element != null)
				return false;
		} else if (!element.equals(other.element))
			return false;
		if (elementObject == null) {
			if (other.elementObject != null)
				return false;
		} else if (!elementObject.equals(other.elementObject))
			return false;
		if (parent == null) {
			if (other.parent != null)
				return false;
		} else if (!parent.equals(other.parent))
			return false;
		return true;
	}

}
