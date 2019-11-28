package com.ecommerce.service;

import java.util.List;

import com.ecommerce.entity.Product;

public interface ProductService {
	List<Product> findAll();
	List<Product> getProducts(String groupbyvalue, String actualvalue);
}
