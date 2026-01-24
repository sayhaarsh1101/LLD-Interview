package DesignPatterns.Factory.PaymentExample;

public class Main {
    public static void main(String[] args) {
        PaymentCreator paymentCreator;

        paymentCreator = new CreditCardPaymentCreator();
        paymentCreator.doPayment(145.00);

        paymentCreator = new UpiPaymentCreator();
        paymentCreator.doPayment(120.00);


    }
    
}
