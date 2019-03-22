package com.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fifth.day.Order;

@Service
public class OrderServiceImpl implements OrderService {

	public Order buyOrder(Order order) {
		System.out.println("Order bought " + order.getOrderId());
		return order;
	}

	public boolean sellOrder(Order order) {
		System.out.println("Order sold" + order.getOrderId());
		return Boolean.TRUE;
	}

	public List<Order> handleOrders(List<Order> orders) {
		System.out.println("Order cannot be handled");
		throw new RuntimeException("cannot be handled");
	}

	public void print() {
		System.out.println("WRONG-WAY");

	}

}
