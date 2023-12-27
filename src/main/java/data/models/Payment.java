package data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document
@Data
public class Payment {
    @Id
    private String Id;
    Order order;
    private double amountPaid;
    private PaymentMethod payment_method;
    private LocalDateTime dateAndTimePaymentWasMade;
    private Status status;
}
