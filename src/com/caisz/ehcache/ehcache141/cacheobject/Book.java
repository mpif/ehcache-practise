package com.caisz.ehcache.ehcache141.cacheobject;

public class Book {

	private int id;
	private String name;
	private int price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("id:[").append(id).append("],\r\n");
		sb.append("name:[").append(name).append("],\r\n");
		sb.append("price:[").append(price).append("],\r\n");
		return sb.toString();
	}
}
