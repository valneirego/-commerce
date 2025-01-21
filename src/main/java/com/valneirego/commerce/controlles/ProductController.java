package com.valneirego.commerce.controlles;


import com.valneirego.commerce.dto.ProductDTO;
import com.valneirego.commerce.entities.Product;
import com.valneirego.commerce.repositories.ProductRepository;
import com.valneirego.commerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "products")

public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}")
    public ProductDTO  findById(@PathVariable Long id){

        return  service.findByID(id);


    }
}
