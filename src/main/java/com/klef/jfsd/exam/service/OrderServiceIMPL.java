package com.klef.jfsd.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Order;
import com.klef.jfsd.exam.repo.OrderRepo;

@Service
public class OrderServiceIMPL  implements OrderService{

	
	
	 @Autowired
	 private OrderRepo orderRepository;
	@Override
	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
	   return orderRepository.save(order);
	}

}
