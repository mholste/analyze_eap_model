package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class TcategoryDo implements Serializable {

    private static final long serialVersionUID = 9131914070628801802L;

    private int categoryid;
    private String name;
    private String type;
    private String notes;

    public TcategoryDo() {
        super();
    }

    public TcategoryDo(int categoryid, String name, String type, String notes) {
        super();
        this.categoryid = categoryid;
        this.name = name;
        this.type = type;
        this.notes = notes;
    }

    public int getCategoryid() {
        return this.categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
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

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + categoryid;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
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
        TcategoryDo other = (TcategoryDo) obj;
        if(categoryid != other.categoryid)
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
        if(notes == null) {
            if(other.notes != null)
                return false;
        } else if(!notes.equals(other.notes))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tcategory [ " + " categoryid=" + categoryid + " name=" + name + " type=" + type + " notes=" + notes+ "]";
    }

}

