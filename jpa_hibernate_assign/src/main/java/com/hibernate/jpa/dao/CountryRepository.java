package com.hibernate.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.hibernate.jpa.entity.Country;

public interface CountryRepository {
	
	void save(Country country);
	
	void update(Country country);
	
	Country find(String code);
	
	List<Country> findALL();
	
	void setEntityManager(EntityManager entityManager);

}
	