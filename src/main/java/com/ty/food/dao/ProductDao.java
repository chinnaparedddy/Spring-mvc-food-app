package com.ty.food.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.food.dto.Product;


@Component
public class ProductDao {

	@Autowired
	EntityManagerFactory entityManagerFactory;

	public boolean saveProduct(Product product) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		if (product != null) {
			entityTransaction.begin();
			entityManager.persist(product);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}
	
	public boolean deletProduct(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Product products = entityManager.find(Product.class, id) ;
		if(products != null) {
			entityTransaction.begin();
			entityManager.remove(products);
			entityTransaction.commit();
			return true ;
		}else {
			return false ;
		}
	}
	
	public boolean updateProduct(int id ,Product products) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Product product = entityManager.find(Product.class, id) ;
		if(product != null) {
			entityTransaction.begin();
			entityManager.merge(products);
			entityTransaction.commit();
			return true ;
		}else {
			return false ;
		}
	}
	
	public List<Product> getAllProducts(){
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		
		String sql = "select p FROM Product p " ;
		Query query = entityManager.createQuery(sql) ;
		return query.getResultList() ;
	}
	
	public Product getProductById(int id){
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String sql = "select p FROM Product p WHERE p.id = "+id ;
		Query query = entityManager.createQuery(sql) ;
		return (Product)query.getResultList().get(0) ;
	}
}
