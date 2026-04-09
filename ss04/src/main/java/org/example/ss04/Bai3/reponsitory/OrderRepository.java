package org.example.ss04.Bai3.reponsitory;

import org.springframework.stereotype.Repository;

@Repository("OrderRepositoryB3")
public class OrderRepository {
    public String getAllOrders() {
        return "Danh sach toan bo don hang";
    }

    public String getOrderById(Long id) {
        return "Thong tin don hang voi ID: " + id;
    }
}