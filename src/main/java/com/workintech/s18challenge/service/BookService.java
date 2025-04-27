package com.workintech.s18challenge.service;

import com.workintech.s18challenge.entity.Author;
import com.workintech.s18challenge.entity.Book;

import java.util.List;

public interface BookService {
    Book findById(Long id);

    List<Book> findAll();

    Book save(Book book);

    Book update(Book book, Long id);

    Book delete(Long id);
}
