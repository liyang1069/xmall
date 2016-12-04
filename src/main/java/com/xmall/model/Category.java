package com.xmall.model;

public class Category extends BaseModel {
	private String name;
	private String description;
	private long classifyId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getClassifyId() {
		return classifyId;
	}
	public void setClassify_id(long classifyId) {
		this.classifyId = classifyId;
	}
}
