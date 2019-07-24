package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class TsecuserpermissionDo implements Serializable {

    private static final long serialVersionUID = -7987885395967842741L;

    private String userid;
    private int permissionid;

    public TsecuserpermissionDo() {
        super();
    }

    public TsecuserpermissionDo(String userid, int permissionid) {
        super();
        this.userid = userid;
        this.permissionid = permissionid;
    }

    public String getUserid() {
        return this.userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
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
        result = prime * result + ((userid == null) ? 0 : userid.hashCode());
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
        TsecuserpermissionDo other = (TsecuserpermissionDo) obj;
        if(userid == null) {
            if(other.userid != null)
                return false;
        } else if(!userid.equals(other.userid))
            return false;
        if(permissionid != other.permissionid)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tsecuserpermission [ " + " userid=" + userid + " permissionid=" + permissionid+ "]";
    }

}

