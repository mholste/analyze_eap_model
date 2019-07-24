package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class ToperationpostsDo implements Serializable {

    private static final long serialVersionUID = 9054247325084909416L;

    private int operationid;
    private String postcondition;
    private String type;
    private String notes;

    public ToperationpostsDo() {
        super();
    }

    public ToperationpostsDo(int operationid, String postcondition, String type, String notes) {
        super();
        this.operationid = operationid;
        this.postcondition = postcondition;
        this.type = type;
        this.notes = notes;
    }

    public int getOperationid() {
        return this.operationid;
    }

    public void setOperationid(int operationid) {
        this.operationid = operationid;
    }

    public String getPostcondition() {
        return this.postcondition;
    }

    public void setPostcondition(String postcondition) {
        this.postcondition = postcondition;
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
        result = prime * result + ((postcondition == null) ? 0 : postcondition.hashCode());
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
        ToperationpostsDo other = (ToperationpostsDo) obj;
        if(operationid != other.operationid)
            return false;
        if(postcondition == null) {
            if(other.postcondition != null)
                return false;
        } else if(!postcondition.equals(other.postcondition))
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
        return "Toperationposts [ " + " operationid=" + operationid + " postcondition=" + postcondition + " type=" + type + " notes=" + notes+ "]";
    }

}

