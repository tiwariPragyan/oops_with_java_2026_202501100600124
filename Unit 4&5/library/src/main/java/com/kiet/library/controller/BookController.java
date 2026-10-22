package com.kiet.library.controller;

import com.kiet.library.model.Book;
import com.kiet.library.service.BookService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks() {

        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getBookById(@PathVariable Long id) {

        try {

            return ResponseEntity.ok(
                    bookService.getBookById(id)
            );

        } catch (RuntimeException e) {

            return ResponseEntity
                    .status(404)
                    .body("{\"message\":\"Book not found\"}");
        }
    }

    @PostMapping
    public ResponseEntity<Book> addBook(
            @RequestBody Book book) {

        return ResponseEntity.ok(
                bookService.addBook(book)
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateBook(
            @PathVariable Long id,
            @RequestBody Book book) {

        try {

            return ResponseEntity.ok(
                    bookService.updateBook(id, book)
            );

        } catch (RuntimeException e) {

            return ResponseEntity
                    .status(404)
                    .body("{\"message\":\"Book not found\"}");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBook(
            @PathVariable Long id) {

        try {

            return ResponseEntity.ok(
                    bookService.deleteBook(id)
            );

        } catch (RuntimeException e) {

            return ResponseEntity
                    .status(404)
                    .body("{\"message\":\"Book not found\"}");
        }
    }
}