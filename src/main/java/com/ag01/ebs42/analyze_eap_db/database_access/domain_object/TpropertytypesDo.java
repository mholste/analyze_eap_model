package com.ag01.ebs42.analyze_eap_db.database_access.domain_object;

import java.io.Serializable;

public class TpropertytypesDo implements Serializable {

    private static final long serialVersionUID = -8014325136024723382L;

    private String property;
    private String description;
    private String notes;

    public TpropertytypesDo() {
        super();
    }

    public TpropertytypesDo(String property, String description, String notes) {
        super();
        this.property = property;
        this.description = description;
        this.notes = notes;
    }

    public String getProperty() {
        return this.property;
    }

    public void setProperty(String property) {
        this.property = property;
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
        result = prime * result + ((property == null) ? 0 : property.hashCode());
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
        TpropertytypesDo other = (TpropertytypesDo) obj;
        if(property == null) {
            if(other.property != null)
                return false;
        } else if(!property.equals(other.property))
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
        return "Tpropertytypes [ " + " property=" + property + " description=" + description + " notes=" + notes+ "]";
    }

}

