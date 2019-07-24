package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class TpaletteitemDo implements Serializable {

    private static final long serialVersionUID = -8014325136024723382L;

    private int paletteid;
    private int itemid;

    public TpaletteitemDo() {
        super();
    }

    public TpaletteitemDo(int paletteid, int itemid) {
        super();
        this.paletteid = paletteid;
        this.itemid = itemid;
    }

    public int getPaletteid() {
        return this.paletteid;
    }

    public void setPaletteid(int paletteid) {
        this.paletteid = paletteid;
    }

    public int getItemid() {
        return this.itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + paletteid;
        result = prime * result + itemid;
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
        TpaletteitemDo other = (TpaletteitemDo) obj;
        if(paletteid != other.paletteid)
            return false;
        if(itemid != other.itemid)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tpaletteitem [ " + " paletteid=" + paletteid + " itemid=" + itemid+ "]";
    }

}

