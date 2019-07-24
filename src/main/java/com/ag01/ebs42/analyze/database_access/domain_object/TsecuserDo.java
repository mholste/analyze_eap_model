package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class TsecuserDo implements Serializable {

    private static final long serialVersionUID = 9131914070628801802L;

    private String userid;
    private String userlogin;
    private String firstname;
    private String surname;
    private String department;
    private String password;

    public TsecuserDo() {
        super();
    }

    public TsecuserDo(String userid, String userlogin, String firstname, String surname, String department, String password) {
        super();
        this.userid = userid;
        this.userlogin = userlogin;
        this.firstname = firstname;
        this.surname = surname;
        this.department = department;
        this.password = password;
    }

    public String getUserid() {
        return this.userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserlogin() {
        return this.userlogin;
    }

    public void setUserlogin(String userlogin) {
        this.userlogin = userlogin;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((userid == null) ? 0 : userid.hashCode());
        result = prime * result + ((userlogin == null) ? 0 : userlogin.hashCode());
        result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
        result = prime * result + ((surname == null) ? 0 : surname.hashCode());
        result = prime * result + ((department == null) ? 0 : department.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
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
        TsecuserDo other = (TsecuserDo) obj;
        if(userid == null) {
            if(other.userid != null)
                return false;
        } else if(!userid.equals(other.userid))
            return false;
        if(userlogin == null) {
            if(other.userlogin != null)
                return false;
        } else if(!userlogin.equals(other.userlogin))
            return false;
        if(firstname == null) {
            if(other.firstname != null)
                return false;
        } else if(!firstname.equals(other.firstname))
            return false;
        if(surname == null) {
            if(other.surname != null)
                return false;
        } else if(!surname.equals(other.surname))
            return false;
        if(department == null) {
            if(other.department != null)
                return false;
        } else if(!department.equals(other.department))
            return false;
        if(password == null) {
            if(other.password != null)
                return false;
        } else if(!password.equals(other.password))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tsecuser [ " + " userid=" + userid + " userlogin=" + userlogin + " firstname=" + firstname + " surname=" + surname + " department=" + department + " password=" + password+ "]";
    }

}

