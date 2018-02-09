package com.hibernate.jpa.entity;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Country {
	
	
	@Id
	private String code;
	
	private String capital;

	private String continent;
	
	private double gnp;
	
	private double lifeExpectancy;
	
	private String localName;
	
	private String name;
	
	private double population;
	 
	private String region;
	 
	@OneToMany(fetch=FetchType.LAZY,mappedBy="countryCode",cascade=CascadeType.ALL)
	 private Set<City> cities = new HashSet<>();
	
	@OneToOne(fetch=FetchType.LAZY,mappedBy="countryCode",cascade=CascadeType.ALL)
	private CountryLanguage language;
	
	public Country() {
		// TODO Auto-generated constructor stub
	}



public Country(String code, String capital, String continent, double gnp, double lifeExpectancy, String localName,
			String name, double population, String region) {
		super();
		this.code = code;
		this.capital = capital;
		this.continent = continent;
		this.gnp = gnp;
		this.lifeExpectancy = lifeExpectancy;
		this.localName = localName;
		this.name = name;
		this.population = population;
		this.region = region;
	}



public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
}

public String getCapital() {
	return capital;
}

public void setCapital(String capital) {
	this.capital = capital;
}

public String getContinent() {
	return continent;
}

public void setContinent(String continent) {
	this.continent = continent;
}

public double getGnp() {
	return gnp;
}

public void setGnp(double gnp) {
	this.gnp = gnp;
}

public double getLifeExpectancy() {
	return lifeExpectancy;
}

public void setLifeExpectancy(double lifeExpectancy) {
	this.lifeExpectancy = lifeExpectancy;
}

public String getLocalName() {
	return localName;
}

public void setLocalName(String localName) {
	this.localName = localName;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getPopulation() {
	return population;
}

public void setPopulation(double population) {
	this.population = population;
}

public String getRegion() {
	return region;
}

public void setRegion(String region) {
	this.region = region;
}


public Set<City> getCities() {
	return cities;
}

public void setCities(Set<City> cities) {
	this.cities = cities;
}


public CountryLanguage getLanguage() {
	return language;
}



public void setLanguage(CountryLanguage language) {
	this.language = language;
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((code == null) ? 0 : code.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (!(obj instanceof Country))
		return false;
	Country other = (Country) obj;
	if (code == null) {
		if (other.code != null)
			return false;
	} else if (!code.equals(other.code))
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
	builder.append("Country [code=");
	builder.append(code);
	builder.append(", capital=");
	builder.append(capital);
	builder.append(", continent=");
	builder.append(continent);
	builder.append(", gnp=");
	builder.append(gnp);
	builder.append(", lifeExpectancy=");
	builder.append(lifeExpectancy);
	builder.append(", localName=");
	builder.append(localName);
	builder.append(", name=");
	builder.append(name);
	builder.append(", population=");
	builder.append(population);
	builder.append(", region=");
	builder.append(region);
	builder.append(", cities=");
	builder.append(cities);
	builder.append(", language=");
	builder.append(language);
	builder.append("]");
	return builder.toString();
}

}
