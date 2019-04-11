package com.ing.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.dto.ProductGroupDto;
import com.ing.model.ProductGroup;
import com.ing.repository.ProductGroupRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductGroupRepository productGroupRepository;

	@Override
	public List<ProductGroup> getAllProducts() {
		return productGroupRepository.findAll();
	}

	@Override
	public List<ProductGroupDto> getProductGroup() {
		
		List<ProductGroupDto> overViewList = new ArrayList<>();
		
		ProductGroupDto productGroupDto = new ProductGroupDto();
		
		List<ProductGroup> result = productGroupRepository.findAll();

		if (result != null) {

			result.stream().forEach(group -> {
				productGroupDto.setProductGroupId(group.getProductGroupId());
				productGroupDto.setProductGroupName(group.getProductGroupName());
				int count = group.getProduct() != null ? group.getProduct().size() : 0;
				productGroupDto.setProductGroupCount(count);
				overViewList.add(productGroupDto);
			});
		}

		return overViewList;
	}

}
