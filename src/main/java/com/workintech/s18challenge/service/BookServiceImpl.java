package com.workintech.s18challenge.service;

import com.workintech.s18challenge.entity.Book;
import com.workintech.s18challenge.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new RuntimeException("The book with given id is not exist"));
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book update(Book book, Long id) {
        book.setId(id);
        return bookRepository.save(book);
    }

    @Override
    public Book delete(Long id) {
        var b = findById(id);
        bookRepository.deleteById(id);
        return b;
    }


}
