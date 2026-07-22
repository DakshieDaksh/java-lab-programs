import java.util.Scanner;

// Main class
public class EmployeePayroll {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // =====================================
    // Take all input as String
    // Later convert using Wrapper Classes
    // =====================================

    System.out.print("Enter Employee ID: ");
    String empIdString = sc.nextLine();

    System.out.print("Enter Basic Salary: ");
    String salaryString = sc.nextLine();

    System.out.print("Enter Bonus Amount: ");
    String bonusString = sc.nextLine();

    // =====================================
    // Convert String to Wrapper Objects
    // valueOf() returns Integer and Double
    // =====================================

    Integer empId = Integer.valueOf(empIdString);

    Double basicSalary = Double.valueOf(salaryString);

    Double bonus = Double.valueOf(bonusString);

    // =====================================
    // Validation
    // Salary and Bonus should not be negative
    // =====================================

    if (basicSalary < 0) {
      System.out.println("Error: Salary cannot be negative.");
    } else if (bonus < 0) {
      System.out.println("Error: Bonus cannot be negative.");
    } else {
      // Calculate Net Salary
      Double netSalary = basicSalary + bonus;

      // Display Employee Details
      System.out.println("\n------ Employee Payroll ------");
      System.out.println("Employee ID : " + empId);
      System.out.println("Basic Salary : $" + basicSalary);
      System.out.println("Bonus : $" + bonus);
      System.out.println("Net Salary : $" + netSalary);
    }

    sc.close();
  }
}
