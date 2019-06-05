package com.ag01.ebs42.analyze_eap_db.database_access.domain_object;

import java.io.Serializable;

public class ToperationDo implements Serializable {

    private static final long serialVersionUID = 9105474330571921161L;

    private int operationid;
    private int objectid;
    private String name;
    private String scope;
    private String type;
    private char returnarray;
    private String stereotype;
    private char isstatic;
    private String concurrency;
    private String notes;
    private String behaviour;
    private char jabstract;
    private String genoption;
    private char jsynchronized;
    private int pos;
    private int jconst;
    private String style;
    private int pure;
    private String jthrows;
    private String classifier;
    private String code;
    private int isroot;
    private int isleaf;
    private int isquery;
    private String stateflags;
    private String eaguid;
    private String styleex;

    public ToperationDo() {
        super();
    }

    public ToperationDo(int operationid, int objectid, String name, String scope, String type, char returnarray, String stereotype, char isstatic, String concurrency, String notes, String behaviour, char jabstract, String genoption, char jsynchronized, int pos, int jconst, String style, int pure, String jthrows, String classifier, String code, int isroot, int isleaf, int isquery, String stateflags, String eaguid, String styleex) {
        super();
        this.operationid = operationid;
        this.objectid = objectid;
        this.name = name;
        this.scope = scope;
        this.type = type;
        this.returnarray = returnarray;
        this.stereotype = stereotype;
        this.isstatic = isstatic;
        this.concurrency = concurrency;
        this.notes = notes;
        this.behaviour = behaviour;
        this.jabstract = jabstract;
        this.genoption = genoption;
        this.jsynchronized = jsynchronized;
        this.pos = pos;
        this.jconst = jconst;
        this.style = style;
        this.pure = pure;
        this.jthrows = jthrows;
        this.classifier = classifier;
        this.code = code;
        this.isroot = isroot;
        this.isleaf = isleaf;
        this.isquery = isquery;
        this.stateflags = stateflags;
        this.eaguid = eaguid;
        this.styleex = styleex;
    }

    public int getOperationid() {
        return this.operationid;
    }

    public void setOperationid(int operationid) {
        this.operationid = operationid;
    }

    public int getObjectid() {
        return this.objectid;
    }

