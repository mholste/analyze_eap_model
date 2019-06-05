package com.ag01.ebs42.analyze_eap_db.database_access.domain_object;

import java.io.Serializable;

public class ToperationpresDo implements Serializable {

    private static final long serialVersionUID = 9131914070628801802L;

    private int operationid;
    private String precondition;
    private String type;
    private String notes;

    public ToperationpresDo() {
        super();
    }

    public ToperationpresDo(int operationid, String precondition, String type, String notes) {
        super();
        this.operationid = operationid;
        this.precondition = precondition;
        this.type = type;
        this.notes = notes;
    }

    public int getOperationid() {
        return this.operationid;
    }

    public void setOperationid(int operationid) {
        this.operationid = operationid;
    }

    public String getPrecondition() {
        return this.precondition;
    }

    public void setPrecondition(String precondition) {
        this.precondition = precondition;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
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
        result = prime * result + operationid;
        result = prime * result + ((precondition == null) ? 0 : precondition.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
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
        ToperationpresDo other = (ToperationpresDo) obj;
        if(operationid != other.operationid)
            return false;
        if(precondition == null) {
            if(other.precondition != null)
                return false;
        } else if(!precondition.equals(other.precondition))
            return false;
        if(type == null) {
            if(other.type != null)
                return false;
        } else if(!type.equals(other.type))
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
        return "Toperationpres [ " + " operationid=" + operationid + " precondition=" + precondition + " type=" + type + " notes=" + notes+ "]";
    }

}

