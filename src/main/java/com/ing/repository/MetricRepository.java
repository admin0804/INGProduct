package com.ing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.model.Metric;

@Repository
public interface MetricRepository extends JpaRepository<Metric, Long>{
	
	public Metric findByGroupId(long id);

}
