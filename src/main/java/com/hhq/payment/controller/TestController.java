package com.hhq.payment.controller;

import com.hhq.common_sdk.pom_model.PomModelSingleton;
import com.hhq.common_sdk.result.Result;
import com.hhq.payment.domain.Payment;
import com.hhq.payment.service.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

     @Autowired
    IPaymentService paymentService;


    @GetMapping("/testGetPayment/{id}")
    public Result<Payment> getResult(@PathVariable("id")String id){
        PomModelSingleton.getInstance();
        Payment payment = paymentService.selectByPrimaryKey(id);
        return Result.success(payment);
    }
}
