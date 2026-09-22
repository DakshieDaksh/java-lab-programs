import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentCRUD {

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
        "INSERT INTO Student VALUES " + "(104, 'Neha', 'CSE', 88)";

      int insertResult = stmt.executeUpdate(insertQuery);

      if (insertResult > 0) {
        System.out.println("Student record inserted successfully.");
      }

      // ================= READ =================

      String selectQuery = "SELECT * FROM Student";

      ResultSet rs = stmt.executeQuery(selectQuery);

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

      // ================= UPDATE =================

      String updateQuery =
        "UPDATE Student SET marks = 95 " + "WHERE roll_no = 104";

      int updateResult = stmt.executeUpdate(updateQuery);

      if (updateResult > 0) {
        System.out.println("Student record updated successfully.");
      }

      // ================= DELETE =================

      String deleteQuery = "DELETE FROM Student WHERE roll_no = 104";

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
