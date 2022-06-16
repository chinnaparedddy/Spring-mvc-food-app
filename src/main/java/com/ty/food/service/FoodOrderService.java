package com.ty.food.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.food.dao.FoodOrderDao;
import com.ty.food.dto.FoodOrder;

@Component
public class FoodOrderService {

	@Autowired
	FoodOrderDao dao ;
	public FoodOrder placeFoodOrder(FoodOrder foodOrder) {
		return dao.placeFoodOrder(foodOrder) ;
	}
}

