package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class TconstantsDo implements Serializable {

    private static final long serialVersionUID = 9131914070628801802L;

    private String constantname;
    private String constantvalue;

    public TconstantsDo() {
        super();
    }

    public TconstantsDo(String constantname, String constantvalue) {
        super();
        this.constantname = constantname;
        this.constantvalue = constantvalue;
    }

    public String getConstantname() {
        return this.constantname;
    }

    public void setConstantname(String constantname) {
        this.constantname = constantname;
    }

    public String getConstantvalue() {
        return this.constantvalue;
    }

    public void setConstantvalue(String constantvalue) {
        this.constantvalue = constantvalue;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((constantname == null) ? 0 : constantname.hashCode());
        result = prime * result + ((constantvalue == null) ? 0 : constantvalue.hashCode());
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
        TconstantsDo other = (TconstantsDo) obj;
        if(constantname == null) {
            if(other.constantname != null)
                return false;
        } else if(!constantname.equals(other.constantname))
            return false;
        if(constantvalue == null) {
            if(other.constantvalue != null)
                return false;
        } else if(!constantvalue.equals(other.constantvalue))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tconstants [ " + " constantname=" + constantname + " constantvalue=" + constantvalue+ "]";
    }

}

