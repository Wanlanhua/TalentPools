package com.talentpool.po;

public class Qualification {
    private Integer id;
    private String ids;
    private String qusername;

    private String qname;

    private String qplace;

    private String qtime;


	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQusername() {
        return qusername;
    }

    public void setQusername(String qusername) {
        this.qusername = qusername == null ? null : qusername.trim();
    }

    public String getQname() {
        return qname;
    }

    public void setQname(String qname) {
        this.qname = qname == null ? null : qname.trim();
    }

    public String getQplace() {
        return qplace;
    }

    public void setQplace(String qplace) {
        this.qplace = qplace == null ? null : qplace.trim();
    }

    public String getQtime() {
        return qtime;
    }

    public void setQtime(String qtime) {
        this.qtime = qtime == null ? null : qtime.trim();
    }
}