package com.hibernate.jpa.main;

import com.hibernate.jpa.dao.CountryRepositoryImpl;
import com.hibernate.jpa.entity.City;
import com.hibernate.jpa.entity.Country;
import com.hibernate.jpa.entity.CountryLanguage;
import com.hibernate.jpa.util.HibernateJpaUtility;

public class TestCountry {
	
	public static void main(String[] args) {
		
		CountryRepositoryImpl countryRepository = new CountryRepositoryImpl();
		countryRepository.setEntityManager(HibernateJpaUtility.getFactory().createEntityManager());
		
		Country country = new Country("IND", "Delhi", "Asia", 8.594, 68.35, "India", "India",1.324,"North");
		City city1 = new City("Jagadhri","Yamunanagar",124894);
		CountryLanguage language = new CountryLanguage(true,90.2);
		city1.addCountryToCity(country);
		language.setCountryCode(country);
		country.setLanguage(language);
		
		country.getCities().add(city1);
		
		
		//countryRepository.save(country);
		
		Country country1 = countryRepository.find("IND");
		System.out.println(country1);
		
		
	}

}
