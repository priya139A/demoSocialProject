package com.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class Followers {
	
	private int uuid;
    
	private int followerid;

	public int getUuid() {
		return uuid;
	}

	public void setUuid(int uuid) {
		this.uuid = uuid;
	}

	public int getFollowerid() {
		return followerid;
	}

	public void setFollowerid(int followerid) {
		this.followerid = followerid;
	}

	public Followers(int uuid, int followerid) {
		super();
		this.uuid = uuid;
		this.followerid = followerid;
	}


}
