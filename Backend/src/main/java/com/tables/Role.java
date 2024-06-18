package com.tables;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Role {
	@Id
	private int id;
	@Column(unique = true)
	private String name;
	@Temporal(TemporalType.DATE)
	private Date created_at;
	@Temporal(TemporalType.DATE)
	private Date updated_at;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Role(int id, String name, Date created_at, Date updated_at) {
		super();
		this.id = id;
		this.name = name;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", created_at=" + created_at + ", updated_at=" + updated_at + "]";
	}
	
	
	
}