    public void setObjectid(int objectid) {
        this.objectid = objectid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScope() {
        return this.scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public char getReturnarray() {
        return this.returnarray;
    }

    public void setReturnarray(char returnarray) {
        this.returnarray = returnarray;
    }

    public String getStereotype() {
        return this.stereotype;
    }

    public void setStereotype(String stereotype) {
        this.stereotype = stereotype;
    }

    public char getIsstatic() {
        return this.isstatic;
    }

    public void setIsstatic(char isstatic) {
        this.isstatic = isstatic;
    }

    public String getConcurrency() {
        return this.concurrency;
    }

    public void setConcurrency(String concurrency) {
        this.concurrency = concurrency;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getBehaviour() {
        return this.behaviour;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    public char getAbstract() {
        return this.jabstract;
    }

    public void setAbstract(char jabstract) {
        this.jabstract = jabstract;
    }

    public String getGenoption() {
        return this.genoption;
    }

    public void setGenoption(String genoption) {
        this.genoption = genoption;
    }

    public char getSynchronized() {
        return this.jsynchronized;
    }

    public void setSynchronized(char jsynchronized) {
        this.jsynchronized = jsynchronized;
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

    public int getPure() {
        return this.pure;
    }

    public void setPure(int pure) {
        this.pure = pure;
    }

    public String getThrows() {
        return this.jthrows;
    }

    public void setThrows(String jthrows) {
        this.jthrows = jthrows;
    }

    public String getClassifier() {
        return this.classifier;
    }

    public void setClassifier(String classifier) {
        this.classifier = classifier;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getIsroot() {
        return this.isroot;
    }

    public void setIsroot(int isroot) {
        this.isroot = isroot;
    }

    public int getIsleaf() {
        return this.isleaf;
    }

    public void setIsleaf(int isleaf) {
        this.isleaf = isleaf;
    }

    public int getIsquery() {
        return this.isquery;
    }

    public void setIsquery(int isquery) {
        this.isquery = isquery;
    }

    public String getStateflags() {
        return this.stateflags;
    }

    public void setStateflags(String stateflags) {
        this.stateflags = stateflags;
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
        result = prime * result + objectid;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((scope == null) ? 0 : scope.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + returnarray;
        result = prime * result + ((stereotype == null) ? 0 : stereotype.hashCode());
        result = prime * result + isstatic;
        result = prime * result + ((concurrency == null) ? 0 : concurrency.hashCode());
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
        result = prime * result + ((behaviour == null) ? 0 : behaviour.hashCode());
        result = prime * result + jabstract;
        result = prime * result + ((genoption == null) ? 0 : genoption.hashCode());
        result = prime * result + jsynchronized;
        result = prime * result + pos;
        result = prime * result + jconst;
        result = prime * result + ((style == null) ? 0 : style.hashCode());
        result = prime * result + pure;
        result = prime * result + ((jthrows == null) ? 0 : jthrows.hashCode());
        result = prime * result + ((classifier == null) ? 0 : classifier.hashCode());
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        result = prime * result + isroot;
        result = prime * result + isleaf;
        result = prime * result + isquery;
        result = prime * result + ((stateflags == null) ? 0 : stateflags.hashCode());
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
        ToperationDo other = (ToperationDo) obj;
        if(operationid != other.operationid)
            return false;
        if(objectid != other.objectid)
            return false;
        if(name == null) {
            if(other.name != null)
                return false;
        } else if(!name.equals(other.name))
            return false;
        if(scope == null) {
            if(other.scope != null)
                return false;
        } else if(!scope.equals(other.scope))
            return false;
        if(type == null) {
            if(other.type != null)
                return false;
        } else if(!type.equals(other.type))
            return false;
        if(returnarray != other.returnarray)
            return false;
        if(stereotype == null) {
            if(other.stereotype != null)
                return false;
        } else if(!stereotype.equals(other.stereotype))
            return false;
        if(isstatic != other.isstatic)
            return false;
        if(concurrency == null) {
            if(other.concurrency != null)
                return false;
        } else if(!concurrency.equals(other.concurrency))
            return false;
        if(notes == null) {
            if(other.notes != null)
                return false;
        } else if(!notes.equals(other.notes))
            return false;
        if(behaviour == null) {
            if(other.behaviour != null)
                return false;
        } else if(!behaviour.equals(other.behaviour))
            return false;
        if(jabstract != other.jabstract)
            return false;
        if(genoption == null) {
            if(other.genoption != null)
                return false;
        } else if(!genoption.equals(other.genoption))
            return false;
        if(jsynchronized != other.jsynchronized)
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
        if(pure != other.pure)
            return false;
        if(jthrows == null) {
            if(other.jthrows != null)
                return false;
        } else if(!jthrows.equals(other.jthrows))
            return false;
        if(classifier == null) {
            if(other.classifier != null)
                return false;
        } else if(!classifier.equals(other.classifier))
            return false;
        if(code == null) {
            if(other.code != null)
                return false;
        } else if(!code.equals(other.code))
            return false;
        if(isroot != other.isroot)
            return false;
        if(isleaf != other.isleaf)
            return false;
        if(isquery != other.isquery)
            return false;
        if(stateflags == null) {
            if(other.stateflags != null)
                return false;
        } else if(!stateflags.equals(other.stateflags))
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
        return "Toperation [ " + " operationid=" + operationid + " objectid=" + objectid + " name=" + name + " scope=" + scope + " type=" + type + " returnarray=" + returnarray + " stereotype=" + stereotype + " isstatic=" + isstatic + " concurrency=" + concurrency + " notes=" + notes + " behaviour=" + behaviour + " jabstract=" + jabstract + " genoption=" + genoption + " jsynchronized=" + jsynchronized + " pos=" + pos + " jconst=" + jconst + " style=" + style + " pure=" + pure + " jthrows=" + jthrows + " classifier=" + classifier + " code=" + code + " isroot=" + isroot + " isleaf=" + isleaf + " isquery=" + isquery + " stateflags=" + stateflags + " eaguid=" + eaguid + " styleex=" + styleex+ "]";
    }

}

