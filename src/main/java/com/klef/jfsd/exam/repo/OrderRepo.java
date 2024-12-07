package com.klef.jfsd.exam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.exam.model.Order;

public interface OrderRepo extends JpaRepository<Order, String>{

}
