package com.phoenix.services;

import com.phoenix.models.Student;

import java.math.BigDecimal;

public class PayStack implements PaymentService{
    @Override
    public void processPayment(Student student, BigDecimal amount) {
        //TODO call paystack api
    }
}
