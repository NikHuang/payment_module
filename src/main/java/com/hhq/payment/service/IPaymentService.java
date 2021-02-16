package com.hhq.payment.service;

import com.hhq.payment.domain.Payment;

public interface IPaymentService {

    Payment selectByPrimaryKey(String id);

    int insert(Payment payment);
}
