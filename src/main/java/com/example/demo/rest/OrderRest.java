package com.example.demo.rest;

import com.example.demo.request.OrderRequest;
import com.example.demo.request.RemoveItemOrder;
import com.example.demo.request.UpdateOrderReq;
import com.example.demo.service.OrderDetailService;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderRest {
    @Autowired
    private OrderService orderService;

    @PostMapping("/post/create_new_order")
    public ResponseEntity<?> addNewOrderController(@RequestBody OrderRequest request){
        return ResponseEntity.ok(orderService.addNewOrderService(request));
    }


    @GetMapping("/get/get_user_order")
    public ResponseEntity<?> findUserOrder(@RequestParam("userId") Long userId, @RequestParam("orderId") Long orderId){
        return ResponseEntity.ok(orderService.findOrderUserService(userId, orderId));
    }

    @PostMapping("/post/update_order")
    public ResponseEntity<?> updateOrder(@RequestBody UpdateOrderReq req){
        return ResponseEntity.ok(orderService.updateOrderService(req));
    }

    @PostMapping("/post/delete_item_order")
    public ResponseEntity<?> removeItemOrder(@RequestBody RemoveItemOrder item){
        return ResponseEntity.ok((orderService.removeItemOrderService(item.getOrderId(),item.getProIds())));
    }

}
