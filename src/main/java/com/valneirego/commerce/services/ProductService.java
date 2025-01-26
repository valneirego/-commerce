package com.valneirego.commerce.services;


import com.valneirego.commerce.dto.ProductDTO;
import com.valneirego.commerce.entities.Product;
import com.valneirego.commerce.repositories.ProductRepository;
import com.valneirego.commerce.services.exeptions.DatabaseException;
import com.valneirego.commerce.services.exeptions.ResouceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findByID(Long id) {

        Product product = repository.findById(id).orElseThrow(() -> new ResouceNotFoundException("Recurso não encontrado"));
        return new ProductDTO(product);
    }

    @Transactional(readOnly = true)
    public Page<ProductDTO> findAll(Pageable pageable) {
        Page<Product> result = repository.findAll(pageable);
        return result.map(x -> new ProductDTO(x));
    }


    @Transactional
    public ProductDTO insert(ProductDTO dto) {
        Product entity = new Product();

        copyDtoToEntity(dto, entity);

        repository.save(entity);

        return new ProductDTO(entity);
    }


    public ProductDTO update(Long id, ProductDTO dto) {

        try {

            Product entity = repository.getReferenceById(id);

            copyDtoToEntity(dto, entity);

            repository.save(entity);

            return new ProductDTO(entity);
        }

        catch (EntityNotFoundException e){
            throw new ResouceNotFoundException("Recurso não encontrado");
        }

    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public void delete (Long id) {
        if(!repository.existsById(id)){
            throw new ResouceNotFoundException("Recurso não encontrado");
        }

        try {
            repository.deleteById(id);
        }
        catch (DataIntegrityViolationException e){
            throw new DatabaseException("Falha de intgidade refereincial");
        }


    }

    private static void copyDtoToEntity(ProductDTO dto, Product entity) {
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setPrice(dto.getPrice());
        entity.setImgUrl(dto.getImgUrl());
    }


}



