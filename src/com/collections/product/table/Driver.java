package com.collections.product.table;

public class Driver {

	public static void main(String[] args) {
		Product[] products = new Product[10];
		
		// to test - true, true, true, false, false
		int[] productNames = { 1002, 1005, 1008, 100, 10 };
		
		ProductTable productTable = new ProductTable();
		
		for (int i = 0; i < 10; i++) {
			products[i] = new Product(1000 +i, "Product : " + 100 + i);

			productTable.addProduct(products[i]);
		}
		for (int i : productNames) {
			System.out.println(productTable.searchProduct(i));
		}
	}

}
