package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class TmetrictypesDo implements Serializable {

    private static final long serialVersionUID = 9105474330571921161L;

    private String metric;
    private String description;
    private long numericweight;
    private String notes;

    public TmetrictypesDo() {
        super();
    }

    public TmetrictypesDo(String metric, String description, long numericweight, String notes) {
        super();
        this.metric = metric;
        this.description = description;
        this.numericweight = numericweight;
        this.notes = notes;
    }

    public String getMetric() {
        return this.metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((metric == null) ? 0 : metric.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + (int) (numericweight ^ (numericweight >>> 32));
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
        TmetrictypesDo other = (TmetrictypesDo) obj;
        if(metric == null) {
            if(other.metric != null)
                return false;
        } else if(!metric.equals(other.metric))
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
        return true;
    }

    @Override
    public String toString() {
        return "Tmetrictypes [ " + " metric=" + metric + " description=" + description + " numericweight=" + numericweight + " notes=" + notes+ "]";
    }

}

