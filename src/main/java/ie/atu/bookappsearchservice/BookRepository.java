package ie.atu.bookappsearchservice;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, String> {
    List<Book> findByTitleContainingIgnoreCase(String keyword);
}
