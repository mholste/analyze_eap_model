package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class ToperationparamsDo implements Serializable {

    private static final long serialVersionUID = 9105474330571921161L;

    private int operationid;
    private String name;
    private String type;
    private String jdefault;
    private String notes;
    private int pos;
    private int jconst;
    private String style;
    private String kind;
    private String classifier;
    private String eaguid;
    private String styleex;

    public ToperationparamsDo() {
        super();
    }

    public ToperationparamsDo(int operationid, String name, String type, String jdefault, String notes, int pos, int jconst, String style, String kind, String classifier, String eaguid, String styleex) {
        super();
        this.operationid = operationid;
        this.name = name;
        this.type = type;
        this.jdefault = jdefault;
        this.notes = notes;
        this.pos = pos;
        this.jconst = jconst;
        this.style = style;
        this.kind = kind;
        this.classifier = classifier;
        this.eaguid = eaguid;
        this.styleex = styleex;
    }

    public int getOperationid() {
        return this.operationid;
    }

    public void setOperationid(int operationid) {
        this.operationid = operationid;
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

    public String getDefault() {
        return this.jdefault;
    }

    public void setDefault(String jdefault) {
        this.jdefault = jdefault;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getPos() {
        return this.pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getConst() {
        return this.jconst;
    }

    public void setConst(int jconst) {
        this.jconst = jconst;
    }

    public String getStyle() {
        return this.style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getClassifier() {
        return this.classifier;
    }

    public void setClassifier(String classifier) {
        this.classifier = classifier;
    }

    public String getEaguid() {
        return this.eaguid;
    }

    public void setEaguid(String eaguid) {
        this.eaguid = eaguid;
    }

    public String getStyleex() {
        return this.styleex;
    }

    public void setStyleex(String styleex) {
        this.styleex = styleex;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + operationid;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((jdefault == null) ? 0 : jdefault.hashCode());
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
        result = prime * result + pos;
        result = prime * result + jconst;
        result = prime * result + ((style == null) ? 0 : style.hashCode());
        result = prime * result + ((kind == null) ? 0 : kind.hashCode());
        result = prime * result + ((classifier == null) ? 0 : classifier.hashCode());
        result = prime * result + ((eaguid == null) ? 0 : eaguid.hashCode());
        result = prime * result + ((styleex == null) ? 0 : styleex.hashCode());
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
        ToperationparamsDo other = (ToperationparamsDo) obj;
        if(operationid != other.operationid)
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
        if(jdefault == null) {
            if(other.jdefault != null)
                return false;
        } else if(!jdefault.equals(other.jdefault))
            return false;
        if(notes == null) {
            if(other.notes != null)
                return false;
        } else if(!notes.equals(other.notes))
            return false;
        if(pos != other.pos)
            return false;
        if(jconst != other.jconst)
            return false;
        if(style == null) {
            if(other.style != null)
                return false;
        } else if(!style.equals(other.style))
            return false;
        if(kind == null) {
            if(other.kind != null)
                return false;
        } else if(!kind.equals(other.kind))
            return false;
        if(classifier == null) {
            if(other.classifier != null)
                return false;
        } else if(!classifier.equals(other.classifier))
            return false;
        if(eaguid == null) {
            if(other.eaguid != null)
                return false;
        } else if(!eaguid.equals(other.eaguid))
            return false;
        if(styleex == null) {
            if(other.styleex != null)
                return false;
        } else if(!styleex.equals(other.styleex))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Toperationparams [ " + " operationid=" + operationid + " name=" + name + " type=" + type + " jdefault=" + jdefault + " notes=" + notes + " pos=" + pos + " jconst=" + jconst + " style=" + style + " kind=" + kind + " classifier=" + classifier + " eaguid=" + eaguid + " styleex=" + styleex+ "]";
    }

}

