package com.grocerry.services;

import java.util.List;

import com.grocerry.model.Category;
import com.grocerry.model.Product;


public interface ProductService {

	List<Product> getAllProducts();
	Product getProduct(int id);
	void deleteProduct(int id);
	List<Category> getAllCategories();
	void saveOrUpdateProduct(Product product);
}
