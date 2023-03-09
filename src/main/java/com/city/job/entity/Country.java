package com.city.job.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
	@Table(name = "country_id1")
	public class Country {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int country_id1;

		public int getCountry_id1() {
			return country_id1;
		}

		public void setCountry_id1(int country_id1) {
			this.country_id1 = country_id1;
		}
	    
	    
	    
}
