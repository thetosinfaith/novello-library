package data.models;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
@Data
@Document
public class Book {
    @Id
    //A catalog of all books in the library.
    private String id;
    private String genre;
    private String title;
    private String author;
    private String ISBN;
    private String publisher;
    private LocalDate publicationDate;
    private boolean canBeBorrowed;
    private boolean canBeBought;
    private boolean isBought;
    private boolean isBorrowed;
}
