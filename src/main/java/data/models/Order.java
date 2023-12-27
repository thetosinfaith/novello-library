package data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document
public class Order {
    @Id
   private String Id;
    private String userId; //ID of the user placing the order
    private String bookId; //ID of the book being ordered
    private String orderDate;  //Date and time when the order is placed
    private String returnDate;  //Expected return date for books return
}
