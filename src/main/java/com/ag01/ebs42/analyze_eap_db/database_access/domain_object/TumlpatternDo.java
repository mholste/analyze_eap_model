package com.ag01.ebs42.analyze_eap_db.database_access.domain_object;

import java.io.Serializable;

public class TumlpatternDo implements Serializable {

    private static final long serialVersionUID = -7935005907264146868L;

    private int patternid;
    private String patterncategory;
    private String patternname;
    private String style;
    private String notes;
    private String patternxml;
    private String version;

    public TumlpatternDo() {
        super();
    }

    public TumlpatternDo(int patternid, String patterncategory, String patternname, String style, String notes, String patternxml, String version) {
        super();
        this.patternid = patternid;
        this.patterncategory = patterncategory;
        this.patternname = patternname;
        this.style = style;
        this.notes = notes;
        this.patternxml = patternxml;
        this.version = version;
    }

    public int getPatternid() {
        return this.patternid;
    }

    public void setPatternid(int patternid) {
        this.patternid = patternid;
    }

    public String getPatterncategory() {
        return this.patterncategory;
    }

    public void setPatterncategory(String patterncategory) {
        this.patterncategory = patterncategory;
    }

    public String getPatternname() {
        return this.patternname;
    }

    public void setPatternname(String patternname) {
        this.patternname = patternname;
    }

    public String getStyle() {
        return this.style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPatternxml() {
        return this.patternxml;
    }

    public void setPatternxml(String patternxml) {
        this.patternxml = patternxml;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + patternid;
        result = prime * result + ((patterncategory == null) ? 0 : patterncategory.hashCode());
        result = prime * result + ((patternname == null) ? 0 : patternname.hashCode());
        result = prime * result + ((style == null) ? 0 : style.hashCode());
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
        result = prime * result + ((patternxml == null) ? 0 : patternxml.hashCode());
        result = prime * result + ((version == null) ? 0 : version.hashCode());
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
        TumlpatternDo other = (TumlpatternDo) obj;
        if(patternid != other.patternid)
            return false;
        if(patterncategory == null) {
            if(other.patterncategory != null)
                return false;
        } else if(!patterncategory.equals(other.patterncategory))
            return false;
        if(patternname == null) {
            if(other.patternname != null)
                return false;
        } else if(!patternname.equals(other.patternname))
            return false;
        if(style == null) {
            if(other.style != null)
                return false;
        } else if(!style.equals(other.style))
            return false;
        if(notes == null) {
            if(other.notes != null)
                return false;
        } else if(!notes.equals(other.notes))
            return false;
        if(patternxml == null) {
            if(other.patternxml != null)
                return false;
        } else if(!patternxml.equals(other.patternxml))
            return false;
        if(version == null) {
            if(other.version != null)
                return false;
        } else if(!version.equals(other.version))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tumlpattern [ " + " patternid=" + patternid + " patterncategory=" + patterncategory + " patternname=" + patternname + " style=" + style + " notes=" + notes + " patternxml=" + patternxml + " version=" + version+ "]";
    }

}

