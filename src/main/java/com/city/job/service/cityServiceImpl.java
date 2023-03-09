package com.city.job.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.city.job.cityRepo.CityRepository;
import com.city.job.entity.City;

@Service
public class cityServiceImpl implements CityService {
    @Autowired
	private CityRepository cityRepository;

	@Override
	public City saveCity(City city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<City> fetchCityList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public City updateCity(City city, Long CityId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCityById(Long CityId) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
}
