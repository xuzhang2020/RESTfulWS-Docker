package com.zx.restfulws.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zx.restfulws.entity.Customer;
import com.zx.restfulws.entity.Order;
import com.zx.restfulws.service.CustomerService;
import com.zx.restfulws.service.OrderService;
import com.zx.restfulws.util.JsonResponse;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerSrv;
	
	@Autowired
	OrderService orderSrv;
	
	@RequestMapping("/")
    @ResponseBody
    public  JsonResponse getCustomerList() {
		ArrayList<Customer> customers = customerSrv.getList();
		return JsonResponse.success(customers);
    }
	
	@RequestMapping("/{id}")
    @ResponseBody
    public  JsonResponse getCustomer (@PathVariable Long id){
		Customer customer = customerSrv.getById(id);
		return JsonResponse.success(customer);
    }
	
	
	@RequestMapping("/{id}/orders")
    @ResponseBody
    public  JsonResponse getCustomerOrderList (@PathVariable Long id){
		Customer customer = customerSrv.getById(id);
		ArrayList<Order> orders = null;
		if(customer!=null){
			orders = orderSrv.getOrderList(customer);
		}
		return JsonResponse.success(orders);
    }
	
	@RequestMapping("/{id}/orders/{orderId}")
    @ResponseBody
    public  JsonResponse getCustomerOrder (@PathVariable Long id,@PathVariable Long orderId){
		Customer customer = customerSrv.getById(id);
		Order order = null;
		if(customer!=null && orderId != null){
			order = orderSrv.getOrder(customer, orderId);
		}
		return JsonResponse.success(order);
    }
}
