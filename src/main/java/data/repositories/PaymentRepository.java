package data.repositories;

import data.models.Payment;
import dto.request.payment.MakePaymentRequest;
import dto.request.payment.ProcessPaymentRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PaymentRepository extends MongoRepository <Payment, String> {

}
