package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class TversionDo implements Serializable {

    private static final long serialVersionUID = 9105474330571921161L;

    private String elementid;
    private String versionid;
    private String elementtype;
    private String flags;
    private String externalfile;
    private String notes;
    private String owner;
    private java.sql.Date versiondate;
    private String branch;
    private String elementxml;

    public TversionDo() {
        super();
    }

    public TversionDo(String elementid, String versionid, String elementtype, String flags, String externalfile, String notes, String owner, java.sql.Date versiondate, String branch, String elementxml) {
        super();
        this.elementid = elementid;
        this.versionid = versionid;
        this.elementtype = elementtype;
        this.flags = flags;
        this.externalfile = externalfile;
        this.notes = notes;
        this.owner = owner;
        this.versiondate = versiondate;
        this.branch = branch;
        this.elementxml = elementxml;
    }

    public String getElementid() {
        return this.elementid;
    }

    public void setElementid(String elementid) {
        this.elementid = elementid;
    }

    public String getVersionid() {
        return this.versionid;
    }

    public void setVersionid(String versionid) {
        this.versionid = versionid;
    }

    public String getElementtype() {
        return this.elementtype;
    }

    public void setElementtype(String elementtype) {
        this.elementtype = elementtype;
    }

    public String getFlags() {
        return this.flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public String getExternalfile() {
        return this.externalfile;
    }

    public void setExternalfile(String externalfile) {
        this.externalfile = externalfile;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public java.sql.Date getVersiondate() {
        return this.versiondate;
    }

    public void setVersiondate(java.sql.Date versiondate) {
        this.versiondate = versiondate;
    }

    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getElementxml() {
        return this.elementxml;
    }

    public void setElementxml(String elementxml) {
        this.elementxml = elementxml;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((elementid == null) ? 0 : elementid.hashCode());
        result = prime * result + ((versionid == null) ? 0 : versionid.hashCode());
        result = prime * result + ((elementtype == null) ? 0 : elementtype.hashCode());
        result = prime * result + ((flags == null) ? 0 : flags.hashCode());
        result = prime * result + ((externalfile == null) ? 0 : externalfile.hashCode());
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
        result = prime * result + ((owner == null) ? 0 : owner.hashCode());
        result = prime * result + ((versiondate == null) ? 0 : versiondate.hashCode());
        result = prime * result + ((branch == null) ? 0 : branch.hashCode());
        result = prime * result + ((elementxml == null) ? 0 : elementxml.hashCode());
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
        TversionDo other = (TversionDo) obj;
        if(elementid == null) {
            if(other.elementid != null)
                return false;
        } else if(!elementid.equals(other.elementid))
            return false;
        if(versionid == null) {
            if(other.versionid != null)
                return false;
        } else if(!versionid.equals(other.versionid))
            return false;
        if(elementtype == null) {
            if(other.elementtype != null)
                return false;
        } else if(!elementtype.equals(other.elementtype))
            return false;
        if(flags == null) {
            if(other.flags != null)
                return false;
        } else if(!flags.equals(other.flags))
            return false;
        if(externalfile == null) {
            if(other.externalfile != null)
                return false;
        } else if(!externalfile.equals(other.externalfile))
            return false;
        if(notes == null) {
            if(other.notes != null)
                return false;
        } else if(!notes.equals(other.notes))
            return false;
        if(owner == null) {
            if(other.owner != null)
                return false;
        } else if(!owner.equals(other.owner))
            return false;
        if(versiondate == null) {
            if(other.versiondate != null)
                return false;
        } else if(!versiondate.equals(other.versiondate))
            return false;
        if(branch == null) {
            if(other.branch != null)
                return false;
        } else if(!branch.equals(other.branch))
            return false;
        if(elementxml == null) {
            if(other.elementxml != null)
                return false;
        } else if(!elementxml.equals(other.elementxml))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tversion [ " + " elementid=" + elementid + " versionid=" + versionid + " elementtype=" + elementtype + " flags=" + flags + " externalfile=" + externalfile + " notes=" + notes + " owner=" + owner + " versiondate=" + versiondate + " branch=" + branch + " elementxml=" + elementxml+ "]";
    }

}

