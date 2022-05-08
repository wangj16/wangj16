package org.com.tour.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "restaurant")
public class Restaurant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;

	@Column(name = "post_code")
	private String postCode;

	@Column(name = "city")
	private String city;

	@Column(name = "country")
	private String country;

	@Column(name = "city_id")
	private Integer cityId;

	@Column(name = "rating")
	private String rating;

	@Column(name = "comment")
	private String comment;

	@Column(name = "link_ip_address")
	private String linkIpAddress;

	@Column(name = "phone")
	private String phone;

	@Column(name = "email")
	private String email;

	public Restaurant() {
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getLinkIpAddress() {
		return linkIpAddress;
	}

	public void setLinkIpAddress(String linkIpAddress) {
		this.linkIpAddress = linkIpAddress;
	}

	public String getPhone() {return phone;	}

	public void setPhone(String phone) { this.phone = phone; }

	public String getEmail() {return email; }

	public void setEmail(String email) {this.email = email; }

}
