package org.com.tour.service;

import java.util.List;
import org.com.tour.model.Restaurant;

public interface RestaurantService {	
	public List<Restaurant> getRestaurantListByCityId(Integer cityId);
	public Restaurant getRestaurantById(Integer restaurantId);
}
