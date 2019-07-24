package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class TdiagramobjectsDo implements Serializable {

    private static final long serialVersionUID = 9131914070628801802L;

    private int diagramid;
    private int objectid;
    private int recttop;
    private int rectleft;
    private int rectright;
    private int rectbottom;
    private int sequence;
    private String objectstyle;
    private int instanceid;

    public TdiagramobjectsDo() {
        super();
    }

    public TdiagramobjectsDo(int diagramid, int objectid, int recttop, int rectleft, int rectright, int rectbottom, int sequence, String objectstyle, int instanceid) {
        super();
        this.diagramid = diagramid;
        this.objectid = objectid;
        this.recttop = recttop;
        this.rectleft = rectleft;
        this.rectright = rectright;
        this.rectbottom = rectbottom;
        this.sequence = sequence;
        this.objectstyle = objectstyle;
        this.instanceid = instanceid;
    }

    public int getDiagramid() {
        return this.diagramid;
    }

    public void setDiagramid(int diagramid) {
        this.diagramid = diagramid;
    }

    public int getObjectid() {
        return this.objectid;
    }

    public void setObjectid(int objectid) {
        this.objectid = objectid;
    }

    public int getRecttop() {
        return this.recttop;
    }

    public void setRecttop(int recttop) {
        this.recttop = recttop;
    }

    public int getRectleft() {
        return this.rectleft;
    }

    public void setRectleft(int rectleft) {
        this.rectleft = rectleft;
    }

    public int getRectright() {
        return this.rectright;
    }

    public void setRectright(int rectright) {
        this.rectright = rectright;
    }

    public int getRectbottom() {
        return this.rectbottom;
    }

    public void setRectbottom(int rectbottom) {
        this.rectbottom = rectbottom;
    }

    public int getSequence() {
        return this.sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public String getObjectstyle() {
        return this.objectstyle;
    }

    public void setObjectstyle(String objectstyle) {
        this.objectstyle = objectstyle;
    }

    public int getInstanceid() {
        return this.instanceid;
    }

    public void setInstanceid(int instanceid) {
        this.instanceid = instanceid;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + diagramid;
        result = prime * result + objectid;
        result = prime * result + recttop;
        result = prime * result + rectleft;
        result = prime * result + rectright;
        result = prime * result + rectbottom;
        result = prime * result + sequence;
        result = prime * result + ((objectstyle == null) ? 0 : objectstyle.hashCode());
        result = prime * result + instanceid;
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
        TdiagramobjectsDo other = (TdiagramobjectsDo) obj;
        if(diagramid != other.diagramid)
            return false;
        if(objectid != other.objectid)
            return false;
        if(recttop != other.recttop)
            return false;
        if(rectleft != other.rectleft)
            return false;
        if(rectright != other.rectright)
            return false;
        if(rectbottom != other.rectbottom)
            return false;
        if(sequence != other.sequence)
            return false;
        if(objectstyle == null) {
            if(other.objectstyle != null)
                return false;
        } else if(!objectstyle.equals(other.objectstyle))
            return false;
        if(instanceid != other.instanceid)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tdiagramobjects [ " + " diagramid=" + diagramid + " objectid=" + objectid + " recttop=" + recttop + " rectleft=" + rectleft + " rectright=" + rectright + " rectbottom=" + rectbottom + " sequence=" + sequence + " objectstyle=" + objectstyle + " instanceid=" + instanceid+ "]";
    }

}

