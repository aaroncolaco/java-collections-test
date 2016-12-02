package com.collections.product.table;

import java.util.Hashtable;

public class ProductTable {
	private Hashtable<Integer, String> productHashTable = new Hashtable<>();
	
	public void addProduct(Product product) {
		productHashTable.put(product.getProductId(), product.getProductName());
	}
	
	
	public boolean searchProduct(int productId) {
		if (productHashTable.containsKey((Integer) productId)) {
			return true;
		}
		return false;
	}
	
	
	public boolean deleteProduct(int productId) {
		if (productHashTable.containsKey((Integer) productId)) {
			productHashTable.remove((Integer) productId);
			return true;
		}
		return false;
	}
}
