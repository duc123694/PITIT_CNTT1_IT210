package org.example.ss04.Bai4.reponsitory;

import org.springframework.stereotype.Repository;

@Repository("OrderRepositoryB4")
public class OrderRepository {
    public String getAllOrders() {
        return "Danh sach toan bo don hang";
    }

    public String getOrderById(Long id) {
        return "Thong tin don hang voi ID: " + id;
    }
}
