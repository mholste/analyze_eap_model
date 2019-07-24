package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class TobjectresourceDo implements Serializable {

    private static final long serialVersionUID = 9131914070628801802L;

    private int objectid;
    private String resource;
    private String role;
    private long time;
    private String notes;
    private int percentcomplete;
    private java.sql.Date datestart;
    private java.sql.Date dateend;
    private String history;
    private int expectedhours;
    private int actualhours;

    public TobjectresourceDo() {
        super();
    }

    public TobjectresourceDo(int objectid, String resource, String role, long time, String notes, int percentcomplete, java.sql.Date datestart, java.sql.Date dateend, String history, int expectedhours, int actualhours) {
        super();
        this.objectid = objectid;
        this.resource = resource;
        this.role = role;
        this.time = time;
        this.notes = notes;
        this.percentcomplete = percentcomplete;
        this.datestart = datestart;
        this.dateend = dateend;
        this.history = history;
        this.expectedhours = expectedhours;
        this.actualhours = actualhours;
    }

    public int getObjectid() {
        return this.objectid;
    }

    public void setObjectid(int objectid) {
        this.objectid = objectid;
    }

    public String getResource() {
        return this.resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getTime() {
        return this.time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getPercentcomplete() {
        return this.percentcomplete;
    }

    public void setPercentcomplete(int percentcomplete) {
        this.percentcomplete = percentcomplete;
    }

    public java.sql.Date getDatestart() {
        return this.datestart;
    }

    public void setDatestart(java.sql.Date datestart) {
        this.datestart = datestart;
    }

    public java.sql.Date getDateend() {
        return this.dateend;
    }

    public void setDateend(java.sql.Date dateend) {
        this.dateend = dateend;
    }

    public String getHistory() {
        return this.history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public int getExpectedhours() {
        return this.expectedhours;
    }

    public void setExpectedhours(int expectedhours) {
        this.expectedhours = expectedhours;
    }

    public int getActualhours() {
        return this.actualhours;
    }

    public void setActualhours(int actualhours) {
        this.actualhours = actualhours;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + objectid;
        result = prime * result + ((resource == null) ? 0 : resource.hashCode());
        result = prime * result + ((role == null) ? 0 : role.hashCode());
        result = prime * result + (int) (time ^ (time >>> 32));
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
        result = prime * result + percentcomplete;
        result = prime * result + ((datestart == null) ? 0 : datestart.hashCode());
        result = prime * result + ((dateend == null) ? 0 : dateend.hashCode());
        result = prime * result + ((history == null) ? 0 : history.hashCode());
        result = prime * result + expectedhours;
        result = prime * result + actualhours;
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
        TobjectresourceDo other = (TobjectresourceDo) obj;
        if(objectid != other.objectid)
            return false;
        if(resource == null) {
            if(other.resource != null)
                return false;
        } else if(!resource.equals(other.resource))
            return false;
        if(role == null) {
            if(other.role != null)
                return false;
        } else if(!role.equals(other.role))
            return false;
        if(time != other.time)
            return false;
        if(notes == null) {
            if(other.notes != null)
                return false;
        } else if(!notes.equals(other.notes))
            return false;
        if(percentcomplete != other.percentcomplete)
            return false;
        if(datestart == null) {
            if(other.datestart != null)
                return false;
        } else if(!datestart.equals(other.datestart))
            return false;
        if(dateend == null) {
            if(other.dateend != null)
                return false;
        } else if(!dateend.equals(other.dateend))
            return false;
        if(history == null) {
            if(other.history != null)
                return false;
        } else if(!history.equals(other.history))
            return false;
        if(expectedhours != other.expectedhours)
            return false;
        if(actualhours != other.actualhours)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tobjectresource [ " + " objectid=" + objectid + " resource=" + resource + " role=" + role + " time=" + time + " notes=" + notes + " percentcomplete=" + percentcomplete + " datestart=" + datestart + " dateend=" + dateend + " history=" + history + " expectedhours=" + expectedhours + " actualhours=" + actualhours+ "]";
    }

}

