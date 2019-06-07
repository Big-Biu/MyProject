package com.gkb.classService;

public class Classes {
	private String cid=null;
	private String cname=null;
	private String cnum=null;
	private String cnote=null;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCnum() {
		return cnum;
	}
	public void setCnum(String cnum) {
		this.cnum = cnum;
	}
	public String getCnote() {
		return cnote;
	}
	public void setCnote(String cnote) {
		this.cnote = cnote;
	}
	public Classes(String cid, String cname, String cnum, String cnote) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cnum = cnum;
		this.cnote = cnote;
	}
	public Classes() {
		super();
	}
}
