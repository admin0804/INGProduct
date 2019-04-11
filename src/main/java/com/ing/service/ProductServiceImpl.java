package com.ing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.model.ProductGroup;
import com.ing.repository.ProductGroupRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductGroupRepository productGroupRepository;

	@Override
	public List<ProductGroup> getAllProducts() {
		return productGroupRepository.findAll();
	}

}
