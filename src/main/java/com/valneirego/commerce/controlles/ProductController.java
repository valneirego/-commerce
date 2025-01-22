package com.valneirego.commerce.controlles;

import java.util.List;
import com.valneirego.commerce.dto.ProductDTO;

import com.valneirego.commerce.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "products")

public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}")
    public ProductDTO  findById(@PathVariable Long id){

        return  service.findByID(id);

    }

    @GetMapping
    public Page<ProductDTO> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }
}