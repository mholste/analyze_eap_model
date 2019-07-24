package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class TobjectfilesDo implements Serializable {

    private static final long serialVersionUID = 9131914070628801802L;

    private int objectid;
    private String filename;
    private String type;
    private String note;
    private String filesize;
    private String filedate;

    public TobjectfilesDo() {
        super();
    }

    public TobjectfilesDo(int objectid, String filename, String type, String note, String filesize, String filedate) {
        super();
        this.objectid = objectid;
        this.filename = filename;
        this.type = type;
        this.note = note;
        this.filesize = filesize;
        this.filedate = filedate;
    }

    public int getObjectid() {
        return this.objectid;
    }

    public void setObjectid(int objectid) {
        this.objectid = objectid;
    }

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getFilesize() {
        return this.filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize;
    }

    public String getFiledate() {
        return this.filedate;
    }

    public void setFiledate(String filedate) {
        this.filedate = filedate;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + objectid;
        result = prime * result + ((filename == null) ? 0 : filename.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((note == null) ? 0 : note.hashCode());
        result = prime * result + ((filesize == null) ? 0 : filesize.hashCode());
        result = prime * result + ((filedate == null) ? 0 : filedate.hashCode());
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
        TobjectfilesDo other = (TobjectfilesDo) obj;
        if(objectid != other.objectid)
            return false;
        if(filename == null) {
            if(other.filename != null)
                return false;
        } else if(!filename.equals(other.filename))
            return false;
        if(type == null) {
            if(other.type != null)
                return false;
        } else if(!type.equals(other.type))
            return false;
        if(note == null) {
            if(other.note != null)
                return false;
        } else if(!note.equals(other.note))
            return false;
        if(filesize == null) {
            if(other.filesize != null)
                return false;
        } else if(!filesize.equals(other.filesize))
            return false;
        if(filedate == null) {
            if(other.filedate != null)
                return false;
        } else if(!filedate.equals(other.filedate))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tobjectfiles [ " + " objectid=" + objectid + " filename=" + filename + " type=" + type + " note=" + note + " filesize=" + filesize + " filedate=" + filedate+ "]";
    }

}

