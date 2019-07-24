package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class UsyssystemDo implements Serializable {

    private static final long serialVersionUID = 9105474330571921161L;

    private String property;
    private String value;

    public UsyssystemDo() {
        super();
    }

    public UsyssystemDo(String property, String value) {
        super();
        this.property = property;
        this.value = value;
    }

    public String getProperty() {
        return this.property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((property == null) ? 0 : property.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
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
        UsyssystemDo other = (UsyssystemDo) obj;
        if(property == null) {
            if(other.property != null)
                return false;
        } else if(!property.equals(other.property))
            return false;
        if(value == null) {
            if(other.value != null)
                return false;
        } else if(!value.equals(other.value))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Usyssystem [ " + " property=" + property + " value=" + value+ "]";
    }

}

