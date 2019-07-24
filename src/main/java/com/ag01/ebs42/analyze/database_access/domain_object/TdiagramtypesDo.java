package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class TdiagramtypesDo implements Serializable {

    private static final long serialVersionUID = 9131914070628801802L;

    private String diagramtype;
    private String name;
    private int packageid;

    public TdiagramtypesDo() {
        super();
    }

    public TdiagramtypesDo(String diagramtype, String name, int packageid) {
        super();
        this.diagramtype = diagramtype;
        this.name = name;
        this.packageid = packageid;
    }

    public String getDiagramtype() {
        return this.diagramtype;
    }

    public void setDiagramtype(String diagramtype) {
        this.diagramtype = diagramtype;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPackageid() {
        return this.packageid;
    }

    public void setPackageid(int packageid) {
        this.packageid = packageid;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((diagramtype == null) ? 0 : diagramtype.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + packageid;
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
        TdiagramtypesDo other = (TdiagramtypesDo) obj;
        if(diagramtype == null) {
            if(other.diagramtype != null)
                return false;
        } else if(!diagramtype.equals(other.diagramtype))
            return false;
        if(name == null) {
            if(other.name != null)
                return false;
        } else if(!name.equals(other.name))
            return false;
        if(packageid != other.packageid)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tdiagramtypes [ " + " diagramtype=" + diagramtype + " name=" + name + " packageid=" + packageid+ "]";
    }

}

