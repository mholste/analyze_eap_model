package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class TdiagramDo implements Serializable {

    private static final long serialVersionUID = -7987885395967842741L;

    private int diagramid;
    private int packageid;
    private int parentid;
    private String diagramtype;
    private String name;
    private String version;
    private String author;
    private int showdetails;
    private String notes;
    private String stereotype;
    private int attpub;
    private int attpri;
    private int attpro;
    private char orientation;
    private int cx;
    private int cy;
    private int scale;
    private java.sql.Date createddate;
    private java.sql.Date modifieddate;
    private String htmlpath;
    private int showforeign;
    private int showborder;
    private int showpackagecontents;
    private String pdata;
    private int locked;
    private String eaguid;
    private int tpos;
    private String swimlanes;
    private String styleex;

    public TdiagramDo() {
        super();
    }

    public TdiagramDo(int diagramid, int packageid, int parentid, String diagramtype, String name, String version, String author, int showdetails, String notes, String stereotype, int attpub, int attpri, int attpro, char orientation, int cx, int cy, int scale, java.sql.Date createddate, java.sql.Date modifieddate, String htmlpath, int showforeign, int showborder, int showpackagecontents, String pdata, int locked, String eaguid, int tpos, String swimlanes, String styleex) {
        super();
        this.diagramid = diagramid;
        this.packageid = packageid;
        this.parentid = parentid;
        this.diagramtype = diagramtype;
        this.name = name;
        this.version = version;
        this.author = author;
        this.showdetails = showdetails;
        this.notes = notes;
        this.stereotype = stereotype;
        this.attpub = attpub;
        this.attpri = attpri;
        this.attpro = attpro;
        this.orientation = orientation;
        this.cx = cx;
        this.cy = cy;
        this.scale = scale;
        this.createddate = createddate;
        this.modifieddate = modifieddate;
        this.htmlpath = htmlpath;
        this.showforeign = showforeign;
        this.showborder = showborder;
        this.showpackagecontents = showpackagecontents;
        this.pdata = pdata;
        this.locked = locked;
        this.eaguid = eaguid;
        this.tpos = tpos;
        this.swimlanes = swimlanes;
        this.styleex = styleex;
    }

    public int getDiagramid() {
        return this.diagramid;
    }

    public void setDiagramid(int diagramid) {
        this.diagramid = diagramid;
    }

    public int getPackageid() {
        return this.packageid;
    }

    public void setPackageid(int packageid) {
        this.packageid = packageid;
    }

    public int getParentid() {
        return this.parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public String getDiagramtype() {
        return this.diagramtype;
    }

    public void setDiagramtype(String diagramtype) {
        this.diagramtype = diagramtype;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getShowdetails() {
        return this.showdetails;
    }

    public void setShowdetails(int showdetails) {
        this.showdetails = showdetails;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getStereotype() {
        return this.stereotype;
    }

    public void setStereotype(String stereotype) {
        this.stereotype = stereotype;
    }

    public int getAttpub() {
        return this.attpub;
    }

    public void setAttpub(int attpub) {
        this.attpub = attpub;
    }

    public int getAttpri() {
        return this.attpri;
    }

    public void setAttpri(int attpri) {
        this.attpri = attpri;
    }

    public int getAttpro() {
        return this.attpro;
    }

    public void setAttpro(int attpro) {
        this.attpro = attpro;
    }

    public char getOrientation() {
        return this.orientation;
    }

    public void setOrientation(char orientation) {
        this.orientation = orientation;
    }

    public int getCx() {
        return this.cx;
    }

    public void setCx(int cx) {
        this.cx = cx;
    }

    public int getCy() {
        return this.cy;
    }

    public void setCy(int cy) {
        this.cy = cy;
    }

    public int getScale() {
        return this.scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public java.sql.Date getCreateddate() {
        return this.createddate;
    }

    public void setCreateddate(java.sql.Date createddate) {
        this.createddate = createddate;
    }

    public java.sql.Date getModifieddate() {
        return this.modifieddate;
    }

    public void setModifieddate(java.sql.Date modifieddate) {
        this.modifieddate = modifieddate;
    }

    public String getHtmlpath() {
        return this.htmlpath;
    }

    public void setHtmlpath(String htmlpath) {
        this.htmlpath = htmlpath;
    }

    public int getShowforeign() {
        return this.showforeign;
    }

    public void setShowforeign(int showforeign) {
        this.showforeign = showforeign;
    }

    public int getShowborder() {
        return this.showborder;
    }

    public void setShowborder(int showborder) {
        this.showborder = showborder;
    }

    public int getShowpackagecontents() {
        return this.showpackagecontents;
    }

    public void setShowpackagecontents(int showpackagecontents) {
        this.showpackagecontents = showpackagecontents;
    }

    public String getPdata() {
        return this.pdata;
    }

    public void setPdata(String pdata) {
        this.pdata = pdata;
    }

    public int getLocked() {
        return this.locked;
    }

    public void setLocked(int locked) {
        this.locked = locked;
    }

    public String getEaguid() {
        return this.eaguid;
    }

    public void setEaguid(String eaguid) {
        this.eaguid = eaguid;
    }

    public int getTpos() {
        return this.tpos;
    }

    public void setTpos(int tpos) {
        this.tpos = tpos;
    }

    public String getSwimlanes() {
        return this.swimlanes;
    }

    public void setSwimlanes(String swimlanes) {
        this.swimlanes = swimlanes;
    }

    public String getStyleex() {
        return this.styleex;
    }

    public void setStyleex(String styleex) {
        this.styleex = styleex;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + diagramid;
        result = prime * result + packageid;
        result = prime * result + parentid;
        result = prime * result + ((diagramtype == null) ? 0 : diagramtype.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((version == null) ? 0 : version.hashCode());
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + showdetails;
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
        result = prime * result + ((stereotype == null) ? 0 : stereotype.hashCode());
        result = prime * result + attpub;
        result = prime * result + attpri;
        result = prime * result + attpro;
        result = prime * result + orientation;
        result = prime * result + cx;
        result = prime * result + cy;
        result = prime * result + scale;
        result = prime * result + ((createddate == null) ? 0 : createddate.hashCode());
        result = prime * result + ((modifieddate == null) ? 0 : modifieddate.hashCode());
        result = prime * result + ((htmlpath == null) ? 0 : htmlpath.hashCode());
        result = prime * result + showforeign;
        result = prime * result + showborder;
        result = prime * result + showpackagecontents;
        result = prime * result + ((pdata == null) ? 0 : pdata.hashCode());
        result = prime * result + locked;
        result = prime * result + ((eaguid == null) ? 0 : eaguid.hashCode());
        result = prime * result + tpos;
        result = prime * result + ((swimlanes == null) ? 0 : swimlanes.hashCode());
        result = prime * result + ((styleex == null) ? 0 : styleex.hashCode());
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
        TdiagramDo other = (TdiagramDo) obj;
        if(diagramid != other.diagramid)
            return false;
        if(packageid != other.packageid)
            return false;
        if(parentid != other.parentid)
            return false;
        if(diagramtype == null) {
            if(other.diagramtype != null)
                return false;
        } else if(!diagramtype.equals(other.diagramtype))
            return false;
        if(name == null) {
            if(other.name != null)
                return false;
        } else if(!name.equals(other.name))
            return false;
        if(version == null) {
            if(other.version != null)
                return false;
        } else if(!version.equals(other.version))
            return false;
        if(author == null) {
            if(other.author != null)
                return false;
        } else if(!author.equals(other.author))
            return false;
        if(showdetails != other.showdetails)
            return false;
        if(notes == null) {
            if(other.notes != null)
                return false;
        } else if(!notes.equals(other.notes))
            return false;
        if(stereotype == null) {
            if(other.stereotype != null)
                return false;
        } else if(!stereotype.equals(other.stereotype))
            return false;
        if(attpub != other.attpub)
            return false;
        if(attpri != other.attpri)
            return false;
        if(attpro != other.attpro)
            return false;
        if(orientation != other.orientation)
            return false;
        if(cx != other.cx)
            return false;
        if(cy != other.cy)
            return false;
        if(scale != other.scale)
            return false;
        if(createddate == null) {
            if(other.createddate != null)
                return false;
        } else if(!createddate.equals(other.createddate))
            return false;
        if(modifieddate == null) {
            if(other.modifieddate != null)
                return false;
        } else if(!modifieddate.equals(other.modifieddate))
            return false;
        if(htmlpath == null) {
            if(other.htmlpath != null)
                return false;
        } else if(!htmlpath.equals(other.htmlpath))
            return false;
        if(showforeign != other.showforeign)
            return false;
        if(showborder != other.showborder)
            return false;
        if(showpackagecontents != other.showpackagecontents)
            return false;
        if(pdata == null) {
            if(other.pdata != null)
                return false;
        } else if(!pdata.equals(other.pdata))
            return false;
        if(locked != other.locked)
            return false;
        if(eaguid == null) {
            if(other.eaguid != null)
                return false;
        } else if(!eaguid.equals(other.eaguid))
            return false;
        if(tpos != other.tpos)
            return false;
        if(swimlanes == null) {
            if(other.swimlanes != null)
                return false;
        } else if(!swimlanes.equals(other.swimlanes))
            return false;
        if(styleex == null) {
            if(other.styleex != null)
                return false;
        } else if(!styleex.equals(other.styleex))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tdiagram [ " + " diagramid=" + diagramid + " packageid=" + packageid + " parentid=" + parentid + " diagramtype=" + diagramtype + " name=" + name + " version=" + version + " author=" + author + " showdetails=" + showdetails + " notes=" + notes + " stereotype=" + stereotype + " attpub=" + attpub + " attpri=" + attpri + " attpro=" + attpro + " orientation=" + orientation + " cx=" + cx + " cy=" + cy + " scale=" + scale + " createddate=" + createddate + " modifieddate=" + modifieddate + " htmlpath=" + htmlpath + " showforeign=" + showforeign + " showborder=" + showborder + " showpackagecontents=" + showpackagecontents + " pdata=" + pdata + " locked=" + locked + " eaguid=" + eaguid + " tpos=" + tpos + " swimlanes=" + swimlanes + " styleex=" + styleex+ "]";
    }

}

