package com.example.e_commerce.dto;

import com.example.e_commerce.document.Product;
import com.example.e_commerce.model.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    public ProductDto(Product entity){
        this.id = entity.getId();
        this.name = entity.getName();
        this.description = entity.getDescription();
        this.price = entity.getPrice();
        this.color = entity.getColor();
        this.size = entity.getSize();
        this.manifacture = entity.getManifacture();
        this.merchent = entity.getMerchent();
        this.stock = entity.getStock();
        this.isOffered = entity.getIsOffered();
        this.offer = entity.getOffer();

    }
    private String id;
    private String name;
    private String description;
    private Float price;
    private String color;
    private Size size;
    private String manifacture;
    private String merchent;
    private Integer stock;
    private Boolean isOffered;
    private Float offer;
    private String manifactureName;
    private String merchantName;


}
