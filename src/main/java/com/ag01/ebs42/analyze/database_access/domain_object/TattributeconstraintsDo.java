package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class TattributeconstraintsDo implements Serializable {

    private static final long serialVersionUID = 9105474330571921161L;

    private int objectid;
    private String constraint;
    private String attname;
    private String type;
    private String notes;
    private int id;

    public TattributeconstraintsDo() {
        super();
    }

    public TattributeconstraintsDo(int objectid, String constraint, String attname, String type, String notes, int id) {
        super();
        this.objectid = objectid;
        this.constraint = constraint;
        this.attname = attname;
        this.type = type;
        this.notes = notes;
        this.id = id;
    }

    public int getObjectid() {
        return this.objectid;
    }

    public void setObjectid(int objectid) {
        this.objectid = objectid;
    }

    public String getConstraint() {
        return this.constraint;
    }

    public void setConstraint(String constraint) {
        this.constraint = constraint;
    }

    public String getAttname() {
        return this.attname;
    }

    public void setAttname(String attname) {
        this.attname = attname;
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

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + objectid;
        result = prime * result + ((constraint == null) ? 0 : constraint.hashCode());
        result = prime * result + ((attname == null) ? 0 : attname.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
        result = prime * result + id;
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
        TattributeconstraintsDo other = (TattributeconstraintsDo) obj;
        if(objectid != other.objectid)
            return false;
        if(constraint == null) {
            if(other.constraint != null)
                return false;
        } else if(!constraint.equals(other.constraint))
            return false;
        if(attname == null) {
            if(other.attname != null)
                return false;
        } else if(!attname.equals(other.attname))
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
        if(id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tattributeconstraints [ " + " objectid=" + objectid + " constraint=" + constraint + " attname=" + attname + " type=" + type + " notes=" + notes + " id=" + id+ "]";
    }

}

