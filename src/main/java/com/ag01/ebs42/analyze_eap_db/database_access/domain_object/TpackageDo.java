package com.ag01.ebs42.analyze_eap_db.database_access.domain_object;

import java.io.Serializable;

public class TpackageDo implements Serializable {

    private static final long serialVersionUID = -7935005907264146868L;

    private int packageid;
    private String name;
    private int parentid;
    private java.sql.Date createddate;
    private java.sql.Date modifieddate;
    private String notes;
    private String eaguid;
    private String xmlpath;
    private int iscontrolled;
    private java.sql.Date lastloaddate;
    private java.sql.Date lastsavedate;
    private String version;
    private int jprotected;
    private String pkgowner;
    private String umlversion;
    private int usedtd;
    private int logxml;
    private String codepath;
    private String namespace;
    private int tpos;
    private String packageflags;
    private int batchsave;
    private int batchload;

    public TpackageDo() {
        super();
    }

    public TpackageDo(int packageid, String name, int parentid, java.sql.Date createddate, java.sql.Date modifieddate, String notes, String eaguid, String xmlpath, int iscontrolled, java.sql.Date lastloaddate, java.sql.Date lastsavedate, String version, int jprotected, String pkgowner, String umlversion, int usedtd, int logxml, String codepath, String namespace, int tpos, String packageflags, int batchsave, int batchload) {
        super();
        this.packageid = packageid;
        this.name = name;
        this.parentid = parentid;
        this.createddate = createddate;
        this.modifieddate = modifieddate;
        this.notes = notes;
        this.eaguid = eaguid;
        this.xmlpath = xmlpath;
        this.iscontrolled = iscontrolled;
        this.lastloaddate = lastloaddate;
        this.lastsavedate = lastsavedate;
        this.version = version;
        this.jprotected = jprotected;
        this.pkgowner = pkgowner;
        this.umlversion = umlversion;
        this.usedtd = usedtd;
        this.logxml = logxml;
        this.codepath = codepath;
        this.namespace = namespace;
        this.tpos = tpos;
        this.packageflags = packageflags;
        this.batchsave = batchsave;
        this.batchload = batchload;
    }

    public int getPackageid() {
        return this.packageid;
    }

