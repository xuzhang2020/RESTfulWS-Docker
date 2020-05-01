package com.zx.restfulws.service;

import java.util.ArrayList;

import com.zx.restfulws.entity.Customer;
import com.zx.restfulws.entity.Order;

public interface OrderService {

	ArrayList<Order> getOrderList(Customer customer);
	
	Order getOrder(Customer customer, Long orderId);
}
