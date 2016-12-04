package com.xmall.model;

public class Category extends BaseModel {
	private String name;
	private String description;
	private int classifyId;
	
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
	public int getClassifyId() {
		return classifyId;
	}
	public void setClassify_id(int classifyId) {
		this.classifyId = classifyId;
	}
}
