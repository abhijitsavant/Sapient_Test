package com.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.Brand;
import com.ecommerce.repository.BrandRepository;

@Service
public class BrandServiceImpl implements BrandService {
	
	@Autowired
	BrandRepository brandRepository;

	@Override
	public List<Brand> findAll() {
		return brandRepository.findAll();
	}

}
