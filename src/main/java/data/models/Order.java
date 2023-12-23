package data.models;

public class Order {
   private String orderId;
    private String userId; //ID of the user placing the order
    private String bookId; //ID of the book being ordered
    private String orderDate;  //Date and time when the order is placed
    private String returnDate;  //Expected return date for books return
}
