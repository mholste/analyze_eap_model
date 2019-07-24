package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class TxrefDo implements Serializable {

    private static final long serialVersionUID = -7987885395967842741L;

    private String xrefid;
    private String name;
    private String type;
    private String visibility;
    private String namespace;
    private String requirement;
    private String constraint;
    private String behavior;
    private String partition;
    private String description;
    private String client;
    private String supplier;
    private String link;

    public TxrefDo() {
        super();
    }

    public TxrefDo(String xrefid, String name, String type, String visibility, String namespace, String requirement, String constraint, String behavior, String partition, String description, String client, String supplier, String link) {
        super();
        this.xrefid = xrefid;
        this.name = name;
        this.type = type;
        this.visibility = visibility;
        this.namespace = namespace;
        this.requirement = requirement;
        this.constraint = constraint;
        this.behavior = behavior;
        this.partition = partition;
        this.description = description;
        this.client = client;
        this.supplier = supplier;
        this.link = link;
    }

    public String getXrefid() {
        return this.xrefid;
    }

    public void setXrefid(String xrefid) {
        this.xrefid = xrefid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVisibility() {
        return this.visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getRequirement() {
        return this.requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getConstraint() {
        return this.constraint;
    }

    public void setConstraint(String constraint) {
        this.constraint = constraint;
    }

    public String getBehavior() {
        return this.behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public String getPartition() {
        return this.partition;
    }

    public void setPartition(String partition) {
        this.partition = partition;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClient() {
        return this.client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getSupplier() {
        return this.supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((xrefid == null) ? 0 : xrefid.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((visibility == null) ? 0 : visibility.hashCode());
        result = prime * result + ((namespace == null) ? 0 : namespace.hashCode());
        result = prime * result + ((requirement == null) ? 0 : requirement.hashCode());
        result = prime * result + ((constraint == null) ? 0 : constraint.hashCode());
        result = prime * result + ((behavior == null) ? 0 : behavior.hashCode());
        result = prime * result + ((partition == null) ? 0 : partition.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((client == null) ? 0 : client.hashCode());
        result = prime * result + ((supplier == null) ? 0 : supplier.hashCode());
        result = prime * result + ((link == null) ? 0 : link.hashCode());
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
        TxrefDo other = (TxrefDo) obj;
        if(xrefid == null) {
            if(other.xrefid != null)
                return false;
        } else if(!xrefid.equals(other.xrefid))
            return false;
        if(name == null) {
            if(other.name != null)
                return false;
        } else if(!name.equals(other.name))
            return false;
        if(type == null) {
            if(other.type != null)
                return false;
        } else if(!type.equals(other.type))
            return false;
        if(visibility == null) {
            if(other.visibility != null)
                return false;
        } else if(!visibility.equals(other.visibility))
            return false;
        if(namespace == null) {
            if(other.namespace != null)
                return false;
        } else if(!namespace.equals(other.namespace))
            return false;
        if(requirement == null) {
            if(other.requirement != null)
                return false;
        } else if(!requirement.equals(other.requirement))
            return false;
        if(constraint == null) {
            if(other.constraint != null)
                return false;
        } else if(!constraint.equals(other.constraint))
            return false;
        if(behavior == null) {
            if(other.behavior != null)
                return false;
        } else if(!behavior.equals(other.behavior))
            return false;
        if(partition == null) {
            if(other.partition != null)
                return false;
        } else if(!partition.equals(other.partition))
            return false;
        if(description == null) {
            if(other.description != null)
                return false;
        } else if(!description.equals(other.description))
            return false;
        if(client == null) {
            if(other.client != null)
                return false;
        } else if(!client.equals(other.client))
            return false;
        if(supplier == null) {
            if(other.supplier != null)
                return false;
        } else if(!supplier.equals(other.supplier))
            return false;
        if(link == null) {
            if(other.link != null)
                return false;
        } else if(!link.equals(other.link))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Txref [ " + " xrefid=" + xrefid + " name=" + name + " type=" + type + " visibility=" + visibility + " namespace=" + namespace + " requirement=" + requirement + " constraint=" + constraint + " behavior=" + behavior + " partition=" + partition + " description=" + description + " client=" + client + " supplier=" + supplier + " link=" + link+ "]";
    }

}

