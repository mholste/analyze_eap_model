package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class TissuesDo implements Serializable {

    private static final long serialVersionUID = 9131914070628801802L;

    private String issue;
    private java.sql.Date issuedate;
    private String owner;
    private String status;
    private String notes;
    private String resolver;
    private java.sql.Date dateresolved;
    private String resolution;
    private int issueid;
    private String category;
    private String priority;
    private String severity;
    private String issuetype;

    public TissuesDo() {
        super();
    }

    public TissuesDo(String issue, java.sql.Date issuedate, String owner, String status, String notes, String resolver, java.sql.Date dateresolved, String resolution, int issueid, String category, String priority, String severity, String issuetype) {
        super();
        this.issue = issue;
        this.issuedate = issuedate;
        this.owner = owner;
        this.status = status;
        this.notes = notes;
        this.resolver = resolver;
        this.dateresolved = dateresolved;
        this.resolution = resolution;
        this.issueid = issueid;
        this.category = category;
        this.priority = priority;
        this.severity = severity;
        this.issuetype = issuetype;
    }

    public String getIssue() {
        return this.issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public java.sql.Date getIssuedate() {
        return this.issuedate;
    }

    public void setIssuedate(java.sql.Date issuedate) {
        this.issuedate = issuedate;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
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

    public String getResolver() {
        return this.resolver;
    }

    public void setResolver(String resolver) {
        this.resolver = resolver;
    }

    public java.sql.Date getDateresolved() {
        return this.dateresolved;
    }

    public void setDateresolved(java.sql.Date dateresolved) {
        this.dateresolved = dateresolved;
    }

    public String getResolution() {
        return this.resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getIssueid() {
        return this.issueid;
    }

    public void setIssueid(int issueid) {
        this.issueid = issueid;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public String getIssuetype() {
        return this.issuetype;
    }

    public void setIssuetype(String issuetype) {
        this.issuetype = issuetype;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((issue == null) ? 0 : issue.hashCode());
        result = prime * result + ((issuedate == null) ? 0 : issuedate.hashCode());
        result = prime * result + ((owner == null) ? 0 : owner.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
        result = prime * result + ((resolver == null) ? 0 : resolver.hashCode());
        result = prime * result + ((dateresolved == null) ? 0 : dateresolved.hashCode());
        result = prime * result + ((resolution == null) ? 0 : resolution.hashCode());
        result = prime * result + issueid;
        result = prime * result + ((category == null) ? 0 : category.hashCode());
        result = prime * result + ((priority == null) ? 0 : priority.hashCode());
        result = prime * result + ((severity == null) ? 0 : severity.hashCode());
        result = prime * result + ((issuetype == null) ? 0 : issuetype.hashCode());
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
        TissuesDo other = (TissuesDo) obj;
        if(issue == null) {
            if(other.issue != null)
                return false;
        } else if(!issue.equals(other.issue))
            return false;
        if(issuedate == null) {
            if(other.issuedate != null)
                return false;
        } else if(!issuedate.equals(other.issuedate))
            return false;
        if(owner == null) {
            if(other.owner != null)
                return false;
        } else if(!owner.equals(other.owner))
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
        if(resolver == null) {
            if(other.resolver != null)
                return false;
        } else if(!resolver.equals(other.resolver))
            return false;
        if(dateresolved == null) {
            if(other.dateresolved != null)
                return false;
        } else if(!dateresolved.equals(other.dateresolved))
            return false;
        if(resolution == null) {
            if(other.resolution != null)
                return false;
        } else if(!resolution.equals(other.resolution))
            return false;
        if(issueid != other.issueid)
            return false;
        if(category == null) {
            if(other.category != null)
                return false;
        } else if(!category.equals(other.category))
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
        if(issuetype == null) {
            if(other.issuetype != null)
                return false;
        } else if(!issuetype.equals(other.issuetype))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tissues [ " + " issue=" + issue + " issuedate=" + issuedate + " owner=" + owner + " status=" + status + " notes=" + notes + " resolver=" + resolver + " dateresolved=" + dateresolved + " resolution=" + resolution + " issueid=" + issueid + " category=" + category + " priority=" + priority + " severity=" + severity + " issuetype=" + issuetype+ "]";
    }

}

