import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductRecords {

  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/java";
    String username = "root";
    String password = "Password1";

    try {
      // Load MySQL JDBC Driver
      Class.forName("com.mysql.cj.jdbc.Driver");

      // Establish connection
      Connection con = DriverManager.getConnection(url, username, password);

      System.out.println("Database connected successfully!");

      // Create Statement
      Statement stmt = con.createStatement();

      // Execute SELECT query
      String query = "SELECT * FROM Product";

      ResultSet rs = stmt.executeQuery(query);

      // Display records
      System.out.println("\nProduct Records:");
      System.out.println("--------------------------------");

      while (rs.next()) {
        int productId = rs.getInt("product_id");
        String productName = rs.getString("product_name");
        int quantity = rs.getInt("quantity");
        double price = rs.getDouble("price");

        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Price        : " + price);
        System.out.println("--------------------------------");
      }

      rs.close();
      stmt.close();
      con.close();
    } catch (ClassNotFoundException e) {
      System.out.println("JDBC Driver not found!");
      e.printStackTrace();
    } catch (SQLException e) {
      System.out.println("Database error!");
      e.printStackTrace();
    }
  }
}
