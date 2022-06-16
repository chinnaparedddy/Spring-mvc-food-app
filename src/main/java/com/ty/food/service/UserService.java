package com.ty.food.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.food.dao.UserDao;
import com.ty.food.dto.User;

@Component
public class UserService {

	@Autowired
	UserDao userDao ;
	
	public boolean addUser(User user) {
		return userDao.addUser(user) ;
	}
	
	public boolean validateUser(String email ,String password) {
		return userDao.validateUser(email, password) ;
	}
	
	public boolean deletUser(int id) {
		return userDao.deletUser(id) ;
	}
	
	public boolean updateUser(int id ,User user) {
		return userDao.updateUser(id, user) ;
	}
	
	public List<User> getAllUsers(){
		return userDao.getAllUsers() ;
	}
	
	public User getUserById(int id){
		return userDao.getUserById(id)  ;
	}
	
}
