package com.city.job.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.city.job.entity.City;

@Service
public interface CityService {
  
	  // Save operation
    City saveCity(City city);
 
    // Read operation
    List<City> fetchCityList();
 
    // Update operation
    City updateCity(City city,Long CityId);
                               
 
    // Delete operation
    void deleteCityById(Long CityId);
	
}
