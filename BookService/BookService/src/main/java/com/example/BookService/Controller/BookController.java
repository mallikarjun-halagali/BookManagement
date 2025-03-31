package com.example.BookService.Controller;

import com.example.BookService.Model.Book;
import com.example.BookService.Model.Response;
import com.example.BookService.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/books")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping()
    public Response addBook(@RequestBody Book book){
        Book savedBook = bookService.addBook(book);
        Response resp = new Response();
        resp.setBook(savedBook);
        resp.setResult("SUCCESS");
//        resp.set
        return resp;
    }
    @GetMapping()
    public Response getAll(){

        Response resp = new Response();
        resp.setBookList(bookService.getAll());
        resp.setResult("SUCCESS");


        return resp;
    }
    @GetMapping("{id}")
    public Response getBook(@PathVariable long id){

        Response resp = new Response();
        resp.setBook(bookService.getBookById(id));
        resp.setResult("SUCCESS");

        return resp;
    }

    @PutMapping("/{id}")
    public Response updateBook(@PathVariable long id){
        return null;
    }
    @DeleteMapping("{id}")
    public Response deleteBook(@PathVariable long id){
        Response resp = new Response();
        bookService.deleteBook(id);
        resp.setResult("SUCCESS");
        return resp;
    }



//
}
