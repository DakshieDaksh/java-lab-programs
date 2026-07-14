/* 

A software company is developing a calculator application that should support addition of different types of inputs:

Two integers

Two floating-point numbers

Three integer

2. Method Overriding:

A banking system has a base class BankAccount that 
provides a method to calculate the interest rate. 
Different types of bank accounts 
(e.g., SavingsAccount, CurrentAccount) 
have different interest rates, so they 
should override the method.

*/

public class CL2 {

  public static void main(String[] args) {
    int a = 5,
      b = 10,
      c = 15;
    float x = 5.5f,
      y = 10.5f;
    CL2 calculator = new CL2();
    System.out.println("Addition of two integers: " + calculator.add(a, b));
    System.out.println(
      "Addition of two floating-point numbers: " + calculator.add(x, y)
    );
    System.out.println(
      "Addition of three integers: " + calculator.add(a, b, c)
    );

    BankAccount account = new BankAccount();
    account.calculateInterest();

    account = new SavingsAccount();
    account.calculateInterest();

    account = new CurrentAccount();
    account.calculateInterest();
  }

  public int add(int a, int b) {
    return a + b;
  }

  public float add(float x, float y) {
    return x + y;
  }

  public int add(int a, int b, int c) {
    return a + b + c;
  }
}

class BankAccount {

  void calculateInterest() {
    System.out.println("Interest Rate: 4%");
  }
}

class SavingsAccount extends BankAccount {

  void calculateInterest() {
    System.out.println("Savings Account Interest Rate: 6%");
  }
}

class CurrentAccount extends BankAccount {

  void calculateInterest() {
    System.out.println("Current Account Interest Rate: 2%");
  }
}
