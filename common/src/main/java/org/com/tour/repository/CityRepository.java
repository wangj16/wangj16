package org.com.tour.repository;

import org.com.tour.model.City;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository <C> extends CrudRepository<City, Integer> {
		
    //wks @Query("SELECT c.name FROM City c where c.cityId = :cityId") 
    //wks List<String> findNameByCityId(@Param("cityId") Integer cityId);    
    @Query("SELECT c FROM City c where c.countryId = :countryId") 
    List<City> findNameByCountryId(@Param("countryId") Integer countryId);    
    
    List<City> findByName(String name);
	List<City> findAll();	
}
