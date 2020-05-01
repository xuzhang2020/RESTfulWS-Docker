package com.zx.restfulws.service;

import java.util.ArrayList;

import com.zx.restfulws.entity.Customer;

public interface CustomerService {

	Customer getById(Long id);
	
	ArrayList<Customer> getList();
}
