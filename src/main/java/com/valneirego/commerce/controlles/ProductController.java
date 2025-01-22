package com.valneirego.commerce.controlles;
import com.valneirego.commerce.dto.ProductDTO;
import com.valneirego.commerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


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

    @PostMapping
    public  ProductDTO insert (@RequestBody ProductDTO dto){
        return service.insert(dto);
    }
}