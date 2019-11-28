package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.Product;
import com.ecommerce.exception.B2CException;
import com.ecommerce.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	@Autowired
	ProductService productService;

	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> products = productService.findAll();
		if(products==null || products.isEmpty()) 
			throw new B2CException("Product not found!");
			
		return new ResponseEntity<List<Product>>(products, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/filter/{filter}/{value}")
	public ResponseEntity<List<Product>> getProducts(@PathVariable String filter,
			@PathVariable String value) {
		List<Product> products = productService.getProducts(filter, value);
		if(products==null || products.isEmpty()) 
			throw new B2CException("Product not found!");
		
		return new ResponseEntity<List<Product>>(products,
				new HttpHeaders(), HttpStatus.OK);
	}

}