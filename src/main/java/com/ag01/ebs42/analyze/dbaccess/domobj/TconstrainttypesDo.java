package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class TconstrainttypesDo implements Serializable {

    private static final long serialVersionUID = 9105474330571921161L;

    private String constraint;
    private String description;
    private String notes;

    public TconstrainttypesDo() {
        super();
    }

    public TconstrainttypesDo(String constraint, String description, String notes) {
        super();
        this.constraint = constraint;
        this.description = description;
        this.notes = notes;
    }

    public String getConstraint() {
        return this.constraint;
    }

    public void setConstraint(String constraint) {
        this.constraint = constraint;
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
        result = prime * result + ((constraint == null) ? 0 : constraint.hashCode());
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
        TconstrainttypesDo other = (TconstrainttypesDo) obj;
        if(constraint == null) {
            if(other.constraint != null)
                return false;
        } else if(!constraint.equals(other.constraint))
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
        return "Tconstrainttypes [ " + " constraint=" + constraint + " description=" + description + " notes=" + notes+ "]";
    }

}

