package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class TglossaryDo implements Serializable {

    private static final long serialVersionUID = 9131914070628801802L;

    private String term;
    private String type;
    private String meaning;
    private int glossaryid;

    public TglossaryDo() {
        super();
    }

    public TglossaryDo(String term, String type, String meaning, int glossaryid) {
        super();
        this.term = term;
        this.type = type;
        this.meaning = meaning;
        this.glossaryid = glossaryid;
    }

    public String getTerm() {
        return this.term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMeaning() {
        return this.meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public int getGlossaryid() {
        return this.glossaryid;
    }

    public void setGlossaryid(int glossaryid) {
        this.glossaryid = glossaryid;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((term == null) ? 0 : term.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((meaning == null) ? 0 : meaning.hashCode());
        result = prime * result + glossaryid;
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
        TglossaryDo other = (TglossaryDo) obj;
        if(term == null) {
            if(other.term != null)
                return false;
        } else if(!term.equals(other.term))
            return false;
        if(type == null) {
            if(other.type != null)
                return false;
        } else if(!type.equals(other.type))
            return false;
        if(meaning == null) {
            if(other.meaning != null)
                return false;
        } else if(!meaning.equals(other.meaning))
            return false;
        if(glossaryid != other.glossaryid)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tglossary [ " + " term=" + term + " type=" + type + " meaning=" + meaning + " glossaryid=" + glossaryid+ "]";
    }

}

