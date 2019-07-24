package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class TconnectortagDo implements Serializable {

    private static final long serialVersionUID = -7935005907264146868L;

    private int propertyid;
    private int elementid;
    private String property;
    private String value;
    private String notes;
    private String eaguid;

    public TconnectortagDo() {
        super();
    }

    public TconnectortagDo(int propertyid, int elementid, String property, String value, String notes, String eaguid) {
        super();
        this.propertyid = propertyid;
        this.elementid = elementid;
        this.property = property;
        this.value = value;
        this.notes = notes;
        this.eaguid = eaguid;
    }

    public int getPropertyid() {
        return this.propertyid;
    }

    public void setPropertyid(int propertyid) {
        this.propertyid = propertyid;
    }

    public int getElementid() {
        return this.elementid;
    }

    public void setElementid(int elementid) {
        this.elementid = elementid;
    }

    public String getProperty() {
        return this.property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getEaguid() {
        return this.eaguid;
    }

    public void setEaguid(String eaguid) {
        this.eaguid = eaguid;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + propertyid;
        result = prime * result + elementid;
        result = prime * result + ((property == null) ? 0 : property.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
        result = prime * result + ((eaguid == null) ? 0 : eaguid.hashCode());
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
        TconnectortagDo other = (TconnectortagDo) obj;
        if(propertyid != other.propertyid)
            return false;
        if(elementid != other.elementid)
            return false;
        if(property == null) {
            if(other.property != null)
                return false;
        } else if(!property.equals(other.property))
            return false;
        if(value == null) {
            if(other.value != null)
                return false;
        } else if(!value.equals(other.value))
            return false;
        if(notes == null) {
            if(other.notes != null)
                return false;
        } else if(!notes.equals(other.notes))
            return false;
        if(eaguid == null) {
            if(other.eaguid != null)
                return false;
        } else if(!eaguid.equals(other.eaguid))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tconnectortag [ " + " propertyid=" + propertyid + " elementid=" + elementid + " property=" + property + " value=" + value + " notes=" + notes + " eaguid=" + eaguid+ "]";
    }

}

