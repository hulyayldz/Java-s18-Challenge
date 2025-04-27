package com.workintech.s18challenge.controller;

import com.workintech.s18challenge.entity.Book;
import com.workintech.s18challenge.entity.Category;
import com.workintech.s18challenge.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/categories")
public class CategoryController {

    private CategoryService categoryService;


    @GetMapping
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Category findById(@PathVariable Long id) {
        return categoryService.findById(id);
    }

    @PostMapping
    public Category save(Category category) {
        return categoryService.save(category);
    }

    @PutMapping(path = "/{id}")
    public Category update(@RequestBody Category category, Long id) {
        return categoryService.update(category, id);
    }

    @DeleteMapping(path = "/{id}")
    public Category delete(@PathVariable Long id) {
        return categoryService.delete(id);
    }
}
