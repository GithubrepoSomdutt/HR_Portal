package com.city.job.cityController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.city.job.entity.City;
import com.city.job.service.CityService;


@RestController
public class CityController {
@Autowired
private CityService cityService;

@PostMapping("/cities")

public City saveCity(
     @RequestBody City city)
{
    return cityService.saveCity(city);
}

// Read operation
@GetMapping("/city")

public List<City> fetchDepartmentList()
{
    return cityService.fetchCityList();
}

// Update operation
@PutMapping("/cities/{id}")

public City
updateDepartment(@RequestBody City city,
                 @PathVariable("id") Long cityId)
{
    return cityService.updateCity(
        city, cityId);
}

// Delete operation
@DeleteMapping("/cities/{id}")

public String deleteCityById(@PathVariable("id")
                                   Long cityId)
{
    
	cityService.deleteCityById(
        cityId);
    return "Deleted Successfully";
}
	
	
	
	
}
