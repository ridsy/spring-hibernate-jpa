package com.hibernate.jpa.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class City {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
    private String name;
    
    private String district;
    
    private double population;
	
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="CountryCode",nullable=false,insertable=true,updatable=false)
	private Country countryCode;
	
	public City() {
		
	}

	public City(String name, String district, double population) {
		super();
		this.name = name;
		this.district = district;
		this.population = population;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public double getPopulation() {
		return population;
	}

	public void setPopulation(double population) {
		this.population = population;
	}
	
	

	public Country getCountryCode() {
		return countryCode;
	}

	private void setCountryCode(Country countryCode) {
		this.countryCode = countryCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("City [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", district=");
		builder.append(district);
		builder.append(", population=");
		builder.append(population);
		builder.append("]");
		return builder.toString();
	}

	public void addCountryToCity(Country country) {
		if(country == null) {
			return;
		}
		this.countryCode=country;
		country.getCities().add(this);
	}
	
	
	
	
}
