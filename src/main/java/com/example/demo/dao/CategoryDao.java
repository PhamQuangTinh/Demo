package com.example.demo.dao;

import com.example.demo.domain.CategoryEntity;
import com.example.demo.dto.CategoryDTO;
import com.example.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoryDao {

    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryEntity addNewCategoryDao(CategoryDTO categoryDTO){
        return categoryRepository.saveAndFlush(CategoryDTO.transferObject(categoryDTO, CategoryEntity.class));
    }

    public List<CategoryDTO> findCategoryByName(String name) {
        List<CategoryEntity> listEntity = categoryRepository.findByCategoryNameQuery(name);
        return listEntity.stream().map(x-> CategoryDTO.transferObject(x,CategoryDTO.class)).collect(Collectors.toList());

    }
}
