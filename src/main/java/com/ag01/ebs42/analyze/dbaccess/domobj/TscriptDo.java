package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class TscriptDo implements Serializable {

    private static final long serialVersionUID = 9105474330571921161L;

    private int scriptid;
    private String scriptcategory;
    private String scriptname;
    private String scriptauthor;
    private String notes;
    private String script;

    public TscriptDo() {
        super();
    }

    public TscriptDo(int scriptid, String scriptcategory, String scriptname, String scriptauthor, String notes, String script) {
        super();
        this.scriptid = scriptid;
        this.scriptcategory = scriptcategory;
        this.scriptname = scriptname;
        this.scriptauthor = scriptauthor;
        this.notes = notes;
        this.script = script;
    }

    public int getScriptid() {
        return this.scriptid;
    }

    public void setScriptid(int scriptid) {
        this.scriptid = scriptid;
    }

    public String getScriptcategory() {
        return this.scriptcategory;
    }

    public void setScriptcategory(String scriptcategory) {
        this.scriptcategory = scriptcategory;
    }

    public String getScriptname() {
        return this.scriptname;
    }

    public void setScriptname(String scriptname) {
        this.scriptname = scriptname;
    }

    public String getScriptauthor() {
        return this.scriptauthor;
    }

    public void setScriptauthor(String scriptauthor) {
        this.scriptauthor = scriptauthor;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getScript() {
        return this.script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + scriptid;
        result = prime * result + ((scriptcategory == null) ? 0 : scriptcategory.hashCode());
        result = prime * result + ((scriptname == null) ? 0 : scriptname.hashCode());
        result = prime * result + ((scriptauthor == null) ? 0 : scriptauthor.hashCode());
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
        result = prime * result + ((script == null) ? 0 : script.hashCode());
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
        TscriptDo other = (TscriptDo) obj;
        if(scriptid != other.scriptid)
            return false;
        if(scriptcategory == null) {
            if(other.scriptcategory != null)
                return false;
        } else if(!scriptcategory.equals(other.scriptcategory))
            return false;
        if(scriptname == null) {
            if(other.scriptname != null)
                return false;
        } else if(!scriptname.equals(other.scriptname))
            return false;
        if(scriptauthor == null) {
            if(other.scriptauthor != null)
                return false;
        } else if(!scriptauthor.equals(other.scriptauthor))
            return false;
        if(notes == null) {
            if(other.notes != null)
                return false;
        } else if(!notes.equals(other.notes))
            return false;
        if(script == null) {
            if(other.script != null)
                return false;
        } else if(!script.equals(other.script))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tscript [ " + " scriptid=" + scriptid + " scriptcategory=" + scriptcategory + " scriptname=" + scriptname + " scriptauthor=" + scriptauthor + " notes=" + notes + " script=" + script+ "]";
    }

}

