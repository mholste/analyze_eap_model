package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class TroleconstraintDo implements Serializable {

    private static final long serialVersionUID = -8014325136024723382L;

    private int connectorid;
    private String constraint;
    private String connectorend;
    private String constrainttype;
    private String notes;

    public TroleconstraintDo() {
        super();
    }

    public TroleconstraintDo(int connectorid, String constraint, String connectorend, String constrainttype, String notes) {
        super();
        this.connectorid = connectorid;
        this.constraint = constraint;
        this.connectorend = connectorend;
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

    public String getConnectorend() {
        return this.connectorend;
    }

    public void setConnectorend(String connectorend) {
        this.connectorend = connectorend;
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
        result = prime * result + ((connectorend == null) ? 0 : connectorend.hashCode());
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
        TroleconstraintDo other = (TroleconstraintDo) obj;
        if(connectorid != other.connectorid)
            return false;
        if(constraint == null) {
            if(other.constraint != null)
                return false;
        } else if(!constraint.equals(other.constraint))
            return false;
        if(connectorend == null) {
            if(other.connectorend != null)
                return false;
        } else if(!connectorend.equals(other.connectorend))
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
        return "Troleconstraint [ " + " connectorid=" + connectorid + " constraint=" + constraint + " connectorend=" + connectorend + " constrainttype=" + constrainttype + " notes=" + notes+ "]";
    }

}

