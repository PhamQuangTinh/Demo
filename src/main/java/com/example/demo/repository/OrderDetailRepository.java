package com.example.demo.repository;

import com.example.demo.domain.OrderDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderDetailRepository extends JpaRepository<OrderDetailEntity, Long> {
    List<OrderDetailEntity> findByUserOrderId(Long id);

    Optional<OrderDetailEntity> findByProductIdAndUserOrderId(Long proId, Long orderId);
}
