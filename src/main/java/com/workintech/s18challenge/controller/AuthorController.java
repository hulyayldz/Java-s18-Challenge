package com.workintech.s18challenge.controller;

import com.workintech.s18challenge.entity.Author;
import com.workintech.s18challenge.service.AuthorService;
import com.workintech.s18challenge.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/authors")
public class AuthorController {

    private AuthorService authorService;


    @GetMapping
    public List<Author> findAll() {
        return authorService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Author findById(@PathVariable Long id) {
        return authorService.findById(id);
    }

    @PostMapping
    public Author save(@RequestBody Author book) {
        return authorService.save(book);
    }

    @PutMapping(path = "/{id}")
    public Author update(@RequestBody Author book, @PathVariable Long id) {
        return authorService.update(book, id);
    }

    @DeleteMapping(path = "/{id}")
    public Author delete(@PathVariable Long id) {
        return authorService.delete(id);
    }
}
