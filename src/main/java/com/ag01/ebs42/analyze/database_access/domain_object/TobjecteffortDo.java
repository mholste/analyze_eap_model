package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class TobjecteffortDo implements Serializable {

    private static final long serialVersionUID = -7987885395967842741L;

    private int objectid;
    private String effort;
    private String efforttype;
    private long evalue;
    private String notes;

    public TobjecteffortDo() {
        super();
    }

    public TobjecteffortDo(int objectid, String effort, String efforttype, long evalue, String notes) {
        super();
        this.objectid = objectid;
        this.effort = effort;
        this.efforttype = efforttype;
        this.evalue = evalue;
        this.notes = notes;
    }

    public int getObjectid() {
        return this.objectid;
    }

    public void setObjectid(int objectid) {
        this.objectid = objectid;
    }

    public String getEffort() {
        return this.effort;
    }

    public void setEffort(String effort) {
        this.effort = effort;
    }

    public String getEfforttype() {
        return this.efforttype;
    }

    public void setEfforttype(String efforttype) {
        this.efforttype = efforttype;
    }

    public long getEvalue() {
        return this.evalue;
    }

    public void setEvalue(long evalue) {
        this.evalue = evalue;
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
        result = prime * result + objectid;
        result = prime * result + ((effort == null) ? 0 : effort.hashCode());
        result = prime * result + ((efforttype == null) ? 0 : efforttype.hashCode());
        result = prime * result + (int) (evalue ^ (evalue >>> 32));
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
        TobjecteffortDo other = (TobjecteffortDo) obj;
        if(objectid != other.objectid)
            return false;
        if(effort == null) {
            if(other.effort != null)
                return false;
        } else if(!effort.equals(other.effort))
            return false;
        if(efforttype == null) {
            if(other.efforttype != null)
                return false;
        } else if(!efforttype.equals(other.efforttype))
            return false;
        if(evalue != other.evalue)
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
        return "Tobjecteffort [ " + " objectid=" + objectid + " effort=" + effort + " efforttype=" + efforttype + " evalue=" + evalue + " notes=" + notes+ "]";
    }

}

