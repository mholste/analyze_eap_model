package com.ag01.ebs42.analyze_eap_db.database_access.domain_object;

import java.io.Serializable;

public class TfilesDo implements Serializable {

    private static final long serialVersionUID = 9131914070628801802L;

    private String fileid;
    private String appliesto;
    private String category;
    private String name;
    private String file;
    private String notes;
    private java.sql.Date filedate;
    private int filesize;

    public TfilesDo() {
        super();
    }

    public TfilesDo(String fileid, String appliesto, String category, String name, String file, String notes, java.sql.Date filedate, int filesize) {
        super();
        this.fileid = fileid;
        this.appliesto = appliesto;
        this.category = category;
        this.name = name;
        this.file = file;
        this.notes = notes;
        this.filedate = filedate;
        this.filesize = filesize;
    }

    public String getFileid() {
        return this.fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid;
    }

    public String getAppliesto() {
        return this.appliesto;
    }

    public void setAppliesto(String appliesto) {
        this.appliesto = appliesto;
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

    public String getFile() {
        return this.file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public java.sql.Date getFiledate() {
        return this.filedate;
    }

    public void setFiledate(java.sql.Date filedate) {
        this.filedate = filedate;
    }

    public int getFilesize() {
        return this.filesize;
    }

    public void setFilesize(int filesize) {
        this.filesize = filesize;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fileid == null) ? 0 : fileid.hashCode());
        result = prime * result + ((appliesto == null) ? 0 : appliesto.hashCode());
        result = prime * result + ((category == null) ? 0 : category.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((file == null) ? 0 : file.hashCode());
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
        result = prime * result + ((filedate == null) ? 0 : filedate.hashCode());
        result = prime * result + filesize;
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
        TfilesDo other = (TfilesDo) obj;
        if(fileid == null) {
            if(other.fileid != null)
                return false;
        } else if(!fileid.equals(other.fileid))
            return false;
        if(appliesto == null) {
            if(other.appliesto != null)
                return false;
        } else if(!appliesto.equals(other.appliesto))
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
        if(file == null) {
            if(other.file != null)
                return false;
        } else if(!file.equals(other.file))
            return false;
        if(notes == null) {
            if(other.notes != null)
                return false;
        } else if(!notes.equals(other.notes))
            return false;
        if(filedate == null) {
            if(other.filedate != null)
                return false;
        } else if(!filedate.equals(other.filedate))
            return false;
        if(filesize != other.filesize)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tfiles [ " + " fileid=" + fileid + " appliesto=" + appliesto + " category=" + category + " name=" + name + " file=" + file + " notes=" + notes + " filedate=" + filedate + " filesize=" + filesize+ "]";
    }

}

