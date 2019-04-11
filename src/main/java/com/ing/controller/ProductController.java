package com.ing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ing.dto.ProductDto;
import com.ing.dto.ProductGroupDto;
import com.ing.model.ProductGroup;
import com.ing.service.ProductService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class ProductController {
	
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
	
	@GetMapping("/productGroups")
	public ResponseEntity<List<ProductGroupDto>> getProductGroups() {
		return new ResponseEntity<List<ProductGroupDto>>(productService.getProductGroup(), HttpStatus.OK);
	}

	@GetMapping("/products")
	public ResponseEntity<List<ProductDto>> getProducts(@RequestParam(value = "id") int groupId) {
		return new ResponseEntity<List<ProductDto>>(productService.getProduct(groupId), HttpStatus.OK);
	}


}
