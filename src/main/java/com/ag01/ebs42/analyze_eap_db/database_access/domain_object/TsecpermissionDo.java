package com.ag01.ebs42.analyze_eap_db.database_access.domain_object;

import java.io.Serializable;

public class TsecpermissionDo implements Serializable {

    private static final long serialVersionUID = -8014325136024723382L;

    private int permissionid;
    private String permissionname;

    public TsecpermissionDo() {
        super();
    }

    public TsecpermissionDo(int permissionid, String permissionname) {
        super();
        this.permissionid = permissionid;
        this.permissionname = permissionname;
    }

    public int getPermissionid() {
        return this.permissionid;
    }

    public void setPermissionid(int permissionid) {
        this.permissionid = permissionid;
    }

    public String getPermissionname() {
        return this.permissionname;
    }

    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + permissionid;
        result = prime * result + ((permissionname == null) ? 0 : permissionname.hashCode());
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
        TsecpermissionDo other = (TsecpermissionDo) obj;
        if(permissionid != other.permissionid)
            return false;
        if(permissionname == null) {
            if(other.permissionname != null)
                return false;
        } else if(!permissionname.equals(other.permissionname))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tsecpermission [ " + " permissionid=" + permissionid + " permissionname=" + permissionname+ "]";
    }

}

