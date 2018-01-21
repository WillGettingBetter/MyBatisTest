package com.it.entity;

import java.util.Date;

public class FounderMessageOne {

	private int messageid;
	private int userid;
	private String username;
	private int fildid;
	private String messagecontent;
	private Date messagedate;
	private FounderUser founderUser;

	@Override
	public String toString() {
		return "FounderMessageOne [messageid=" + messageid + ", userid="
				+ userid + ", username=" + username + ", fildid=" + fildid
				+ ", messagecontent=" + messagecontent + ", messagedate="
				+ messagedate + ", founderUser=" + founderUser + "]";
	}

	public int getMessageid() {
		return messageid;
	}

	public void setMessageid(int messageid) {
		this.messageid = messageid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getFildid() {
		return fildid;
	}

	public void setFildid(int fildid) {
		this.fildid = fildid;
	}

	public String getMessagecontent() {
		return messagecontent;
	}

	public void setMessagecontent(String messagecontent) {
		this.messagecontent = messagecontent;
	}

	public Date getMessagedate() {
		return messagedate;
	}

	public void setMessagedate(Date messagedate) {
		this.messagedate = messagedate;
	}

	public FounderUser getFounderUser() {
		return founderUser;
	}

	public void setFounderUser(FounderUser founderUser) {
		this.founderUser = founderUser;
	}

}
