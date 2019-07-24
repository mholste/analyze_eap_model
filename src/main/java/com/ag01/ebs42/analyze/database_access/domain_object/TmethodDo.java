package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class TmethodDo implements Serializable {

    private static final long serialVersionUID = -8014325136024723382L;

    private int objectid;
    private String name;
    private String scope;
    private String type;

    public TmethodDo() {
        super();
    }

    public TmethodDo(int objectid, String name, String scope, String type) {
        super();
        this.objectid = objectid;
        this.name = name;
        this.scope = scope;
        this.type = type;
    }

    public int getObjectid() {
        return this.objectid;
    }

    public void setObjectid(int objectid) {
        this.objectid = objectid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScope() {
        return this.scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
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
        result = prime * result + objectid;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((scope == null) ? 0 : scope.hashCode());
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
        TmethodDo other = (TmethodDo) obj;
        if(objectid != other.objectid)
            return false;
        if(name == null) {
            if(other.name != null)
                return false;
        } else if(!name.equals(other.name))
            return false;
        if(scope == null) {
            if(other.scope != null)
                return false;
        } else if(!scope.equals(other.scope))
            return false;
        if(type == null) {
            if(other.type != null)
                return false;
        } else if(!type.equals(other.type))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tmethod [ " + " objectid=" + objectid + " name=" + name + " scope=" + scope + " type=" + type+ "]";
    }

}

