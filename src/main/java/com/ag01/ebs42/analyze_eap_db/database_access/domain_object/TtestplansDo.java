package com.ag01.ebs42.analyze_eap_db.database_access.domain_object;

import java.io.Serializable;

public class TtestplansDo implements Serializable {

    private static final long serialVersionUID = -7987885395967842741L;

    private String planid;
    private String category;
    private String name;
    private String author;
    private String notes;
    private String testplan;

    public TtestplansDo() {
        super();
    }

    public TtestplansDo(String planid, String category, String name, String author, String notes, String testplan) {
        super();
        this.planid = planid;
        this.category = category;
        this.name = name;
        this.author = author;
        this.notes = notes;
        this.testplan = testplan;
    }

    public String getPlanid() {
        return this.planid;
    }

    public void setPlanid(String planid) {
        this.planid = planid;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getTestplan() {
        return this.testplan;
    }

    public void setTestplan(String testplan) {
        this.testplan = testplan;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((planid == null) ? 0 : planid.hashCode());
        result = prime * result + ((category == null) ? 0 : category.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
        result = prime * result + ((testplan == null) ? 0 : testplan.hashCode());
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
        TtestplansDo other = (TtestplansDo) obj;
        if(planid == null) {
            if(other.planid != null)
                return false;
        } else if(!planid.equals(other.planid))
            return false;
        if(category == null) {
            if(other.category != null)
                return false;
        } else if(!category.equals(other.category))
            return false;
        if(name == null) {
            if(other.name != null)
                return false;
        } else if(!name.equals(other.name))
            return false;
        if(author == null) {
            if(other.author != null)
                return false;
        } else if(!author.equals(other.author))
            return false;
        if(notes == null) {
            if(other.notes != null)
                return false;
        } else if(!notes.equals(other.notes))
            return false;
        if(testplan == null) {
            if(other.testplan != null)
                return false;
        } else if(!testplan.equals(other.testplan))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Ttestplans [ " + " planid=" + planid + " category=" + category + " name=" + name + " author=" + author + " notes=" + notes + " testplan=" + testplan+ "]";
    }

}

