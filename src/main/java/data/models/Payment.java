package data.models;

import java.time.LocalDateTime;

public class Payment {
    Order order;
    private double amountPaid;
    private String payment_method;
    private LocalDateTime dateAndTimePaymentWasMade;
    private Status status;
    private String transaction_id;
}

