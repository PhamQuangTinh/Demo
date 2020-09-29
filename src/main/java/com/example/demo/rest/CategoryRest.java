package com.example.demo.rest;

import com.example.demo.domain.CategoryEntity;
import com.example.demo.dto.CategoryDTO;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/category")
public class CategoryRest {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/post/add_new_category")
    public ResponseEntity<?> addNewCategoryController(@RequestBody CategoryDTO categoryDTO){
        return ResponseEntity.ok(categoryService.addNewCategoryService(categoryDTO));
    }

    @GetMapping("/get/find_by_category_name")
    public ResponseEntity<?> findCategoryByName(@RequestParam("name") String name){
        return ResponseEntity.ok(categoryService.findCategoryByName(name));
    }
}
