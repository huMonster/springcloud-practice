package com.xtt.springcloud.service.impl;

import com.xtt.springcloud.dao.PaymentDAO;
import com.xtt.springcloud.entities.Payment;
import com.xtt.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description PaymentService
 * @Author Monster
 * @Date 2020/11/21 15:47
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDAO dao;


    @Override
    public int create(Payment payment) {
        return dao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return dao.getPaymentById(id);
    }
}
