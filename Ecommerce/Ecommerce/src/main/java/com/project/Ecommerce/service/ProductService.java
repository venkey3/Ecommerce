package com.project.Ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Ecommerce.model.Product;
import com.project.Ecommerce.repo.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productrepo;

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productrepo.findAll();
	}

}
