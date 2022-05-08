package org.com.tour.service.impl;

import java.util.List;

import org.com.tour.model.Country;
import org.com.tour.repository.CountryRepository;
import org.com.tour.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CountryServiceImpl implements CountryService  {

	@Autowired
	CountryRepository<Country> countryRepository;
	
	@Transactional
	public List<Country> getAllCountry() {
		List<Country> countries =  countryRepository.findAll();
		System.out.println("CountryServiceImpl countries:   " + countries.size()); 
		return countries;
	}
}
