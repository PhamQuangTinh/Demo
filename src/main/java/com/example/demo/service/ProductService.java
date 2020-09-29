package com.example.demo.service;

import com.example.demo.dao.ProductDao;
import com.example.demo.domain.ProductEntity;
import com.example.demo.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductDao productDao;

    public ProductEntity addNewProductService(ProductDTO productDTO){
        return productDao.addNewProductDao(productDTO);
    }

    public List<ProductDTO> findByProductName(String name) {
        return productDao.findByProductName(name);
    }
}
