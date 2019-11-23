package com.talentpool.po;

public class Pexperience {
    private Integer id;
    private String ids;
    private String pusername;

    private String ptime;

    private String pplace;

    private String pcontent;


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

    public String getPusername() {
        return pusername;
    }

    public void setPusername(String pusername) {
        this.pusername = pusername == null ? null : pusername.trim();
    }

    public String getPtime() {
        return ptime;
    }

    public void setPtime(String ptime) {
        this.ptime = ptime == null ? null : ptime.trim();
    }

    public String getPplace() {
        return pplace;
    }

    public void setPplace(String pplace) {
        this.pplace = pplace == null ? null : pplace.trim();
    }

    public String getPcontent() {
        return pcontent;
    }

    public void setPcontent(String pcontent) {
        this.pcontent = pcontent == null ? null : pcontent.trim();
    }
}