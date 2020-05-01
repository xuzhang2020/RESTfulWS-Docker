package com.zx.restfulws;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zx.restfulws.entity.Customer;
import com.zx.restfulws.entity.JsonData;
import com.zx.restfulws.entity.Order;
import com.zx.restfulws.entity.OrderItem;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JsonTest {
	
	@Test
	public void test() throws IOException{
		/*
		JsonData datas = new JsonData();
		datas.customers = new ArrayList<>();
		datas.orders = new ArrayList<>();
		datas.orderItems = new ArrayList<>();
		
		Customer c1 = new Customer();
		c1.setId(1L);
		c1.setName("Jason");
		datas.customers.add(c1);
		
		c1 = new Customer();
		c1.setId(2L);
		c1.setName("Jack");
		datas.customers.add(c1);		
		
		c1 = new Customer();
		c1.setId(3L);
		c1.setName("Mason");
		datas.customers.add(c1);		
		
		c1 = new Customer();
		c1.setId(4L);
		c1.setName("John");
		datas.customers.add(c1);
		
		c1 = new Customer();
		c1.setId(5L);
		c1.setName("Fei Li");
		datas.customers.add(c1);
		
		
		Order order = new Order();
		order.setId(1L);
		order.setCusId(c1.getId());
		order.setCode("O0000001");
		order.setDate("2020-4-27 13:00:00");
		datas.orders.add(order);
		
		OrderItem item = new OrderItem();
		item.setId(1L);
		item.setItemCode("I0000001");
		item.setItemName("Water");
		item.setOrderId(order.getId());
		item.setPrice(10d);
		item.setQuantity(1L);
		datas.orderItems.add(item);
		
		   
        ObjectMapper objectMapper = new ObjectMapper();
        
        System.out.println(objectMapper.writeValueAsString(datas));
		    
        JsonData datas2 = new JsonData();
        datas2 = objectMapper.readValue("{\"customers\":[{\"id\":1,\"name\":\"Jason\"}],\"orders\":[{\"id\":1,\"code\":\"O0000001\",\"cusId\":1,\"date\":\"2020-4-27 13:00:00\"}],\"orderItems\":[{\"id\":1,\"orderId\":1,\"itemName\":\"Water\",\"itemCode\":\"I0000001\",\"price\":10.0,\"quantity\":1}]}", JsonData.class);
        System.out.println(datas2);
        */
	}
}
