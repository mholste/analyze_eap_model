package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class TconnectorDo implements Serializable {

    private static final long serialVersionUID = -8014325136024723382L;

    private int connectorid;
    private String name;
    private String direction;
    private String notes;
    private String connectortype;
    private String subtype;
    private String sourcecard;
    private String sourceaccess;
    private String sourceelement;
    private String destcard;
    private String destaccess;
    private String destelement;
    private String sourcerole;
    private String sourceroletype;
    private String sourcerolenote;
    private String sourcecontainment;
    private int sourceisaggregate;
    private int sourceisordered;
    private String sourcequalifier;
    private String destrole;
    private String destroletype;
    private String destrolenote;
    private String destcontainment;
    private int destisaggregate;
    private int destisordered;
    private String destqualifier;
    private int startobjectid;
    private int endobjectid;
    private String topstartlabel;
    private String topmidlabel;
    private String topendlabel;
    private String btmstartlabel;
    private String btmmidlabel;
    private String btmendlabel;
    private int startedge;
    private int endedge;
    private int ptstartx;
    private int ptstarty;
    private int ptendx;
    private int ptendy;
    private int seqno;
    private int headstyle;
    private int linestyle;
    private int routestyle;
    private int isbold;
    private int linecolor;
    private String stereotype;
    private char virtualinheritance;
    private String linkaccess;
    private String pdata1;
    private String pdata2;
    private String pdata3;
    private String pdata4;
    private String pdata5;
    private int diagramid;
    private String eaguid;
    private String sourceconstraint;
    private String destconstraint;
    private int sourceisnavigable;
    private int destisnavigable;
    private int isroot;
    private int isleaf;
    private int isspec;
    private String sourcechangeable;
    private String destchangeable;
    private String sourcets;
    private String destts;
    private String stateflags;
    private String actionflags;
    private int issignal;
    private int isstimulus;
    private String dispatchaction;
    private int target2;
    private String styleex;
    private String sourcestereotype;
    private String deststereotype;
    private String sourcestyle;
    private String deststyle;
    private String eventflags;

    public TconnectorDo() {
        super();
    }

    public TconnectorDo(int connectorid, String name, String direction, String notes, String connectortype, String subtype, String sourcecard, String sourceaccess, String sourceelement, String destcard, String destaccess, String destelement, String sourcerole, String sourceroletype, String sourcerolenote, String sourcecontainment, int sourceisaggregate, int sourceisordered, String sourcequalifier, String destrole, String destroletype, String destrolenote, String destcontainment, int destisaggregate, int destisordered, String destqualifier, int startobjectid, int endobjectid, String topstartlabel, String topmidlabel, String topendlabel, String btmstartlabel, String btmmidlabel, String btmendlabel, int startedge, int endedge, int ptstartx, int ptstarty, int ptendx, int ptendy, int seqno, int headstyle, int linestyle, int routestyle, int isbold, int linecolor, String stereotype, char virtualinheritance, String linkaccess, String pdata1, String pdata2, String pdata3, String pdata4, String pdata5, int diagramid, String eaguid, String sourceconstraint, String destconstraint, int sourceisnavigable, int destisnavigable, int isroot, int isleaf, int isspec, String sourcechangeable, String destchangeable, String sourcets, String destts, String stateflags, String actionflags, int issignal, int isstimulus, String dispatchaction, int target2, String styleex, String sourcestereotype, String deststereotype, String sourcestyle, String deststyle, String eventflags) {
        super();
        this.connectorid = connectorid;
        this.name = name;
        this.direction = direction;
        this.notes = notes;
        this.connectortype = connectortype;
        this.subtype = subtype;
        this.sourcecard = sourcecard;
        this.sourceaccess = sourceaccess;
        this.sourceelement = sourceelement;
        this.destcard = destcard;
        this.destaccess = destaccess;
        this.destelement = destelement;
        this.sourcerole = sourcerole;
        this.sourceroletype = sourceroletype;
        this.sourcerolenote = sourcerolenote;
        this.sourcecontainment = sourcecontainment;
        this.sourceisaggregate = sourceisaggregate;
        this.sourceisordered = sourceisordered;
        this.sourcequalifier = sourcequalifier;
        this.destrole = destrole;
        this.destroletype = destroletype;
        this.destrolenote = destrolenote;
        this.destcontainment = destcontainment;
        this.destisaggregate = destisaggregate;
        this.destisordered = destisordered;
        this.destqualifier = destqualifier;
        this.startobjectid = startobjectid;
        this.endobjectid = endobjectid;
        this.topstartlabel = topstartlabel;
        this.topmidlabel = topmidlabel;
        this.topendlabel = topendlabel;
        this.btmstartlabel = btmstartlabel;
        this.btmmidlabel = btmmidlabel;
        this.btmendlabel = btmendlabel;
        this.startedge = startedge;
        this.endedge = endedge;
        this.ptstartx = ptstartx;
        this.ptstarty = ptstarty;
        this.ptendx = ptendx;
        this.ptendy = ptendy;
        this.seqno = seqno;
        this.headstyle = headstyle;
        this.linestyle = linestyle;
        this.routestyle = routestyle;
        this.isbold = isbold;
        this.linecolor = linecolor;
        this.stereotype = stereotype;
        this.virtualinheritance = virtualinheritance;
        this.linkaccess = linkaccess;
        this.pdata1 = pdata1;
        this.pdata2 = pdata2;
        this.pdata3 = pdata3;
        this.pdata4 = pdata4;
        this.pdata5 = pdata5;
        this.diagramid = diagramid;
        this.eaguid = eaguid;
        this.sourceconstraint = sourceconstraint;
        this.destconstraint = destconstraint;
        this.sourceisnavigable = sourceisnavigable;
        this.destisnavigable = destisnavigable;
        this.isroot = isroot;
        this.isleaf = isleaf;
        this.isspec = isspec;
        this.sourcechangeable = sourcechangeable;
        this.destchangeable = destchangeable;
        this.sourcets = sourcets;
        this.destts = destts;
        this.stateflags = stateflags;
        this.actionflags = actionflags;
        this.issignal = issignal;
        this.isstimulus = isstimulus;
        this.dispatchaction = dispatchaction;
        this.target2 = target2;
        this.styleex = styleex;
        this.sourcestereotype = sourcestereotype;
        this.deststereotype = deststereotype;
        this.sourcestyle = sourcestyle;
        this.deststyle = deststyle;
        this.eventflags = eventflags;
    }

    public int getConnectorid() {
        return this.connectorid;
    }

    public void setConnectorid(int connectorid) {
        this.connectorid = connectorid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return this.direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getConnectortype() {
        return this.connectortype;
    }

    public void setConnectortype(String connectortype) {
        this.connectortype = connectortype;
    }

    public String getSubtype() {
        return this.subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getSourcecard() {
        return this.sourcecard;
    }

    public void setSourcecard(String sourcecard) {
        this.sourcecard = sourcecard;
    }

    public String getSourceaccess() {
        return this.sourceaccess;
    }

    public void setSourceaccess(String sourceaccess) {
        this.sourceaccess = sourceaccess;
    }

    public String getSourceelement() {
        return this.sourceelement;
    }

    public void setSourceelement(String sourceelement) {
        this.sourceelement = sourceelement;
    }

    public String getDestcard() {
        return this.destcard;
    }

    public void setDestcard(String destcard) {
        this.destcard = destcard;
    }

    public String getDestaccess() {
        return this.destaccess;
    }

    public void setDestaccess(String destaccess) {
        this.destaccess = destaccess;
    }

    public String getDestelement() {
        return this.destelement;
    }

    public void setDestelement(String destelement) {
        this.destelement = destelement;
    }

    public String getSourcerole() {
        return this.sourcerole;
    }

    public void setSourcerole(String sourcerole) {
        this.sourcerole = sourcerole;
    }

    public String getSourceroletype() {
        return this.sourceroletype;
    }

    public void setSourceroletype(String sourceroletype) {
        this.sourceroletype = sourceroletype;
    }

    public String getSourcerolenote() {
        return this.sourcerolenote;
    }

    public void setSourcerolenote(String sourcerolenote) {
        this.sourcerolenote = sourcerolenote;
    }

    public String getSourcecontainment() {
        return this.sourcecontainment;
    }

    public void setSourcecontainment(String sourcecontainment) {
        this.sourcecontainment = sourcecontainment;
    }

    public int getSourceisaggregate() {
        return this.sourceisaggregate;
    }

    public void setSourceisaggregate(int sourceisaggregate) {
        this.sourceisaggregate = sourceisaggregate;
    }

    public int getSourceisordered() {
        return this.sourceisordered;
    }

    public void setSourceisordered(int sourceisordered) {
        this.sourceisordered = sourceisordered;
    }

    public String getSourcequalifier() {
        return this.sourcequalifier;
    }

    public void setSourcequalifier(String sourcequalifier) {
        this.sourcequalifier = sourcequalifier;
    }

    public String getDestrole() {
        return this.destrole;
    }

    public void setDestrole(String destrole) {
        this.destrole = destrole;
    }

    public String getDestroletype() {
        return this.destroletype;
    }

    public void setDestroletype(String destroletype) {
        this.destroletype = destroletype;
    }

    public String getDestrolenote() {
        return this.destrolenote;
    }

    public void setDestrolenote(String destrolenote) {
        this.destrolenote = destrolenote;
    }

    public String getDestcontainment() {
        return this.destcontainment;
    }

    public void setDestcontainment(String destcontainment) {
        this.destcontainment = destcontainment;
    }

    public int getDestisaggregate() {
        return this.destisaggregate;
    }

    public void setDestisaggregate(int destisaggregate) {
        this.destisaggregate = destisaggregate;
    }

    public int getDestisordered() {
        return this.destisordered;
    }

    public void setDestisordered(int destisordered) {
        this.destisordered = destisordered;
    }

    public String getDestqualifier() {
        return this.destqualifier;
    }

    public void setDestqualifier(String destqualifier) {
        this.destqualifier = destqualifier;
    }

    public int getStartobjectid() {
        return this.startobjectid;
    }

    public void setStartobjectid(int startobjectid) {
        this.startobjectid = startobjectid;
    }

    public int getEndobjectid() {
        return this.endobjectid;
    }

    public void setEndobjectid(int endobjectid) {
        this.endobjectid = endobjectid;
    }

    public String getTopstartlabel() {
        return this.topstartlabel;
    }

    public void setTopstartlabel(String topstartlabel) {
        this.topstartlabel = topstartlabel;
    }

    public String getTopmidlabel() {
        return this.topmidlabel;
    }

    public void setTopmidlabel(String topmidlabel) {
        this.topmidlabel = topmidlabel;
    }

    public String getTopendlabel() {
        return this.topendlabel;
    }

    public void setTopendlabel(String topendlabel) {
        this.topendlabel = topendlabel;
    }

    public String getBtmstartlabel() {
        return this.btmstartlabel;
    }

    public void setBtmstartlabel(String btmstartlabel) {
        this.btmstartlabel = btmstartlabel;
    }

    public String getBtmmidlabel() {
        return this.btmmidlabel;
    }

    public void setBtmmidlabel(String btmmidlabel) {
        this.btmmidlabel = btmmidlabel;
    }

    public String getBtmendlabel() {
        return this.btmendlabel;
    }

    public void setBtmendlabel(String btmendlabel) {
        this.btmendlabel = btmendlabel;
    }

    public int getStartedge() {
        return this.startedge;
    }

    public void setStartedge(int startedge) {
        this.startedge = startedge;
    }

    public int getEndedge() {
        return this.endedge;
    }

    public void setEndedge(int endedge) {
        this.endedge = endedge;
    }

    public int getPtstartx() {
        return this.ptstartx;
    }

    public void setPtstartx(int ptstartx) {
        this.ptstartx = ptstartx;
    }

    public int getPtstarty() {
        return this.ptstarty;
    }

    public void setPtstarty(int ptstarty) {
        this.ptstarty = ptstarty;
    }

    public int getPtendx() {
        return this.ptendx;
    }

    public void setPtendx(int ptendx) {
        this.ptendx = ptendx;
    }

    public int getPtendy() {
        return this.ptendy;
    }

    public void setPtendy(int ptendy) {
        this.ptendy = ptendy;
    }

    public int getSeqno() {
        return this.seqno;
    }

    public void setSeqno(int seqno) {
        this.seqno = seqno;
    }

    public int getHeadstyle() {
        return this.headstyle;
    }

    public void setHeadstyle(int headstyle) {
        this.headstyle = headstyle;
    }

    public int getLinestyle() {
        return this.linestyle;
    }

    public void setLinestyle(int linestyle) {
        this.linestyle = linestyle;
    }

    public int getRoutestyle() {
        return this.routestyle;
    }

    public void setRoutestyle(int routestyle) {
        this.routestyle = routestyle;
    }

    public int getIsbold() {
        return this.isbold;
    }

    public void setIsbold(int isbold) {
        this.isbold = isbold;
    }

    public int getLinecolor() {
        return this.linecolor;
    }

    public void setLinecolor(int linecolor) {
        this.linecolor = linecolor;
    }

    public String getStereotype() {
        return this.stereotype;
    }

    public void setStereotype(String stereotype) {
        this.stereotype = stereotype;
    }

    public char getVirtualinheritance() {
        return this.virtualinheritance;
    }

    public void setVirtualinheritance(char virtualinheritance) {
        this.virtualinheritance = virtualinheritance;
    }

    public String getLinkaccess() {
        return this.linkaccess;
    }

    public void setLinkaccess(String linkaccess) {
        this.linkaccess = linkaccess;
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

    public int getDiagramid() {
        return this.diagramid;
    }

    public void setDiagramid(int diagramid) {
        this.diagramid = diagramid;
    }

    public String getEaguid() {
        return this.eaguid;
    }

    public void setEaguid(String eaguid) {
        this.eaguid = eaguid;
    }

    public String getSourceconstraint() {
        return this.sourceconstraint;
    }

    public void setSourceconstraint(String sourceconstraint) {
        this.sourceconstraint = sourceconstraint;
    }

    public String getDestconstraint() {
        return this.destconstraint;
    }

    public void setDestconstraint(String destconstraint) {
        this.destconstraint = destconstraint;
    }

    public int getSourceisnavigable() {
        return this.sourceisnavigable;
    }

    public void setSourceisnavigable(int sourceisnavigable) {
        this.sourceisnavigable = sourceisnavigable;
    }

    public int getDestisnavigable() {
        return this.destisnavigable;
    }

    public void setDestisnavigable(int destisnavigable) {
        this.destisnavigable = destisnavigable;
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

    public String getSourcechangeable() {
        return this.sourcechangeable;
    }

    public void setSourcechangeable(String sourcechangeable) {
        this.sourcechangeable = sourcechangeable;
    }

    public String getDestchangeable() {
        return this.destchangeable;
    }

    public void setDestchangeable(String destchangeable) {
        this.destchangeable = destchangeable;
    }

    public String getSourcets() {
        return this.sourcets;
    }

    public void setSourcets(String sourcets) {
        this.sourcets = sourcets;
    }

    public String getDestts() {
        return this.destts;
    }

    public void setDestts(String destts) {
        this.destts = destts;
    }

    public String getStateflags() {
        return this.stateflags;
    }

    public void setStateflags(String stateflags) {
        this.stateflags = stateflags;
    }

    public String getActionflags() {
        return this.actionflags;
    }

    public void setActionflags(String actionflags) {
        this.actionflags = actionflags;
    }

    public int getIssignal() {
        return this.issignal;
    }

    public void setIssignal(int issignal) {
        this.issignal = issignal;
    }

    public int getIsstimulus() {
        return this.isstimulus;
    }

    public void setIsstimulus(int isstimulus) {
        this.isstimulus = isstimulus;
    }

    public String getDispatchaction() {
        return this.dispatchaction;
    }

    public void setDispatchaction(String dispatchaction) {
        this.dispatchaction = dispatchaction;
    }

    public int getTarget2() {
        return this.target2;
    }

    public void setTarget2(int target2) {
        this.target2 = target2;
    }

    public String getStyleex() {
        return this.styleex;
    }

    public void setStyleex(String styleex) {
        this.styleex = styleex;
    }

    public String getSourcestereotype() {
        return this.sourcestereotype;
    }

    public void setSourcestereotype(String sourcestereotype) {
        this.sourcestereotype = sourcestereotype;
    }

    public String getDeststereotype() {
        return this.deststereotype;
    }

    public void setDeststereotype(String deststereotype) {
        this.deststereotype = deststereotype;
    }

    public String getSourcestyle() {
        return this.sourcestyle;
    }

    public void setSourcestyle(String sourcestyle) {
        this.sourcestyle = sourcestyle;
    }

    public String getDeststyle() {
        return this.deststyle;
    }

    public void setDeststyle(String deststyle) {
        this.deststyle = deststyle;
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
        result = prime * result + connectorid;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((direction == null) ? 0 : direction.hashCode());
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
        result = prime * result + ((connectortype == null) ? 0 : connectortype.hashCode());
        result = prime * result + ((subtype == null) ? 0 : subtype.hashCode());
        result = prime * result + ((sourcecard == null) ? 0 : sourcecard.hashCode());
        result = prime * result + ((sourceaccess == null) ? 0 : sourceaccess.hashCode());
        result = prime * result + ((sourceelement == null) ? 0 : sourceelement.hashCode());
        result = prime * result + ((destcard == null) ? 0 : destcard.hashCode());
        result = prime * result + ((destaccess == null) ? 0 : destaccess.hashCode());
        result = prime * result + ((destelement == null) ? 0 : destelement.hashCode());
        result = prime * result + ((sourcerole == null) ? 0 : sourcerole.hashCode());
        result = prime * result + ((sourceroletype == null) ? 0 : sourceroletype.hashCode());
        result = prime * result + ((sourcerolenote == null) ? 0 : sourcerolenote.hashCode());
        result = prime * result + ((sourcecontainment == null) ? 0 : sourcecontainment.hashCode());
        result = prime * result + sourceisaggregate;
        result = prime * result + sourceisordered;
        result = prime * result + ((sourcequalifier == null) ? 0 : sourcequalifier.hashCode());
        result = prime * result + ((destrole == null) ? 0 : destrole.hashCode());
        result = prime * result + ((destroletype == null) ? 0 : destroletype.hashCode());
        result = prime * result + ((destrolenote == null) ? 0 : destrolenote.hashCode());
        result = prime * result + ((destcontainment == null) ? 0 : destcontainment.hashCode());
        result = prime * result + destisaggregate;
        result = prime * result + destisordered;
        result = prime * result + ((destqualifier == null) ? 0 : destqualifier.hashCode());
        result = prime * result + startobjectid;
        result = prime * result + endobjectid;
        result = prime * result + ((topstartlabel == null) ? 0 : topstartlabel.hashCode());
        result = prime * result + ((topmidlabel == null) ? 0 : topmidlabel.hashCode());
        result = prime * result + ((topendlabel == null) ? 0 : topendlabel.hashCode());
        result = prime * result + ((btmstartlabel == null) ? 0 : btmstartlabel.hashCode());
        result = prime * result + ((btmmidlabel == null) ? 0 : btmmidlabel.hashCode());
        result = prime * result + ((btmendlabel == null) ? 0 : btmendlabel.hashCode());
        result = prime * result + startedge;
        result = prime * result + endedge;
        result = prime * result + ptstartx;
        result = prime * result + ptstarty;
        result = prime * result + ptendx;
        result = prime * result + ptendy;
        result = prime * result + seqno;
        result = prime * result + headstyle;
        result = prime * result + linestyle;
        result = prime * result + routestyle;
        result = prime * result + isbold;
        result = prime * result + linecolor;
        result = prime * result + ((stereotype == null) ? 0 : stereotype.hashCode());
        result = prime * result + virtualinheritance;
        result = prime * result + ((linkaccess == null) ? 0 : linkaccess.hashCode());
        result = prime * result + ((pdata1 == null) ? 0 : pdata1.hashCode());
        result = prime * result + ((pdata2 == null) ? 0 : pdata2.hashCode());
        result = prime * result + ((pdata3 == null) ? 0 : pdata3.hashCode());
        result = prime * result + ((pdata4 == null) ? 0 : pdata4.hashCode());
        result = prime * result + ((pdata5 == null) ? 0 : pdata5.hashCode());
        result = prime * result + diagramid;
        result = prime * result + ((eaguid == null) ? 0 : eaguid.hashCode());
        result = prime * result + ((sourceconstraint == null) ? 0 : sourceconstraint.hashCode());
        result = prime * result + ((destconstraint == null) ? 0 : destconstraint.hashCode());
        result = prime * result + sourceisnavigable;
        result = prime * result + destisnavigable;
        result = prime * result + isroot;
        result = prime * result + isleaf;
        result = prime * result + isspec;
        result = prime * result + ((sourcechangeable == null) ? 0 : sourcechangeable.hashCode());
        result = prime * result + ((destchangeable == null) ? 0 : destchangeable.hashCode());
        result = prime * result + ((sourcets == null) ? 0 : sourcets.hashCode());
        result = prime * result + ((destts == null) ? 0 : destts.hashCode());
        result = prime * result + ((stateflags == null) ? 0 : stateflags.hashCode());
        result = prime * result + ((actionflags == null) ? 0 : actionflags.hashCode());
        result = prime * result + issignal;
        result = prime * result + isstimulus;
        result = prime * result + ((dispatchaction == null) ? 0 : dispatchaction.hashCode());
        result = prime * result + target2;
        result = prime * result + ((styleex == null) ? 0 : styleex.hashCode());
        result = prime * result + ((sourcestereotype == null) ? 0 : sourcestereotype.hashCode());
        result = prime * result + ((deststereotype == null) ? 0 : deststereotype.hashCode());
        result = prime * result + ((sourcestyle == null) ? 0 : sourcestyle.hashCode());
        result = prime * result + ((deststyle == null) ? 0 : deststyle.hashCode());
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
        TconnectorDo other = (TconnectorDo) obj;
        if(connectorid != other.connectorid)
            return false;
        if(name == null) {
            if(other.name != null)
                return false;
        } else if(!name.equals(other.name))
            return false;
        if(direction == null) {
            if(other.direction != null)
                return false;
        } else if(!direction.equals(other.direction))
            return false;
        if(notes == null) {
            if(other.notes != null)
                return false;
        } else if(!notes.equals(other.notes))
            return false;
        if(connectortype == null) {
            if(other.connectortype != null)
                return false;
        } else if(!connectortype.equals(other.connectortype))
            return false;
        if(subtype == null) {
            if(other.subtype != null)
                return false;
        } else if(!subtype.equals(other.subtype))
            return false;
        if(sourcecard == null) {
            if(other.sourcecard != null)
                return false;
        } else if(!sourcecard.equals(other.sourcecard))
            return false;
        if(sourceaccess == null) {
            if(other.sourceaccess != null)
                return false;
        } else if(!sourceaccess.equals(other.sourceaccess))
            return false;
        if(sourceelement == null) {
            if(other.sourceelement != null)
                return false;
        } else if(!sourceelement.equals(other.sourceelement))
            return false;
        if(destcard == null) {
            if(other.destcard != null)
                return false;
        } else if(!destcard.equals(other.destcard))
            return false;
        if(destaccess == null) {
            if(other.destaccess != null)
                return false;
        } else if(!destaccess.equals(other.destaccess))
            return false;
        if(destelement == null) {
            if(other.destelement != null)
                return false;
        } else if(!destelement.equals(other.destelement))
            return false;
        if(sourcerole == null) {
            if(other.sourcerole != null)
                return false;
        } else if(!sourcerole.equals(other.sourcerole))
            return false;
        if(sourceroletype == null) {
            if(other.sourceroletype != null)
                return false;
        } else if(!sourceroletype.equals(other.sourceroletype))
            return false;
        if(sourcerolenote == null) {
            if(other.sourcerolenote != null)
                return false;
        } else if(!sourcerolenote.equals(other.sourcerolenote))
            return false;
        if(sourcecontainment == null) {
            if(other.sourcecontainment != null)
                return false;
        } else if(!sourcecontainment.equals(other.sourcecontainment))
            return false;
        if(sourceisaggregate != other.sourceisaggregate)
            return false;
        if(sourceisordered != other.sourceisordered)
            return false;
        if(sourcequalifier == null) {
            if(other.sourcequalifier != null)
                return false;
        } else if(!sourcequalifier.equals(other.sourcequalifier))
            return false;
        if(destrole == null) {
            if(other.destrole != null)
                return false;
        } else if(!destrole.equals(other.destrole))
            return false;
        if(destroletype == null) {
            if(other.destroletype != null)
                return false;
        } else if(!destroletype.equals(other.destroletype))
            return false;
        if(destrolenote == null) {
            if(other.destrolenote != null)
                return false;
        } else if(!destrolenote.equals(other.destrolenote))
            return false;
        if(destcontainment == null) {
            if(other.destcontainment != null)
                return false;
        } else if(!destcontainment.equals(other.destcontainment))
            return false;
        if(destisaggregate != other.destisaggregate)
            return false;
        if(destisordered != other.destisordered)
            return false;
        if(destqualifier == null) {
            if(other.destqualifier != null)
                return false;
        } else if(!destqualifier.equals(other.destqualifier))
            return false;
        if(startobjectid != other.startobjectid)
            return false;
        if(endobjectid != other.endobjectid)
            return false;
        if(topstartlabel == null) {
            if(other.topstartlabel != null)
                return false;
        } else if(!topstartlabel.equals(other.topstartlabel))
            return false;
        if(topmidlabel == null) {
            if(other.topmidlabel != null)
                return false;
        } else if(!topmidlabel.equals(other.topmidlabel))
            return false;
        if(topendlabel == null) {
            if(other.topendlabel != null)
                return false;
        } else if(!topendlabel.equals(other.topendlabel))
            return false;
        if(btmstartlabel == null) {
            if(other.btmstartlabel != null)
                return false;
        } else if(!btmstartlabel.equals(other.btmstartlabel))
            return false;
        if(btmmidlabel == null) {
            if(other.btmmidlabel != null)
                return false;
        } else if(!btmmidlabel.equals(other.btmmidlabel))
            return false;
        if(btmendlabel == null) {
            if(other.btmendlabel != null)
                return false;
        } else if(!btmendlabel.equals(other.btmendlabel))
            return false;
        if(startedge != other.startedge)
            return false;
        if(endedge != other.endedge)
            return false;
        if(ptstartx != other.ptstartx)
            return false;
        if(ptstarty != other.ptstarty)
            return false;
        if(ptendx != other.ptendx)
            return false;
        if(ptendy != other.ptendy)
            return false;
        if(seqno != other.seqno)
            return false;
        if(headstyle != other.headstyle)
            return false;
        if(linestyle != other.linestyle)
            return false;
        if(routestyle != other.routestyle)
            return false;
        if(isbold != other.isbold)
            return false;
        if(linecolor != other.linecolor)
            return false;
        if(stereotype == null) {
            if(other.stereotype != null)
                return false;
        } else if(!stereotype.equals(other.stereotype))
            return false;
        if(virtualinheritance != other.virtualinheritance)
            return false;
        if(linkaccess == null) {
            if(other.linkaccess != null)
                return false;
        } else if(!linkaccess.equals(other.linkaccess))
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
        if(diagramid != other.diagramid)
            return false;
        if(eaguid == null) {
            if(other.eaguid != null)
                return false;
        } else if(!eaguid.equals(other.eaguid))
            return false;
        if(sourceconstraint == null) {
            if(other.sourceconstraint != null)
                return false;
        } else if(!sourceconstraint.equals(other.sourceconstraint))
            return false;
        if(destconstraint == null) {
            if(other.destconstraint != null)
                return false;
        } else if(!destconstraint.equals(other.destconstraint))
            return false;
        if(sourceisnavigable != other.sourceisnavigable)
            return false;
        if(destisnavigable != other.destisnavigable)
            return false;
        if(isroot != other.isroot)
            return false;
        if(isleaf != other.isleaf)
            return false;
        if(isspec != other.isspec)
            return false;
        if(sourcechangeable == null) {
            if(other.sourcechangeable != null)
                return false;
        } else if(!sourcechangeable.equals(other.sourcechangeable))
            return false;
        if(destchangeable == null) {
            if(other.destchangeable != null)
                return false;
        } else if(!destchangeable.equals(other.destchangeable))
            return false;
        if(sourcets == null) {
            if(other.sourcets != null)
                return false;
        } else if(!sourcets.equals(other.sourcets))
            return false;
        if(destts == null) {
            if(other.destts != null)
                return false;
        } else if(!destts.equals(other.destts))
            return false;
        if(stateflags == null) {
            if(other.stateflags != null)
                return false;
        } else if(!stateflags.equals(other.stateflags))
            return false;
        if(actionflags == null) {
            if(other.actionflags != null)
                return false;
        } else if(!actionflags.equals(other.actionflags))
            return false;
        if(issignal != other.issignal)
            return false;
        if(isstimulus != other.isstimulus)
            return false;
        if(dispatchaction == null) {
            if(other.dispatchaction != null)
                return false;
        } else if(!dispatchaction.equals(other.dispatchaction))
            return false;
        if(target2 != other.target2)
            return false;
        if(styleex == null) {
            if(other.styleex != null)
                return false;
        } else if(!styleex.equals(other.styleex))
            return false;
        if(sourcestereotype == null) {
            if(other.sourcestereotype != null)
                return false;
        } else if(!sourcestereotype.equals(other.sourcestereotype))
            return false;
        if(deststereotype == null) {
            if(other.deststereotype != null)
                return false;
        } else if(!deststereotype.equals(other.deststereotype))
            return false;
        if(sourcestyle == null) {
            if(other.sourcestyle != null)
                return false;
        } else if(!sourcestyle.equals(other.sourcestyle))
            return false;
        if(deststyle == null) {
            if(other.deststyle != null)
                return false;
        } else if(!deststyle.equals(other.deststyle))
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
        return "Tconnector [ " + " connectorid=" + connectorid + " name=" + name + " direction=" + direction + " notes=" + notes + " connectortype=" + connectortype + " subtype=" + subtype + " sourcecard=" + sourcecard + " sourceaccess=" + sourceaccess + " sourceelement=" + sourceelement + " destcard=" + destcard + " destaccess=" + destaccess + " destelement=" + destelement + " sourcerole=" + sourcerole + " sourceroletype=" + sourceroletype + " sourcerolenote=" + sourcerolenote + " sourcecontainment=" + sourcecontainment + " sourceisaggregate=" + sourceisaggregate + " sourceisordered=" + sourceisordered + " sourcequalifier=" + sourcequalifier + " destrole=" + destrole + " destroletype=" + destroletype + " destrolenote=" + destrolenote + " destcontainment=" + destcontainment + " destisaggregate=" + destisaggregate + " destisordered=" + destisordered + " destqualifier=" + destqualifier + " startobjectid=" + startobjectid + " endobjectid=" + endobjectid + " topstartlabel=" + topstartlabel + " topmidlabel=" + topmidlabel + " topendlabel=" + topendlabel + " btmstartlabel=" + btmstartlabel + " btmmidlabel=" + btmmidlabel + " btmendlabel=" + btmendlabel + " startedge=" + startedge + " endedge=" + endedge + " ptstartx=" + ptstartx + " ptstarty=" + ptstarty + " ptendx=" + ptendx + " ptendy=" + ptendy + " seqno=" + seqno + " headstyle=" + headstyle + " linestyle=" + linestyle + " routestyle=" + routestyle + " isbold=" + isbold + " linecolor=" + linecolor + " stereotype=" + stereotype + " virtualinheritance=" + virtualinheritance + " linkaccess=" + linkaccess + " pdata1=" + pdata1 + " pdata2=" + pdata2 + " pdata3=" + pdata3 + " pdata4=" + pdata4 + " pdata5=" + pdata5 + " diagramid=" + diagramid + " eaguid=" + eaguid + " sourceconstraint=" + sourceconstraint + " destconstraint=" + destconstraint + " sourceisnavigable=" + sourceisnavigable + " destisnavigable=" + destisnavigable + " isroot=" + isroot + " isleaf=" + isleaf + " isspec=" + isspec + " sourcechangeable=" + sourcechangeable + " destchangeable=" + destchangeable + " sourcets=" + sourcets + " destts=" + destts + " stateflags=" + stateflags + " actionflags=" + actionflags + " issignal=" + issignal + " isstimulus=" + isstimulus + " dispatchaction=" + dispatchaction + " target2=" + target2 + " styleex=" + styleex + " sourcestereotype=" + sourcestereotype + " deststereotype=" + deststereotype + " sourcestyle=" + sourcestyle + " deststyle=" + deststyle + " eventflags=" + eventflags+ "]";
    }

}

