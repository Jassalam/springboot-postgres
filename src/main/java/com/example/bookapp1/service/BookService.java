package com.example.bookapp1.service;

import com.example.bookapp1.model.Book;
import com.example.bookapp1.respository.BookRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRespository bookRespository;

    public List<Book> findAll() {
        return bookRespository.findAll();
    }

    public Optional<Book> findById(Long id) {
        return bookRespository.findById(id);
    }

    public Book save(Book book) {
        return bookRespository.save(book);
    }

    public void deleteById(Long id) {
        bookRespository.deleteById(id);
    }

    public List<Book> findByTitle(String title) {
        return bookRespository.findByTitle(title);
    }


}
