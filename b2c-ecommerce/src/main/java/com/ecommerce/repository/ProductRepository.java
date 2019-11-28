package com.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query("SELECT p FROM Product p JOIN FETCH p.color JOIN FETCH p.brand WHERE p.colorId = :colorId")
	List<Product> findByColorId(@Param(value = "colorId") Integer colorId);

	@Query("SELECT p FROM Product p JOIN FETCH p.color JOIN FETCH p.brand WHERE p.brandId = :brandId")
	List<Product> findByBrandId(@Param(value = "brandId") Integer brandId);
	
	List<Product> findBySize(String actualvalue);
}
