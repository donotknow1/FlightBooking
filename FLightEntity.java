package com.pract.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Flight")
public class FLightEntity {

	@Id
	@Column
	private int flightNo;
	@Column
	private String depCity;
	@Column
	private String arrCity;
	@Column
	private int seatAvail;
	public int getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(int i) {
		this.flightNo = i;
	}
	public String getDepCity() {
		return depCity;
	}
	public void setDepCity(String depCity) {
		this.depCity = depCity;
	}
	public String getArrCity() {
		return arrCity;
	}
	public void setArrCity(String arrCity) {
		this.arrCity = arrCity;
	}
	public int getSeatAvail() {
		return seatAvail;
	}
	public void setSeatAvail(int i) {
		this.seatAvail = i;
	}
	
	
	
	
	
}
