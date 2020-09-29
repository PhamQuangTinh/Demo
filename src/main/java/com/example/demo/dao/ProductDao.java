package com.example.demo.dao;

import com.example.demo.domain.CategoryEntity;
import com.example.demo.domain.ProductEntity;
import com.example.demo.dto.ProductDTO;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class ProductDao {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    public ProductEntity addNewProductDao(ProductDTO productDTO){
        CategoryEntity categoryEntity = categoryRepository.findById(productDTO.getCategoryId()).orElse(null);
        if(categoryEntity != null){
            ProductEntity productEntity = ProductDTO.transferObject(productDTO, ProductEntity.class);
            productEntity.setId(null);
            return productRepository.saveAndFlush(productEntity);
        }
        return null;

    }

    public List<ProductDTO> findByProductName(String name) {
        List<ProductEntity> listProducts = productRepository.findByProductNameContaining(name);
        return listProducts.stream().map(x->ProductDTO.transferObject(x,ProductDTO.class)).collect(Collectors.toList());


    }
}
