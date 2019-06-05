package com.ag01.ebs42.analyze_eap_db.database_access.domain_object;

import java.io.Serializable;

public class TobjectconstraintDo implements Serializable {

    private static final long serialVersionUID = -8014325136024723382L;

    private int objectid;
    private String constraint;
    private String constrainttype;
    private long weight;
    private String notes;
    private String status;

    public TobjectconstraintDo() {
        super();
    }

    public TobjectconstraintDo(int objectid, String constraint, String constrainttype, long weight, String notes, String status) {
        super();
        this.objectid = objectid;
        this.constraint = constraint;
        this.constrainttype = constrainttype;
        this.weight = weight;
        this.notes = notes;
        this.status = status;
    }

    public int getObjectid() {
        return this.objectid;
    }

    public void setObjectid(int objectid) {
        this.objectid = objectid;
    }

    public String getConstraint() {
        return this.constraint;
    }

    public void setConstraint(String constraint) {
        this.constraint = constraint;
    }

    public String getConstrainttype() {
        return this.constrainttype;
    }

    public void setConstrainttype(String constrainttype) {
        this.constrainttype = constrainttype;
    }

    public long getWeight() {
        return this.weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + objectid;
        result = prime * result + ((constraint == null) ? 0 : constraint.hashCode());
        result = prime * result + ((constrainttype == null) ? 0 : constrainttype.hashCode());
        result = prime * result + (int) (weight ^ (weight >>> 32));
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
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
        TobjectconstraintDo other = (TobjectconstraintDo) obj;
        if(objectid != other.objectid)
            return false;
        if(constraint == null) {
            if(other.constraint != null)
                return false;
        } else if(!constraint.equals(other.constraint))
            return false;
        if(constrainttype == null) {
            if(other.constrainttype != null)
                return false;
        } else if(!constrainttype.equals(other.constrainttype))
            return false;
        if(weight != other.weight)
            return false;
        if(notes == null) {
            if(other.notes != null)
                return false;
        } else if(!notes.equals(other.notes))
            return false;
        if(status == null) {
            if(other.status != null)
                return false;
        } else if(!status.equals(other.status))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tobjectconstraint [ " + " objectid=" + objectid + " constraint=" + constraint + " constrainttype=" + constrainttype + " weight=" + weight + " notes=" + notes + " status=" + status+ "]";
    }

}

