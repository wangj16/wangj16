package org.com.tour.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name = "country")
public class Country {
	
//	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
//	   //@Builder.Default
//	@JoinTable(name = "country", joinColumns = @JoinColumn(name = "id"), inverseJoinColumns = @JoinColumn(name = "country_id"))
//	private Set<City> books = new HashSet<>();
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	@Column(name = "country_name")
	private String countryName;    
	@Column(name = "continent")
	private String continent;
	
//    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private Set<City> books = new HashSet<>();
     
    //Getters and setters omitted for brevity
     
//    public City addCity(City city) {
//    	cities.add(city);
//        city.setCity(this);
//        return this;
//    }	
	
	
//    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<City> cities;
//	public List<City> getCities() {
//		return cities;
//	}
//
//	public void setCities(List<City> cities) {
//		this.cities = cities;
//	}
			
	  
    public Country() {
    }

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
  
}

