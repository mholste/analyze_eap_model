package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class TobjectmetricsDo implements Serializable {

    private static final long serialVersionUID = 9131914070628801802L;

    private int objectid;
    private String metric;
    private String metrictype;
    private long evalue;
    private String notes;

    public TobjectmetricsDo() {
        super();
    }

    public TobjectmetricsDo(int objectid, String metric, String metrictype, long evalue, String notes) {
        super();
        this.objectid = objectid;
        this.metric = metric;
        this.metrictype = metrictype;
        this.evalue = evalue;
        this.notes = notes;
    }

    public int getObjectid() {
        return this.objectid;
    }

    public void setObjectid(int objectid) {
        this.objectid = objectid;
    }

    public String getMetric() {
        return this.metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public String getMetrictype() {
        return this.metrictype;
    }

    public void setMetrictype(String metrictype) {
        this.metrictype = metrictype;
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
        result = prime * result + ((metric == null) ? 0 : metric.hashCode());
        result = prime * result + ((metrictype == null) ? 0 : metrictype.hashCode());
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
        TobjectmetricsDo other = (TobjectmetricsDo) obj;
        if(objectid != other.objectid)
            return false;
        if(metric == null) {
            if(other.metric != null)
                return false;
        } else if(!metric.equals(other.metric))
            return false;
        if(metrictype == null) {
            if(other.metrictype != null)
                return false;
        } else if(!metrictype.equals(other.metrictype))
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
        return "Tobjectmetrics [ " + " objectid=" + objectid + " metric=" + metric + " metrictype=" + metrictype + " evalue=" + evalue + " notes=" + notes+ "]";
    }

}

