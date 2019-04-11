package com.ing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.model.Metric;
import com.ing.repository.MetricRepository;

@Service
public class MetricServiceImpl {
	
	@Autowired
	private MetricRepository metricRepository;

	public List<Metric> updateMetrics(long id) {
		
		return null ; //metricRepository.save();
	}

}
