package com.xmall.model;

import java.math.BigDecimal;

public class Commodity extends BaseModel {
	private String name;
	private String description;
	private long classifyId;
	private String size;
	private BigDecimal price;
	private float weight;
	
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
	public void setClassifyId(long classifyId) {
		this.classifyId = classifyId;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
}
