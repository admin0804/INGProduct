package com.ing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
