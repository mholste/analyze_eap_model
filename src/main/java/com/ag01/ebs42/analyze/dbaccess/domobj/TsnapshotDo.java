package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class TsnapshotDo implements Serializable {

    private static final long serialVersionUID = 9105474330571921161L;

    private String snapshotid;
    private String seriesid;
    private int position;
    private String snapshotname;
    private String notes;
    private String style;
    private String elementid;
    private String elementtype;
    private String strcontent;
    private String bincontent1;
    private String bincontent2;

    public TsnapshotDo() {
        super();
    }

    public TsnapshotDo(String snapshotid, String seriesid, int position, String snapshotname, String notes, String style, String elementid, String elementtype, String strcontent, String bincontent1, String bincontent2) {
        super();
        this.snapshotid = snapshotid;
        this.seriesid = seriesid;
        this.position = position;
        this.snapshotname = snapshotname;
        this.notes = notes;
        this.style = style;
        this.elementid = elementid;
        this.elementtype = elementtype;
        this.strcontent = strcontent;
        this.bincontent1 = bincontent1;
        this.bincontent2 = bincontent2;
    }

    public String getSnapshotid() {
        return this.snapshotid;
    }

    public void setSnapshotid(String snapshotid) {
        this.snapshotid = snapshotid;
    }

    public String getSeriesid() {
        return this.seriesid;
    }

    public void setSeriesid(String seriesid) {
        this.seriesid = seriesid;
    }

    public int getPosition() {
        return this.position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getSnapshotname() {
        return this.snapshotname;
    }

    public void setSnapshotname(String snapshotname) {
        this.snapshotname = snapshotname;
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

    public String getBincontent1() {
        return this.bincontent1;
    }

    public void setBincontent1(String bincontent1) {
        this.bincontent1 = bincontent1;
    }

    public String getBincontent2() {
        return this.bincontent2;
    }

    public void setBincontent2(String bincontent2) {
        this.bincontent2 = bincontent2;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((snapshotid == null) ? 0 : snapshotid.hashCode());
        result = prime * result + ((seriesid == null) ? 0 : seriesid.hashCode());
        result = prime * result + position;
        result = prime * result + ((snapshotname == null) ? 0 : snapshotname.hashCode());
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
        result = prime * result + ((style == null) ? 0 : style.hashCode());
        result = prime * result + ((elementid == null) ? 0 : elementid.hashCode());
        result = prime * result + ((elementtype == null) ? 0 : elementtype.hashCode());
        result = prime * result + ((strcontent == null) ? 0 : strcontent.hashCode());
        result = prime * result + ((bincontent1 == null) ? 0 : bincontent1.hashCode());
        result = prime * result + ((bincontent2 == null) ? 0 : bincontent2.hashCode());
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
        TsnapshotDo other = (TsnapshotDo) obj;
        if(snapshotid == null) {
            if(other.snapshotid != null)
                return false;
        } else if(!snapshotid.equals(other.snapshotid))
            return false;
        if(seriesid == null) {
            if(other.seriesid != null)
                return false;
        } else if(!seriesid.equals(other.seriesid))
            return false;
        if(position != other.position)
            return false;
        if(snapshotname == null) {
            if(other.snapshotname != null)
                return false;
        } else if(!snapshotname.equals(other.snapshotname))
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
        if(bincontent1 == null) {
            if(other.bincontent1 != null)
                return false;
        } else if(!bincontent1.equals(other.bincontent1))
            return false;
        if(bincontent2 == null) {
            if(other.bincontent2 != null)
                return false;
        } else if(!bincontent2.equals(other.bincontent2))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tsnapshot [ " + " snapshotid=" + snapshotid + " seriesid=" + seriesid + " position=" + position + " snapshotname=" + snapshotname + " notes=" + notes + " style=" + style + " elementid=" + elementid + " elementtype=" + elementtype + " strcontent=" + strcontent + " bincontent1=" + bincontent1 + " bincontent2=" + bincontent2+ "]";
    }

}

