package com.app.nile.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.nile.model.Product;

public interface ProductJpaRepo extends JpaRepository<Product, Long>{

}
