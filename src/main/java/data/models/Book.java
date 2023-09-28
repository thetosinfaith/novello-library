package data.models;
import java.time.LocalDate;
public class Book {
    //A catalog of all books in the library.
    private String genre;
    private String title;
    private String author;
    private String ISBN;
    private String publisher;
    private LocalDate publicationDate;
    private boolean canBeBorrowed;
}
