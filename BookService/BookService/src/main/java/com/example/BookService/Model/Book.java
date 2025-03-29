package com.example.BookService.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "books" , uniqueConstraints = @UniqueConstraint(columnNames = "isbn"))
@Builder
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Size(min = 1, max = 255)
    private String title;


    @NotBlank
    @Size(min = 1, max = 255)
    private String author;


    @NotBlank
    @Pattern(regexp = "^(97(8|9))?\\d{9}(\\d|X)$", message = "Invalid ISBN format")
    private String isbn;

    private BigDecimal price;
    @Pattern(regexp = "^(http|https)://.*$", message = "Invalid URL format")
    private String coverUrl;

    @NotNull
    @DecimalMin(value = "0.0", inclusive = false)
    private LocalDate publishedDate;
    @Size(max = 2000)
    private String description;

}
