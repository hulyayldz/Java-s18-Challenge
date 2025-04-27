package com.workintech.s18challenge.service;

import com.workintech.s18challenge.entity.Author;

import java.util.List;

public interface AuthorService {
    Author findById(Long id);

    List<Author> findAll();

    Author save(Author author);

    Author update(Author author, Long id);

    Author delete(Long id);


}
