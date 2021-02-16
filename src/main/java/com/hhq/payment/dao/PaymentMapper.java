package com.hhq.payment.dao;

import com.hhq.payment.domain.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentMapper {

    Payment selectByPrimaryKey(String id);

    int insert(Payment payment);

}
