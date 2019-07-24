package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class TtcfDo implements Serializable {

    private static final long serialVersionUID = -7935005907264146868L;

    private String tcfid;
    private String description;
    private long weight;
    private long value;
    private String notes;

    public TtcfDo() {
        super();
    }

    public TtcfDo(String tcfid, String description, long weight, long value, String notes) {
        super();
        this.tcfid = tcfid;
        this.description = description;
        this.weight = weight;
        this.value = value;
        this.notes = notes;
    }

    public String getTcfid() {
        return this.tcfid;
    }

    public void setTcfid(String tcfid) {
        this.tcfid = tcfid;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getWeight() {
        return this.weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public long getValue() {
        return this.value;
    }

    public void setValue(long value) {
        this.value = value;
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
        result = prime * result + ((tcfid == null) ? 0 : tcfid.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + (int) (weight ^ (weight >>> 32));
        result = prime * result + (int) (value ^ (value >>> 32));
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
        TtcfDo other = (TtcfDo) obj;
        if(tcfid == null) {
            if(other.tcfid != null)
                return false;
        } else if(!tcfid.equals(other.tcfid))
            return false;
        if(description == null) {
            if(other.description != null)
                return false;
        } else if(!description.equals(other.description))
            return false;
        if(weight != other.weight)
            return false;
        if(value != other.value)
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
        return "Ttcf [ " + " tcfid=" + tcfid + " description=" + description + " weight=" + weight + " value=" + value + " notes=" + notes+ "]";
    }

}

