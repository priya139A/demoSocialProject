package com.project.entities;
import java.util.List;

import javax.persistence.*;

@Entity
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uuid;
	
	private String username;
	
	private String usermail;
	
	private String userPhone;
	
	private String userPass;
	
	private String userBio;
	
	private String photoloc;

	public Users(int uUID, String username, String usermail, String userPhone, String userPass, String userBio,
			String photoloc) {
		super();
		this.uuid = uuid;
		this.username = username;
		this.usermail = usermail;
		this.userPhone = userPhone;
		this.userPass = userPass;
		this.userBio = userBio;
		this.photoloc = photoloc;
	}

	public int getUuid() {
		return uuid;
	}

	public void setUuid(int uuid) {
		this.uuid = uuid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsermail() {
		return usermail;
	}

	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserBio() {
		return userBio;
	}

	public void setUserBio(String userBio) {
		this.userBio = userBio;
	}

	public String getPhotoloc() {
		return photoloc;
	}

	public void setPhotoloc(String photoloc) {
		this.photoloc = photoloc;
	}
}


