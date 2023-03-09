package com.city.job.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class City {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int city_id;


@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "state_id", nullable = false)
private int state_id1;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "country_id1", nullable = false)
private int country_id1;

private String city_name;

private String city_short_name;

private int sc_fk;

public int getCity_id() {
	return city_id;
}


public void setCity_id(int city_id) {
	this.city_id = city_id;
}
public int getState_id1() {
	return state_id1;
}



public void setState_id1(int state_id1) {
	this.state_id1 = state_id1;
}


public int getCountry_id1() {
	return country_id1;
}


public void setCountry_id1(int country_id1) {
	this.country_id1 = country_id1;
}


public String getCity_name() {
	return city_name;
}


public void setCity_name(String city_name) {
	this.city_name = city_name;
}


public String getCity_short_name() {
	return city_short_name;
}


public void setCity_short_name(String city_short_name) {
	this.city_short_name = city_short_name;
}


public int getSc_fk() {
	return sc_fk;
}


public void setSc_fk(int sc_fk) {
	this.sc_fk = sc_fk;
}


public City(int city_id, int state_id1, int country_id1, String city_name, String city_short_name, int sc_fk) {
	super();
	this.city_id = city_id;
	this.state_id1 = state_id1;
	this.country_id1 = country_id1;
	this.city_name = city_name;
	this.city_short_name = city_short_name;
	this.sc_fk = sc_fk;
}







}
