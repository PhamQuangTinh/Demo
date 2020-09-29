package com.example.demo.dao;

import com.example.demo.domain.UserOrderEntity;
import com.example.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderDao {
    @Autowired
    private OrderRepository repository;

    public UserOrderEntity addNewOrderDao(Long userId){
        UserOrderEntity userOrderEntity = new UserOrderEntity();
        userOrderEntity.setUserId(userId);
        return repository.saveAndFlush(userOrderEntity);
    }

    public UserOrderEntity findUserOrderById(Long userId, Long orderId){
        return repository.findByIdAndUserId(orderId,userId).orElse(null);
    }

    public UserOrderEntity findUserOrderById(Long orderId){
        return repository.findById(orderId).orElse(null);
    }
}
