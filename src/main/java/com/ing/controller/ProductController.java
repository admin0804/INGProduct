package com.ing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.model.ProductGroup;
import com.ing.service.ProductService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class ProductController {
	
	public static final String WELCOME = "Welcome to ING Product Applications";
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/overview")
	public ResponseEntity<List<ProductGroup>> getAllProducts(){
		List<ProductGroup> productGroups = productService.getAllProducts();
		if(null != productGroups) {
			return ResponseEntity.ok().body(productGroups);
			
		}else {
			return ResponseEntity.badRequest().build();
		}
	}
	
	
	@GetMapping("/overview")
	public ResponseEntity<List<ProductGroup>> getProductGroup(){
		List<ProductGroup> productGroups = productService.getAllProducts();
		if(null != productGroups) {
			return ResponseEntity.ok().body(productGroups);
			
		}else {
			return ResponseEntity.badRequest().build();
		}
	}
	

}
