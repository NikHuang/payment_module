package com.hhq.payment.controller;

import com.hhq.common_sdk.pom_model.PomModelSingleton;
import com.hhq.common_sdk.result.Result;
import com.hhq.payment.domain.Payment;
import com.hhq.payment.service.IPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

     @Autowired
    IPaymentService paymentService;

     @Value("${server.port}")
     private String port;


    @GetMapping(value = "/testGetPayment/{id}",produces = {"application/json;charset=UTF-8"})
    public Payment getResult(@PathVariable("id")String id){
        Payment payment = paymentService.selectByPrimaryKey(id);
        log.info(port);
        return payment;
    }
}
