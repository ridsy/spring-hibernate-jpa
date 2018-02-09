package com.hibernate.jpa.dao;

import java.util.List;

import com.hibernate.jpa.entity.City;

public interface CityRepository {
	
	       void save(City city);
	
			void update(City city);
			
			City findById(long id);
			
			void delete(long id);
			
			List<City> findAll();  

	
	

}
