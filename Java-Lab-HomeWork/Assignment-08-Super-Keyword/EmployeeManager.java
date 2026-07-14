import java.util.Scanner;

// ==========================================
// Parent Class
// Stores common employee information
// ==========================================
class Employee {

  String name;
  int employeeId;

  // Parent class constructor
  Employee(String name, int employeeId) {
    this.name = name;
    this.employeeId = employeeId;
  }

  // Display employee details
  void displayEmployee() {
    System.out.println("Employee Name : " + name);
    System.out.println("Employee ID   : " + employeeId);
  }
}

// ==========================================
// Child Class
// Inherits Employee
// ==========================================
class Manager extends Employee {

  String department;

  // Child constructor
  Manager(String name, int employeeId, String department) {
    // super() calls the constructor of the parent class
    // It initializes name and employeeId
    super(name, employeeId);
    // Initialize child class variable
    this.department = department;
  }

  // Display all manager details
  void displayManager() {
    // Call parent class method using super
    super.displayEmployee();

    System.out.println("Department    : " + department);
  }
}

// ==========================================
// Main Class
// ==========================================
public class EmployeeManager {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Take input from user
    System.out.print("Enter Employee Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Employee ID: ");
    int id = sc.nextInt();
    sc.nextLine(); // Consume newline

    System.out.print("Enter Department: ");
    String department = sc.nextLine();

    // Create Manager object
    Manager manager = new Manager(name, id, department);

    // Display details
    System.out.println("\n===== Manager Details =====");
    manager.displayManager();

    sc.close();
  }
}
