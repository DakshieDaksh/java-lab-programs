import java.util.Scanner;

public class ATM {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int balance = 10000;

    System.out.print("Enter withdrawal amount: ");
    int amount = sc.nextInt();

    try {
      if (amount <= 0) {
        throw new ArithmeticException(
          "Withdrawal amount must be greater than zero."
        );
      }

      if (amount > balance) {
        throw new ArithmeticException("Insufficient balance.");
      }

      balance = balance - amount;

      System.out.println("Withdrawal successful.");
      System.out.println("Amount withdrawn: " + amount);
      System.out.println("Remaining balance: " + balance);
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    }

    sc.close();
  }
}
