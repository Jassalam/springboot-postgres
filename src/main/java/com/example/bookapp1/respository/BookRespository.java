package com.example.bookapp1.respository;

import com.example.bookapp1.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRespository extends JpaRepository<Book, Long> {
    List<Book> findByTitle(String title);

}
