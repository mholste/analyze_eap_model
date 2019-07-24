package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class TobjecttypesDo implements Serializable {

    private static final long serialVersionUID = -8014325136024723382L;

    private String objecttype;
    private String description;
    private int designobject;
    private int imageid;

    public TobjecttypesDo() {
        super();
    }

    public TobjecttypesDo(String objecttype, String description, int designobject, int imageid) {
        super();
        this.objecttype = objecttype;
        this.description = description;
        this.designobject = designobject;
        this.imageid = imageid;
    }

    public String getObjecttype() {
        return this.objecttype;
    }

    public void setObjecttype(String objecttype) {
        this.objecttype = objecttype;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDesignobject() {
        return this.designobject;
    }

    public void setDesignobject(int designobject) {
        this.designobject = designobject;
    }

    public int getImageid() {
        return this.imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((objecttype == null) ? 0 : objecttype.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + designobject;
        result = prime * result + imageid;
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
        TobjecttypesDo other = (TobjecttypesDo) obj;
        if(objecttype == null) {
            if(other.objecttype != null)
                return false;
        } else if(!objecttype.equals(other.objecttype))
            return false;
        if(description == null) {
            if(other.description != null)
                return false;
        } else if(!description.equals(other.description))
            return false;
        if(designobject != other.designobject)
            return false;
        if(imageid != other.imageid)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tobjecttypes [ " + " objecttype=" + objecttype + " description=" + description + " designobject=" + designobject + " imageid=" + imageid+ "]";
    }

}

