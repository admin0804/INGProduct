package com.ing.service;

import java.util.List;

import com.ing.dto.ProductDto;
import com.ing.dto.ProductGroupDto;
import com.ing.model.ProductGroup;

public interface ProductService {
	
	public List<ProductGroup> getAllProducts();
	
	public List<ProductGroupDto> getProductGroup();
	
	public List<ProductDto> getProduct(long groupId);

}
