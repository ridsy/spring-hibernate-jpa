//package com.hibernate.jpa.main;
//
//import java.time.Instant;
//import java.time.LocalDate;
//import java.util.Date;
//import java.util.HashSet;
//import java.util.Set;
//
//import com.hibernate.jpa.dao.CustomerRepositoryImpl;
//import com.hibernate.jpa.dao.CityRepositoryImplementation;
//import com.hibernate.jpa.entity.Country;
//import com.hibernate.jpa.entity.City;
//import com.hibernate.jpa.util.HibernateJpaUtility;
//
//public class TestOrderOTM {
//
//	public static void main(String[] args) {
//
//		CustomerRepositoryImpl customerRepository = new CustomerRepositoryImpl();
//		customerRepository.setEntityManager(HibernateJpaUtility.getFactory().createEntityManager());
//		
//		Country customer1 = new Country("Ridhi","Garg","ridhi@gmail.com");
//		
//		City order1 = new City("C123",new Date(),new Date(),"NEW");
//		order1.addCustomerToOrder(customer1);
//		City order2 = new City("D123",new Date(),new Date(),"NEW");
//		order2.addCustomerToOrder(customer1);
//		City order3 = new City("E123",new Date(),new Date(),"NEW");
//		order3.addCustomerToOrder(customer1);
//		
//		customer1.getOrders().add(order1);
//		customer1.getOrders().add(order2);
//		customer1.getOrders().add(order3);
//		
//		customerRepository.save(customer1);
//		HibernateJpaUtility.closeEntryManagerFactory();
//		
//		
//	}
//
//}
