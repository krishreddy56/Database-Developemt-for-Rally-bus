package com.beans;

import java.sql.Date;

public class TripBean {

	private int eventid,charge;
	
	public TripBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TripBean(int eventid, int charge, String eventCategory, String departDate, String returnDate) {
		super();
		this.eventid = eventid;
		this.charge = charge;
		this.eventCategory = eventCategory;
		this.departDate = departDate;
		ReturnDate = returnDate;
	}
	public int getEventid() {
		return eventid;
	}
	public TripBean(int charge, String eventCategory, String departDate, String returnDate) {
		super();
		this.charge = charge;
		this.eventCategory = eventCategory;
		this.departDate = departDate;
		ReturnDate = returnDate;
	}
	public void setEventid(int eventid) {
		this.eventid = eventid;
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	public String getEventCategory() {
		return eventCategory;
	}
	public void setEventCategory(String eventCategory) {
		this.eventCategory = eventCategory;
	}
	public String getDepartDate() {
		return departDate;
	}
	public void setDepartDate(String departDate) {
		this.departDate = departDate;
	}
	public String getReturnDate() {
		return ReturnDate;
	}
	public void setReturnDate(String returnDate) {
		ReturnDate = returnDate;
	}
	private String eventCategory;
	private String departDate,ReturnDate;
	
}
