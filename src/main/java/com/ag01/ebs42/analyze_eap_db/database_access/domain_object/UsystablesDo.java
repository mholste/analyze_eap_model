package com.ag01.ebs42.analyze_eap_db.database_access.domain_object;

import java.io.Serializable;

public class UsystablesDo implements Serializable {

    private static final long serialVersionUID = -7987885395967842741L;

    private String tablename;
    private int relorder;
    private String displayname;
    private String fromver;
    private String tover;

    public UsystablesDo() {
        super();
    }

    public UsystablesDo(String tablename, int relorder, String displayname, String fromver, String tover) {
        super();
        this.tablename = tablename;
        this.relorder = relorder;
        this.displayname = displayname;
        this.fromver = fromver;
        this.tover = tover;
    }

    public String getTablename() {
        return this.tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public int getRelorder() {
        return this.relorder;
    }

    public void setRelorder(int relorder) {
        this.relorder = relorder;
    }

    public String getDisplayname() {
        return this.displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public String getFromver() {
        return this.fromver;
    }

    public void setFromver(String fromver) {
        this.fromver = fromver;
    }

    public String getTover() {
        return this.tover;
    }

    public void setTover(String tover) {
        this.tover = tover;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((tablename == null) ? 0 : tablename.hashCode());
        result = prime * result + relorder;
        result = prime * result + ((displayname == null) ? 0 : displayname.hashCode());
        result = prime * result + ((fromver == null) ? 0 : fromver.hashCode());
        result = prime * result + ((tover == null) ? 0 : tover.hashCode());
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
        UsystablesDo other = (UsystablesDo) obj;
        if(tablename == null) {
            if(other.tablename != null)
                return false;
        } else if(!tablename.equals(other.tablename))
            return false;
        if(relorder != other.relorder)
            return false;
        if(displayname == null) {
            if(other.displayname != null)
                return false;
        } else if(!displayname.equals(other.displayname))
            return false;
        if(fromver == null) {
            if(other.fromver != null)
                return false;
        } else if(!fromver.equals(other.fromver))
            return false;
        if(tover == null) {
            if(other.tover != null)
                return false;
        } else if(!tover.equals(other.tover))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Usystables [ " + " tablename=" + tablename + " relorder=" + relorder + " displayname=" + displayname + " fromver=" + fromver + " tover=" + tover+ "]";
    }

}

