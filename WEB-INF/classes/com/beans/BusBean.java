package com.beans;

public class BusBean {

	private String busid,capacity,model,make;

	public String getBusid() {
		return busid;
	}

	public void setBusid(String busid) {
		this.busid = busid;
	}

	public BusBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BusBean(String busid, String capacity, String model, String make) {
		super();
		this.busid = busid;
		this.capacity = capacity;
		this.model = model;
		this.make = make;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
}