    public void setPackageid(int packageid) {
        this.packageid = packageid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentid() {
        return this.parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public java.sql.Date getCreateddate() {
        return this.createddate;
    }

    public void setCreateddate(java.sql.Date createddate) {
        this.createddate = createddate;
    }

    public java.sql.Date getModifieddate() {
        return this.modifieddate;
    }

    public void setModifieddate(java.sql.Date modifieddate) {
        this.modifieddate = modifieddate;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getEaguid() {
        return this.eaguid;
    }

    public void setEaguid(String eaguid) {
        this.eaguid = eaguid;
    }

    public String getXmlpath() {
        return this.xmlpath;
    }

    public void setXmlpath(String xmlpath) {
        this.xmlpath = xmlpath;
    }

    public int getIscontrolled() {
        return this.iscontrolled;
    }

    public void setIscontrolled(int iscontrolled) {
        this.iscontrolled = iscontrolled;
    }

    public java.sql.Date getLastloaddate() {
        return this.lastloaddate;
    }

    public void setLastloaddate(java.sql.Date lastloaddate) {
        this.lastloaddate = lastloaddate;
    }

    public java.sql.Date getLastsavedate() {
        return this.lastsavedate;
    }

    public void setLastsavedate(java.sql.Date lastsavedate) {
        this.lastsavedate = lastsavedate;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getProtected() {
        return this.jprotected;
    }

    public void setProtected(int jprotected) {
        this.jprotected = jprotected;
    }

    public String getPkgowner() {
        return this.pkgowner;
    }

    public void setPkgowner(String pkgowner) {
        this.pkgowner = pkgowner;
    }

    public String getUmlversion() {
        return this.umlversion;
    }

    public void setUmlversion(String umlversion) {
        this.umlversion = umlversion;
    }

    public int getUsedtd() {
        return this.usedtd;
    }

    public void setUsedtd(int usedtd) {
        this.usedtd = usedtd;
    }

    public int getLogxml() {
        return this.logxml;
    }

    public void setLogxml(int logxml) {
        this.logxml = logxml;
    }

    public String getCodepath() {
        return this.codepath;
    }

    public void setCodepath(String codepath) {
        this.codepath = codepath;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public int getTpos() {
        return this.tpos;
    }

    public void setTpos(int tpos) {
        this.tpos = tpos;
    }

    public String getPackageflags() {
        return this.packageflags;
    }

    public void setPackageflags(String packageflags) {
        this.packageflags = packageflags;
    }

    public int getBatchsave() {
        return this.batchsave;
    }

    public void setBatchsave(int batchsave) {
        this.batchsave = batchsave;
    }

    public int getBatchload() {
        return this.batchload;
    }

    public void setBatchload(int batchload) {
        this.batchload = batchload;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + packageid;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + parentid;
        result = prime * result + ((createddate == null) ? 0 : createddate.hashCode());
        result = prime * result + ((modifieddate == null) ? 0 : modifieddate.hashCode());
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
        result = prime * result + ((eaguid == null) ? 0 : eaguid.hashCode());
        result = prime * result + ((xmlpath == null) ? 0 : xmlpath.hashCode());
        result = prime * result + iscontrolled;
        result = prime * result + ((lastloaddate == null) ? 0 : lastloaddate.hashCode());
        result = prime * result + ((lastsavedate == null) ? 0 : lastsavedate.hashCode());
        result = prime * result + ((version == null) ? 0 : version.hashCode());
        result = prime * result + jprotected;
        result = prime * result + ((pkgowner == null) ? 0 : pkgowner.hashCode());
        result = prime * result + ((umlversion == null) ? 0 : umlversion.hashCode());
        result = prime * result + usedtd;
        result = prime * result + logxml;
        result = prime * result + ((codepath == null) ? 0 : codepath.hashCode());
        result = prime * result + ((namespace == null) ? 0 : namespace.hashCode());
        result = prime * result + tpos;
        result = prime * result + ((packageflags == null) ? 0 : packageflags.hashCode());
        result = prime * result + batchsave;
        result = prime * result + batchload;
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
        TpackageDo other = (TpackageDo) obj;
        if(packageid != other.packageid)
            return false;
        if(name == null) {
            if(other.name != null)
                return false;
        } else if(!name.equals(other.name))
            return false;
        if(parentid != other.parentid)
            return false;
        if(createddate == null) {
            if(other.createddate != null)
                return false;
        } else if(!createddate.equals(other.createddate))
            return false;
        if(modifieddate == null) {
            if(other.modifieddate != null)
                return false;
        } else if(!modifieddate.equals(other.modifieddate))
            return false;
        if(notes == null) {
            if(other.notes != null)
                return false;
        } else if(!notes.equals(other.notes))
            return false;
        if(eaguid == null) {
            if(other.eaguid != null)
                return false;
        } else if(!eaguid.equals(other.eaguid))
            return false;
        if(xmlpath == null) {
            if(other.xmlpath != null)
                return false;
        } else if(!xmlpath.equals(other.xmlpath))
            return false;
        if(iscontrolled != other.iscontrolled)
            return false;
        if(lastloaddate == null) {
            if(other.lastloaddate != null)
                return false;
        } else if(!lastloaddate.equals(other.lastloaddate))
            return false;
        if(lastsavedate == null) {
            if(other.lastsavedate != null)
                return false;
        } else if(!lastsavedate.equals(other.lastsavedate))
            return false;
        if(version == null) {
            if(other.version != null)
                return false;
        } else if(!version.equals(other.version))
            return false;
        if(jprotected != other.jprotected)
            return false;
        if(pkgowner == null) {
            if(other.pkgowner != null)
                return false;
        } else if(!pkgowner.equals(other.pkgowner))
            return false;
        if(umlversion == null) {
            if(other.umlversion != null)
                return false;
        } else if(!umlversion.equals(other.umlversion))
            return false;
        if(usedtd != other.usedtd)
            return false;
        if(logxml != other.logxml)
            return false;
        if(codepath == null) {
            if(other.codepath != null)
                return false;
        } else if(!codepath.equals(other.codepath))
            return false;
        if(namespace == null) {
            if(other.namespace != null)
                return false;
        } else if(!namespace.equals(other.namespace))
            return false;
        if(tpos != other.tpos)
            return false;
        if(packageflags == null) {
            if(other.packageflags != null)
                return false;
        } else if(!packageflags.equals(other.packageflags))
            return false;
        if(batchsave != other.batchsave)
            return false;
        if(batchload != other.batchload)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tpackage [ " + " packageid=" + packageid + " name=" + name + " parentid=" + parentid + " createddate=" + createddate + " modifieddate=" + modifieddate + " notes=" + notes + " eaguid=" + eaguid + " xmlpath=" + xmlpath + " iscontrolled=" + iscontrolled + " lastloaddate=" + lastloaddate + " lastsavedate=" + lastsavedate + " version=" + version + " jprotected=" + jprotected + " pkgowner=" + pkgowner + " umlversion=" + umlversion + " usedtd=" + usedtd + " logxml=" + logxml + " codepath=" + codepath + " namespace=" + namespace + " tpos=" + tpos + " packageflags=" + packageflags + " batchsave=" + batchsave + " batchload=" + batchload+ "]";
    }

}

