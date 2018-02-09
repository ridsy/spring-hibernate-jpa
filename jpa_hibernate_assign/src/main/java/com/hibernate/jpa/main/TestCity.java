//package com.hibernate.jpa.main;
//
//
//
//import com.hibernate.jpa.dao.CityRepositoryImplementation;
//import com.hibernate.jpa.entity.City;
//import com.hibernate.jpa.util.HibernateJpaUtility;
//
//public class TestCity {
//
//	public static void main(String[] args) {
//		CityRepositoryImplementation cityRepository = new CityRepositoryImplementation();
//		cityRepository.setEntityManager(HibernateJpaUtility.getFactory().createEntityManager());
//		City city = new City("Jagadhri","Yamunanagar",124894);
//		cityRepository.save(city);
//
//		HibernateJpaUtility.closeEntryManagerFactory();
//		
//		
//	}
//
//}
