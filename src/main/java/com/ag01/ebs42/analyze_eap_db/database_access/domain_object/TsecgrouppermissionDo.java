package com.ag01.ebs42.analyze_eap_db.database_access.domain_object;

import java.io.Serializable;

public class TsecgrouppermissionDo implements Serializable {

    private static final long serialVersionUID = -7935005907264146868L;

    private String groupid;
    private int permissionid;

    public TsecgrouppermissionDo() {
        super();
    }

    public TsecgrouppermissionDo(String groupid, int permissionid) {
        super();
        this.groupid = groupid;
        this.permissionid = permissionid;
    }

    public String getGroupid() {
        return this.groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public int getPermissionid() {
        return this.permissionid;
    }

    public void setPermissionid(int permissionid) {
        this.permissionid = permissionid;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((groupid == null) ? 0 : groupid.hashCode());
        result = prime * result + permissionid;
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
        TsecgrouppermissionDo other = (TsecgrouppermissionDo) obj;
        if(groupid == null) {
            if(other.groupid != null)
                return false;
        } else if(!groupid.equals(other.groupid))
            return false;
        if(permissionid != other.permissionid)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tsecgrouppermission [ " + " groupid=" + groupid + " permissionid=" + permissionid+ "]";
    }

}

