public class PaymentProcessor {
    private PaymentMethod paymentMethod;
    private double amount;

    public PaymentProcessor(PaymentMethod paymentMethod, double amount) {
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    public void processPayment(double amount) {
        paymentMethod.pay(amount);
    }
}
