package com.example.demo.repository;

import com.example.demo.domain.UserOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<UserOrderEntity, Long> {
    Optional<UserOrderEntity> findByIdAndUserId(Long orderId, Long userId);
    Optional<UserOrderEntity> findById(Long orderId);
}
