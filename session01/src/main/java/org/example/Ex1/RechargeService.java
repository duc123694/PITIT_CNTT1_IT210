package org.example.Ex1;

public class RechargeService {
    private PaymentGateway gateway;

    // Lỗi: Tự khởi tạo thủ công (Hard-code dependency)
//    public RechargeService() {
//        this.gateway = new InternalPaymentGateway();
//    }
    // bản đã sửa
    public RechargeService(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public void processRecharge(String username, double amount) {
        gateway.pay(amount);
        System.out.println("Nạp " + amount + " cho " + username);
    }
}