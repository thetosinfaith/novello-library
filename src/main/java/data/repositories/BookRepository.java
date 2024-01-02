package data.repositories;

import data.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface BookRepository extends MongoRepository <Book, String> {
    Optional<Book> searchBookByTitle(String title);
}
