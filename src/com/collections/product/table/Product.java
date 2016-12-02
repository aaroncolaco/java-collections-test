package com.collections.product.table;

public class Product {
	private int productId;
	private String productName;
	
	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	
	public Product() {
		this.productId = 0;
		this.productName = null;
	}
	
}
