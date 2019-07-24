package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class TstatustypesDo implements Serializable {

    private static final long serialVersionUID = -8014325136024723382L;

    private String status;
    private String description;

    public TstatustypesDo() {
        super();
    }

    public TstatustypesDo(String status, String description) {
        super();
        this.status = status;
        this.description = description;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
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
        TstatustypesDo other = (TstatustypesDo) obj;
        if(status == null) {
            if(other.status != null)
                return false;
        } else if(!status.equals(other.status))
            return false;
        if(description == null) {
            if(other.description != null)
                return false;
        } else if(!description.equals(other.description))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tstatustypes [ " + " status=" + status + " description=" + description+ "]";
    }

}

