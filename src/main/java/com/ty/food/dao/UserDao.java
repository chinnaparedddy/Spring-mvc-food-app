package com.ty.food.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.food.dto.User;

@Component
public class UserDao {

	@Autowired
	EntityManagerFactory entityManagerFactory;

	public boolean addUser(User user) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		if (user != null) {
			entityTransaction.begin();
			entityManager.persist(user);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}
	
	public boolean validateUser(String email ,String password) {
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		String sql = "SELECT u FROM User u WHERE u.email = ?1 AND u.password = ?2" ;
		Query  query = entityManager.createQuery(sql) ;
		query.setParameter(1, email) ;
		query.setParameter(2, password) ;
		
		if(query.getResultList().size() >= 0) {
			return true ;
		}else {
			return false ;
		}
	}
	
	public boolean deletUser(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		User user = entityManager.find(User.class, id) ;
		if(user != null) {
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			return true ;
		}else {
			return false ;
		}
	}
	
	public boolean updateUser(int id ,User user) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		User user1 = entityManager.find(User.class, id) ;
		if(user1 != null) {
			entityTransaction.begin();
			entityManager.merge(user);
			entityTransaction.commit();
			return true ;
		}else {
			return false ;
		}
	}
	
	public List<User> getAllUsers(){
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String sql = "select u from User u " ;
		Query query = entityManager.createQuery(sql) ;
		return query.getResultList() ;
	}
	
	public User getUserById(int id){
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String sql = "select u from User u where u.id = "+id ;
		Query query = entityManager.createQuery(sql) ;
		return (User)query.getResultList().get(0) ;
	}
}

