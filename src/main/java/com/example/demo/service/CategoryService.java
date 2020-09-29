package com.example.demo.service;

import com.example.demo.dao.CategoryDao;
import com.example.demo.domain.CategoryEntity;
import com.example.demo.dto.CategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    public CategoryEntity addNewCategoryService(CategoryDTO categoryDTO){
        return categoryDao.addNewCategoryDao(categoryDTO);
    }

    public List<CategoryDTO> findCategoryByName(String name) {
        return categoryDao.findCategoryByName(name);

    }
}
