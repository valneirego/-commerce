package com.valneirego.commerce.dto;

import com.valneirego.commerce.entities.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imgUrl;

    public ProductDTO() {

    }

    public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product entity) {

        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        imgUrl = entity.getImgUrl();

    }


}
