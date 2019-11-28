package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.Color;

@Repository
public interface ColorRepository 
        extends JpaRepository<Color, Integer> {
}
