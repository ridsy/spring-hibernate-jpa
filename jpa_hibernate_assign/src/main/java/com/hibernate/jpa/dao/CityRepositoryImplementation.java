package com.hibernate.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.hibernate.jpa.entity.City;

public class CityRepositoryImplementation implements CityRepository {
	
	
	private EntityManager entityManager;
	
	

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void save(City city) {
		
		EntityTransaction trxn = entityManager.getTransaction();
		
		try {
		trxn.begin();
		entityManager.persist(city);
		trxn.commit();
		
		}catch(Exception e) {
			trxn.rollback();
			e.printStackTrace();
		}
		

	}

	public void update(City city) {
		
EntityTransaction trxn = entityManager.getTransaction();
		
		try {
		trxn.begin();
		entityManager.merge(city);
		trxn.commit();
		
		}catch(Exception e) {
			trxn.rollback();
			e.printStackTrace();
		}

		
	}

	public City findById(long id) {
		// TODO Auto-generated method stub
		return entityManager.find(City.class, id);
	}

	public void delete(long id) {

		EntityTransaction trxn = entityManager.getTransaction();
		try {
			trxn.begin();
			entityManager.remove(entityManager.find(City.class, id));
			trxn.commit();
			
			
		} catch (Exception e) {
			
			trxn.rollback();
			e.printStackTrace();
		}
		
	}

	public List<City> findAll() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("from City").getResultList();
	}

}
