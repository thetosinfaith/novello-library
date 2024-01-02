package data.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Order {
    private Book bookBorrowed;
    private ReaderModel reader;
    private LocalDateTime localDateTime;
    private int copies;
    private LocalDate dueDate;
    private Payment paymentMade;

}
