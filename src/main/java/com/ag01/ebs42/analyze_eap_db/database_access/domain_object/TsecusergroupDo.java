package com.ag01.ebs42.analyze_eap_db.database_access.domain_object;

import java.io.Serializable;

public class TsecusergroupDo implements Serializable {

    private static final long serialVersionUID = -7987885395967842741L;

    private String userid;
    private String groupid;

    public TsecusergroupDo() {
        super();
    }

    public TsecusergroupDo(String userid, String groupid) {
        super();
        this.userid = userid;
        this.groupid = groupid;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((userid == null) ? 0 : userid.hashCode());
        result = prime * result + ((groupid == null) ? 0 : groupid.hashCode());
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
        TsecusergroupDo other = (TsecusergroupDo) obj;
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
        return true;
    }

    @Override
    public String toString() {
        return "Tsecusergroup [ " + " userid=" + userid + " groupid=" + groupid+ "]";
    }

}

