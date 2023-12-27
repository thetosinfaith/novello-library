package data.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.io.Reader;

public interface ReaderRepository extends MongoRepository <Reader, String> {
}
