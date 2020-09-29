package com.example.demo.rest;

import com.example.demo.dao.ProductDao;
import com.example.demo.dto.ProductDTO;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductRest {

    @Autowired
    private ProductService productService;

    @PostMapping("/post/add_new_product")
    public ResponseEntity<?> addNewProductController(@RequestBody ProductDTO productDTO){
        return ResponseEntity.ok(productService.addNewProductService(productDTO));
    }

    @GetMapping("/get/find_by_product_name")
    public ResponseEntity<?> findProductByProductName(@RequestParam("name") String name){
        return ResponseEntity.ok(productService.findByProductName(name));
    }

}
