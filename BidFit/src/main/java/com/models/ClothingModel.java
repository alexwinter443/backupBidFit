package com.models;

import java.sql.Date;

public class ClothingModel {
	
	private int id;
	private String name;
	private int size; 
	private String material;
	private String condition;
	private int quantity;
	private String sex;
	private String image;
	private Date date;
	private int users_id;
	
	public ClothingModel(int id, String name, int size, String material, String condition, int quantity, String sex,
			String image, Date date, int users_id) {
		super();
		this.id = id;
		this.name = name;
		this.size = size;
		this.material = material;
		this.condition = condition;
		this.quantity = quantity;
		this.sex = sex;
		this.image = image;
		this.date = date;
		this.users_id = users_id;
	}

	public ClothingModel() {
		super();
	}

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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getUsers_id() {
		return users_id;
	}

	public void setUsers_id(int users_id) {
		this.users_id = users_id;
	}
	
	
	
}

