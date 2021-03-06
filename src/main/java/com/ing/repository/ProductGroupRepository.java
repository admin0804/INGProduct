package com.ing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.model.ProductGroup;

@Repository
public interface ProductGroupRepository extends JpaRepository<ProductGroup, Long>{

}
