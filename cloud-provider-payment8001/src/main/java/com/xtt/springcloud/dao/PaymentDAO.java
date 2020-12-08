package com.xtt.springcloud.dao;

import com.xtt.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description PaymentDAO
 * @Author Monster
 * @Date 2020/11/21 15:00
 * @Version 1.0
 */
@Mapper
public interface PaymentDAO {
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
