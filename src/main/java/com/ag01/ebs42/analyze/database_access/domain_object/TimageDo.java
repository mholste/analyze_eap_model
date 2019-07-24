package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class TimageDo implements Serializable {

    private static final long serialVersionUID = 9131914070628801802L;

    private int imageid;
    private String name;
    private String type;
    private String image;

    public TimageDo() {
        super();
    }

    public TimageDo(int imageid, String name, String type, String image) {
        super();
        this.imageid = imageid;
        this.name = name;
        this.type = type;
        this.image = image;
    }

    public int getImageid() {
        return this.imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
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

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + imageid;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((image == null) ? 0 : image.hashCode());
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
        TimageDo other = (TimageDo) obj;
        if(imageid != other.imageid)
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
        if(image == null) {
            if(other.image != null)
                return false;
        } else if(!image.equals(other.image))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Timage [ " + " imageid=" + imageid + " name=" + name + " type=" + type + " image=" + image+ "]";
    }

}

