package com.phoenix.services;

import com.phoenix.models.Student;
import java.math.BigDecimal;

public interface PaymentService {
    void processPayment(Student student, BigDecimal amount);
}
