package com.ag01.ebs42.analyze_eap_db.database_access.domain_object;

import java.io.Serializable;

public class TtaggedvalueDo implements Serializable {

    private static final long serialVersionUID = -8014325136024723382L;

    private String propertyid;
    private String elementid;
    private String baseclass;
    private String tagvalue;
    private String notes;

    public TtaggedvalueDo() {
        super();
    }

    public TtaggedvalueDo(String propertyid, String elementid, String baseclass, String tagvalue, String notes) {
        super();
        this.propertyid = propertyid;
        this.elementid = elementid;
        this.baseclass = baseclass;
        this.tagvalue = tagvalue;
        this.notes = notes;
    }

    public String getPropertyid() {
        return this.propertyid;
    }

    public void setPropertyid(String propertyid) {
        this.propertyid = propertyid;
    }

    public String getElementid() {
        return this.elementid;
    }

    public void setElementid(String elementid) {
        this.elementid = elementid;
    }

    public String getBaseclass() {
        return this.baseclass;
    }

    public void setBaseclass(String baseclass) {
        this.baseclass = baseclass;
    }

    public String getTagvalue() {
        return this.tagvalue;
    }

    public void setTagvalue(String tagvalue) {
        this.tagvalue = tagvalue;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((propertyid == null) ? 0 : propertyid.hashCode());
        result = prime * result + ((elementid == null) ? 0 : elementid.hashCode());
        result = prime * result + ((baseclass == null) ? 0 : baseclass.hashCode());
        result = prime * result + ((tagvalue == null) ? 0 : tagvalue.hashCode());
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
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
        TtaggedvalueDo other = (TtaggedvalueDo) obj;
        if(propertyid == null) {
            if(other.propertyid != null)
                return false;
        } else if(!propertyid.equals(other.propertyid))
            return false;
        if(elementid == null) {
            if(other.elementid != null)
                return false;
        } else if(!elementid.equals(other.elementid))
            return false;
        if(baseclass == null) {
            if(other.baseclass != null)
                return false;
        } else if(!baseclass.equals(other.baseclass))
            return false;
        if(tagvalue == null) {
            if(other.tagvalue != null)
                return false;
        } else if(!tagvalue.equals(other.tagvalue))
            return false;
        if(notes == null) {
            if(other.notes != null)
                return false;
        } else if(!notes.equals(other.notes))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Ttaggedvalue [ " + " propertyid=" + propertyid + " elementid=" + elementid + " baseclass=" + baseclass + " tagvalue=" + tagvalue + " notes=" + notes+ "]";
    }

}

