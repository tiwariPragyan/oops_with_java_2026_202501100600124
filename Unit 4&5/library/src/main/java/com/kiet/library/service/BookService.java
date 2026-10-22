package com.kiet.library.service;

import com.kiet.library.model.Book;
import com.kiet.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {

        Book book = bookRepository.findById(id);

        if (book == null) {
            throw new RuntimeException("Book not found");
        }

        return book;
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }


    public Book updateBook(Long id, Book book) {

        int result = bookRepository.update(id, book);

        if (result == 0) {
            throw new RuntimeException("Book not found");
        }

        book.setId(id);

        return book;
    }

    public String deleteBook(Long id) {

        int result = bookRepository.delete(id);

        if (result == 0) {
            throw new RuntimeException("Book not found");
        }

        return "Book deleted successfully";
    }
}