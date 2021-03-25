package com.ibm.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ibm.demo.entity.Order;

@Service
public class OrderService {
	public String createOrder(Order order) {
		return "order created";

	}

	public Order getOrder(int orderID) {
		return new Order();
	}

	public void updateOrder(int orderID) {
	}

	public void deleteOrder(int orderID) {
		System.out.println("order deleted");
	}

	public List<Order> getOrders() {
		return new ArrayList<Order>();
	}
}
