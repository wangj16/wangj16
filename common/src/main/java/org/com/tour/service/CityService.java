package org.com.tour.service;

import java.util.List;
import org.com.tour.model.City;

public interface CityService {
	public List<City> getAllCity();	
	public List<City> getCityListByCountryId(Integer countryId);
}
