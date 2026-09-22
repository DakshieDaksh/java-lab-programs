import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDisplay {

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
      String query = "SELECT * FROM Student";

      ResultSet rs = stmt.executeQuery(query);

      // Display records
      System.out.println("\nStudent Records:");
      System.out.println("--------------------------------");

      while (rs.next()) {
        int rollNo = rs.getInt("roll_no");
        String name = rs.getString("name");
        String course = rs.getString("course");
        int marks = rs.getInt("marks");

        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Course  : " + course);
        System.out.println("Marks   : " + marks);
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
