package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class TdocumentDo implements Serializable {

    private static final long serialVersionUID = 9105474330571921161L;

    private String docid;
    private String docname;
    private String notes;
    private String style;
    private String elementid;
    private String elementtype;
    private String strcontent;
    private String bincontent;
    private String doctype;
    private String author;
    private String version;
    private int isactive;
    private int sequence;
    private java.sql.Date docdate;

    public TdocumentDo() {
        super();
    }

    public TdocumentDo(String docid, String docname, String notes, String style, String elementid, String elementtype, String strcontent, String bincontent, String doctype, String author, String version, int isactive, int sequence, java.sql.Date docdate) {
        super();
        this.docid = docid;
        this.docname = docname;
        this.notes = notes;
        this.style = style;
        this.elementid = elementid;
        this.elementtype = elementtype;
        this.strcontent = strcontent;
        this.bincontent = bincontent;
        this.doctype = doctype;
        this.author = author;
        this.version = version;
        this.isactive = isactive;
        this.sequence = sequence;
        this.docdate = docdate;
    }

    public String getDocid() {
        return this.docid;
    }

    public void setDocid(String docid) {
        this.docid = docid;
    }

    public String getDocname() {
        return this.docname;
    }

    public void setDocname(String docname) {
        this.docname = docname;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getStyle() {
        return this.style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getElementid() {
        return this.elementid;
    }

    public void setElementid(String elementid) {
        this.elementid = elementid;
    }

    public String getElementtype() {
        return this.elementtype;
    }

    public void setElementtype(String elementtype) {
        this.elementtype = elementtype;
    }

    public String getStrcontent() {
        return this.strcontent;
    }

    public void setStrcontent(String strcontent) {
        this.strcontent = strcontent;
    }

    public String getBincontent() {
        return this.bincontent;
    }

    public void setBincontent(String bincontent) {
        this.bincontent = bincontent;
    }

    public String getDoctype() {
        return this.doctype;
    }

    public void setDoctype(String doctype) {
        this.doctype = doctype;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getIsactive() {
        return this.isactive;
    }

    public void setIsactive(int isactive) {
        this.isactive = isactive;
    }

    public int getSequence() {
        return this.sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public java.sql.Date getDocdate() {
        return this.docdate;
    }

    public void setDocdate(java.sql.Date docdate) {
        this.docdate = docdate;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((docid == null) ? 0 : docid.hashCode());
        result = prime * result + ((docname == null) ? 0 : docname.hashCode());
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
        result = prime * result + ((style == null) ? 0 : style.hashCode());
        result = prime * result + ((elementid == null) ? 0 : elementid.hashCode());
        result = prime * result + ((elementtype == null) ? 0 : elementtype.hashCode());
        result = prime * result + ((strcontent == null) ? 0 : strcontent.hashCode());
        result = prime * result + ((bincontent == null) ? 0 : bincontent.hashCode());
        result = prime * result + ((doctype == null) ? 0 : doctype.hashCode());
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + ((version == null) ? 0 : version.hashCode());
        result = prime * result + isactive;
        result = prime * result + sequence;
        result = prime * result + ((docdate == null) ? 0 : docdate.hashCode());
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
        TdocumentDo other = (TdocumentDo) obj;
        if(docid == null) {
            if(other.docid != null)
                return false;
        } else if(!docid.equals(other.docid))
            return false;
        if(docname == null) {
            if(other.docname != null)
                return false;
        } else if(!docname.equals(other.docname))
            return false;
        if(notes == null) {
            if(other.notes != null)
                return false;
        } else if(!notes.equals(other.notes))
            return false;
        if(style == null) {
            if(other.style != null)
                return false;
        } else if(!style.equals(other.style))
            return false;
        if(elementid == null) {
            if(other.elementid != null)
                return false;
        } else if(!elementid.equals(other.elementid))
            return false;
        if(elementtype == null) {
            if(other.elementtype != null)
                return false;
        } else if(!elementtype.equals(other.elementtype))
            return false;
        if(strcontent == null) {
            if(other.strcontent != null)
                return false;
        } else if(!strcontent.equals(other.strcontent))
            return false;
        if(bincontent == null) {
            if(other.bincontent != null)
                return false;
        } else if(!bincontent.equals(other.bincontent))
            return false;
        if(doctype == null) {
            if(other.doctype != null)
                return false;
        } else if(!doctype.equals(other.doctype))
            return false;
        if(author == null) {
            if(other.author != null)
                return false;
        } else if(!author.equals(other.author))
            return false;
        if(version == null) {
            if(other.version != null)
                return false;
        } else if(!version.equals(other.version))
            return false;
        if(isactive != other.isactive)
            return false;
        if(sequence != other.sequence)
            return false;
        if(docdate == null) {
            if(other.docdate != null)
                return false;
        } else if(!docdate.equals(other.docdate))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tdocument [ " + " docid=" + docid + " docname=" + docname + " notes=" + notes + " style=" + style + " elementid=" + elementid + " elementtype=" + elementtype + " strcontent=" + strcontent + " bincontent=" + bincontent + " doctype=" + doctype + " author=" + author + " version=" + version + " isactive=" + isactive + " sequence=" + sequence + " docdate=" + docdate+ "]";
    }

}

