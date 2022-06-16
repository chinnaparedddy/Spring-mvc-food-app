package com.ty.food.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.food.dao.ProductDao;
import com.ty.food.dto.Product;

@Component
public class ProductService {

	@Autowired
	ProductDao productDao ;
	
	public boolean saveProduct(Product product) {
		return productDao.saveProduct(product) ;
	}
	
	public boolean deletProduct(int id) {
		return productDao.deletProduct(id) ;
	}
	
	public boolean updateProduct(int id ,Product products) {
		return productDao.updateProduct(id, products) ;
	}
	
	public List<Product> getAllProducts(){
		return productDao.getAllProducts();
	}
	
	public Product getProductById(int id){
		return productDao.getProductById(id) ;
	}
}

