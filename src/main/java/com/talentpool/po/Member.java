package com.talentpool.po;

public class Member {
    private Integer id;
    private String ids;
    private String musername;

    private String mlink;

    private String mname;

    private String mworkplace;

    private String mtel;

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

    public String getMusername() {
        return musername;
    }

    public void setMusername(String musername) {
        this.musername = musername == null ? null : musername.trim();
    }

    public String getMlink() {
        return mlink;
    }

    public void setMlink(String mlink) {
        this.mlink = mlink == null ? null : mlink.trim();
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public String getMworkplace() {
        return mworkplace;
    }

    public void setMworkplace(String mworkplace) {
        this.mworkplace = mworkplace == null ? null : mworkplace.trim();
    }

    public String getMtel() {
        return mtel;
    }

    public void setMtel(String mtel) {
        this.mtel = mtel == null ? null : mtel.trim();
    }
}