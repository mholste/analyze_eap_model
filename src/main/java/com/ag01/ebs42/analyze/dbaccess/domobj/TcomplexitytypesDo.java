package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class TcomplexitytypesDo implements Serializable {

    private static final long serialVersionUID = 9105474330571921161L;

    private String complexity;
    private int numericweight;

    public TcomplexitytypesDo() {
        super();
    }

    public TcomplexitytypesDo(String complexity, int numericweight) {
        super();
        this.complexity = complexity;
        this.numericweight = numericweight;
    }

    public String getComplexity() {
        return this.complexity;
    }

    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }

    public int getNumericweight() {
        return this.numericweight;
    }

    public void setNumericweight(int numericweight) {
        this.numericweight = numericweight;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((complexity == null) ? 0 : complexity.hashCode());
        result = prime * result + numericweight;
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
        TcomplexitytypesDo other = (TcomplexitytypesDo) obj;
        if(complexity == null) {
            if(other.complexity != null)
                return false;
        } else if(!complexity.equals(other.complexity))
            return false;
        if(numericweight != other.numericweight)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tcomplexitytypes [ " + " complexity=" + complexity + " numericweight=" + numericweight+ "]";
    }

}

