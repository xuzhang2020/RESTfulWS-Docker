package com.zx.restfulws.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.restfulws.entity.Customer;
import com.zx.restfulws.entity.Order;
import com.zx.restfulws.entity.OrderItem;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	JsonService jsonService;
	
	@Override
	public ArrayList<Order> getOrderList(Customer customer) {
		if(customer == null){
			return null;
		}
		
		ArrayList<Order> orders = new ArrayList<>();
		
		jsonService.getJsonData().orders.forEach(o->{
			if(o.getCusId() == customer.getId()){
				Order order = (Order)o.clone();
				ArrayList<OrderItem> orderItems = new ArrayList<>();
				jsonService.getJsonData().orderItems.forEach(i->{
						if(i.getOrderId() == order.getId()){
							orderItems.add((OrderItem)i.clone());
						}
					}
				);
				order.setOrderItems(orderItems);
				orders.add(order);
			}
		});
		
		return orders;
	}

	@Override
	public Order getOrder(Customer customer, Long orderId) {
		if(customer == null || orderId == null){
			return null;
		}
		ArrayList<Order> orders = new ArrayList<>();
		ArrayList<OrderItem> orderItems = new ArrayList<>();
		
		Order order = null;
		for(Order o : jsonService.getJsonData().orders){
			if( o.getCusId() == customer.getId() &&  o.getId() == orderId){
				order = (Order)o.clone();
				jsonService.getJsonData().orderItems.forEach(i->{
						if(i.getOrderId() == o.getId()){
							orderItems.add((OrderItem)i.clone());
						}
					}
				);
				order.setOrderItems(orderItems);
				break;
			}
		}
		return order;
	}

}
