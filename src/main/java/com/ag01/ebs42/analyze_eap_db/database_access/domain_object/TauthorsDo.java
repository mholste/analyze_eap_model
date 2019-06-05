package com.ag01.ebs42.analyze_eap_db.database_access.domain_object;

import java.io.Serializable;

public class TauthorsDo implements Serializable {

    private static final long serialVersionUID = -7987885395967842741L;

    private String authorname;
    private String roles;
    private String notes;

    public TauthorsDo() {
        super();
    }

    public TauthorsDo(String authorname, String roles, String notes) {
        super();
        this.authorname = authorname;
        this.roles = roles;
        this.notes = notes;
    }

    public String getAuthorname() {
        return this.authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public String getRoles() {
        return this.roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
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
        result = prime * result + ((authorname == null) ? 0 : authorname.hashCode());
        result = prime * result + ((roles == null) ? 0 : roles.hashCode());
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
        TauthorsDo other = (TauthorsDo) obj;
        if(authorname == null) {
            if(other.authorname != null)
                return false;
        } else if(!authorname.equals(other.authorname))
            return false;
        if(roles == null) {
            if(other.roles != null)
                return false;
        } else if(!roles.equals(other.roles))
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
        return "Tauthors [ " + " authorname=" + authorname + " roles=" + roles + " notes=" + notes+ "]";
    }

}

