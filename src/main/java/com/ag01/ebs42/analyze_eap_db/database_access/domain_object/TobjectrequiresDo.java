package com.ag01.ebs42.analyze_eap_db.database_access.domain_object;

import java.io.Serializable;

public class TobjectrequiresDo implements Serializable {

    private static final long serialVersionUID = -7987885395967842741L;

    private int reqid;
    private int objectid;
    private String requirement;
    private String reqtype;
    private String status;
    private String notes;
    private String stability;
    private String difficulty;
    private String priority;
    private String lastupdate;

    public TobjectrequiresDo() {
        super();
    }

    public TobjectrequiresDo(int reqid, int objectid, String requirement, String reqtype, String status, String notes, String stability, String difficulty, String priority, String lastupdate) {
        super();
        this.reqid = reqid;
        this.objectid = objectid;
        this.requirement = requirement;
        this.reqtype = reqtype;
        this.status = status;
        this.notes = notes;
        this.stability = stability;
        this.difficulty = difficulty;
        this.priority = priority;
        this.lastupdate = lastupdate;
    }

    public int getReqid() {
        return this.reqid;
    }

    public void setReqid(int reqid) {
        this.reqid = reqid;
    }

    public int getObjectid() {
        return this.objectid;
    }

    public void setObjectid(int objectid) {
        this.objectid = objectid;
    }

    public String getRequirement() {
        return this.requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getReqtype() {
        return this.reqtype;
    }

    public void setReqtype(String reqtype) {
        this.reqtype = reqtype;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getStability() {
        return this.stability;
    }

    public void setStability(String stability) {
        this.stability = stability;
    }

    public String getDifficulty() {
        return this.difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getPriority() {
        return this.priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getLastupdate() {
        return this.lastupdate;
    }

    public void setLastupdate(String lastupdate) {
        this.lastupdate = lastupdate;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + reqid;
        result = prime * result + objectid;
        result = prime * result + ((requirement == null) ? 0 : requirement.hashCode());
        result = prime * result + ((reqtype == null) ? 0 : reqtype.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
        result = prime * result + ((stability == null) ? 0 : stability.hashCode());
        result = prime * result + ((difficulty == null) ? 0 : difficulty.hashCode());
        result = prime * result + ((priority == null) ? 0 : priority.hashCode());
        result = prime * result + ((lastupdate == null) ? 0 : lastupdate.hashCode());
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
        TobjectrequiresDo other = (TobjectrequiresDo) obj;
        if(reqid != other.reqid)
            return false;
        if(objectid != other.objectid)
            return false;
        if(requirement == null) {
            if(other.requirement != null)
                return false;
        } else if(!requirement.equals(other.requirement))
            return false;
        if(reqtype == null) {
            if(other.reqtype != null)
                return false;
        } else if(!reqtype.equals(other.reqtype))
            return false;
        if(status == null) {
            if(other.status != null)
                return false;
        } else if(!status.equals(other.status))
            return false;
        if(notes == null) {
            if(other.notes != null)
                return false;
        } else if(!notes.equals(other.notes))
            return false;
        if(stability == null) {
            if(other.stability != null)
                return false;
        } else if(!stability.equals(other.stability))
            return false;
        if(difficulty == null) {
            if(other.difficulty != null)
                return false;
        } else if(!difficulty.equals(other.difficulty))
            return false;
        if(priority == null) {
            if(other.priority != null)
                return false;
        } else if(!priority.equals(other.priority))
            return false;
        if(lastupdate == null) {
            if(other.lastupdate != null)
                return false;
        } else if(!lastupdate.equals(other.lastupdate))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tobjectrequires [ " + " reqid=" + reqid + " objectid=" + objectid + " requirement=" + requirement + " reqtype=" + reqtype + " status=" + status + " notes=" + notes + " stability=" + stability + " difficulty=" + difficulty + " priority=" + priority + " lastupdate=" + lastupdate+ "]";
    }

}

