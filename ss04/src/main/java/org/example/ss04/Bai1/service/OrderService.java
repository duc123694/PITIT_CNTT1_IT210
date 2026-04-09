package org.example.ss04.Bai1.service;

import org.example.ss04.Bai1.repositoty.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("OrderServiceB1")
public class OrderService {
    private final OrderRepository orderRepository;
    @Autowired
    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }
    public String getOrderAll(){
        return orderRepository.getOrder();
    }
    public String getOrderById(Long id){
        return orderRepository.getOrderById(id);
    }
}
