package com.ag01.ebs42.analyze_eap_db.database_access.domain_object;

import java.io.Serializable;

public class TrulesDo implements Serializable {

    private static final long serialVersionUID = -7987885395967842741L;

    private String ruleid;
    private String rulename;
    private String ruletype;
    private int ruleactive;
    private String errormsg;
    private String flags;
    private String ruleocl;
    private String rulexml;
    private String notes;

    public TrulesDo() {
        super();
    }

    public TrulesDo(String ruleid, String rulename, String ruletype, int ruleactive, String errormsg, String flags, String ruleocl, String rulexml, String notes) {
        super();
        this.ruleid = ruleid;
        this.rulename = rulename;
        this.ruletype = ruletype;
        this.ruleactive = ruleactive;
        this.errormsg = errormsg;
        this.flags = flags;
        this.ruleocl = ruleocl;
        this.rulexml = rulexml;
        this.notes = notes;
    }

    public String getRuleid() {
        return this.ruleid;
    }

    public void setRuleid(String ruleid) {
        this.ruleid = ruleid;
    }

    public String getRulename() {
        return this.rulename;
    }

    public void setRulename(String rulename) {
        this.rulename = rulename;
    }

    public String getRuletype() {
        return this.ruletype;
    }

    public void setRuletype(String ruletype) {
        this.ruletype = ruletype;
    }

    public int getRuleactive() {
        return this.ruleactive;
    }

    public void setRuleactive(int ruleactive) {
        this.ruleactive = ruleactive;
    }

    public String getErrormsg() {
        return this.errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }

    public String getFlags() {
        return this.flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public String getRuleocl() {
        return this.ruleocl;
    }

    public void setRuleocl(String ruleocl) {
        this.ruleocl = ruleocl;
    }

    public String getRulexml() {
        return this.rulexml;
    }

    public void setRulexml(String rulexml) {
        this.rulexml = rulexml;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ruleid == null) ? 0 : ruleid.hashCode());
        result = prime * result + ((rulename == null) ? 0 : rulename.hashCode());
        result = prime * result + ((ruletype == null) ? 0 : ruletype.hashCode());
        result = prime * result + ruleactive;
        result = prime * result + ((errormsg == null) ? 0 : errormsg.hashCode());
        result = prime * result + ((flags == null) ? 0 : flags.hashCode());
        result = prime * result + ((ruleocl == null) ? 0 : ruleocl.hashCode());
        result = prime * result + ((rulexml == null) ? 0 : rulexml.hashCode());
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
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
        TrulesDo other = (TrulesDo) obj;
        if(ruleid == null) {
            if(other.ruleid != null)
                return false;
        } else if(!ruleid.equals(other.ruleid))
            return false;
        if(rulename == null) {
            if(other.rulename != null)
                return false;
        } else if(!rulename.equals(other.rulename))
            return false;
        if(ruletype == null) {
            if(other.ruletype != null)
                return false;
        } else if(!ruletype.equals(other.ruletype))
            return false;
        if(ruleactive != other.ruleactive)
            return false;
        if(errormsg == null) {
            if(other.errormsg != null)
                return false;
        } else if(!errormsg.equals(other.errormsg))
            return false;
        if(flags == null) {
            if(other.flags != null)
                return false;
        } else if(!flags.equals(other.flags))
            return false;
        if(ruleocl == null) {
            if(other.ruleocl != null)
                return false;
        } else if(!ruleocl.equals(other.ruleocl))
            return false;
        if(rulexml == null) {
            if(other.rulexml != null)
                return false;
        } else if(!rulexml.equals(other.rulexml))
            return false;
        if(notes == null) {
            if(other.notes != null)
                return false;
        } else if(!notes.equals(other.notes))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Trules [ " + " ruleid=" + ruleid + " rulename=" + rulename + " ruletype=" + ruletype + " ruleactive=" + ruleactive + " errormsg=" + errormsg + " flags=" + flags + " ruleocl=" + ruleocl + " rulexml=" + rulexml + " notes=" + notes+ "]";
    }

}

