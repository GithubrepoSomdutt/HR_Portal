package com.city.job.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class City {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int city_id;


@ManyToOne(targetEntity = State.class)
private State state;
//
//
@ManyToOne(targetEntity = Country.class)
private Country country;

private String city_name;

private String city_short_name;

public int getCity_id() {
	return city_id;
}

public void setCity_id(int city_id) {
	this.city_id = city_id;
}

public State getState() {
	return state;
	}

public void setState(State state) {
	this.state = state;
}

public Country getCountry() {
	return country;
}

public void setCountry(Country country) {
this.country = country;
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


public City(int city_id, State state, Country country, String city_name, String city_short_name) {
	super();
	this.city_id = city_id;
	this.state = state;
	this.country = country;
	this.city_name = city_name;
	this.city_short_name = city_short_name;
}






}
