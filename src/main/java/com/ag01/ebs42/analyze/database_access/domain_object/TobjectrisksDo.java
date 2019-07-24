package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class TobjectrisksDo implements Serializable {

    private static final long serialVersionUID = -7987885395967842741L;

    private int objectid;
    private String risk;
    private String risktype;
    private long evalue;
    private String notes;

    public TobjectrisksDo() {
        super();
    }

    public TobjectrisksDo(int objectid, String risk, String risktype, long evalue, String notes) {
        super();
        this.objectid = objectid;
        this.risk = risk;
        this.risktype = risktype;
        this.evalue = evalue;
        this.notes = notes;
    }

    public int getObjectid() {
        return this.objectid;
    }

    public void setObjectid(int objectid) {
        this.objectid = objectid;
    }

    public String getRisk() {
        return this.risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }

    public String getRisktype() {
        return this.risktype;
    }

    public void setRisktype(String risktype) {
        this.risktype = risktype;
    }

    public long getEvalue() {
        return this.evalue;
    }

    public void setEvalue(long evalue) {
        this.evalue = evalue;
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
        result = prime * result + ((risk == null) ? 0 : risk.hashCode());
        result = prime * result + ((risktype == null) ? 0 : risktype.hashCode());
        result = prime * result + (int) (evalue ^ (evalue >>> 32));
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
        TobjectrisksDo other = (TobjectrisksDo) obj;
        if(objectid != other.objectid)
            return false;
        if(risk == null) {
            if(other.risk != null)
                return false;
        } else if(!risk.equals(other.risk))
            return false;
        if(risktype == null) {
            if(other.risktype != null)
                return false;
        } else if(!risktype.equals(other.risktype))
            return false;
        if(evalue != other.evalue)
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
        return "Tobjectrisks [ " + " objectid=" + objectid + " risk=" + risk + " risktype=" + risktype + " evalue=" + evalue + " notes=" + notes+ "]";
    }

}

