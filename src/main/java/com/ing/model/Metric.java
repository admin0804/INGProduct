package com.ing.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Metric {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name = "group_id")
	private long groupId;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "visit_count")
	private long visitCount;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getGroupId() {
		return groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getVisitCount() {
		return visitCount;
	}

	public void setVisitCount(long visitCount) {
		this.visitCount = visitCount;
	}
	
}
