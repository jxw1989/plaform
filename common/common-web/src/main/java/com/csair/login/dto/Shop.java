package com.csair.login.dto;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.csair.common.type.Status;

public class Shop {
	private String name;
	private String[] staffName;

	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date createDate = new Date();
	@JSONField(format = "#0.00")
	private double price = 100d;
	@JSONField(format = "#0.0")
	private float rate = 7f;
	private Status status = Status.OK;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getStaffName() {
		return staffName;
	}

	public void setStaffName(String[] staffName) {
		this.staffName = staffName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}