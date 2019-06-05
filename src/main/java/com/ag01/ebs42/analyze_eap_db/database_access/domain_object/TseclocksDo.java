package com.ag01.ebs42.analyze_eap_db.database_access.domain_object;

import java.io.Serializable;

public class TseclocksDo implements Serializable {

    private static final long serialVersionUID = 9131914070628801802L;

    private String userid;
    private String groupid;
    private String entitytype;
    private String entityid;
    private java.sql.Date timestamp;
    private String locktype;

    public TseclocksDo() {
        super();
    }

    public TseclocksDo(String userid, String groupid, String entitytype, String entityid, java.sql.Date timestamp, String locktype) {
        super();
        this.userid = userid;
        this.groupid = groupid;
        this.entitytype = entitytype;
        this.entityid = entityid;
        this.timestamp = timestamp;
        this.locktype = locktype;
    }

    public String getUserid() {
        return this.userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getGroupid() {
        return this.groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getEntitytype() {
        return this.entitytype;
    }

    public void setEntitytype(String entitytype) {
        this.entitytype = entitytype;
    }

    public String getEntityid() {
        return this.entityid;
    }

    public void setEntityid(String entityid) {
        this.entityid = entityid;
    }

    public java.sql.Date getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(java.sql.Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getLocktype() {
        return this.locktype;
    }

    public void setLocktype(String locktype) {
        this.locktype = locktype;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((userid == null) ? 0 : userid.hashCode());
        result = prime * result + ((groupid == null) ? 0 : groupid.hashCode());
        result = prime * result + ((entitytype == null) ? 0 : entitytype.hashCode());
        result = prime * result + ((entityid == null) ? 0 : entityid.hashCode());
        result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
        result = prime * result + ((locktype == null) ? 0 : locktype.hashCode());
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
        TseclocksDo other = (TseclocksDo) obj;
        if(userid == null) {
            if(other.userid != null)
                return false;
        } else if(!userid.equals(other.userid))
            return false;
        if(groupid == null) {
            if(other.groupid != null)
                return false;
        } else if(!groupid.equals(other.groupid))
            return false;
        if(entitytype == null) {
            if(other.entitytype != null)
                return false;
        } else if(!entitytype.equals(other.entitytype))
            return false;
        if(entityid == null) {
            if(other.entityid != null)
                return false;
        } else if(!entityid.equals(other.entityid))
            return false;
        if(timestamp == null) {
            if(other.timestamp != null)
                return false;
        } else if(!timestamp.equals(other.timestamp))
            return false;
        if(locktype == null) {
            if(other.locktype != null)
                return false;
        } else if(!locktype.equals(other.locktype))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tseclocks [ " + " userid=" + userid + " groupid=" + groupid + " entitytype=" + entitytype + " entityid=" + entityid + " timestamp=" + timestamp + " locktype=" + locktype+ "]";
    }

}

