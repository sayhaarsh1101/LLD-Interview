class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment(new CreditCardPayment(), 150.0);
        processor.processPayment(new UpiPayment(), 200.0);
    
    }
}