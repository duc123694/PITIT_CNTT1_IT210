package org.example.ss04.Bai1.repositoty;

import org.springframework.stereotype.Repository;

@Repository("OrderRepositoryB1")
public class OrderRepository {
    public String getOrder(){
        return "Danh sách toàn bộ đơn hàng";
    }
    public String getOrderById(Long id){
        return "Thng tin đơn hàng với id: " +id;
    }
}
