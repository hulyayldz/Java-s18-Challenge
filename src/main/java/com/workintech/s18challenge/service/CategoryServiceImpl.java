package com.workintech.s18challenge.service;

import com.workintech.s18challenge.entity.Category;
import com.workintech.s18challenge.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    @Override
    public Category findById(Long id) {
        return categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category with given id is not exist"));
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category update(Category category, Long id) {
        category.setId(id);
        return categoryRepository.save(category);
    }

    @Override
    public Category delete(Long id) {
        var c = findById(id);
        categoryRepository.deleteById(id);
        return c;
    }
}
