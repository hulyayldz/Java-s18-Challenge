package com.workintech.s18challenge.service;

import com.workintech.s18challenge.entity.Author;
import com.workintech.s18challenge.repository.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AuthorServiceImpl implements AuthorService {
    private AuthorRepository authorRepository;

    @Override
    public Author findById(Long id) {
        return authorRepository.findById(id).orElseThrow(() -> new RuntimeException("Category with given id is not exist"));
    }

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public Author save(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Author update(Author author, Long id) {
        author.setId(id);
        return authorRepository.save(author);
    }

    @Override
    public Author delete(Long id) {
        var a = findById(id);
        authorRepository.deleteById(id);
        return a;
    }
}
