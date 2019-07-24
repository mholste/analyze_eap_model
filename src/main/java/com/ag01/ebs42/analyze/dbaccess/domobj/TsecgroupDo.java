package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class TsecgroupDo implements Serializable {

    private static final long serialVersionUID = -7987885395967842741L;

    private String groupid;
    private String groupname;
    private String description;

    public TsecgroupDo() {
        super();
    }

    public TsecgroupDo(String groupid, String groupname, String description) {
        super();
        this.groupid = groupid;
        this.groupname = groupname;
        this.description = description;
    }

    public String getGroupid() {
        return this.groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getGroupname() {
        return this.groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((groupid == null) ? 0 : groupid.hashCode());
        result = prime * result + ((groupname == null) ? 0 : groupname.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
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
        TsecgroupDo other = (TsecgroupDo) obj;
        if(groupid == null) {
            if(other.groupid != null)
                return false;
        } else if(!groupid.equals(other.groupid))
            return false;
        if(groupname == null) {
            if(other.groupname != null)
                return false;
        } else if(!groupname.equals(other.groupname))
            return false;
        if(description == null) {
            if(other.description != null)
                return false;
        } else if(!description.equals(other.description))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tsecgroup [ " + " groupid=" + groupid + " groupname=" + groupname + " description=" + description+ "]";
    }

}

