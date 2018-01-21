package com.it.entity;

import java.io.Serializable;
import java.util.Date;

public class FounderMessageAndUser extends FounderMessage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2145138384121023308L;
	protected String user_sex;
	protected String user_tel;
	protected Date user_birth;
	protected String user_psw;

	@Override
	public String toString() {
		return "FounderMessageAndUser [user_sex=" + user_sex + ", user_tel="
				+ user_tel + ", user_birth=" + user_birth + ", user_psw="
				+ user_psw + ", messageid=" + messageid + ", userid=" + userid
				+ ", username=" + username + ", fildid=" + fildid
				+ ", messagecontent=" + messagecontent + ", messagedate="
				+ messagedate + "]";
	}

	public String getUser_sex() {
		return user_sex;
	}

	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}

	public String getUser_tel() {
		return user_tel;
	}

	public void setUser_tel(String user_tel) {
		this.user_tel = user_tel;
	}

	public Date getUser_birth() {
		return user_birth;
	}

	public void setUser_birth(Date user_birth) {
		this.user_birth = user_birth;
	}

	public String getUser_psw() {
		return user_psw;
	}

	public void setUser_psw(String user_psw) {
		this.user_psw = user_psw;
	}

}
