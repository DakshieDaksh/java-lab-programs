import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
RUN COMMANDS:

1. Compile the Java program with the MySQL JDBC driver:
javac -cp "C:\Users\Daksh\OneDrive\Desktop\Study Sem3 2nd year\JAVA\Lab\JDBC\mysql-connector-j-26.7.0.jar" Assignment20.java

2. Run the compiled Java program with the MySQL JDBC driver:
java -cp ".;C:\Users\Daksh\OneDrive\Desktop\Study Sem3 2nd year\JAVA\Lab\JDBC\mysql-connector-j-26.7.0.jar" Assignment20

3. Run the Java source file directly with the MySQL JDBC driver:
java -cp ".;C:\Users\Daksh\OneDrive\Desktop\Study Sem3 2nd year\JAVA\Lab\JDBC\mysql-connector-j-26.7.0.jar" Assignment20

*/

public class Assignment20 {

  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/college";
    String username = "root";
    String password = "Password1";

    try {
      // Load JDBC Driver
      Class.forName("com.mysql.cj.jdbc.Driver");

      // Establish connection
      Connection con = DriverManager.getConnection(url, username, password);

      System.out.println("Database connected successfully!");

      // Create Statement
      Statement stmt = con.createStatement();

      // INSERT operation
      String insertQuery = "INSERT INTO Student VALUES (4, 'Neha', 'CSE', 88)";

      int insertResult = stmt.executeUpdate(insertQuery);

      if (insertResult > 0) {
        System.out.println("Student record inserted successfully.");
      }

      // UPDATE operation
      String updateQuery = "UPDATE Student SET marks = 95 WHERE roll_no = 4";

      int updateResult = stmt.executeUpdate(updateQuery);

      if (updateResult > 0) {
        System.out.println("Student record updated successfully.");
      }

      // DELETE operation
      String deleteQuery = "DELETE FROM Student WHERE roll_no = 4";

      int deleteResult = stmt.executeUpdate(deleteQuery);

      if (deleteResult > 0) {
        System.out.println("Student record deleted successfully.");
      }

      // Close resources
      stmt.close();
      con.close();

      System.out.println("Database connection closed.");
    } catch (ClassNotFoundException e) {
      System.out.println("JDBC Driver not found!");
      e.printStackTrace();
    } catch (SQLException e) {
      System.out.println("Database error!");
      e.printStackTrace();
    }
  }
}
