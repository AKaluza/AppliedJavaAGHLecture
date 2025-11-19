package example;

public class PaymentService {

    private final PaymentGateway gateway;

    PaymentService(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    void makePayment(double amount) {
        gateway.process(amount);
    }
}

