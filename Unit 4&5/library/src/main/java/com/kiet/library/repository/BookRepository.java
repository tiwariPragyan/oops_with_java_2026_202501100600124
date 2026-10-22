package com.kiet.library.repository;

import com.kiet.library.model.Book;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {

    private final JdbcTemplate jdbcTemplate;

    public BookRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // GET ALL BOOKS
    public List<Book> findAll() {

        String sql = "SELECT * FROM book";

        return jdbcTemplate.query(sql, (rs, rowNum) -> {

            Book book = new Book();

            book.setId(rs.getLong("id"));
            book.setTitle(rs.getString("title"));
            book.setAuthor(rs.getString("author"));
            book.setCategory(rs.getString("category"));
            book.setPublicationYear(rs.getInt("publication_year"));
            book.setAvailable(rs.getBoolean("available"));

            return book;
        });
    }

    public Book findById(Long id) {

        String sql = "SELECT * FROM book WHERE id = ?";

        List<Book> books = jdbcTemplate.query(sql,
                (rs, rowNum) -> {

                    Book book = new Book();

                    book.setId(rs.getLong("id"));
                    book.setTitle(rs.getString("title"));
                    book.setAuthor(rs.getString("author"));
                    book.setCategory(rs.getString("category"));
                    book.setPublicationYear(
                            rs.getInt("publication_year"));
                    book.setAvailable(
                            rs.getBoolean("available"));

                    return book;
                },
                id);

        if (books.isEmpty()) {
            return null;
        }

        return books.get(0);
    }
    public Book save(Book book) {

        String sql = """
                INSERT INTO book
                (title, author, category, publication_year, available)
                VALUES (?, ?, ?, ?, ?)
                """;

        jdbcTemplate.update(
                sql,
                book.getTitle(),
                book.getAuthor(),
                book.getCategory(),
                book.getPublicationYear(),
                book.isAvailable()
        );

        return book;
    }
    public int update(Long id, Book book) {

        String sql = """
                UPDATE book
                SET title = ?,
                    author = ?,
                    category = ?,
                    publication_year = ?,
                    available = ?
                WHERE id = ?
                """;

        return jdbcTemplate.update(
                sql,
                book.getTitle(),
                book.getAuthor(),
                book.getCategory(),
                book.getPublicationYear(),
                book.isAvailable(),
                id
        );
    }

    public int delete(Long id) {

        String sql = "DELETE FROM book WHERE id = ?";

        return jdbcTemplate.update(sql, id);
    }
}
