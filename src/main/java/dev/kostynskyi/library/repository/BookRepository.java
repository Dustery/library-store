package dev.kostynskyi.library.repository;

import dev.kostynskyi.library.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}

