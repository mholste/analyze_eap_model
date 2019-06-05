package com.ag01.ebs42.analyze_eap_db.database_access.domain_object;

import java.io.Serializable;

public class TdiagramlinksDo implements Serializable {

    private static final long serialVersionUID = 9131914070628801802L;

    private int diagramid;
    private int connectorid;
    private String geometry;
    private String style;
    private int hidden;
    private String path;
    private int instanceid;

    public TdiagramlinksDo() {
        super();
    }

    public TdiagramlinksDo(int diagramid, int connectorid, String geometry, String style, int hidden, String path, int instanceid) {
        super();
        this.diagramid = diagramid;
        this.connectorid = connectorid;
        this.geometry = geometry;
        this.style = style;
        this.hidden = hidden;
        this.path = path;
        this.instanceid = instanceid;
    }

    public int getDiagramid() {
        return this.diagramid;
    }

    public void setDiagramid(int diagramid) {
        this.diagramid = diagramid;
    }

    public int getConnectorid() {
        return this.connectorid;
    }

    public void setConnectorid(int connectorid) {
        this.connectorid = connectorid;
    }

    public String getGeometry() {
        return this.geometry;
    }

    public void setGeometry(String geometry) {
        this.geometry = geometry;
    }

    public String getStyle() {
        return this.style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getHidden() {
        return this.hidden;
    }

    public void setHidden(int hidden) {
        this.hidden = hidden;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getInstanceid() {
        return this.instanceid;
    }

    public void setInstanceid(int instanceid) {
        this.instanceid = instanceid;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + diagramid;
        result = prime * result + connectorid;
        result = prime * result + ((geometry == null) ? 0 : geometry.hashCode());
        result = prime * result + ((style == null) ? 0 : style.hashCode());
        result = prime * result + hidden;
        result = prime * result + ((path == null) ? 0 : path.hashCode());
        result = prime * result + instanceid;
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
        TdiagramlinksDo other = (TdiagramlinksDo) obj;
        if(diagramid != other.diagramid)
            return false;
        if(connectorid != other.connectorid)
            return false;
        if(geometry == null) {
            if(other.geometry != null)
                return false;
        } else if(!geometry.equals(other.geometry))
            return false;
        if(style == null) {
            if(other.style != null)
                return false;
        } else if(!style.equals(other.style))
            return false;
        if(hidden != other.hidden)
            return false;
        if(path == null) {
            if(other.path != null)
                return false;
        } else if(!path.equals(other.path))
            return false;
        if(instanceid != other.instanceid)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tdiagramlinks [ " + " diagramid=" + diagramid + " connectorid=" + connectorid + " geometry=" + geometry + " style=" + style + " hidden=" + hidden + " path=" + path + " instanceid=" + instanceid+ "]";
    }

}

