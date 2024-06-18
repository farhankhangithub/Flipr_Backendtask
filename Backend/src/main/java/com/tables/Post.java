package com.tables;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Post {
	@Id
	private String id;
	private Community community;
	private User user;
	private String content;
	@Temporal(TemporalType.DATE)
	private Date created_at;
	@Temporal(TemporalType.DATE)
	private Date updated_at;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public Post(String id, Community community, User user, String content, Date created_at, Date updated_at) {
		super();
		this.id = id;
		this.community = community;
		this.user = user;
		this.content = content;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", community=" + community + ", user=" + user + ", content=" + content
				+ ", created_at=" + created_at + ", updated_at=" + updated_at + "]";
	}
	
	
}
