package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class TpaletteDo implements Serializable {

    private static final long serialVersionUID = -7987885395967842741L;

    private int paletteid;
    private String name;
    private String type;

    public TpaletteDo() {
        super();
    }

    public TpaletteDo(int paletteid, String name, String type) {
        super();
        this.paletteid = paletteid;
        this.name = name;
        this.type = type;
    }

    public int getPaletteid() {
        return this.paletteid;
    }

    public void setPaletteid(int paletteid) {
        this.paletteid = paletteid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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
        result = prime * result + paletteid;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
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
        TpaletteDo other = (TpaletteDo) obj;
        if(paletteid != other.paletteid)
            return false;
        if(name == null) {
            if(other.name != null)
                return false;
        } else if(!name.equals(other.name))
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
        return "Tpalette [ " + " paletteid=" + paletteid + " name=" + name + " type=" + type+ "]";
    }

}

