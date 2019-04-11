package com.ing.service;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.dto.ProductDto;
import com.ing.dto.ProductGroupDto;
import com.ing.model.Metric;
import com.ing.model.Product;
import com.ing.model.ProductGroup;
import com.ing.repository.MetricRepository;
import com.ing.repository.ProductGroupRepository;
import com.ing.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductGroupRepository productGroupRepository;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private MetricRepository metricRepository;
	
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
		
		Metric metric = metricRepository.findByGroupId(0);
		
		metric.setVisitCount(metric.getVisitCount()+1);
		
		metricRepository.save(metric);
		
		return overViewList;
	}
	
	@Override
	public List<ProductDto> getProduct(long groupId) {
		
		List<ProductDto> productList = new ArrayList<>();
		
		//ProductDto productDto = new ProductDto();
		
		List<Product> product = productRepository.findByProductGroupId(groupId);

		Type listType = new TypeToken<List<Product>>() {}.getType();
		
		ModelMapper modelMapper = new ModelMapper();
		
		productList = modelMapper.map(product, listType);
		
		Metric metric = metricRepository.findByGroupId(groupId);
		if(metric != null) {
			metric.setVisitCount(metric.getVisitCount()+1);
		}
		
		metricRepository.save(metric);
		
		return productList;
	}

}
