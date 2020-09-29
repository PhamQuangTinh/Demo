package com.example.demo.response;

import com.example.demo.dto.ProductDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductOrderDetailRes {
    private ProductDTO productDTO;
    private int qty;
}
