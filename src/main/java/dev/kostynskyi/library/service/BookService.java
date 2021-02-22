package dev.kostynskyi.library.service;

import dev.kostynskyi.library.domain.Book;
import dev.kostynskyi.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    // Crud methods
    public Book addBook(Book book){
        return repository.save(book);
    }

    public List<Book> findAllBooks() {
        return repository.findAll();
    }
}