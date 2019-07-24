package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class TattributeDo implements Serializable {

    private static final long serialVersionUID = -7987885395967842741L;

    private int objectid;
    private String name;
    private String scope;
    private String stereotype;
    private String containment;
    private int isstatic;
    private int iscollection;
    private int isordered;
    private int allowduplicates;
    private String lowerbound;
    private String upperbound;
    private String container;
    private String notes;
    private char derived;
    private int id;
    private int pos;
    private String genoption;
    private int length;
    private int precision;
    private int scale;
    private int jconst;
    private String style;
    private String classifier;
    private String jdefault;
    private String type;
    private String eaguid;
    private String styleex;

    public TattributeDo() {
        super();
    }

    public TattributeDo(int objectid, String name, String scope, String stereotype, String containment, int isstatic, int iscollection, int isordered, int allowduplicates, String lowerbound, String upperbound, String container, String notes, char derived, int id, int pos, String genoption, int length, int precision, int scale, int jconst, String style, String classifier, String jdefault, String type, String eaguid, String styleex) {
        super();
        this.objectid = objectid;
        this.name = name;
        this.scope = scope;
        this.stereotype = stereotype;
        this.containment = containment;
        this.isstatic = isstatic;
        this.iscollection = iscollection;
        this.isordered = isordered;
        this.allowduplicates = allowduplicates;
        this.lowerbound = lowerbound;
        this.upperbound = upperbound;
        this.container = container;
        this.notes = notes;
        this.derived = derived;
        this.id = id;
        this.pos = pos;
        this.genoption = genoption;
        this.length = length;
        this.precision = precision;
        this.scale = scale;
        this.jconst = jconst;
        this.style = style;
        this.classifier = classifier;
        this.jdefault = jdefault;
        this.type = type;
        this.eaguid = eaguid;
        this.styleex = styleex;
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

    public String getStereotype() {
        return this.stereotype;
    }

    public void setStereotype(String stereotype) {
        this.stereotype = stereotype;
    }

    public String getContainment() {
        return this.containment;
    }

    public void setContainment(String containment) {
        this.containment = containment;
    }

    public int getIsstatic() {
        return this.isstatic;
    }

    public void setIsstatic(int isstatic) {
        this.isstatic = isstatic;
    }

    public int getIscollection() {
        return this.iscollection;
    }

    public void setIscollection(int iscollection) {
        this.iscollection = iscollection;
    }

    public int getIsordered() {
        return this.isordered;
    }

    public void setIsordered(int isordered) {
        this.isordered = isordered;
    }

    public int getAllowduplicates() {
        return this.allowduplicates;
    }

    public void setAllowduplicates(int allowduplicates) {
        this.allowduplicates = allowduplicates;
    }

    public String getLowerbound() {
        return this.lowerbound;
    }

    public void setLowerbound(String lowerbound) {
        this.lowerbound = lowerbound;
    }

    public String getUpperbound() {
        return this.upperbound;
    }

    public void setUpperbound(String upperbound) {
        this.upperbound = upperbound;
    }

    public String getContainer() {
        return this.container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public char getDerived() {
        return this.derived;
    }

    public void setDerived(char derived) {
        this.derived = derived;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPos() {
        return this.pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public String getGenoption() {
        return this.genoption;
    }

    public void setGenoption(String genoption) {
        this.genoption = genoption;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPrecision() {
        return this.precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public int getScale() {
        return this.scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
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

    public String getClassifier() {
        return this.classifier;
    }

    public void setClassifier(String classifier) {
        this.classifier = classifier;
    }

    public String getDefault() {
        return this.jdefault;
    }

    public void setDefault(String jdefault) {
        this.jdefault = jdefault;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
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
        result = prime * result + objectid;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((scope == null) ? 0 : scope.hashCode());
        result = prime * result + ((stereotype == null) ? 0 : stereotype.hashCode());
        result = prime * result + ((containment == null) ? 0 : containment.hashCode());
        result = prime * result + isstatic;
        result = prime * result + iscollection;
        result = prime * result + isordered;
        result = prime * result + allowduplicates;
        result = prime * result + ((lowerbound == null) ? 0 : lowerbound.hashCode());
        result = prime * result + ((upperbound == null) ? 0 : upperbound.hashCode());
        result = prime * result + ((container == null) ? 0 : container.hashCode());
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
        result = prime * result + derived;
        result = prime * result + id;
        result = prime * result + pos;
        result = prime * result + ((genoption == null) ? 0 : genoption.hashCode());
        result = prime * result + length;
        result = prime * result + precision;
        result = prime * result + scale;
        result = prime * result + jconst;
        result = prime * result + ((style == null) ? 0 : style.hashCode());
        result = prime * result + ((classifier == null) ? 0 : classifier.hashCode());
        result = prime * result + ((jdefault == null) ? 0 : jdefault.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
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
        TattributeDo other = (TattributeDo) obj;
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
        if(stereotype == null) {
            if(other.stereotype != null)
                return false;
        } else if(!stereotype.equals(other.stereotype))
            return false;
        if(containment == null) {
            if(other.containment != null)
                return false;
        } else if(!containment.equals(other.containment))
            return false;
        if(isstatic != other.isstatic)
            return false;
        if(iscollection != other.iscollection)
            return false;
        if(isordered != other.isordered)
            return false;
        if(allowduplicates != other.allowduplicates)
            return false;
        if(lowerbound == null) {
            if(other.lowerbound != null)
                return false;
        } else if(!lowerbound.equals(other.lowerbound))
            return false;
        if(upperbound == null) {
            if(other.upperbound != null)
                return false;
        } else if(!upperbound.equals(other.upperbound))
            return false;
        if(container == null) {
            if(other.container != null)
                return false;
        } else if(!container.equals(other.container))
            return false;
        if(notes == null) {
            if(other.notes != null)
                return false;
        } else if(!notes.equals(other.notes))
            return false;
        if(derived != other.derived)
            return false;
        if(id != other.id)
            return false;
        if(pos != other.pos)
            return false;
        if(genoption == null) {
            if(other.genoption != null)
                return false;
        } else if(!genoption.equals(other.genoption))
            return false;
        if(length != other.length)
            return false;
        if(precision != other.precision)
            return false;
        if(scale != other.scale)
            return false;
        if(jconst != other.jconst)
            return false;
        if(style == null) {
            if(other.style != null)
                return false;
        } else if(!style.equals(other.style))
            return false;
        if(classifier == null) {
            if(other.classifier != null)
                return false;
        } else if(!classifier.equals(other.classifier))
            return false;
        if(jdefault == null) {
            if(other.jdefault != null)
                return false;
        } else if(!jdefault.equals(other.jdefault))
            return false;
        if(type == null) {
            if(other.type != null)
                return false;
        } else if(!type.equals(other.type))
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
        return "Tattribute [ " + " objectid=" + objectid + " name=" + name + " scope=" + scope + " stereotype=" + stereotype + " containment=" + containment + " isstatic=" + isstatic + " iscollection=" + iscollection + " isordered=" + isordered + " allowduplicates=" + allowduplicates + " lowerbound=" + lowerbound + " upperbound=" + upperbound + " container=" + container + " notes=" + notes + " derived=" + derived + " id=" + id + " pos=" + pos + " genoption=" + genoption + " length=" + length + " precision=" + precision + " scale=" + scale + " jconst=" + jconst + " style=" + style + " classifier=" + classifier + " jdefault=" + jdefault + " type=" + type + " eaguid=" + eaguid + " styleex=" + styleex+ "]";
    }

}

