package org.com.tour.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
@Table(name = "cities")
public class City {
			
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
	// @OneToMany(mappedBy = "City", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	// private Set<Hotel> hotels = new HashSet<>();
	//@JoinTable(name = "city", joinColumns = @JoinColumn(name = "id"), inverseJoinColumns = @JoinColumn(name = "country_id"))
//    @OneToMany(mappedBy = "city")
//    private Set<Hotel> hotels;       
	    
	@Column(name = "name")
	private String name;    
	@Column(name = "tour_places")
	private String tourPlaces;	
	@Column(name = "population")
	private Integer population;
	@Column(name = "country_id")
	private Integer countryId;	
	@Column(name = "country_name")
	private String countryName;	
	@Column(name = "provinces")
	private String provinces;
		  
    public City() {
    }
   
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
	public String getTourPlaces() {
		return tourPlaces;
	}

	public void setTourPlaces(String tourPlaces) {
		this.tourPlaces = tourPlaces;
	}    

    public int getPopulation() {
        return population;
    }
    
	public void setPopulation(Integer population) {
		this.population = population;
	}
	
	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public String getProvinces() {
		return provinces;
	}

	public void setProvinces(String provinces) {
		this.provinces = provinces;
	}	
}
