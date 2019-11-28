package com.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.ProductCategory;
import com.ecommerce.repository.ProductCategoryRepository;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
	
	@Autowired
	ProductCategoryRepository productCategoryRepository;

	@Override
	public List<ProductCategory> findAll() {
		return productCategoryRepository.findAll();
	}

}
