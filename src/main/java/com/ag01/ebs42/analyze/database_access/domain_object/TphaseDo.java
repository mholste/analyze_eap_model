package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class TphaseDo implements Serializable {

    private static final long serialVersionUID = -7987885395967842741L;

    private String phaseid;
    private String phasename;
    private String phasenotes;
    private String phasestyle;
    private java.sql.Date startdate;
    private java.sql.Date enddate;
    private String phasecontent;

    public TphaseDo() {
        super();
    }

    public TphaseDo(String phaseid, String phasename, String phasenotes, String phasestyle, java.sql.Date startdate, java.sql.Date enddate, String phasecontent) {
        super();
        this.phaseid = phaseid;
        this.phasename = phasename;
        this.phasenotes = phasenotes;
        this.phasestyle = phasestyle;
        this.startdate = startdate;
        this.enddate = enddate;
        this.phasecontent = phasecontent;
    }

    public String getPhaseid() {
        return this.phaseid;
    }

    public void setPhaseid(String phaseid) {
        this.phaseid = phaseid;
    }

    public String getPhasename() {
        return this.phasename;
    }

    public void setPhasename(String phasename) {
        this.phasename = phasename;
    }

    public String getPhasenotes() {
        return this.phasenotes;
    }

    public void setPhasenotes(String phasenotes) {
        this.phasenotes = phasenotes;
    }

    public String getPhasestyle() {
        return this.phasestyle;
    }

    public void setPhasestyle(String phasestyle) {
        this.phasestyle = phasestyle;
    }

    public java.sql.Date getStartdate() {
        return this.startdate;
    }

    public void setStartdate(java.sql.Date startdate) {
        this.startdate = startdate;
    }

    public java.sql.Date getEnddate() {
        return this.enddate;
    }

    public void setEnddate(java.sql.Date enddate) {
        this.enddate = enddate;
    }

    public String getPhasecontent() {
        return this.phasecontent;
    }

    public void setPhasecontent(String phasecontent) {
        this.phasecontent = phasecontent;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((phaseid == null) ? 0 : phaseid.hashCode());
        result = prime * result + ((phasename == null) ? 0 : phasename.hashCode());
        result = prime * result + ((phasenotes == null) ? 0 : phasenotes.hashCode());
        result = prime * result + ((phasestyle == null) ? 0 : phasestyle.hashCode());
        result = prime * result + ((startdate == null) ? 0 : startdate.hashCode());
        result = prime * result + ((enddate == null) ? 0 : enddate.hashCode());
        result = prime * result + ((phasecontent == null) ? 0 : phasecontent.hashCode());
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
        TphaseDo other = (TphaseDo) obj;
        if(phaseid == null) {
            if(other.phaseid != null)
                return false;
        } else if(!phaseid.equals(other.phaseid))
            return false;
        if(phasename == null) {
            if(other.phasename != null)
                return false;
        } else if(!phasename.equals(other.phasename))
            return false;
        if(phasenotes == null) {
            if(other.phasenotes != null)
                return false;
        } else if(!phasenotes.equals(other.phasenotes))
            return false;
        if(phasestyle == null) {
            if(other.phasestyle != null)
                return false;
        } else if(!phasestyle.equals(other.phasestyle))
            return false;
        if(startdate == null) {
            if(other.startdate != null)
                return false;
        } else if(!startdate.equals(other.startdate))
            return false;
        if(enddate == null) {
            if(other.enddate != null)
                return false;
        } else if(!enddate.equals(other.enddate))
            return false;
        if(phasecontent == null) {
            if(other.phasecontent != null)
                return false;
        } else if(!phasecontent.equals(other.phasecontent))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tphase [ " + " phaseid=" + phaseid + " phasename=" + phasename + " phasenotes=" + phasenotes + " phasestyle=" + phasestyle + " startdate=" + startdate + " enddate=" + enddate + " phasecontent=" + phasecontent+ "]";
    }

}

