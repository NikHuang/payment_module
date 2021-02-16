package com.hhq.payment.service.impl;

import com.hhq.payment.dao.PaymentMapper;
import com.hhq.payment.domain.Payment;
import com.hhq.payment.service.IPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PaymentServiceImpl implements IPaymentService {

    @Autowired
    PaymentMapper paymentMapper;


    public Payment selectByPrimaryKey(String id) {
        return paymentMapper.selectByPrimaryKey(id);
    }

    public int insert(Payment payment) {
        return paymentMapper.insert(payment);
    }
}
