import java.util.Scanner;

public class OnlineShopping {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter product name: ");
    String product = sc.nextLine();

    System.out.print("Enter product quantity: ");
    int quantity = sc.nextInt();

    try {
      if (quantity <= 0) {
        throw new IllegalArgumentException(
          "Product quantity must be greater than zero."
        );
      }

      System.out.println("Order placed successfully.");
      System.out.println("Product: " + product);
      System.out.println("Quantity: " + quantity);
    } catch (IllegalArgumentException e) {
      System.out.println("Error: " + e.getMessage());
    }

    sc.close();
  }
}
