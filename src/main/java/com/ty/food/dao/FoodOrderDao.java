package com.ty.food.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.food.dto.FoodOrder;

@Component
public class FoodOrderDao {

	@Autowired
	EntityManagerFactory entityManagerFactory ;
	
	public FoodOrder placeFoodOrder(FoodOrder foodOrder) {
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction entityTransaction = entityManager.getTransaction() ;
		entityTransaction.begin();
		entityManager.persist(foodOrder);
		entityTransaction.commit();
		return foodOrder ;
	}
}
