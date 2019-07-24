package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class TobjectDo implements Serializable {

    private static final long serialVersionUID = -7935005907264146868L;

    private int objectid;
    private String objecttype;
    private int diagramid;
    private String name;
    private String alias;
    private String author;
    private String version;
    private String note;
    private int packageid;
    private String stereotype;
    private int ntype;
    private String complexity;
    private int effort;
    private String style;
    private int backcolor;
    private int borderstyle;
    private int borderwidth;
    private int fontcolor;
    private int bordercolor;
    private java.sql.Date createddate;
    private java.sql.Date modifieddate;
    private String status;
    private char jabstract;
    private int tagged;
    private String pdata1;
    private String pdata2;
    private String pdata3;
    private String pdata4;
    private String pdata5;
    private String concurrency;
    private String visibility;
    private String persistence;
    private String cardinality;
    private String gentype;
    private String genfile;
    private String header1;
    private String header2;
    private String phase;
    private String scope;
    private String genoption;
    private String genlinks;
    private int classifier;
    private String eaguid;
    private int parentid;
    private String runstate;
    private String classifierguid;
    private int tpos;
    private int isroot;
    private int isleaf;
    private int isspec;
    private int isactive;
    private String stateflags;
    private String packageflags;
    private String multiplicity;
    private String styleex;
    private String actionflags;
    private String eventflags;

    public TobjectDo() {
        super();
    }

    public TobjectDo(int objectid, String objecttype, int diagramid, String name, String alias, String author, String version, String note, int packageid, String stereotype, int ntype, String complexity, int effort, String style, int backcolor, int borderstyle, int borderwidth, int fontcolor, int bordercolor, java.sql.Date createddate, java.sql.Date modifieddate, String status, char jabstract, int tagged, String pdata1, String pdata2, String pdata3, String pdata4, String pdata5, String concurrency, String visibility, String persistence, String cardinality, String gentype, String genfile, String header1, String header2, String phase, String scope, String genoption, String genlinks, int classifier, String eaguid, int parentid, String runstate, String classifierguid, int tpos, int isroot, int isleaf, int isspec, int isactive, String stateflags, String packageflags, String multiplicity, String styleex, String actionflags, String eventflags) {
        super();
        this.objectid = objectid;
        this.objecttype = objecttype;
        this.diagramid = diagramid;
        this.name = name;
        this.alias = alias;
        this.author = author;
        this.version = version;
        this.note = note;
        this.packageid = packageid;
        this.stereotype = stereotype;
        this.ntype = ntype;
        this.complexity = complexity;
        this.effort = effort;
        this.style = style;
        this.backcolor = backcolor;
        this.borderstyle = borderstyle;
        this.borderwidth = borderwidth;
        this.fontcolor = fontcolor;
        this.bordercolor = bordercolor;
        this.createddate = createddate;
        this.modifieddate = modifieddate;
        this.status = status;
        this.jabstract = jabstract;
        this.tagged = tagged;
        this.pdata1 = pdata1;
        this.pdata2 = pdata2;
        this.pdata3 = pdata3;
        this.pdata4 = pdata4;
        this.pdata5 = pdata5;
        this.concurrency = concurrency;
        this.visibility = visibility;
        this.persistence = persistence;
        this.cardinality = cardinality;
        this.gentype = gentype;
        this.genfile = genfile;
        this.header1 = header1;
        this.header2 = header2;
        this.phase = phase;
        this.scope = scope;
        this.genoption = genoption;
        this.genlinks = genlinks;
        this.classifier = classifier;
        this.eaguid = eaguid;
        this.parentid = parentid;
        this.runstate = runstate;
        this.classifierguid = classifierguid;
        this.tpos = tpos;
        this.isroot = isroot;
        this.isleaf = isleaf;
        this.isspec = isspec;
        this.isactive = isactive;
        this.stateflags = stateflags;
        this.packageflags = packageflags;
        this.multiplicity = multiplicity;
        this.styleex = styleex;
        this.actionflags = actionflags;
        this.eventflags = eventflags;
    }

    public int getObjectid() {
        return this.objectid;
    }

    public void setObjectid(int objectid) {
        this.objectid = objectid;
    }

    public String getObjecttype() {
        return this.objecttype;
    }

    public void setObjecttype(String objecttype) {
        this.objecttype = objecttype;
    }

    public int getDiagramid() {
        return this.diagramid;
    }

    public void setDiagramid(int diagramid) {
        this.diagramid = diagramid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getPackageid() {
        return this.packageid;
    }

    public void setPackageid(int packageid) {
        this.packageid = packageid;
    }

    public String getStereotype() {
        return this.stereotype;
    }

    public void setStereotype(String stereotype) {
        this.stereotype = stereotype;
    }

    public int getNtype() {
        return this.ntype;
    }

    public void setNtype(int ntype) {
        this.ntype = ntype;
    }

    public String getComplexity() {
        return this.complexity;
    }

    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }

    public int getEffort() {
        return this.effort;
    }

    public void setEffort(int effort) {
        this.effort = effort;
    }

    public String getStyle() {
        return this.style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getBackcolor() {
        return this.backcolor;
    }

    public void setBackcolor(int backcolor) {
        this.backcolor = backcolor;
    }

    public int getBorderstyle() {
        return this.borderstyle;
    }

    public void setBorderstyle(int borderstyle) {
        this.borderstyle = borderstyle;
    }

    public int getBorderwidth() {
        return this.borderwidth;
    }

    public void setBorderwidth(int borderwidth) {
        this.borderwidth = borderwidth;
    }

    public int getFontcolor() {
        return this.fontcolor;
    }

    public void setFontcolor(int fontcolor) {
        this.fontcolor = fontcolor;
    }

    public int getBordercolor() {
        return this.bordercolor;
    }

    public void setBordercolor(int bordercolor) {
        this.bordercolor = bordercolor;
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

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public char getAbstract() {
        return this.jabstract;
    }

    public void setAbstract(char jabstract) {
        this.jabstract = jabstract;
    }

    public int getTagged() {
        return this.tagged;
    }

    public void setTagged(int tagged) {
        this.tagged = tagged;
    }

    public String getPdata1() {
        return this.pdata1;
    }

    public void setPdata1(String pdata1) {
        this.pdata1 = pdata1;
    }

    public String getPdata2() {
        return this.pdata2;
    }

    public void setPdata2(String pdata2) {
        this.pdata2 = pdata2;
    }

    public String getPdata3() {
        return this.pdata3;
    }

    public void setPdata3(String pdata3) {
        this.pdata3 = pdata3;
    }

    public String getPdata4() {
        return this.pdata4;
    }

    public void setPdata4(String pdata4) {
        this.pdata4 = pdata4;
    }

    public String getPdata5() {
        return this.pdata5;
    }

    public void setPdata5(String pdata5) {
        this.pdata5 = pdata5;
    }

    public String getConcurrency() {
        return this.concurrency;
    }

    public void setConcurrency(String concurrency) {
        this.concurrency = concurrency;
    }

    public String getVisibility() {
        return this.visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getPersistence() {
        return this.persistence;
    }

    public void setPersistence(String persistence) {
        this.persistence = persistence;
    }

    public String getCardinality() {
        return this.cardinality;
    }

    public void setCardinality(String cardinality) {
        this.cardinality = cardinality;
    }

    public String getGentype() {
        return this.gentype;
    }

    public void setGentype(String gentype) {
        this.gentype = gentype;
    }

    public String getGenfile() {
        return this.genfile;
    }

    public void setGenfile(String genfile) {
        this.genfile = genfile;
    }

    public String getHeader1() {
        return this.header1;
    }

    public void setHeader1(String header1) {
        this.header1 = header1;
    }

    public String getHeader2() {
        return this.header2;
    }

    public void setHeader2(String header2) {
        this.header2 = header2;
    }

    public String getPhase() {
        return this.phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getScope() {
        return this.scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getGenoption() {
        return this.genoption;
    }

    public void setGenoption(String genoption) {
        this.genoption = genoption;
    }

    public String getGenlinks() {
        return this.genlinks;
    }

    public void setGenlinks(String genlinks) {
        this.genlinks = genlinks;
    }

    public int getClassifier() {
        return this.classifier;
    }

    public void setClassifier(int classifier) {
        this.classifier = classifier;
    }

    public String getEaguid() {
        return this.eaguid;
    }

    public void setEaguid(String eaguid) {
        this.eaguid = eaguid;
    }

    public int getParentid() {
        return this.parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public String getRunstate() {
        return this.runstate;
    }

    public void setRunstate(String runstate) {
        this.runstate = runstate;
    }

    public String getClassifierguid() {
        return this.classifierguid;
    }

    public void setClassifierguid(String classifierguid) {
        this.classifierguid = classifierguid;
    }

    public int getTpos() {
        return this.tpos;
    }

    public void setTpos(int tpos) {
        this.tpos = tpos;
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

    public int getIsspec() {
        return this.isspec;
    }

    public void setIsspec(int isspec) {
        this.isspec = isspec;
    }

    public int getIsactive() {
        return this.isactive;
    }

    public void setIsactive(int isactive) {
        this.isactive = isactive;
    }

    public String getStateflags() {
        return this.stateflags;
    }

    public void setStateflags(String stateflags) {
        this.stateflags = stateflags;
    }

    public String getPackageflags() {
        return this.packageflags;
    }

    public void setPackageflags(String packageflags) {
        this.packageflags = packageflags;
    }

    public String getMultiplicity() {
        return this.multiplicity;
    }

    public void setMultiplicity(String multiplicity) {
        this.multiplicity = multiplicity;
    }

    public String getStyleex() {
        return this.styleex;
    }

    public void setStyleex(String styleex) {
        this.styleex = styleex;
    }

    public String getActionflags() {
        return this.actionflags;
    }

    public void setActionflags(String actionflags) {
        this.actionflags = actionflags;
    }

    public String getEventflags() {
        return this.eventflags;
    }

    public void setEventflags(String eventflags) {
        this.eventflags = eventflags;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + objectid;
        result = prime * result + ((objecttype == null) ? 0 : objecttype.hashCode());
        result = prime * result + diagramid;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((alias == null) ? 0 : alias.hashCode());
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + ((version == null) ? 0 : version.hashCode());
        result = prime * result + ((note == null) ? 0 : note.hashCode());
        result = prime * result + packageid;
        result = prime * result + ((stereotype == null) ? 0 : stereotype.hashCode());
        result = prime * result + ntype;
        result = prime * result + ((complexity == null) ? 0 : complexity.hashCode());
        result = prime * result + effort;
        result = prime * result + ((style == null) ? 0 : style.hashCode());
        result = prime * result + backcolor;
        result = prime * result + borderstyle;
        result = prime * result + borderwidth;
        result = prime * result + fontcolor;
        result = prime * result + bordercolor;
        result = prime * result + ((createddate == null) ? 0 : createddate.hashCode());
        result = prime * result + ((modifieddate == null) ? 0 : modifieddate.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + jabstract;
        result = prime * result + tagged;
        result = prime * result + ((pdata1 == null) ? 0 : pdata1.hashCode());
        result = prime * result + ((pdata2 == null) ? 0 : pdata2.hashCode());
        result = prime * result + ((pdata3 == null) ? 0 : pdata3.hashCode());
        result = prime * result + ((pdata4 == null) ? 0 : pdata4.hashCode());
        result = prime * result + ((pdata5 == null) ? 0 : pdata5.hashCode());
        result = prime * result + ((concurrency == null) ? 0 : concurrency.hashCode());
        result = prime * result + ((visibility == null) ? 0 : visibility.hashCode());
        result = prime * result + ((persistence == null) ? 0 : persistence.hashCode());
        result = prime * result + ((cardinality == null) ? 0 : cardinality.hashCode());
        result = prime * result + ((gentype == null) ? 0 : gentype.hashCode());
        result = prime * result + ((genfile == null) ? 0 : genfile.hashCode());
        result = prime * result + ((header1 == null) ? 0 : header1.hashCode());
        result = prime * result + ((header2 == null) ? 0 : header2.hashCode());
        result = prime * result + ((phase == null) ? 0 : phase.hashCode());
        result = prime * result + ((scope == null) ? 0 : scope.hashCode());
        result = prime * result + ((genoption == null) ? 0 : genoption.hashCode());
        result = prime * result + ((genlinks == null) ? 0 : genlinks.hashCode());
        result = prime * result + classifier;
        result = prime * result + ((eaguid == null) ? 0 : eaguid.hashCode());
        result = prime * result + parentid;
        result = prime * result + ((runstate == null) ? 0 : runstate.hashCode());
        result = prime * result + ((classifierguid == null) ? 0 : classifierguid.hashCode());
        result = prime * result + tpos;
        result = prime * result + isroot;
        result = prime * result + isleaf;
        result = prime * result + isspec;
        result = prime * result + isactive;
        result = prime * result + ((stateflags == null) ? 0 : stateflags.hashCode());
        result = prime * result + ((packageflags == null) ? 0 : packageflags.hashCode());
        result = prime * result + ((multiplicity == null) ? 0 : multiplicity.hashCode());
        result = prime * result + ((styleex == null) ? 0 : styleex.hashCode());
        result = prime * result + ((actionflags == null) ? 0 : actionflags.hashCode());
        result = prime * result + ((eventflags == null) ? 0 : eventflags.hashCode());
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
        TobjectDo other = (TobjectDo) obj;
        if(objectid != other.objectid)
            return false;
        if(objecttype == null) {
            if(other.objecttype != null)
                return false;
        } else if(!objecttype.equals(other.objecttype))
            return false;
        if(diagramid != other.diagramid)
            return false;
        if(name == null) {
            if(other.name != null)
                return false;
        } else if(!name.equals(other.name))
            return false;
        if(alias == null) {
            if(other.alias != null)
                return false;
        } else if(!alias.equals(other.alias))
            return false;
        if(author == null) {
            if(other.author != null)
                return false;
        } else if(!author.equals(other.author))
            return false;
        if(version == null) {
            if(other.version != null)
                return false;
        } else if(!version.equals(other.version))
            return false;
        if(note == null) {
            if(other.note != null)
                return false;
        } else if(!note.equals(other.note))
            return false;
        if(packageid != other.packageid)
            return false;
        if(stereotype == null) {
            if(other.stereotype != null)
                return false;
        } else if(!stereotype.equals(other.stereotype))
            return false;
        if(ntype != other.ntype)
            return false;
        if(complexity == null) {
            if(other.complexity != null)
                return false;
        } else if(!complexity.equals(other.complexity))
            return false;
        if(effort != other.effort)
            return false;
        if(style == null) {
            if(other.style != null)
                return false;
        } else if(!style.equals(other.style))
            return false;
        if(backcolor != other.backcolor)
            return false;
        if(borderstyle != other.borderstyle)
            return false;
        if(borderwidth != other.borderwidth)
            return false;
        if(fontcolor != other.fontcolor)
            return false;
        if(bordercolor != other.bordercolor)
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
        if(status == null) {
            if(other.status != null)
                return false;
        } else if(!status.equals(other.status))
            return false;
        if(jabstract != other.jabstract)
            return false;
        if(tagged != other.tagged)
            return false;
        if(pdata1 == null) {
            if(other.pdata1 != null)
                return false;
        } else if(!pdata1.equals(other.pdata1))
            return false;
        if(pdata2 == null) {
            if(other.pdata2 != null)
                return false;
        } else if(!pdata2.equals(other.pdata2))
            return false;
        if(pdata3 == null) {
            if(other.pdata3 != null)
                return false;
        } else if(!pdata3.equals(other.pdata3))
            return false;
        if(pdata4 == null) {
            if(other.pdata4 != null)
                return false;
        } else if(!pdata4.equals(other.pdata4))
            return false;
        if(pdata5 == null) {
            if(other.pdata5 != null)
                return false;
        } else if(!pdata5.equals(other.pdata5))
            return false;
        if(concurrency == null) {
            if(other.concurrency != null)
                return false;
        } else if(!concurrency.equals(other.concurrency))
            return false;
        if(visibility == null) {
            if(other.visibility != null)
                return false;
        } else if(!visibility.equals(other.visibility))
            return false;
        if(persistence == null) {
            if(other.persistence != null)
                return false;
        } else if(!persistence.equals(other.persistence))
            return false;
        if(cardinality == null) {
            if(other.cardinality != null)
                return false;
        } else if(!cardinality.equals(other.cardinality))
            return false;
        if(gentype == null) {
            if(other.gentype != null)
                return false;
        } else if(!gentype.equals(other.gentype))
            return false;
        if(genfile == null) {
            if(other.genfile != null)
                return false;
        } else if(!genfile.equals(other.genfile))
            return false;
        if(header1 == null) {
            if(other.header1 != null)
                return false;
        } else if(!header1.equals(other.header1))
            return false;
        if(header2 == null) {
            if(other.header2 != null)
                return false;
        } else if(!header2.equals(other.header2))
            return false;
        if(phase == null) {
            if(other.phase != null)
                return false;
        } else if(!phase.equals(other.phase))
            return false;
        if(scope == null) {
            if(other.scope != null)
                return false;
        } else if(!scope.equals(other.scope))
            return false;
        if(genoption == null) {
            if(other.genoption != null)
                return false;
        } else if(!genoption.equals(other.genoption))
            return false;
        if(genlinks == null) {
            if(other.genlinks != null)
                return false;
        } else if(!genlinks.equals(other.genlinks))
            return false;
        if(classifier != other.classifier)
            return false;
        if(eaguid == null) {
            if(other.eaguid != null)
                return false;
        } else if(!eaguid.equals(other.eaguid))
            return false;
        if(parentid != other.parentid)
            return false;
        if(runstate == null) {
            if(other.runstate != null)
                return false;
        } else if(!runstate.equals(other.runstate))
            return false;
        if(classifierguid == null) {
            if(other.classifierguid != null)
                return false;
        } else if(!classifierguid.equals(other.classifierguid))
            return false;
        if(tpos != other.tpos)
            return false;
        if(isroot != other.isroot)
            return false;
        if(isleaf != other.isleaf)
            return false;
        if(isspec != other.isspec)
            return false;
        if(isactive != other.isactive)
            return false;
        if(stateflags == null) {
            if(other.stateflags != null)
                return false;
        } else if(!stateflags.equals(other.stateflags))
            return false;
        if(packageflags == null) {
            if(other.packageflags != null)
                return false;
        } else if(!packageflags.equals(other.packageflags))
            return false;
        if(multiplicity == null) {
            if(other.multiplicity != null)
                return false;
        } else if(!multiplicity.equals(other.multiplicity))
            return false;
        if(styleex == null) {
            if(other.styleex != null)
                return false;
        } else if(!styleex.equals(other.styleex))
            return false;
        if(actionflags == null) {
            if(other.actionflags != null)
                return false;
        } else if(!actionflags.equals(other.actionflags))
            return false;
        if(eventflags == null) {
            if(other.eventflags != null)
                return false;
        } else if(!eventflags.equals(other.eventflags))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tobject [ " + " objectid=" + objectid + " objecttype=" + objecttype + " diagramid=" + diagramid + " name=" + name + " alias=" + alias + " author=" + author + " version=" + version + " note=" + note + " packageid=" + packageid + " stereotype=" + stereotype + " ntype=" + ntype + " complexity=" + complexity + " effort=" + effort + " style=" + style + " backcolor=" + backcolor + " borderstyle=" + borderstyle + " borderwidth=" + borderwidth + " fontcolor=" + fontcolor + " bordercolor=" + bordercolor + " createddate=" + createddate + " modifieddate=" + modifieddate + " status=" + status + " jabstract=" + jabstract + " tagged=" + tagged + " pdata1=" + pdata1 + " pdata2=" + pdata2 + " pdata3=" + pdata3 + " pdata4=" + pdata4 + " pdata5=" + pdata5 + " concurrency=" + concurrency + " visibility=" + visibility + " persistence=" + persistence + " cardinality=" + cardinality + " gentype=" + gentype + " genfile=" + genfile + " header1=" + header1 + " header2=" + header2 + " phase=" + phase + " scope=" + scope + " genoption=" + genoption + " genlinks=" + genlinks + " classifier=" + classifier + " eaguid=" + eaguid + " parentid=" + parentid + " runstate=" + runstate + " classifierguid=" + classifierguid + " tpos=" + tpos + " isroot=" + isroot + " isleaf=" + isleaf + " isspec=" + isspec + " isactive=" + isactive + " stateflags=" + stateflags + " packageflags=" + packageflags + " multiplicity=" + multiplicity + " styleex=" + styleex + " actionflags=" + actionflags + " eventflags=" + eventflags+ "]";
    }

}

