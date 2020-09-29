package com.example.demo.service;

import com.example.demo.dao.OrderDetailDao;
import com.example.demo.domain.OrderDetailEntity;
import com.example.demo.request.OrderProductRequest;
import com.example.demo.request.UpdateOrderReq;
import com.example.demo.response.FindUserOrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailService {
    @Autowired
    private OrderDetailDao orderDetailDao;

    public void addNewOrderDetailService(Long orderId, List<OrderProductRequest> orderDetail){
        orderDetailDao.addNewOrderDetailDao(orderId, orderDetail);
    }

    public List<OrderDetailEntity> findByOrderId(Long orderId){
        return orderDetailDao.findByOrderId(orderId);
    }

    public FindUserOrderResponse findByOrderIdService(Long orderId){
        return orderDetailDao.findByOrderIdDao(orderId);
    }

    public void updateOrderDetail(UpdateOrderReq req) {
        req.getProductOrders().forEach(x->{
            orderDetailDao.updateOrderDetailDao(req.getOrderId(), x.getProId(),x.getQty());
        });
    }

    public void removeItemOrderDetail(Long orderId,List<Long> proIds) {
        proIds.forEach(x->{
            orderDetailDao.removeItemOrderDetail(orderId,proIds);
        });
    }

}
