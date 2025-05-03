package com.project.Ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Ecommerce.model.Product;
import com.project.Ecommerce.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private ProductService productservice;
	
	@GetMapping("/products")
	public  ResponseEntity<List<Product>>  getProduct() {
		return new ResponseEntity<>(productservice.getAllProducts(),HttpStatus.OK);
	}

}
