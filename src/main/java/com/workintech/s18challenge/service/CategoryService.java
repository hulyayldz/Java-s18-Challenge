package com.workintech.s18challenge.service;

import com.workintech.s18challenge.entity.Category;

import java.util.List;

public interface CategoryService {

    Category findById(Long id);

    Category save(Category category);

    List<Category> findAll();

    Category update(Category category, Long id);

    Category delete(Long id);
}
