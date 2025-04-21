package PaymentProcessorBitcoin;

class Bitcoin {
    private String transactionId;

    public Bitcoin(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return transactionId;
    }
}

class CreditCard {
    // Just a stub class for demonstration
}

class PayPal {
    // Just a stub class for demonstration
}

class ApplePay {
    // Just a stub class for demonstration
}

class PaymentProcessor {

    public void processPayment(CreditCard card) {
        System.out.println("Processing Credit Card Payment");
    }

    public void processPayment(PayPal paypal) {
        System.out.println("Processing PayPal Payment");
    }

    public void processPayment(Bitcoin bitcoin) {
        System.out.println("Processing Bitcoin Payment with transaction ID: " + bitcoin.getTransactionId());
    }

    // Bonus: ApplePay support
    public void processPayment(ApplePay applePay) {
        System.out.println("Processing Apple Pay Payment");
    }
}

public class PaymentProcessorBitcoin {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // Create instances of payment methods
        CreditCard card = new CreditCard();
        PayPal paypal = new PayPal();
        Bitcoin bitcoin = new Bitcoin("BTC1234567890");
        ApplePay applePay = new ApplePay();

        // Process payments
        processor.processPayment(card);
        processor.processPayment(paypal);
        processor.processPayment(bitcoin);
        processor.processPayment(applePay);
    }
    
}
