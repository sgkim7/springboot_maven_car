package com.sboot.hello.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String brand;
	private String model;
	private String color;
	private String reqisterNumber;

	private int modleYear;
	private int price;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getReqisterNumber() {
		return reqisterNumber;
	}

	public void setReqisterNumber(String reqisterNumber) {
		this.reqisterNumber = reqisterNumber;
	}

	public int getModleYear() {
		return modleYear;
	}

	public void setModleYear(int modleYear) {
		this.modleYear = modleYear;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
