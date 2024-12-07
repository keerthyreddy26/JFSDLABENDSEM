package com.klef.jfsd.exam.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	    @Id
	    @Column(name = "order_id", nullable = false, unique = true)
	    private String orderId;

	    @Column(name = "product_name", nullable = false)
	    private String productName;

	    @Column(name = "quantity", nullable = false)
	    private int quantity;

	    @Column(name = "order_date", nullable = false)
	    private LocalDate orderDate;

	    @Column(name = "customer_name", nullable = false)
	    private String customerName;

	    // Getters and Setters
	    public String getOrderId() {
	        return orderId;
	    }

	    public void setOrderId(String orderId) {
	        this.orderId = orderId;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    public void setProductName(String productName) {
	        this.productName = productName;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }

	    public LocalDate getOrderDate() {
	        return orderDate;
	    }

	    public void setOrderDate(LocalDate orderDate) {
	        this.orderDate = orderDate;
	    }

	    public String getCustomerName() {
	        return customerName;
	    }

	    public void setCustomerName(String customerName) {
	        this.customerName = customerName;
	    }
	}
