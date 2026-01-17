class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor( new CreditCardPayment(), 150.0);
        processor.processPayment(150.0);

        PaymentProcessor upiProcessor = new PaymentProcessor( new UpiPayment(), 200.0);
        upiProcessor.processPayment(200.0);

    }
}