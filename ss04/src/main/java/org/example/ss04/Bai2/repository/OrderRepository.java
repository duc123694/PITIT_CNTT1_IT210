package org.example.ss04.Bai2.repository;

import org.springframework.stereotype.Repository;

@Repository("/OrderReponsitoryB2")
public class OrderRepository {
    public String getOrderAll(){
        return "Danh sách toàn bộ đơn hàng";
    }
    public String getOrderById(Long id){
        return "Thông tin đơn hàng với ID: "+id;
    }
}
