package org.com.tour.service.impl;

import java.util.List;

import org.com.tour.model.City;
import org.com.tour.repository.CityRepository;
import org.com.tour.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CityServiceImpl implements CityService {
	
	@Autowired
	CityRepository<City> cityRepository;
		
	@Transactional
	public List<City> getAllCity() {
		List<City> cities =  cityRepository.findByName("Berlin");
//		for (City city : cities) {
//		    System.out.println("a nupdate jpa city name: " + city.getName());		    
//		}
//		return (List<City>) cityRepository.findByName("Berlin");
		return cityRepository.findAll();
	}
	
	@Transactional
	public List<City> getCityListByCountryId(Integer countryId) {				 		
		return cityRepository.findNameByCountryId(countryId);
	}		
}
