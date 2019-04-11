package com.ing.service;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.dto.MetricDto;
import com.ing.dto.ProductGroupDto;
import com.ing.model.Metric;
import com.ing.model.Product;
import com.ing.repository.MetricRepository;

@Service
public class MetricServiceImpl implements MetricService {
	
	@Autowired
	MetricRepository metricRepository;
	
	public List<MetricDto> getMetrics(){
		
		List<MetricDto> metricDtoList = new ArrayList<>();
		
		MetricDto metricDto = new MetricDto();
		
		List<Metric> metric = metricRepository.findAll();
		
		Type listType = new TypeToken<List<Metric>>() {}.getType();
		
		ModelMapper modelMapper = new ModelMapper();
		
		metricDtoList = modelMapper.map(metric, listType);
		
		return metricDtoList;
	}

}
