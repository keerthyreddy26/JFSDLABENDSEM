package com.klef.jfsd.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.model.Order;
import com.klef.jfsd.exam.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	
	@Autowired
	private OrderService or;
	
	@PostMapping(path="/save")
	public ResponseEntity<Order> addOrder(@RequestBody Order order){
		 if (order.getOrderId() == null || order.getOrderId().isEmpty()) {
	            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	        }
	        return new ResponseEntity<>(or.addOrder(order), HttpStatus.CREATED);
	    }

}
