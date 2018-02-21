package com.example.SplitApp.Entity;
// Generated 19 Feb, 2018 3:43:10 AM by Hibernate Tools 4.3.5.Final

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * Groups generated by hbm2java
 */
@Entity
@Table(name = "groups", catalog = "splitapp")
public class Groups implements java.io.Serializable {
	@NotNull
	@Id
	private int groupId;
	private String groupName;
	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy = "group")
	private List<Members> members = new ArrayList<Members>();	

	public Groups() {
	}
	
	public List<Members> getMembers() {
		return members;
	}
	
	public void setMembers(List<Members> members) {
		this.members = members;
	}
	

	public Groups(int groupId) {
		this.groupId = groupId;
	}

	public Groups(int groupId, String groupName) {
		this.groupId = groupId;
		this.groupName = groupName;
	}

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	
	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
