package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class UsysqueriesDo implements Serializable {

    private static final long serialVersionUID = -8014325136024723382L;

    private String queryname;
    private String newname;
    private int fixcode;

    public UsysqueriesDo() {
        super();
    }

    public UsysqueriesDo(String queryname, String newname, int fixcode) {
        super();
        this.queryname = queryname;
        this.newname = newname;
        this.fixcode = fixcode;
    }

    public String getQueryname() {
        return this.queryname;
    }

    public void setQueryname(String queryname) {
        this.queryname = queryname;
    }

    public String getNewname() {
        return this.newname;
    }

    public void setNewname(String newname) {
        this.newname = newname;
    }

    public int getFixcode() {
        return this.fixcode;
    }

    public void setFixcode(int fixcode) {
        this.fixcode = fixcode;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((queryname == null) ? 0 : queryname.hashCode());
        result = prime * result + ((newname == null) ? 0 : newname.hashCode());
        result = prime * result + fixcode;
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
        UsysqueriesDo other = (UsysqueriesDo) obj;
        if(queryname == null) {
            if(other.queryname != null)
                return false;
        } else if(!queryname.equals(other.queryname))
            return false;
        if(newname == null) {
            if(other.newname != null)
                return false;
        } else if(!newname.equals(other.newname))
            return false;
        if(fixcode != other.fixcode)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Usysqueries [ " + " queryname=" + queryname + " newname=" + newname + " fixcode=" + fixcode+ "]";
    }

}

