package DesignPatterns.Factory.PaymentExample;

abstract class PaymentCreator {
    public abstract Payment createPayment();

    public void doPayment(double amount){
        Payment payment = createPayment();
        payment.pay(amount);
    }
}
