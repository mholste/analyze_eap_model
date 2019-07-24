package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class TconnectortypesDo implements Serializable {

    private static final long serialVersionUID = -7987885395967842741L;

    private String connectortype;
    private String description;

    public TconnectortypesDo() {
        super();
    }

    public TconnectortypesDo(String connectortype, String description) {
        super();
        this.connectortype = connectortype;
        this.description = description;
    }

    public String getConnectortype() {
        return this.connectortype;
    }

    public void setConnectortype(String connectortype) {
        this.connectortype = connectortype;
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
        result = prime * result + ((connectortype == null) ? 0 : connectortype.hashCode());
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
        TconnectortypesDo other = (TconnectortypesDo) obj;
        if(connectortype == null) {
            if(other.connectortype != null)
                return false;
        } else if(!connectortype.equals(other.connectortype))
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
        return "Tconnectortypes [ " + " connectortype=" + connectortype + " description=" + description+ "]";
    }

}

