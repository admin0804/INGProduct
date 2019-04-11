package com.ing.service;

import java.util.List;

import com.ing.dto.MetricDto;
import com.ing.model.Metric;

public interface MetricService {

	public List<MetricDto> getMetrics();
}
