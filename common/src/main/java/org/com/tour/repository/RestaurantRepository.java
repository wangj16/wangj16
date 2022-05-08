package org.com.tour.repository;

import java.util.List;

import org.com.tour.model.Restaurant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository <C> extends CrudRepository<Restaurant, Integer> {

    @Query("SELECT r FROM Restaurant r where r.cityId = :cityId") 
    List<Restaurant> findRestaurantByCityId(@Param("cityId") Integer cityId);

    @Query("SELECT r FROM Restaurant r where r.id = :id")
    Restaurant findRestaurantById(@Param("id") Integer id);

    // List<Restaurant> findRestaurantByRating(String rating);
	// List<Restaurant> findRestaurantsAll();			
}
