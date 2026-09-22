import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
RUN COMMANDS:

1. Compile the Java program with the MySQL JDBC driver:
javac -cp "C:\Users\Daksh\OneDrive\Desktop\Study Sem3 2nd year\JAVA\Lab\JDBC\mysql-connector-j-26.7.0.jar" Assignment21.java

2. Run the compiled Java program with the MySQL JDBC driver:
java -cp ".;C:\Users\Daksh\OneDrive\Desktop\Study Sem3 2nd year\JAVA\Lab\JDBC\mysql-connector-j-26.7.0.jar" Assignment21

3. Run the Java source file directly with the MySQL JDBC driver:
java -cp ".;C:\Users\Daksh\OneDrive\Desktop\Study Sem3 2nd year\JAVA\Lab\JDBC\mysql-connector-j-26.7.0.jar" Assignment21

*/

public class Assignment21 {

  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/college";
    String username = "root";
    String password = "Password1";

    try {
      // 1. DriverManager
      Class.forName("com.mysql.cj.jdbc.Driver");

      System.out.println("JDBC Driver loaded successfully.");

      // 2. Connection
      Connection con = DriverManager.getConnection(url, username, password);

      System.out.println("Connection established successfully.");

      // 3. Statement
      Statement stmt = con.createStatement();

      System.out.println("Statement object created successfully.");

      System.out.println("Student database is connected successfully!");

      // Close resources
      stmt.close();
      con.close();
    } catch (ClassNotFoundException e) {
      System.out.println("JDBC Driver not found!");
      e.printStackTrace();
    } catch (SQLException e) {
      System.out.println("Database connection failed!");
      e.printStackTrace();
    }
  }
}
