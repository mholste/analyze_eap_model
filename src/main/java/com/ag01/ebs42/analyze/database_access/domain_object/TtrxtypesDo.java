package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class TtrxtypesDo implements Serializable {

    private static final long serialVersionUID = 9131914070628801802L;

    private String trx;
    private String description;
    private long numericweight;
    private String notes;
    private String style;
    private int trxid;

    public TtrxtypesDo() {
        super();
    }

    public TtrxtypesDo(String trx, String description, long numericweight, String notes, String style, int trxid) {
        super();
        this.trx = trx;
        this.description = description;
        this.numericweight = numericweight;
        this.notes = notes;
        this.style = style;
        this.trxid = trxid;
    }

    public String getTrx() {
        return this.trx;
    }

    public void setTrx(String trx) {
        this.trx = trx;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getNumericweight() {
        return this.numericweight;
    }

    public void setNumericweight(long numericweight) {
        this.numericweight = numericweight;
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

    public int getTrxid() {
        return this.trxid;
    }

    public void setTrxid(int trxid) {
        this.trxid = trxid;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((trx == null) ? 0 : trx.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + (int) (numericweight ^ (numericweight >>> 32));
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
        result = prime * result + ((style == null) ? 0 : style.hashCode());
        result = prime * result + trxid;
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
        TtrxtypesDo other = (TtrxtypesDo) obj;
        if(trx == null) {
            if(other.trx != null)
                return false;
        } else if(!trx.equals(other.trx))
            return false;
        if(description == null) {
            if(other.description != null)
                return false;
        } else if(!description.equals(other.description))
            return false;
        if(numericweight != other.numericweight)
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
        if(trxid != other.trxid)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Ttrxtypes [ " + " trx=" + trx + " description=" + description + " numericweight=" + numericweight + " notes=" + notes + " style=" + style + " trxid=" + trxid+ "]";
    }

}

