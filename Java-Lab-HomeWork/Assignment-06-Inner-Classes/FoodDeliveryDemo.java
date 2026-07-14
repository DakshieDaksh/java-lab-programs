import java.util.Scanner;

// Interface
interface DeliveryStatus {
  void showStatus();
}

// Outer Class
class FoodDelivery {

  // Data Members
  String customerName;
  String foodItem;

  // Constructor
  FoodDelivery(String customerName, String foodItem) {
    this.customerName = customerName;
    this.foodItem = foodItem;
  }

  // =====================================================
  // Inner Class
  // Handles order details.
  // =====================================================
  class OrderDetails {

    void displayOrder() {
      System.out.println("\n----- Order Details -----");
      System.out.println("Customer Name : " + customerName);
      System.out.println("Food Item     : " + foodItem);
    }
  }
}

public class FoodDeliveryDemo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Take user input
    System.out.print("Enter Customer Name: ");
    String customer = sc.nextLine();

    System.out.print("Enter Food Item: ");
    String food = sc.nextLine();

    // Create outer class object
    FoodDelivery order = new FoodDelivery(customer, food);

    // Create inner class object
    FoodDelivery.OrderDetails details = order.new OrderDetails();

    // Display order information
    details.displayOrder();

    // =====================================================
    // Anonymous Class 1
    // Displays "Order Accepted"
    // =====================================================
    DeliveryStatus accepted = new DeliveryStatus() {
      @Override
      public void showStatus() {
        System.out.println("Status : Order Accepted");
      }
    };

    // =====================================================
    // Anonymous Class 2
    // Displays "Out for Delivery"
    // =====================================================
    DeliveryStatus outForDelivery = new DeliveryStatus() {
      @Override
      public void showStatus() {
        System.out.println("Status : Out for Delivery");
      }
    };

    // =====================================================
    // Anonymous Class 3
    // Displays "Delivered"
    // =====================================================
    DeliveryStatus delivered = new DeliveryStatus() {
      @Override
      public void showStatus() {
        System.out.println("Status : Delivered");
      }
    };

    // Call all anonymous class methods
    accepted.showStatus();
    outForDelivery.showStatus();
    delivered.showStatus();

    sc.close();
  }
}
