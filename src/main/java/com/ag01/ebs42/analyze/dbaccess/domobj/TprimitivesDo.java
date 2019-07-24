package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class TprimitivesDo implements Serializable {

    private static final long serialVersionUID = -7935005907264146868L;

    private String datatype;
    private String description;

    public TprimitivesDo() {
        super();
    }

    public TprimitivesDo(String datatype, String description) {
        super();
        this.datatype = datatype;
        this.description = description;
    }

    public String getDatatype() {
        return this.datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
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
        result = prime * result + ((datatype == null) ? 0 : datatype.hashCode());
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
        TprimitivesDo other = (TprimitivesDo) obj;
        if(datatype == null) {
            if(other.datatype != null)
                return false;
        } else if(!datatype.equals(other.datatype))
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
        return "Tprimitives [ " + " datatype=" + datatype + " description=" + description+ "]";
    }

}

