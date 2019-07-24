package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class TstereotypesDo implements Serializable {

    private static final long serialVersionUID = -7987885395967842741L;

    private String stereotype;
    private String appliesto;
    private String description;
    private int mfenabled;
    private String mfpath;
    private String metafile;
    private String style;
    private String eaguid;
    private String visualtype;

    public TstereotypesDo() {
        super();
    }

    public TstereotypesDo(String stereotype, String appliesto, String description, int mfenabled, String mfpath, String metafile, String style, String eaguid, String visualtype) {
        super();
        this.stereotype = stereotype;
        this.appliesto = appliesto;
        this.description = description;
        this.mfenabled = mfenabled;
        this.mfpath = mfpath;
        this.metafile = metafile;
        this.style = style;
        this.eaguid = eaguid;
        this.visualtype = visualtype;
    }

    public String getStereotype() {
        return this.stereotype;
    }

    public void setStereotype(String stereotype) {
        this.stereotype = stereotype;
    }

    public String getAppliesto() {
        return this.appliesto;
    }

    public void setAppliesto(String appliesto) {
        this.appliesto = appliesto;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMfenabled() {
        return this.mfenabled;
    }

    public void setMfenabled(int mfenabled) {
        this.mfenabled = mfenabled;
    }

    public String getMfpath() {
        return this.mfpath;
    }

    public void setMfpath(String mfpath) {
        this.mfpath = mfpath;
    }

    public String getMetafile() {
        return this.metafile;
    }

    public void setMetafile(String metafile) {
        this.metafile = metafile;
    }

    public String getStyle() {
        return this.style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getEaguid() {
        return this.eaguid;
    }

    public void setEaguid(String eaguid) {
        this.eaguid = eaguid;
    }

    public String getVisualtype() {
        return this.visualtype;
    }

    public void setVisualtype(String visualtype) {
        this.visualtype = visualtype;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((stereotype == null) ? 0 : stereotype.hashCode());
        result = prime * result + ((appliesto == null) ? 0 : appliesto.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + mfenabled;
        result = prime * result + ((mfpath == null) ? 0 : mfpath.hashCode());
        result = prime * result + ((metafile == null) ? 0 : metafile.hashCode());
        result = prime * result + ((style == null) ? 0 : style.hashCode());
        result = prime * result + ((eaguid == null) ? 0 : eaguid.hashCode());
        result = prime * result + ((visualtype == null) ? 0 : visualtype.hashCode());
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
        TstereotypesDo other = (TstereotypesDo) obj;
        if(stereotype == null) {
            if(other.stereotype != null)
                return false;
        } else if(!stereotype.equals(other.stereotype))
            return false;
        if(appliesto == null) {
            if(other.appliesto != null)
                return false;
        } else if(!appliesto.equals(other.appliesto))
            return false;
        if(description == null) {
            if(other.description != null)
                return false;
        } else if(!description.equals(other.description))
            return false;
        if(mfenabled != other.mfenabled)
            return false;
        if(mfpath == null) {
            if(other.mfpath != null)
                return false;
        } else if(!mfpath.equals(other.mfpath))
            return false;
        if(metafile == null) {
            if(other.metafile != null)
                return false;
        } else if(!metafile.equals(other.metafile))
            return false;
        if(style == null) {
            if(other.style != null)
                return false;
        } else if(!style.equals(other.style))
            return false;
        if(eaguid == null) {
            if(other.eaguid != null)
                return false;
        } else if(!eaguid.equals(other.eaguid))
            return false;
        if(visualtype == null) {
            if(other.visualtype != null)
                return false;
        } else if(!visualtype.equals(other.visualtype))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tstereotypes [ " + " stereotype=" + stereotype + " appliesto=" + appliesto + " description=" + description + " mfenabled=" + mfenabled + " mfpath=" + mfpath + " metafile=" + metafile + " style=" + style + " eaguid=" + eaguid + " visualtype=" + visualtype+ "]";
    }

}

