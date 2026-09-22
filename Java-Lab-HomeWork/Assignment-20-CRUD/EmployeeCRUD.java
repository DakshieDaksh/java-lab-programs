import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeCRUD {

  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/java";
    String username = "root";
    String password = "Password1";

    try {
      // Load JDBC Driver
      Class.forName("com.mysql.cj.jdbc.Driver");

      // Establish connection
      Connection con = DriverManager.getConnection(url, username, password);

      System.out.println("Database connected successfully!");

      Statement stmt = con.createStatement();

      // ================= CREATE =================

      String insertQuery =
        "INSERT INTO Employee VALUES " + "(4, 'Daksh', 'CSE', 50000)";

      int insertResult = stmt.executeUpdate(insertQuery);

      if (insertResult > 0) {
        System.out.println("Employee record inserted successfully.");
      }

      // ================= READ =================

      String selectQuery = "SELECT * FROM Employee";

      ResultSet rs = stmt.executeQuery(selectQuery);

      System.out.println("\nEmployee Records:");
      System.out.println("--------------------------------");

      while (rs.next()) {
        int employeeId = rs.getInt("employee_id");
        String name = rs.getString("name");
        String department = rs.getString("department");
        double salary = rs.getDouble("salary");

        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + salary);
        System.out.println("--------------------------------");
      }

      rs.close();

      // ================= UPDATE =================

      String updateQuery =
        "UPDATE Employee SET salary = 55000 " + "WHERE employee_id = 4";

      int updateResult = stmt.executeUpdate(updateQuery);

      if (updateResult > 0) {
        System.out.println("Employee record updated successfully.");
      }

      // ================= DELETE =================

      String deleteQuery = "DELETE FROM Employee WHERE employee_id = 4";

      int deleteResult = stmt.executeUpdate(deleteQuery);

      if (deleteResult > 0) {
        System.out.println("Employee record deleted successfully.");
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
