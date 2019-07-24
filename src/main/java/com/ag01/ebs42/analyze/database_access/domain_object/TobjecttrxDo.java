package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class TobjecttrxDo implements Serializable {

    private static final long serialVersionUID = -7935005907264146868L;

    private int objectid;
    private String trx;
    private String trxtype;
    private long weight;
    private String notes;

    public TobjecttrxDo() {
        super();
    }

    public TobjecttrxDo(int objectid, String trx, String trxtype, long weight, String notes) {
        super();
        this.objectid = objectid;
        this.trx = trx;
        this.trxtype = trxtype;
        this.weight = weight;
        this.notes = notes;
    }

    public int getObjectid() {
        return this.objectid;
    }

    public void setObjectid(int objectid) {
        this.objectid = objectid;
    }

    public String getTrx() {
        return this.trx;
    }

    public void setTrx(String trx) {
        this.trx = trx;
    }

    public String getTrxtype() {
        return this.trxtype;
    }

    public void setTrxtype(String trxtype) {
        this.trxtype = trxtype;
    }

    public long getWeight() {
        return this.weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + objectid;
        result = prime * result + ((trx == null) ? 0 : trx.hashCode());
        result = prime * result + ((trxtype == null) ? 0 : trxtype.hashCode());
        result = prime * result + (int) (weight ^ (weight >>> 32));
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
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
        TobjecttrxDo other = (TobjecttrxDo) obj;
        if(objectid != other.objectid)
            return false;
        if(trx == null) {
            if(other.trx != null)
                return false;
        } else if(!trx.equals(other.trx))
            return false;
        if(trxtype == null) {
            if(other.trxtype != null)
                return false;
        } else if(!trxtype.equals(other.trxtype))
            return false;
        if(weight != other.weight)
            return false;
        if(notes == null) {
            if(other.notes != null)
                return false;
        } else if(!notes.equals(other.notes))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tobjecttrx [ " + " objectid=" + objectid + " trx=" + trx + " trxtype=" + trxtype + " weight=" + weight + " notes=" + notes+ "]";
    }

}

