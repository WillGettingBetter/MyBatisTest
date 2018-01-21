package com.it.entity;

public class FounderMessageAndUserAndFile extends FounderMessageAndUser {

	private String filename;
	private String filepic;
	private double fileprice;
	private String filedes;

	@Override
	public String toString() {
		return "FounderMessageAndUserAndFile [filename=" + filename
				+ ", filepic=" + filepic + ", fileprice=" + fileprice
				+ ", filedes=" + filedes + ", user_sex=" + user_sex
				+ ", user_tel=" + user_tel + ", user_birth=" + user_birth
				+ ", user_psw=" + user_psw + ", messageid=" + messageid
				+ ", userid=" + userid + ", username=" + username + ", fildid="
				+ fildid + ", messagecontent=" + messagecontent
				+ ", messagedate=" + messagedate + "]";
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFilepic() {
		return filepic;
	}

	public void setFilepic(String filepic) {
		this.filepic = filepic;
	}

	public double getFileprice() {
		return fileprice;
	}

	public void setFileprice(double fileprice) {
		this.fileprice = fileprice;
	}

	public String getFiledes() {
		return filedes;
	}

	public void setFiledes(String filedes) {
		this.filedes = filedes;
	}

}
