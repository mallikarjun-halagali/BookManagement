package com.example.BookService.Service;

import com.example.BookService.Model.Book;
import com.example.BookService.Model.Response;
import com.example.BookService.Repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepo bookRepo;

    public Book addBook(Book book) {
        return bookRepo.save(book);
    }

    public Book getBookById(long id) {
        return bookRepo.findById(id).get();
    }

    public List<Book> getAll() {
        return bookRepo.findAll();
    }

    public void deleteBook(long id) {
        bookRepo.deleteById(id);
    }
}
