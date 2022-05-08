package org.com.tour.repository;

import java.util.List;

import org.com.tour.model.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository <C> extends CrudRepository<Country, Long> {	
	List<Country> findAll();
}

