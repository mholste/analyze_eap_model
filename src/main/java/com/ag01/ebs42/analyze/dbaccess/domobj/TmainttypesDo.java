package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class TmainttypesDo implements Serializable {

    private static final long serialVersionUID = -7987885395967842741L;

    private String mainttype;
    private String description;
    private long numericweight;
    private String notes;

    public TmainttypesDo() {
        super();
    }

    public TmainttypesDo(String mainttype, String description, long numericweight, String notes) {
        super();
        this.mainttype = mainttype;
        this.description = description;
        this.numericweight = numericweight;
        this.notes = notes;
    }

    public String getMainttype() {
        return this.mainttype;
    }

    public void setMainttype(String mainttype) {
        this.mainttype = mainttype;
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
        result = prime * result + ((mainttype == null) ? 0 : mainttype.hashCode());
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
        TmainttypesDo other = (TmainttypesDo) obj;
        if(mainttype == null) {
            if(other.mainttype != null)
                return false;
        } else if(!mainttype.equals(other.mainttype))
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
        return "Tmainttypes [ " + " mainttype=" + mainttype + " description=" + description + " numericweight=" + numericweight + " notes=" + notes+ "]";
    }

}

