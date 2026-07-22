import java.util.Scanner;

// ==========================================
// Interface
// Every product must implement displayCategory()
// ==========================================
interface Product {
  void displayCategory();
}

// ==========================================
// Parent Class
// Stores common product details
// ==========================================
class ProductDetails {

  String productName;
  double price;

  // Constructor
  ProductDetails(String productName, double price) {
    this.productName = productName;
    this.price = price;
  }

  // Display common information
  void displayProduct() {
    System.out.println("\nProduct Name : " + productName);
    System.out.println("Price        : $" + price);
  }
}

// ==========================================
// Electronic Product
// ==========================================
class Electronic extends ProductDetails implements Product {

  Electronic(String name, double price) {
    super(name, price); // Calls parent constructor
  }

  // Interface method
  @Override
  public void displayCategory() {
    System.out.println("Category     : Electronic");
  }
}

// ==========================================
// Clothing Product
// ==========================================
class Clothing extends ProductDetails implements Product {

  Clothing(String name, double price) {
    super(name, price);
  }

  @Override
  public void displayCategory() {
    System.out.println("Category     : Clothing");
  }
}

// ==========================================
// Grocery Product
// ==========================================
class Grocery extends ProductDetails implements Product {

  Grocery(String name, double price) {
    super(name, price);
  }

  public void displayCategory() {
    System.out.println("Category     : Grocery");
  }
}

// ==========================================
// Main Class
// ==========================================
public class EcommerceSystem {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // ===============================
    // Electronic Product
    // ===============================
    System.out.println("Electronic Product");

    System.out.print("Enter Product Name: ");
    String eName = sc.nextLine();

    System.out.print("Enter Price: ");
    double ePrice = sc.nextDouble();
    sc.nextLine();

    Electronic electronic = new Electronic(eName, ePrice);

    // ===============================
    // Clothing Product
    // ===============================
    System.out.println("\nClothing Product");

    System.out.print("Enter Product Name: ");
    String cName = sc.nextLine();

    System.out.print("Enter Price: ");
    double cPrice = sc.nextDouble();
    sc.nextLine();

    Clothing clothing = new Clothing(cName, cPrice);

    // ===============================
    // Grocery Product
    // ===============================
    System.out.println("\nGrocery Product");

    System.out.print("Enter Product Name: ");
    String gName = sc.nextLine();

    System.out.print("Enter Price: ");
    double gPrice = sc.nextDouble();

    Grocery grocery = new Grocery(gName, gPrice);

    // ===============================
    // Display All Products
    // ===============================
    System.out.println("\n========== PRODUCT DETAILS ==========");

    electronic.displayProduct();
    electronic.displayCategory();

    clothing.displayProduct();
    clothing.displayCategory();

    grocery.displayProduct();
    grocery.displayCategory();

    sc.close();
  }
}
