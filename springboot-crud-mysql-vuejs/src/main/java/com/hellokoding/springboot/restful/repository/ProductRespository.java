package com.hellokoding.springboot.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hellokoding.springboot.restful.product.Product;

@Repository
public interface ProductRespository extends JpaRepository<Product, Long> {
}
