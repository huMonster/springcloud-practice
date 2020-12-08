package com.xtt.springcloud.service;

import com.xtt.springcloud.entities.Payment;

/**
 * @Description PaymentService
 * @Author Monster
 * @Date 2020/11/21 15:47
 * @Version 1.0
 */

public interface PaymentService {
    /**
     * 写接口
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 读接口
     * @param id
     * @return
     */
    Payment getPaymentById(Long id);
}
