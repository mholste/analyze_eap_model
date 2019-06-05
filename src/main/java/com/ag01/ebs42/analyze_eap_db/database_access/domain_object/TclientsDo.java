package com.ag01.ebs42.analyze_eap_db.database_access.domain_object;

import java.io.Serializable;

public class TclientsDo implements Serializable {

    private static final long serialVersionUID = 9131914070628801802L;

    private String name;
    private String organisation;
    private String phone1;
    private String phone2;
    private String mobile;
    private String fax;
    private String email;
    private String roles;
    private String notes;

    public TclientsDo() {
        super();
    }

    public TclientsDo(String name, String organisation, String phone1, String phone2, String mobile, String fax, String email, String roles, String notes) {
        super();
        this.name = name;
        this.organisation = organisation;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.mobile = mobile;
        this.fax = fax;
        this.email = email;
        this.roles = roles;
        this.notes = notes;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganisation() {
        return this.organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getPhone1() {
        return this.phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return this.phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getFax() {
        return this.fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoles() {
        return this.roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
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
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((organisation == null) ? 0 : organisation.hashCode());
        result = prime * result + ((phone1 == null) ? 0 : phone1.hashCode());
        result = prime * result + ((phone2 == null) ? 0 : phone2.hashCode());
        result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
        result = prime * result + ((fax == null) ? 0 : fax.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((roles == null) ? 0 : roles.hashCode());
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
        TclientsDo other = (TclientsDo) obj;
        if(name == null) {
            if(other.name != null)
                return false;
        } else if(!name.equals(other.name))
            return false;
        if(organisation == null) {
            if(other.organisation != null)
                return false;
        } else if(!organisation.equals(other.organisation))
            return false;
        if(phone1 == null) {
            if(other.phone1 != null)
                return false;
        } else if(!phone1.equals(other.phone1))
            return false;
        if(phone2 == null) {
            if(other.phone2 != null)
                return false;
        } else if(!phone2.equals(other.phone2))
            return false;
        if(mobile == null) {
            if(other.mobile != null)
                return false;
        } else if(!mobile.equals(other.mobile))
            return false;
        if(fax == null) {
            if(other.fax != null)
                return false;
        } else if(!fax.equals(other.fax))
            return false;
        if(email == null) {
            if(other.email != null)
                return false;
        } else if(!email.equals(other.email))
            return false;
        if(roles == null) {
            if(other.roles != null)
                return false;
        } else if(!roles.equals(other.roles))
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
        return "Tclients [ " + " name=" + name + " organisation=" + organisation + " phone1=" + phone1 + " phone2=" + phone2 + " mobile=" + mobile + " fax=" + fax + " email=" + email + " roles=" + roles + " notes=" + notes+ "]";
    }

}

