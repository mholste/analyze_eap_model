package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class TimplementDo implements Serializable {

    private static final long serialVersionUID = -7987885395967842741L;

    private String type;

    public TimplementDo() {
        super();
    }

    public TimplementDo(String type) {
        super();
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
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
        TimplementDo other = (TimplementDo) obj;
        if(type == null) {
            if(other.type != null)
                return false;
        } else if(!type.equals(other.type))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Timplement [ " + " type=" + type+ "]";
    }

}

