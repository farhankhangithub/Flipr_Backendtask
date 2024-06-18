package com.tables;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Member {
	@Id
	private String id;
	@ManyToOne
	private Community community;
	@ManyToMany
	private User user;
	@ManyToMany
	private Role role;
	private Date created_at;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Community getCommunity() {
		return community;
	}
	public void setCommunity(Community community) {
		this.community = community;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Member(String id, Community community, User user, Role role, Date created_at) {
		super();
		this.id = id;
		this.community = community;
		this.user = user;
		this.role = role;
		this.created_at = created_at;
	}
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", community=" + community + ", user=" + user + ", role=" + role + ", created_at="
				+ created_at + "]";
	}
	
	
	
	
}
