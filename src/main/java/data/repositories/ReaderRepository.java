package data.repositories;

import data.models.ReaderModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ReaderRepository extends MongoRepository <ReaderModel, String> {
    Optional<ReaderModel>findByEmail(String email); //A custom method in repository - anyone that mongo didn't give

}
