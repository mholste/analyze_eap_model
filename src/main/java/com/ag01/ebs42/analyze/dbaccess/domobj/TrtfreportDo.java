package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class TrtfreportDo implements Serializable {

    private static final long serialVersionUID = 9131914070628801802L;

    private String templateid;
    private int rootpackage;
    private String filename;
    private int details;
    private int processchildren;
    private int showdiagrams;
    private String heading;
    private int requirements;
    private int associations;
    private int scenarios;
    private int childdiagrams;
    private int attributes;
    private int methods;
    private int imagetype;
    private int paging;
    private String intro;
    private int resources;
    private int constraints;
    private int tagged;
    private int showtag;
    private int showalias;
    private String pdata1;
    private String pdata2;
    private String pdata3;
    private String pdata4;

    public TrtfreportDo() {
        super();
    }

    public TrtfreportDo(String templateid, int rootpackage, String filename, int details, int processchildren, int showdiagrams, String heading, int requirements, int associations, int scenarios, int childdiagrams, int attributes, int methods, int imagetype, int paging, String intro, int resources, int constraints, int tagged, int showtag, int showalias, String pdata1, String pdata2, String pdata3, String pdata4) {
        super();
        this.templateid = templateid;
        this.rootpackage = rootpackage;
        this.filename = filename;
        this.details = details;
        this.processchildren = processchildren;
        this.showdiagrams = showdiagrams;
        this.heading = heading;
        this.requirements = requirements;
        this.associations = associations;
        this.scenarios = scenarios;
        this.childdiagrams = childdiagrams;
        this.attributes = attributes;
        this.methods = methods;
        this.imagetype = imagetype;
        this.paging = paging;
        this.intro = intro;
        this.resources = resources;
        this.constraints = constraints;
        this.tagged = tagged;
        this.showtag = showtag;
        this.showalias = showalias;
        this.pdata1 = pdata1;
        this.pdata2 = pdata2;
        this.pdata3 = pdata3;
        this.pdata4 = pdata4;
    }

    public String getTemplateid() {
        return this.templateid;
    }

    public void setTemplateid(String templateid) {
        this.templateid = templateid;
    }

    public int getRootpackage() {
        return this.rootpackage;
    }

    public void setRootpackage(int rootpackage) {
        this.rootpackage = rootpackage;
    }

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getDetails() {
        return this.details;
    }

    public void setDetails(int details) {
        this.details = details;
    }

    public int getProcesschildren() {
        return this.processchildren;
    }

    public void setProcesschildren(int processchildren) {
        this.processchildren = processchildren;
    }

    public int getShowdiagrams() {
        return this.showdiagrams;
    }

    public void setShowdiagrams(int showdiagrams) {
        this.showdiagrams = showdiagrams;
    }

    public String getHeading() {
        return this.heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public int getRequirements() {
        return this.requirements;
    }

    public void setRequirements(int requirements) {
        this.requirements = requirements;
    }

    public int getAssociations() {
        return this.associations;
    }

    public void setAssociations(int associations) {
        this.associations = associations;
    }

    public int getScenarios() {
        return this.scenarios;
    }

    public void setScenarios(int scenarios) {
        this.scenarios = scenarios;
    }

    public int getChilddiagrams() {
        return this.childdiagrams;
    }

    public void setChilddiagrams(int childdiagrams) {
        this.childdiagrams = childdiagrams;
    }

    public int getAttributes() {
        return this.attributes;
    }

    public void setAttributes(int attributes) {
        this.attributes = attributes;
    }

    public int getMethods() {
        return this.methods;
    }

    public void setMethods(int methods) {
        this.methods = methods;
    }

    public int getImagetype() {
        return this.imagetype;
    }

    public void setImagetype(int imagetype) {
        this.imagetype = imagetype;
    }

    public int getPaging() {
        return this.paging;
    }

    public void setPaging(int paging) {
        this.paging = paging;
    }

    public String getIntro() {
        return this.intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public int getResources() {
        return this.resources;
    }

    public void setResources(int resources) {
        this.resources = resources;
    }

    public int getConstraints() {
        return this.constraints;
    }

    public void setConstraints(int constraints) {
        this.constraints = constraints;
    }

    public int getTagged() {
        return this.tagged;
    }

    public void setTagged(int tagged) {
        this.tagged = tagged;
    }

    public int getShowtag() {
        return this.showtag;
    }

    public void setShowtag(int showtag) {
        this.showtag = showtag;
    }

    public int getShowalias() {
        return this.showalias;
    }

    public void setShowalias(int showalias) {
        this.showalias = showalias;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((templateid == null) ? 0 : templateid.hashCode());
        result = prime * result + rootpackage;
        result = prime * result + ((filename == null) ? 0 : filename.hashCode());
        result = prime * result + details;
        result = prime * result + processchildren;
        result = prime * result + showdiagrams;
        result = prime * result + ((heading == null) ? 0 : heading.hashCode());
        result = prime * result + requirements;
        result = prime * result + associations;
        result = prime * result + scenarios;
        result = prime * result + childdiagrams;
        result = prime * result + attributes;
        result = prime * result + methods;
        result = prime * result + imagetype;
        result = prime * result + paging;
        result = prime * result + ((intro == null) ? 0 : intro.hashCode());
        result = prime * result + resources;
        result = prime * result + constraints;
        result = prime * result + tagged;
        result = prime * result + showtag;
        result = prime * result + showalias;
        result = prime * result + ((pdata1 == null) ? 0 : pdata1.hashCode());
        result = prime * result + ((pdata2 == null) ? 0 : pdata2.hashCode());
        result = prime * result + ((pdata3 == null) ? 0 : pdata3.hashCode());
        result = prime * result + ((pdata4 == null) ? 0 : pdata4.hashCode());
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
        TrtfreportDo other = (TrtfreportDo) obj;
        if(templateid == null) {
            if(other.templateid != null)
                return false;
        } else if(!templateid.equals(other.templateid))
            return false;
        if(rootpackage != other.rootpackage)
            return false;
        if(filename == null) {
            if(other.filename != null)
                return false;
        } else if(!filename.equals(other.filename))
            return false;
        if(details != other.details)
            return false;
        if(processchildren != other.processchildren)
            return false;
        if(showdiagrams != other.showdiagrams)
            return false;
        if(heading == null) {
            if(other.heading != null)
                return false;
        } else if(!heading.equals(other.heading))
            return false;
        if(requirements != other.requirements)
            return false;
        if(associations != other.associations)
            return false;
        if(scenarios != other.scenarios)
            return false;
        if(childdiagrams != other.childdiagrams)
            return false;
        if(attributes != other.attributes)
            return false;
        if(methods != other.methods)
            return false;
        if(imagetype != other.imagetype)
            return false;
        if(paging != other.paging)
            return false;
        if(intro == null) {
            if(other.intro != null)
                return false;
        } else if(!intro.equals(other.intro))
            return false;
        if(resources != other.resources)
            return false;
        if(constraints != other.constraints)
            return false;
        if(tagged != other.tagged)
            return false;
        if(showtag != other.showtag)
            return false;
        if(showalias != other.showalias)
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
        return true;
    }

    @Override
    public String toString() {
        return "Trtfreport [ " + " templateid=" + templateid + " rootpackage=" + rootpackage + " filename=" + filename + " details=" + details + " processchildren=" + processchildren + " showdiagrams=" + showdiagrams + " heading=" + heading + " requirements=" + requirements + " associations=" + associations + " scenarios=" + scenarios + " childdiagrams=" + childdiagrams + " attributes=" + attributes + " methods=" + methods + " imagetype=" + imagetype + " paging=" + paging + " intro=" + intro + " resources=" + resources + " constraints=" + constraints + " tagged=" + tagged + " showtag=" + showtag + " showalias=" + showalias + " pdata1=" + pdata1 + " pdata2=" + pdata2 + " pdata3=" + pdata3 + " pdata4=" + pdata4+ "]";
    }

}

