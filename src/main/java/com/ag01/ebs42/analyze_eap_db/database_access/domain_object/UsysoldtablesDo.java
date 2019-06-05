package com.ag01.ebs42.analyze_eap_db.database_access.domain_object;

import java.io.Serializable;

public class UsysoldtablesDo implements Serializable {

    private static final long serialVersionUID = 9131914070628801802L;

    private String tablename;
    private String newname;
    private int relorder;
    private int fixcode;

    public UsysoldtablesDo() {
        super();
    }

    public UsysoldtablesDo(String tablename, String newname, int relorder, int fixcode) {
        super();
        this.tablename = tablename;
        this.newname = newname;
        this.relorder = relorder;
        this.fixcode = fixcode;
    }

    public String getTablename() {
        return this.tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public String getNewname() {
        return this.newname;
    }

    public void setNewname(String newname) {
        this.newname = newname;
    }

    public int getRelorder() {
        return this.relorder;
    }

    public void setRelorder(int relorder) {
        this.relorder = relorder;
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
        result = prime * result + ((tablename == null) ? 0 : tablename.hashCode());
        result = prime * result + ((newname == null) ? 0 : newname.hashCode());
        result = prime * result + relorder;
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
        UsysoldtablesDo other = (UsysoldtablesDo) obj;
        if(tablename == null) {
            if(other.tablename != null)
                return false;
        } else if(!tablename.equals(other.tablename))
            return false;
        if(newname == null) {
            if(other.newname != null)
                return false;
        } else if(!newname.equals(other.newname))
            return false;
        if(relorder != other.relorder)
            return false;
        if(fixcode != other.fixcode)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Usysoldtables [ " + " tablename=" + tablename + " newname=" + newname + " relorder=" + relorder + " fixcode=" + fixcode+ "]";
    }

}

