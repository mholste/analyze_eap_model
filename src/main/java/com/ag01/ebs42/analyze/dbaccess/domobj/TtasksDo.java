package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class TtasksDo implements Serializable {

    private static final long serialVersionUID = 9054247325084909416L;

    private int taskid;
    private String name;
    private String tasktype;
    private String notes;
    private String priority;
    private String status;
    private String owner;
    private java.sql.Date startdate;
    private java.sql.Date enddate;
    private String phase;
    private String history;
    private int percent;
    private int totaltime;
    private int actualtime;
    private String assignedto;

    public TtasksDo() {
        super();
    }

    public TtasksDo(int taskid, String name, String tasktype, String notes, String priority, String status, String owner, java.sql.Date startdate, java.sql.Date enddate, String phase, String history, int percent, int totaltime, int actualtime, String assignedto) {
        super();
        this.taskid = taskid;
        this.name = name;
        this.tasktype = tasktype;
        this.notes = notes;
        this.priority = priority;
        this.status = status;
        this.owner = owner;
        this.startdate = startdate;
        this.enddate = enddate;
        this.phase = phase;
        this.history = history;
        this.percent = percent;
        this.totaltime = totaltime;
        this.actualtime = actualtime;
        this.assignedto = assignedto;
    }

    public int getTaskid() {
        return this.taskid;
    }

    public void setTaskid(int taskid) {
        this.taskid = taskid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTasktype() {
        return this.tasktype;
    }

    public void setTasktype(String tasktype) {
        this.tasktype = tasktype;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPriority() {
        return this.priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public java.sql.Date getStartdate() {
        return this.startdate;
    }

    public void setStartdate(java.sql.Date startdate) {
        this.startdate = startdate;
    }

    public java.sql.Date getEnddate() {
        return this.enddate;
    }

    public void setEnddate(java.sql.Date enddate) {
        this.enddate = enddate;
    }

    public String getPhase() {
        return this.phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getHistory() {
        return this.history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public int getPercent() {
        return this.percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public int getTotaltime() {
        return this.totaltime;
    }

    public void setTotaltime(int totaltime) {
        this.totaltime = totaltime;
    }

    public int getActualtime() {
        return this.actualtime;
    }

    public void setActualtime(int actualtime) {
        this.actualtime = actualtime;
    }

    public String getAssignedto() {
        return this.assignedto;
    }

    public void setAssignedto(String assignedto) {
        this.assignedto = assignedto;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + taskid;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((tasktype == null) ? 0 : tasktype.hashCode());
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
        result = prime * result + ((priority == null) ? 0 : priority.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((owner == null) ? 0 : owner.hashCode());
        result = prime * result + ((startdate == null) ? 0 : startdate.hashCode());
        result = prime * result + ((enddate == null) ? 0 : enddate.hashCode());
        result = prime * result + ((phase == null) ? 0 : phase.hashCode());
        result = prime * result + ((history == null) ? 0 : history.hashCode());
        result = prime * result + percent;
        result = prime * result + totaltime;
        result = prime * result + actualtime;
        result = prime * result + ((assignedto == null) ? 0 : assignedto.hashCode());
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
        TtasksDo other = (TtasksDo) obj;
        if(taskid != other.taskid)
            return false;
        if(name == null) {
            if(other.name != null)
                return false;
        } else if(!name.equals(other.name))
            return false;
        if(tasktype == null) {
            if(other.tasktype != null)
                return false;
        } else if(!tasktype.equals(other.tasktype))
            return false;
        if(notes == null) {
            if(other.notes != null)
                return false;
        } else if(!notes.equals(other.notes))
            return false;
        if(priority == null) {
            if(other.priority != null)
                return false;
        } else if(!priority.equals(other.priority))
            return false;
        if(status == null) {
            if(other.status != null)
                return false;
        } else if(!status.equals(other.status))
            return false;
        if(owner == null) {
            if(other.owner != null)
                return false;
        } else if(!owner.equals(other.owner))
            return false;
        if(startdate == null) {
            if(other.startdate != null)
                return false;
        } else if(!startdate.equals(other.startdate))
            return false;
        if(enddate == null) {
            if(other.enddate != null)
                return false;
        } else if(!enddate.equals(other.enddate))
            return false;
        if(phase == null) {
            if(other.phase != null)
                return false;
        } else if(!phase.equals(other.phase))
            return false;
        if(history == null) {
            if(other.history != null)
                return false;
        } else if(!history.equals(other.history))
            return false;
        if(percent != other.percent)
            return false;
        if(totaltime != other.totaltime)
            return false;
        if(actualtime != other.actualtime)
            return false;
        if(assignedto == null) {
            if(other.assignedto != null)
                return false;
        } else if(!assignedto.equals(other.assignedto))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Ttasks [ " + " taskid=" + taskid + " name=" + name + " tasktype=" + tasktype + " notes=" + notes + " priority=" + priority + " status=" + status + " owner=" + owner + " startdate=" + startdate + " enddate=" + enddate + " phase=" + phase + " history=" + history + " percent=" + percent + " totaltime=" + totaltime + " actualtime=" + actualtime + " assignedto=" + assignedto+ "]";
    }

}

