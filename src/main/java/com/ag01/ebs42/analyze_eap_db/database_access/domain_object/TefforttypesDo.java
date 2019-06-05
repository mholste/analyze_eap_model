package com.ag01.ebs42.analyze_eap_db.database_access.domain_object;

import java.io.Serializable;

public class TefforttypesDo implements Serializable {

    private static final long serialVersionUID = -7961445651615994805L;

    private String efforttype;
    private String description;
    private long numericweight;
    private String notes;

    public TefforttypesDo() {
        super();
    }

    public TefforttypesDo(String efforttype, String description, long numericweight, String notes) {
        super();
        this.efforttype = efforttype;
        this.description = description;
        this.numericweight = numericweight;
        this.notes = notes;
    }

    public String getEfforttype() {
        return this.efforttype;
    }

    public void setEfforttype(String efforttype) {
        this.efforttype = efforttype;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getNumericweight() {
        return this.numericweight;
    }

    public void setNumericweight(long numericweight) {
        this.numericweight = numericweight;
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
        result = prime * result + ((efforttype == null) ? 0 : efforttype.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + (int) (numericweight ^ (numericweight >>> 32));
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
        TefforttypesDo other = (TefforttypesDo) obj;
        if(efforttype == null) {
            if(other.efforttype != null)
                return false;
        } else if(!efforttype.equals(other.efforttype))
            return false;
        if(description == null) {
            if(other.description != null)
                return false;
        } else if(!description.equals(other.description))
            return false;
        if(numericweight != other.numericweight)
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
        return "Tefforttypes [ " + " efforttype=" + efforttype + " description=" + description + " numericweight=" + numericweight + " notes=" + notes+ "]";
    }

}

