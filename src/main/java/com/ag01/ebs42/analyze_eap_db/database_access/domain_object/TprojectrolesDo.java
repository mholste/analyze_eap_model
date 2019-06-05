package com.ag01.ebs42.analyze_eap_db.database_access.domain_object;

import java.io.Serializable;

public class TprojectrolesDo implements Serializable {

    private static final long serialVersionUID = -7935005907264146868L;

    private String role;
    private String description;
    private String notes;

    public TprojectrolesDo() {
        super();
    }

    public TprojectrolesDo(String role, String description, String notes) {
        super();
        this.role = role;
        this.description = description;
        this.notes = notes;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        result = prime * result + ((role == null) ? 0 : role.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
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
        TprojectrolesDo other = (TprojectrolesDo) obj;
        if(role == null) {
            if(other.role != null)
                return false;
        } else if(!role.equals(other.role))
            return false;
        if(description == null) {
            if(other.description != null)
                return false;
        } else if(!description.equals(other.description))
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
        return "Tprojectroles [ " + " role=" + role + " description=" + description + " notes=" + notes+ "]";
    }

}

