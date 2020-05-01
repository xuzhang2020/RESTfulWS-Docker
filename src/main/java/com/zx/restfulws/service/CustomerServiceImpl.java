package com.zx.restfulws.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.restfulws.entity.Customer;
import com.zx.restfulws.entity.Order;
import com.zx.restfulws.entity.OrderItem;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	JsonService jsonService;
	
	@Override
	public Customer getById(Long id) {
		Customer customer = null;
		for(Customer c : jsonService.getJsonData().customers){
			if(c.getId() == id){
				customer = c;
				break;
			}
		}
		
		return customer;
	}

	@Override
	public ArrayList<Customer> getList() {
		ArrayList<Customer> customers = new ArrayList<>();

		jsonService.getJsonData().customers.forEach(o->{
			customers.add((Customer)o.clone());
		});
		
		return customers;
	}

}
