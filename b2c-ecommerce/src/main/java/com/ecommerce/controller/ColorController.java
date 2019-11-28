package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.Color;
import com.ecommerce.service.ColorService;

@RestController
@RequestMapping("/api/colors")
public class ColorController {
	@Autowired
	ColorService colorService;

	@GetMapping
	public ResponseEntity<List<Color>> findAll() {
		List<Color> list = colorService.findAll();
		return new ResponseEntity<List<Color>>(list, new HttpHeaders(), HttpStatus.OK);
	}
}