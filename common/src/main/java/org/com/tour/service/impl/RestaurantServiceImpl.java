package org.com.tour.service.impl;

import java.util.List;
import org.com.tour.model.Restaurant;
import org.com.tour.repository.RestaurantRepository;
import org.com.tour.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RestaurantServiceImpl implements RestaurantService   {

	@Autowired
	RestaurantRepository<Restaurant> restaurantRepository;	
	
	@Transactional
	public List<Restaurant> getRestaurantListByCityId(Integer cityId) {				 		
		return restaurantRepository.findRestaurantByCityId(cityId);	
	}

	@Transactional
	public Restaurant getRestaurantById(Integer id) {
		return restaurantRepository.findRestaurantById(id);
	}
}
