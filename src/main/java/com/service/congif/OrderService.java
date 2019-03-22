package com.service.congif;

import java.util.List;

import com.fifth.day.Order;

public interface OrderService {

	public Order buyOrder(Order order);

	public boolean sellOrder(Order order);

	public List<Order> handleOrders(List<Order> orders);
}
