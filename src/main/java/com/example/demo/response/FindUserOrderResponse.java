package com.example.demo.response;

import com.example.demo.dto.ProductDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class FindUserOrderResponse {
    private List<ProductOrderDetailRes> listOrder;
    private double totalPrice;
}
