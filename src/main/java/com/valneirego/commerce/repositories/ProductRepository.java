package com.valneirego.commerce.repositories;

import com.valneirego.commerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long> {


}
