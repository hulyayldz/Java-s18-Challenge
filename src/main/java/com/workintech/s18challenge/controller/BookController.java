package com.workintech.s18challenge.controller;

import com.workintech.s18challenge.entity.Book;
import com.workintech.s18challenge.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/books")
public class BookController {

    private BookService bookService;


    @GetMapping
    public List<Book> findAll() {
        return bookService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Book findById(@PathVariable Long id) {
        return bookService.findById(id);
    }

    @PostMapping
    public Book save(@RequestBody Book book) {
        return bookService.save(book);
    }

    @PutMapping(path = "/{id}")
    public Book update(@RequestBody Book book, @PathVariable Long id) {
        return bookService.update(book, id);
    }

    @DeleteMapping(path = "/{id}")
    public Book delete(@PathVariable Long id) {
        return bookService.delete(id);
    }


}
