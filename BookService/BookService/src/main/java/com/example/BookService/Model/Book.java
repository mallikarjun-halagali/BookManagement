package com.example.BookService.Model;

import lombok.Data;

@Data
public class Book {
    private long id;
    private String title;
    private String author;
    private String isbn;
    private String price;
    private String coverUrl;
    private String publishedDate;
    private String description;
}
