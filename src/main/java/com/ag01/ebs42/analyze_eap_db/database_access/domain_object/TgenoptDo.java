package com.ag01.ebs42.analyze_eap_db.database_access.domain_object;

import java.io.Serializable;

public class TgenoptDo implements Serializable {

    private static final long serialVersionUID = -7987885395967842741L;

    private String appliesto;
    private String option;

    public TgenoptDo() {
        super();
    }

    public TgenoptDo(String appliesto, String option) {
        super();
        this.appliesto = appliesto;
        this.option = option;
    }

    public String getAppliesto() {
        return this.appliesto;
    }

    public void setAppliesto(String appliesto) {
        this.appliesto = appliesto;
    }

    public String getOption() {
        return this.option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((appliesto == null) ? 0 : appliesto.hashCode());
        result = prime * result + ((option == null) ? 0 : option.hashCode());
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
        TgenoptDo other = (TgenoptDo) obj;
        if(appliesto == null) {
            if(other.appliesto != null)
                return false;
        } else if(!appliesto.equals(other.appliesto))
            return false;
        if(option == null) {
            if(other.option != null)
                return false;
        } else if(!option.equals(other.option))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tgenopt [ " + " appliesto=" + appliesto + " option=" + option+ "]";
    }

}

