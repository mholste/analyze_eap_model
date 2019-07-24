package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class TocfDo implements Serializable {

    private static final long serialVersionUID = -7987885395967842741L;

    private String objecttype;
    private long complexityweight;

    public TocfDo() {
        super();
    }

    public TocfDo(String objecttype, long complexityweight) {
        super();
        this.objecttype = objecttype;
        this.complexityweight = complexityweight;
    }

    public String getObjecttype() {
        return this.objecttype;
    }

    public void setObjecttype(String objecttype) {
        this.objecttype = objecttype;
    }

    public long getComplexityweight() {
        return this.complexityweight;
    }

    public void setComplexityweight(long complexityweight) {
        this.complexityweight = complexityweight;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((objecttype == null) ? 0 : objecttype.hashCode());
        result = prime * result + (int) (complexityweight ^ (complexityweight >>> 32));
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
        TocfDo other = (TocfDo) obj;
        if(objecttype == null) {
            if(other.objecttype != null)
                return false;
        } else if(!objecttype.equals(other.objecttype))
            return false;
        if(complexityweight != other.complexityweight)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tocf [ " + " objecttype=" + objecttype + " complexityweight=" + complexityweight+ "]";
    }

}

