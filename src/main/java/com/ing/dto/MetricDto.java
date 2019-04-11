package com.ing.dto;

public class MetricDto {
	
	private long id;
	
	private String description;
	
	private long groupId;

	private static int viewCount;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getGroupId() {
		return groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	public static int getViewCount() {
		return viewCount;
	}

	public static void setViewCount(int viewCount) {
		MetricDto.viewCount = viewCount;
	}	
	
}
