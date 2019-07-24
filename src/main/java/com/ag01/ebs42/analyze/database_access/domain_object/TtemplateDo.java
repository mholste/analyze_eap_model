package com.ag01.ebs42.analyze.database_access.domain_object;

import java.io.Serializable;

public class TtemplateDo implements Serializable {

    private static final long serialVersionUID = -7935005907264146868L;

    private String templateid;
    private String templatetype;
    private String templatename;
    private String notes;
    private String style;
    private String template;

    public TtemplateDo() {
        super();
    }

    public TtemplateDo(String templateid, String templatetype, String templatename, String notes, String style, String template) {
        super();
        this.templateid = templateid;
        this.templatetype = templatetype;
        this.templatename = templatename;
        this.notes = notes;
        this.style = style;
        this.template = template;
    }

    public String getTemplateid() {
        return this.templateid;
    }

    public void setTemplateid(String templateid) {
        this.templateid = templateid;
    }

    public String getTemplatetype() {
        return this.templatetype;
    }

    public void setTemplatetype(String templatetype) {
        this.templatetype = templatetype;
    }

    public String getTemplatename() {
        return this.templatename;
    }

    public void setTemplatename(String templatename) {
        this.templatename = templatename;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getStyle() {
        return this.style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getTemplate() {
        return this.template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((templateid == null) ? 0 : templateid.hashCode());
        result = prime * result + ((templatetype == null) ? 0 : templatetype.hashCode());
        result = prime * result + ((templatename == null) ? 0 : templatename.hashCode());
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
        result = prime * result + ((style == null) ? 0 : style.hashCode());
        result = prime * result + ((template == null) ? 0 : template.hashCode());
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
        TtemplateDo other = (TtemplateDo) obj;
        if(templateid == null) {
            if(other.templateid != null)
                return false;
        } else if(!templateid.equals(other.templateid))
            return false;
        if(templatetype == null) {
            if(other.templatetype != null)
                return false;
        } else if(!templatetype.equals(other.templatetype))
            return false;
        if(templatename == null) {
            if(other.templatename != null)
                return false;
        } else if(!templatename.equals(other.templatename))
            return false;
        if(notes == null) {
            if(other.notes != null)
                return false;
        } else if(!notes.equals(other.notes))
            return false;
        if(style == null) {
            if(other.style != null)
                return false;
        } else if(!style.equals(other.style))
            return false;
        if(template == null) {
            if(other.template != null)
                return false;
        } else if(!template.equals(other.template))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Ttemplate [ " + " templateid=" + templateid + " templatetype=" + templatetype + " templatename=" + templatename + " notes=" + notes + " style=" + style + " template=" + template+ "]";
    }

}

