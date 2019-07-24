package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class TlistsDo implements Serializable {

    private static final long serialVersionUID = 9105474330571921161L;

    private String listid;
    private String category;
    private String name;
    private int nval;
    private String notes;

    public TlistsDo() {
        super();
    }

    public TlistsDo(String listid, String category, String name, int nval, String notes) {
        super();
        this.listid = listid;
        this.category = category;
        this.name = name;
        this.nval = nval;
        this.notes = notes;
    }

    public String getListid() {
        return this.listid;
    }

    public void setListid(String listid) {
        this.listid = listid;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNval() {
        return this.nval;
    }

    public void setNval(int nval) {
        this.nval = nval;
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
        result = prime * result + ((listid == null) ? 0 : listid.hashCode());
        result = prime * result + ((category == null) ? 0 : category.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + nval;
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
        TlistsDo other = (TlistsDo) obj;
        if(listid == null) {
            if(other.listid != null)
                return false;
        } else if(!listid.equals(other.listid))
            return false;
        if(category == null) {
            if(other.category != null)
                return false;
        } else if(!category.equals(other.category))
            return false;
        if(name == null) {
            if(other.name != null)
                return false;
        } else if(!name.equals(other.name))
            return false;
        if(nval != other.nval)
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
        return "Tlists [ " + " listid=" + listid + " category=" + category + " name=" + name + " nval=" + nval + " notes=" + notes+ "]";
    }

}

