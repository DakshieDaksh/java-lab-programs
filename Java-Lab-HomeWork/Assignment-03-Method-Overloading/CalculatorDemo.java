import java.util.Scanner; // Imports Scanner class for taking user input

// Calculator class
class Calculator {

  // Static variable shared by ALL Calculator objects.
  // It counts how many calculations have been performed.
  static int calculationCount = 0;

  /* ============================
   Method Overloading Example 1
   Adds two integers
      ============================*/
  int add(int a, int b) {
    // Increase calculation counter every time this method is called
    calculationCount++;

    // Return the sum
    return a + b;
  }

  // ============================
  // Method Overloading Example 2
  // Adds two decimal numbers
  // Notice same method name (add)
  // Different parameter types
  // ============================
  double add(double a, double b) {
    // Increase calculation counter
    calculationCount++;

    // Return decimal sum
    return a + b;
  }

  // Static method
  // Since it is static, it belongs to the class,
  // so we call it using Calculator.displayCount()
  static void displayCount() {
    System.out.println("Total Calculations Performed = " + calculationCount);
  }
}

// Main class
public class CalculatorDemo {

  public static void main(String[] args) {
    // Scanner object to read keyboard input
    Scanner sc = new Scanner(System.in);

    // Create Calculator object
    Calculator calc = new Calculator();

    // -------------------------------
    // Integer Addition
    // -------------------------------

    System.out.print("Enter first integer: ");
    int num1 = sc.nextInt();

    System.out.print("Enter second integer: ");
    int num2 = sc.nextInt();

    // Compiler automatically calls
    // add(int,int)
    System.out.println("Integer Sum = " + calc.add(num1, num2));

    // -------------------------------
    // Decimal Addition
    // -------------------------------

    System.out.print("\nEnter first decimal number: ");
    double d1 = sc.nextDouble();

    System.out.print("Enter second decimal number: ");
    double d2 = sc.nextDouble();

    // Compiler automatically calls
    // add(double,double)
    System.out.println("Decimal Sum = " + calc.add(d1, d2));

    // Display total calculations
    Calculator.displayCount();

    // Close Scanner to prevent resource leak
    sc.close();
  }
}
