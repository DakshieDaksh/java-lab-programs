class Payment {

  // Credit Card Payment
  void pay(String cardNumber, int cvv) {
    System.out.println("Payment made using Credit Card");
  }

  // Bank Transfer
  void pay(long accountNumber, String ifscCode) {
    System.out.println("Payment made using Bank Transfer");
  }

  // UPI Payment
  void pay(String upiId) {
    System.out.println("Payment made using UPI");
  }
}

public class PaymentProcessingSystem {

  public static void main(String[] args) {
    Payment payment = new Payment();

    payment.pay("1234567812345678", 123); // Credit Card
    payment.pay(123456789012L, "SBIN0001234"); // Bank Transfer
    payment.pay("daksh@upi"); // UPI
  }
}
