package com.it.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �û�ʵ���࣬��ӦOracle���ݿ��е�sms_user��
 * 
 * @author SJF18
 * 
 */
public class SmsUser {

	// ʵ��������Ժͱ���ֶ�����һһ��Ӧ
	private int userid;
	private String username;
	private String userpsw;
	private String usersex;
	private String usertel;
	private Date userbirth;

	public SmsUser() {
		super();
	}
   
	public SmsUser(int userid, String username, String userpsw, String usersex,
			String usertel, Date userbirth) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpsw = userpsw;
		this.usersex = usersex;
		this.usertel = usertel;
		this.userbirth = userbirth;
	}

	// ���toString����
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return "SmsUser [userid=" + userid + ", username=" + username
				+ ", userpsw=" + userpsw + ", usersex=" + usersex
				+ ", usertel=" + usertel + ", userbirth="
				+ sdf.format(userbirth) + "]";
	}

	// �����Խ��з�װ
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

	public String getUserpsw() {
		return userpsw;
	}

	public void setUserpsw(String userpsw) {
		this.userpsw = userpsw;
	}

	public String getUsersex() {
		return usersex;
	}

	public void setUsersex(String usersex) {
		this.usersex = usersex;
	}

	public String getUsertel() {
		return usertel;
	}

	public void setUsertel(String usertel) {
		this.usertel = usertel;
	}

	public Date getUserbirth() {
		return userbirth;
	}

	public void setUserbirth(Date userbirth) {
		this.userbirth = userbirth;
	}

}
