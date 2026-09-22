import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
RUN COMMANDS:

1. Compile the Java program with the MySQL JDBC driver:
javac -cp "C:\Users\Daksh\OneDrive\Desktop\Study Sem3 2nd year\JAVA\Lab\JDBC\mysql-connector-j-26.7.0.jar" Assignment19.java

2. Run the compiled Java program with the MySQL JDBC driver:
java -cp ".;C:\Users\Daksh\OneDrive\Desktop\Study Sem3 2nd year\JAVA\Lab\JDBC\mysql-connector-j-26.7.0.jar" Assignment19

3. Run the Java source file directly with the MySQL JDBC driver:
java -cp ".;C:\Users\Daksh\OneDrive\Desktop\Study Sem3 2nd year\JAVA\Lab\JDBC\mysql-connector-j-26.7.0.jar" Assignment19

*/

public class Assignment19 {

  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/college";
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

      // Close connection
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
