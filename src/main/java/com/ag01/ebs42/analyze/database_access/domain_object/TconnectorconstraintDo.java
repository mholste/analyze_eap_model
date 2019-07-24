package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class TconnectorconstraintDo implements Serializable {

    private static final long serialVersionUID = 9054247325084909416L;

    private int connectorid;
    private String constraint;
    private String constrainttype;
    private String notes;

    public TconnectorconstraintDo() {
        super();
    }

    public TconnectorconstraintDo(int connectorid, String constraint, String constrainttype, String notes) {
        super();
        this.connectorid = connectorid;
        this.constraint = constraint;
        this.constrainttype = constrainttype;
        this.notes = notes;
    }

    public int getConnectorid() {
        return this.connectorid;
    }

    public void setConnectorid(int connectorid) {
        this.connectorid = connectorid;
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
        result = prime * result + connectorid;
        result = prime * result + ((constraint == null) ? 0 : constraint.hashCode());
        result = prime * result + ((constrainttype == null) ? 0 : constrainttype.hashCode());
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
        TconnectorconstraintDo other = (TconnectorconstraintDo) obj;
        if(connectorid != other.connectorid)
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
        if(notes == null) {
            if(other.notes != null)
                return false;
        } else if(!notes.equals(other.notes))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tconnectorconstraint [ " + " connectorid=" + connectorid + " constraint=" + constraint + " constrainttype=" + constrainttype + " notes=" + notes+ "]";
    }

}

