package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class TobjectpropertiesDo implements Serializable {

    private static final long serialVersionUID = -8014325136024723382L;

    private int propertyid;
    private int objectid;
    private String property;
    private String value;
    private String notes;
    private String eaguid;

    public TobjectpropertiesDo() {
        super();
    }

    public TobjectpropertiesDo(int propertyid, int objectid, String property, String value, String notes, String eaguid) {
        super();
        this.propertyid = propertyid;
        this.objectid = objectid;
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

    public int getObjectid() {
        return this.objectid;
    }

    public void setObjectid(int objectid) {
        this.objectid = objectid;
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
        result = prime * result + objectid;
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
        TobjectpropertiesDo other = (TobjectpropertiesDo) obj;
        if(propertyid != other.propertyid)
            return false;
        if(objectid != other.objectid)
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
        return "Tobjectproperties [ " + " propertyid=" + propertyid + " objectid=" + objectid + " property=" + property + " value=" + value + " notes=" + notes + " eaguid=" + eaguid+ "]";
    }

}

