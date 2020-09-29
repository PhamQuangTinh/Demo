package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO extends MainDTO<ProductDTO> {
    private Long id;

    private String productName;

    private double unitPrice;

    private Long categoryId;

}
