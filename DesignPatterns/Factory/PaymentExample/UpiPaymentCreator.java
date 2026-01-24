package DesignPatterns.Factory.PaymentExample;

public class UpiPaymentCreator extends PaymentCreator{
    @Override
    public Payment createPayment(){
        return new UpiPayment();
    }
    
}
