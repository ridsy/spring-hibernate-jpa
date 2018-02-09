package com.hibernate.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.hibernate.jpa.entity.Country;
//import com.hibernate.jpa.entity.City;

public class CountryRepositoryImpl implements CountryRepository {
	
	private EntityManager entityManager;
	

	@Override
	public void save(Country country) {
		
         EntityTransaction trxn = entityManager.getTransaction();
		
		try {
		trxn.begin();
		entityManager.persist(country);
		trxn.commit();
		
		}catch(Exception e) {
			trxn.rollback();
			e.printStackTrace();
		}

	}

	@Override
	public void update(Country country) {

		
EntityTransaction trxn = entityManager.getTransaction();
		
		try {
		trxn.begin();
		entityManager.merge(country);
		trxn.commit();
		
		}catch(Exception e) {
			trxn.rollback();
			e.printStackTrace();
		}

	}

	@Override
	public Country find(String code) {
		return entityManager.find(Country.class, code);
	}

	@Override
	public List<Country> findALL() {
		return entityManager.createQuery("from Country").getResultList();
	}

	@Override
	public void setEntityManager(EntityManager entityManager) {

		this.entityManager = entityManager;
	}

}
