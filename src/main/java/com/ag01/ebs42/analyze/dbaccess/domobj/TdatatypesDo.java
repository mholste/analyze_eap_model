package com.ag01.ebs42.analyze.dbaccess.domobj;

import java.io.Serializable;

public class TdatatypesDo implements Serializable {

    private static final long serialVersionUID = -7987885395967842741L;

    private String type;
    private String productname;
    private String datatype;
    private int size;
    private int maxlen;
    private int maxprec;
    private int maxscale;
    private int defaultlen;
    private int defaultprec;
    private int defaultscale;
    private int user;
    private String pdata1;
    private String pdata2;
    private String pdata3;
    private String pdata4;
    private String haslength;
    private String generictype;
    private int datatypeid;

    public TdatatypesDo() {
        super();
    }

    public TdatatypesDo(String type, String productname, String datatype, int size, int maxlen, int maxprec, int maxscale, int defaultlen, int defaultprec, int defaultscale, int user, String pdata1, String pdata2, String pdata3, String pdata4, String haslength, String generictype, int datatypeid) {
        super();
        this.type = type;
        this.productname = productname;
        this.datatype = datatype;
        this.size = size;
        this.maxlen = maxlen;
        this.maxprec = maxprec;
        this.maxscale = maxscale;
        this.defaultlen = defaultlen;
        this.defaultprec = defaultprec;
        this.defaultscale = defaultscale;
        this.user = user;
        this.pdata1 = pdata1;
        this.pdata2 = pdata2;
        this.pdata3 = pdata3;
        this.pdata4 = pdata4;
        this.haslength = haslength;
        this.generictype = generictype;
        this.datatypeid = datatypeid;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProductname() {
        return this.productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getDatatype() {
        return this.datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMaxlen() {
        return this.maxlen;
    }

    public void setMaxlen(int maxlen) {
        this.maxlen = maxlen;
    }

    public int getMaxprec() {
        return this.maxprec;
    }

    public void setMaxprec(int maxprec) {
        this.maxprec = maxprec;
    }

    public int getMaxscale() {
        return this.maxscale;
    }

    public void setMaxscale(int maxscale) {
        this.maxscale = maxscale;
    }

    public int getDefaultlen() {
        return this.defaultlen;
    }

    public void setDefaultlen(int defaultlen) {
        this.defaultlen = defaultlen;
    }

    public int getDefaultprec() {
        return this.defaultprec;
    }

    public void setDefaultprec(int defaultprec) {
        this.defaultprec = defaultprec;
    }

    public int getDefaultscale() {
        return this.defaultscale;
    }

    public void setDefaultscale(int defaultscale) {
        this.defaultscale = defaultscale;
    }

    public int getUser() {
        return this.user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public String getPdata1() {
        return this.pdata1;
    }

    public void setPdata1(String pdata1) {
        this.pdata1 = pdata1;
    }

    public String getPdata2() {
        return this.pdata2;
    }

    public void setPdata2(String pdata2) {
        this.pdata2 = pdata2;
    }

    public String getPdata3() {
        return this.pdata3;
    }

    public void setPdata3(String pdata3) {
        this.pdata3 = pdata3;
    }

    public String getPdata4() {
        return this.pdata4;
    }

    public void setPdata4(String pdata4) {
        this.pdata4 = pdata4;
    }

    public String getHaslength() {
        return this.haslength;
    }

    public void setHaslength(String haslength) {
        this.haslength = haslength;
    }

    public String getGenerictype() {
        return this.generictype;
    }

    public void setGenerictype(String generictype) {
        this.generictype = generictype;
    }

    public int getDatatypeid() {
        return this.datatypeid;
    }

    public void setDatatypeid(int datatypeid) {
        this.datatypeid = datatypeid;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((productname == null) ? 0 : productname.hashCode());
        result = prime * result + ((datatype == null) ? 0 : datatype.hashCode());
        result = prime * result + size;
        result = prime * result + maxlen;
        result = prime * result + maxprec;
        result = prime * result + maxscale;
        result = prime * result + defaultlen;
        result = prime * result + defaultprec;
        result = prime * result + defaultscale;
        result = prime * result + user;
        result = prime * result + ((pdata1 == null) ? 0 : pdata1.hashCode());
        result = prime * result + ((pdata2 == null) ? 0 : pdata2.hashCode());
        result = prime * result + ((pdata3 == null) ? 0 : pdata3.hashCode());
        result = prime * result + ((pdata4 == null) ? 0 : pdata4.hashCode());
        result = prime * result + ((haslength == null) ? 0 : haslength.hashCode());
        result = prime * result + ((generictype == null) ? 0 : generictype.hashCode());
        result = prime * result + datatypeid;
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
        TdatatypesDo other = (TdatatypesDo) obj;
        if(type == null) {
            if(other.type != null)
                return false;
        } else if(!type.equals(other.type))
            return false;
        if(productname == null) {
            if(other.productname != null)
                return false;
        } else if(!productname.equals(other.productname))
            return false;
        if(datatype == null) {
            if(other.datatype != null)
                return false;
        } else if(!datatype.equals(other.datatype))
            return false;
        if(size != other.size)
            return false;
        if(maxlen != other.maxlen)
            return false;
        if(maxprec != other.maxprec)
            return false;
        if(maxscale != other.maxscale)
            return false;
        if(defaultlen != other.defaultlen)
            return false;
        if(defaultprec != other.defaultprec)
            return false;
        if(defaultscale != other.defaultscale)
            return false;
        if(user != other.user)
            return false;
        if(pdata1 == null) {
            if(other.pdata1 != null)
                return false;
        } else if(!pdata1.equals(other.pdata1))
            return false;
        if(pdata2 == null) {
            if(other.pdata2 != null)
                return false;
        } else if(!pdata2.equals(other.pdata2))
            return false;
        if(pdata3 == null) {
            if(other.pdata3 != null)
                return false;
        } else if(!pdata3.equals(other.pdata3))
            return false;
        if(pdata4 == null) {
            if(other.pdata4 != null)
                return false;
        } else if(!pdata4.equals(other.pdata4))
            return false;
        if(haslength == null) {
            if(other.haslength != null)
                return false;
        } else if(!haslength.equals(other.haslength))
            return false;
        if(generictype == null) {
            if(other.generictype != null)
                return false;
        } else if(!generictype.equals(other.generictype))
            return false;
        if(datatypeid != other.datatypeid)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tdatatypes [ " + " type=" + type + " productname=" + productname + " datatype=" + datatype + " size=" + size + " maxlen=" + maxlen + " maxprec=" + maxprec + " maxscale=" + maxscale + " defaultlen=" + defaultlen + " defaultprec=" + defaultprec + " defaultscale=" + defaultscale + " user=" + user + " pdata1=" + pdata1 + " pdata2=" + pdata2 + " pdata3=" + pdata3 + " pdata4=" + pdata4 + " haslength=" + haslength + " generictype=" + generictype + " datatypeid=" + datatypeid+ "]";
    }

}

