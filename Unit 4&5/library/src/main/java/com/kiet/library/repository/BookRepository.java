package com.kiet.library.repository;

import com.kiet.library.model.Book;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {

    private final JdbcTemplate jdbcTemplate;

    public BookRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Book> findAll() {

        String sql = "SELECT * FROM book";

        RowMapper<Book> rowMapper = new RowMapper<Book>() {

            @Override
            public Book mapRow(java.sql.ResultSet rs, int rowNum)
                    throws java.sql.SQLException {

                Book book = new Book();

                book.setId(rs.getLong("id"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setCategory(rs.getString("category"));
                book.setPublicationYear(rs.getInt("publication_year"));
                book.setAvailable(rs.getBoolean("available"));

                return book;
            }
        };

        return jdbcTemplate.query(sql, rowMapper);
    }

    public Book findById(Long id) {

        String sql = "SELECT * FROM book WHERE id = ?";

        RowMapper<Book> rowMapper = new RowMapper<Book>() {

            @Override
            public Book mapRow(java.sql.ResultSet rs, int rowNum)
                    throws java.sql.SQLException {

                Book book = new Book();

                book.setId(rs.getLong("id"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setCategory(rs.getString("category"));
                book.setPublicationYear(rs.getInt("publication_year"));
                book.setAvailable(rs.getBoolean("available"));

                return book;
            }
        };

        List<Book> books = jdbcTemplate.query(sql, rowMapper, id);

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