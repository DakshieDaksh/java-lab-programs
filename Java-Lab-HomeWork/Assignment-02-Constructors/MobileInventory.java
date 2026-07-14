import java.util.Scanner;

// Mobile class
class Mobile {

  // Data members
  String brand;
  String model;
  double price;

  // ==================================
  // Default Constructor
  // Gives default values
  // ==================================
  Mobile() {
    brand = "Not Available";
    model = "Not Available";
    price = 0.0;
  }

  // ==================================
  // Parameterized Constructor
  // Initializes object with user input
  // ==================================
  Mobile(String brand, String model, double price) {
    this.brand = brand;
    this.model = model;
    this.price = price;
  }

  // ==================================
  // Copy Constructor
  // Creates a duplicate object
  // Copies values from another Mobile object
  // ==================================
  Mobile(Mobile m) {
    brand = m.brand;
    model = m.model;
    price = m.price;
  }

  // Method to display mobile details
  void display() {
    System.out.println("Brand : " + brand);
    System.out.println("Model : " + model);
    System.out.println("Price : ₹" + price);
  }
}

public class MobileInventory {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // ==================================
    // Object using Default Constructor
    // ==================================
    Mobile m1 = new Mobile();

    System.out.println("Default Mobile Details");
    m1.display();

    System.out.println();

    // ==================================
    // Taking input from user
    // ==================================
    System.out.print("Enter Brand: ");
    String brand = sc.nextLine();

    System.out.print("Enter Model: ");
    String model = sc.nextLine();

    System.out.print("Enter Price: ");
    double price = sc.nextDouble();

    // ==================================
    // Object using Parameterized Constructor
    // ==================================
    Mobile m2 = new Mobile(brand, model, price);

    System.out.println("\nOriginal Mobile Details");
    m2.display();

    // ==================================
    // Object using Copy Constructor
    // Duplicate object created
    // ==================================
    Mobile m3 = new Mobile(m2);

    System.out.println("\nDuplicate Mobile Details");
    m3.display();

    sc.close();
  }
}
