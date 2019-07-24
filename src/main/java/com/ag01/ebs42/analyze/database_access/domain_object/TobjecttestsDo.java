package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class TobjecttestsDo implements Serializable {

    private static final long serialVersionUID = 9131914070628801802L;

    private int objectid;
    private String test;
    private int testclass;
    private String testtype;
    private String notes;
    private String inputdata;
    private String acceptancecriteria;
    private String status;
    private java.sql.Date daterun;
    private String results;
    private String runby;
    private String checkby;

    public TobjecttestsDo() {
        super();
    }

    public TobjecttestsDo(int objectid, String test, int testclass, String testtype, String notes, String inputdata, String acceptancecriteria, String status, java.sql.Date daterun, String results, String runby, String checkby) {
        super();
        this.objectid = objectid;
        this.test = test;
        this.testclass = testclass;
        this.testtype = testtype;
        this.notes = notes;
        this.inputdata = inputdata;
        this.acceptancecriteria = acceptancecriteria;
        this.status = status;
        this.daterun = daterun;
        this.results = results;
        this.runby = runby;
        this.checkby = checkby;
    }

    public int getObjectid() {
        return this.objectid;
    }

    public void setObjectid(int objectid) {
        this.objectid = objectid;
    }

    public String getTest() {
        return this.test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public int getTestclass() {
        return this.testclass;
    }

    public void setTestclass(int testclass) {
        this.testclass = testclass;
    }

    public String getTesttype() {
        return this.testtype;
    }

    public void setTesttype(String testtype) {
        this.testtype = testtype;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getInputdata() {
        return this.inputdata;
    }

    public void setInputdata(String inputdata) {
        this.inputdata = inputdata;
    }

    public String getAcceptancecriteria() {
        return this.acceptancecriteria;
    }

    public void setAcceptancecriteria(String acceptancecriteria) {
        this.acceptancecriteria = acceptancecriteria;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public java.sql.Date getDaterun() {
        return this.daterun;
    }

    public void setDaterun(java.sql.Date daterun) {
        this.daterun = daterun;
    }

    public String getResults() {
        return this.results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public String getRunby() {
        return this.runby;
    }

    public void setRunby(String runby) {
        this.runby = runby;
    }

    public String getCheckby() {
        return this.checkby;
    }

    public void setCheckby(String checkby) {
        this.checkby = checkby;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + objectid;
        result = prime * result + ((test == null) ? 0 : test.hashCode());
        result = prime * result + testclass;
        result = prime * result + ((testtype == null) ? 0 : testtype.hashCode());
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
        result = prime * result + ((inputdata == null) ? 0 : inputdata.hashCode());
        result = prime * result + ((acceptancecriteria == null) ? 0 : acceptancecriteria.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((daterun == null) ? 0 : daterun.hashCode());
        result = prime * result + ((results == null) ? 0 : results.hashCode());
        result = prime * result + ((runby == null) ? 0 : runby.hashCode());
        result = prime * result + ((checkby == null) ? 0 : checkby.hashCode());
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
        TobjecttestsDo other = (TobjecttestsDo) obj;
        if(objectid != other.objectid)
            return false;
        if(test == null) {
            if(other.test != null)
                return false;
        } else if(!test.equals(other.test))
            return false;
        if(testclass != other.testclass)
            return false;
        if(testtype == null) {
            if(other.testtype != null)
                return false;
        } else if(!testtype.equals(other.testtype))
            return false;
        if(notes == null) {
            if(other.notes != null)
                return false;
        } else if(!notes.equals(other.notes))
            return false;
        if(inputdata == null) {
            if(other.inputdata != null)
                return false;
        } else if(!inputdata.equals(other.inputdata))
            return false;
        if(acceptancecriteria == null) {
            if(other.acceptancecriteria != null)
                return false;
        } else if(!acceptancecriteria.equals(other.acceptancecriteria))
            return false;
        if(status == null) {
            if(other.status != null)
                return false;
        } else if(!status.equals(other.status))
            return false;
        if(daterun == null) {
            if(other.daterun != null)
                return false;
        } else if(!daterun.equals(other.daterun))
            return false;
        if(results == null) {
            if(other.results != null)
                return false;
        } else if(!results.equals(other.results))
            return false;
        if(runby == null) {
            if(other.runby != null)
                return false;
        } else if(!runby.equals(other.runby))
            return false;
        if(checkby == null) {
            if(other.checkby != null)
                return false;
        } else if(!checkby.equals(other.checkby))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tobjecttests [ " + " objectid=" + objectid + " test=" + test + " testclass=" + testclass + " testtype=" + testtype + " notes=" + notes + " inputdata=" + inputdata + " acceptancecriteria=" + acceptancecriteria + " status=" + status + " daterun=" + daterun + " results=" + results + " runby=" + runby + " checkby=" + checkby+ "]";
    }

}

