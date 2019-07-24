package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class TobjectproblemsDo implements Serializable {

    private static final long serialVersionUID = -7935005907264146868L;

    private int objectid;
    private String problem;
    private String problemtype;
    private java.sql.Date datereported;
    private String status;
    private String problemnotes;
    private String reportedby;
    private String resolvedby;
    private java.sql.Date dateresolved;
    private String version;
    private String resolvernotes;
    private String priority;
    private String severity;

    public TobjectproblemsDo() {
        super();
    }

    public TobjectproblemsDo(int objectid, String problem, String problemtype, java.sql.Date datereported, String status, String problemnotes, String reportedby, String resolvedby, java.sql.Date dateresolved, String version, String resolvernotes, String priority, String severity) {
        super();
        this.objectid = objectid;
        this.problem = problem;
        this.problemtype = problemtype;
        this.datereported = datereported;
        this.status = status;
        this.problemnotes = problemnotes;
        this.reportedby = reportedby;
        this.resolvedby = resolvedby;
        this.dateresolved = dateresolved;
        this.version = version;
        this.resolvernotes = resolvernotes;
        this.priority = priority;
        this.severity = severity;
    }

    public int getObjectid() {
        return this.objectid;
    }

    public void setObjectid(int objectid) {
        this.objectid = objectid;
    }

    public String getProblem() {
        return this.problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getProblemtype() {
        return this.problemtype;
    }

    public void setProblemtype(String problemtype) {
        this.problemtype = problemtype;
    }

    public java.sql.Date getDatereported() {
        return this.datereported;
    }

    public void setDatereported(java.sql.Date datereported) {
        this.datereported = datereported;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProblemnotes() {
        return this.problemnotes;
    }

    public void setProblemnotes(String problemnotes) {
        this.problemnotes = problemnotes;
    }

    public String getReportedby() {
        return this.reportedby;
    }

    public void setReportedby(String reportedby) {
        this.reportedby = reportedby;
    }

    public String getResolvedby() {
        return this.resolvedby;
    }

    public void setResolvedby(String resolvedby) {
        this.resolvedby = resolvedby;
    }

    public java.sql.Date getDateresolved() {
        return this.dateresolved;
    }

    public void setDateresolved(java.sql.Date dateresolved) {
        this.dateresolved = dateresolved;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getResolvernotes() {
        return this.resolvernotes;
    }

    public void setResolvernotes(String resolvernotes) {
        this.resolvernotes = resolvernotes;
    }

    public String getPriority() {
        return this.priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getSeverity() {
        return this.severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + objectid;
        result = prime * result + ((problem == null) ? 0 : problem.hashCode());
        result = prime * result + ((problemtype == null) ? 0 : problemtype.hashCode());
        result = prime * result + ((datereported == null) ? 0 : datereported.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((problemnotes == null) ? 0 : problemnotes.hashCode());
        result = prime * result + ((reportedby == null) ? 0 : reportedby.hashCode());
        result = prime * result + ((resolvedby == null) ? 0 : resolvedby.hashCode());
        result = prime * result + ((dateresolved == null) ? 0 : dateresolved.hashCode());
        result = prime * result + ((version == null) ? 0 : version.hashCode());
        result = prime * result + ((resolvernotes == null) ? 0 : resolvernotes.hashCode());
        result = prime * result + ((priority == null) ? 0 : priority.hashCode());
        result = prime * result + ((severity == null) ? 0 : severity.hashCode());
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
        TobjectproblemsDo other = (TobjectproblemsDo) obj;
        if(objectid != other.objectid)
            return false;
        if(problem == null) {
            if(other.problem != null)
                return false;
        } else if(!problem.equals(other.problem))
            return false;
        if(problemtype == null) {
            if(other.problemtype != null)
                return false;
        } else if(!problemtype.equals(other.problemtype))
            return false;
        if(datereported == null) {
            if(other.datereported != null)
                return false;
        } else if(!datereported.equals(other.datereported))
            return false;
        if(status == null) {
            if(other.status != null)
                return false;
        } else if(!status.equals(other.status))
            return false;
        if(problemnotes == null) {
            if(other.problemnotes != null)
                return false;
        } else if(!problemnotes.equals(other.problemnotes))
            return false;
        if(reportedby == null) {
            if(other.reportedby != null)
                return false;
        } else if(!reportedby.equals(other.reportedby))
            return false;
        if(resolvedby == null) {
            if(other.resolvedby != null)
                return false;
        } else if(!resolvedby.equals(other.resolvedby))
            return false;
        if(dateresolved == null) {
            if(other.dateresolved != null)
                return false;
        } else if(!dateresolved.equals(other.dateresolved))
            return false;
        if(version == null) {
            if(other.version != null)
                return false;
        } else if(!version.equals(other.version))
            return false;
        if(resolvernotes == null) {
            if(other.resolvernotes != null)
                return false;
        } else if(!resolvernotes.equals(other.resolvernotes))
            return false;
        if(priority == null) {
            if(other.priority != null)
                return false;
        } else if(!priority.equals(other.priority))
            return false;
        if(severity == null) {
            if(other.severity != null)
                return false;
        } else if(!severity.equals(other.severity))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tobjectproblems [ " + " objectid=" + objectid + " problem=" + problem + " problemtype=" + problemtype + " datereported=" + datereported + " status=" + status + " problemnotes=" + problemnotes + " reportedby=" + reportedby + " resolvedby=" + resolvedby + " dateresolved=" + dateresolved + " version=" + version + " resolvernotes=" + resolvernotes + " priority=" + priority + " severity=" + severity+ "]";
    }

}

