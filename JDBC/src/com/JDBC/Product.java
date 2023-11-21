package com.JDBC;

public class Product {
	public int prodID;
	String prodName;
	int price;
	int quantity;
	int discount;
	
	public Product(int prodID, String prodName, int price, int quantity, int discount) {
		this.prodID = prodID;
		this.prodName = prodName;
		this.price = price;
		this.quantity = quantity;
		this.discount = discount;
	}
	
	public int getProdID() {
		return prodID;
	}
	public void setProdID(int prodID) {
		this.prodID = prodID;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}

}
