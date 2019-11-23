package com.talentpool.po;

public class Workex {
    private Integer id;
    private String ids;
    private String wuesrname;

    private String wstartdate;

    private String wenddate;

    private String job;

    private String post;

    private String resignreason;

    private String ztel;

    

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

    public String getWuesrname() {
        return wuesrname;
    }

    public void setWuesrname(String wuesrname) {
        this.wuesrname = wuesrname == null ? null : wuesrname.trim();
    }

    public String getWstartdate() {
        return wstartdate;
    }

    public void setWstartdate(String wstartdate) {
        this.wstartdate = wstartdate == null ? null : wstartdate.trim();
    }

    public String getWenddate() {
        return wenddate;
    }

    public void setWenddate(String wenddate) {
        this.wenddate = wenddate == null ? null : wenddate.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public String getResignreason() {
        return resignreason;
    }

    public void setResignreason(String resignreason) {
        this.resignreason = resignreason == null ? null : resignreason.trim();
    }

    public String getZtel() {
        return ztel;
    }

    public void setZtel(String ztel) {
        this.ztel = ztel == null ? null : ztel.trim();
    }
}