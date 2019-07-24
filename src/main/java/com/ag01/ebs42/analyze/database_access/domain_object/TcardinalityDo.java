package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class TcardinalityDo implements Serializable {

    private static final long serialVersionUID = 9131914070628801802L;

    private String cardinality;

    public TcardinalityDo() {
        super();
    }

    public TcardinalityDo(String cardinality) {
        super();
        this.cardinality = cardinality;
    }

    public String getCardinality() {
        return this.cardinality;
    }

    public void setCardinality(String cardinality) {
        this.cardinality = cardinality;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cardinality == null) ? 0 : cardinality.hashCode());
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
        TcardinalityDo other = (TcardinalityDo) obj;
        if(cardinality == null) {
            if(other.cardinality != null)
                return false;
        } else if(!cardinality.equals(other.cardinality))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tcardinality [ " + " cardinality=" + cardinality+ "]";
    }

}

