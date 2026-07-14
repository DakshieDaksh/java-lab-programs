import java.util.Scanner;

// Restaurant class
class Restaurant {

  // Static variable
  // Shared by every Restaurant object
  // Used to count total orders
  static int totalOrders = 0;

  // =====================================
  // DINE-IN BILL
  // Only food amount is charged
  // =====================================
  double calculateBill(double foodAmount) {
    // One more order processed
    totalOrders++;

    return foodAmount;
  }

  // =====================================
  // TAKEAWAY BILL
  // Food amount + Packing charge
  // =====================================
  double calculateBill(double foodAmount, double packingCharge) {
    totalOrders++;

    return foodAmount + packingCharge;
  }

  // =====================================
  // DELIVERY BILL
  // Food + Packing + Delivery charges
  // =====================================
  double calculateBill(
    double foodAmount,
    double packingCharge,
    double deliveryCharge
  ) {
    totalOrders++;

    return foodAmount + packingCharge + deliveryCharge;
  }

  // Static method to display total orders
  static void displayOrders() {
    System.out.println("\nTotal Orders Processed = " + totalOrders);
  }
}

public class RestaurantBilling {

  public static void main(String[] args) {
    // Scanner object for user input
    Scanner sc = new Scanner(System.in);

    // Create Restaurant object
    Restaurant bill = new Restaurant();

    // -----------------------------
    // DINE-IN
    // -----------------------------
    System.out.print("Enter Dine-In Food Amount: ");
    double dineIn = sc.nextDouble();

    // Calls calculateBill(double)
    System.out.println("Dine-In Bill = ₹" + bill.calculateBill(dineIn));

    // -----------------------------
    // TAKEAWAY
    // -----------------------------
    System.out.print("\nEnter Takeaway Food Amount: ");
    double takeaway = sc.nextDouble();

    System.out.print("Enter Packing Charge: ");
    double packing = sc.nextDouble();

    // Calls calculateBill(double,double)
    System.out.println(
      "Takeaway Bill = ₹" + bill.calculateBill(takeaway, packing)
    );

    // -----------------------------
    // DELIVERY
    // -----------------------------
    System.out.print("\nEnter Delivery Food Amount: ");
    double delivery = sc.nextDouble();

    System.out.print("Enter Packing Charge: ");
    double packing2 = sc.nextDouble();

    System.out.print("Enter Delivery Charge: ");
    double deliveryCharge = sc.nextDouble();

    // Calls calculateBill(double,double,double)
    System.out.println(
      "Delivery Bill = ₹" +
        bill.calculateBill(delivery, packing2, deliveryCharge)
    );

    // Display total orders processed
    Restaurant.displayOrders();

    // Close scanner
    sc.close();
  }
}
