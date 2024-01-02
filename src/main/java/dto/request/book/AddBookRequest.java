package dto.request.book;

import lombok.Data;

import java.time.LocalDate;
@Data
public class AddBookRequest {
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

