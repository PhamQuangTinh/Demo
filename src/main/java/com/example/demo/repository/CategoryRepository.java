package com.example.demo.repository;

import com.example.demo.domain.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
    Optional<CategoryEntity> findById(Long id);

    @Query(value = "select c from CategoryEntity c where c.categoryName  = ?1")
    List<CategoryEntity> findByCategoryNameQuery(String name);

}
