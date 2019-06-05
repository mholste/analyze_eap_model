package com.ag01.ebs42.analyze_eap_db.database_access.domain_object;

import java.io.Serializable;

public class TrtfDo implements Serializable {

    private static final long serialVersionUID = 9105474330571921161L;

    private String type;
    private String template;

    public TrtfDo() {
        super();
    }

    public TrtfDo(String type, String template) {
        super();
        this.type = type;
        this.template = template;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTemplate() {
        return this.template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((template == null) ? 0 : template.hashCode());
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
        TrtfDo other = (TrtfDo) obj;
        if(type == null) {
            if(other.type != null)
                return false;
        } else if(!type.equals(other.type))
            return false;
        if(template == null) {
            if(other.template != null)
                return false;
        } else if(!template.equals(other.template))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Trtf [ " + " type=" + type + " template=" + template+ "]";
    }

}

