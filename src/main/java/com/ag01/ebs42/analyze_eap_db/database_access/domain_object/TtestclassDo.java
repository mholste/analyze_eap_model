package com.ag01.ebs42.analyze_eap_db.database_access.domain_object;

import java.io.Serializable;

public class TtestclassDo implements Serializable {

    private static final long serialVersionUID = 9105474330571921161L;

    private String testclass;
    private String description;

    public TtestclassDo() {
        super();
    }

    public TtestclassDo(String testclass, String description) {
        super();
        this.testclass = testclass;
        this.description = description;
    }

    public String getTestclass() {
        return this.testclass;
    }

    public void setTestclass(String testclass) {
        this.testclass = testclass;
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
        result = prime * result + ((testclass == null) ? 0 : testclass.hashCode());
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
        TtestclassDo other = (TtestclassDo) obj;
        if(testclass == null) {
            if(other.testclass != null)
                return false;
        } else if(!testclass.equals(other.testclass))
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
        return "Ttestclass [ " + " testclass=" + testclass + " description=" + description+ "]";
    }

}

