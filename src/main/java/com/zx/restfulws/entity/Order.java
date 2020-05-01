package com.zx.restfulws.entity;

import java.util.ArrayList;

public class Order  implements Cloneable   {
	
	private Long id;
	private String code;
	private Long cusId;
	private String date;
	private ArrayList<OrderItem> orderItems;
	
	public ArrayList<OrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(ArrayList<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Long getCusId() {
		return cusId;
	}
	public void setCusId(Long cusId) {
		this.cusId = cusId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public Object clone(){
		Order order = null;  
        try{  
        	order = (Order)super.clone();  
        }catch(CloneNotSupportedException e) {  
            e.printStackTrace();  
        }  
        return order;  
	}
}
