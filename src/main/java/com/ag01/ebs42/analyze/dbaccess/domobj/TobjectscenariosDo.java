package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class TobjectscenariosDo implements Serializable {

    private static final long serialVersionUID = 9105474330571921161L;

    private int objectid;
    private String scenario;
    private String scenariotype;
    private long evalue;
    private String notes;
    private String eaguid;
    private String xmlcontent;

    public TobjectscenariosDo() {
        super();
    }

    public TobjectscenariosDo(int objectid, String scenario, String scenariotype, long evalue, String notes, String eaguid, String xmlcontent) {
        super();
        this.objectid = objectid;
        this.scenario = scenario;
        this.scenariotype = scenariotype;
        this.evalue = evalue;
        this.notes = notes;
        this.eaguid = eaguid;
        this.xmlcontent = xmlcontent;
    }

    public int getObjectid() {
        return this.objectid;
    }

    public void setObjectid(int objectid) {
        this.objectid = objectid;
    }

    public String getScenario() {
        return this.scenario;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario;
    }

    public String getScenariotype() {
        return this.scenariotype;
    }

    public void setScenariotype(String scenariotype) {
        this.scenariotype = scenariotype;
    }

    public long getEvalue() {
        return this.evalue;
    }

    public void setEvalue(long evalue) {
        this.evalue = evalue;
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

    public String getXmlcontent() {
        return this.xmlcontent;
    }

    public void setXmlcontent(String xmlcontent) {
        this.xmlcontent = xmlcontent;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + objectid;
        result = prime * result + ((scenario == null) ? 0 : scenario.hashCode());
        result = prime * result + ((scenariotype == null) ? 0 : scenariotype.hashCode());
        result = prime * result + (int) (evalue ^ (evalue >>> 32));
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
        result = prime * result + ((eaguid == null) ? 0 : eaguid.hashCode());
        result = prime * result + ((xmlcontent == null) ? 0 : xmlcontent.hashCode());
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
        TobjectscenariosDo other = (TobjectscenariosDo) obj;
        if(objectid != other.objectid)
            return false;
        if(scenario == null) {
            if(other.scenario != null)
                return false;
        } else if(!scenario.equals(other.scenario))
            return false;
        if(scenariotype == null) {
            if(other.scenariotype != null)
                return false;
        } else if(!scenariotype.equals(other.scenariotype))
            return false;
        if(evalue != other.evalue)
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
        if(xmlcontent == null) {
            if(other.xmlcontent != null)
                return false;
        } else if(!xmlcontent.equals(other.xmlcontent))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tobjectscenarios [ " + " objectid=" + objectid + " scenario=" + scenario + " scenariotype=" + scenariotype + " evalue=" + evalue + " notes=" + notes + " eaguid=" + eaguid + " xmlcontent=" + xmlcontent+ "]";
    }

}

